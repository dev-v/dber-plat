package com.dber.plat.web.api;

import com.alibaba.fastjson.JSON;
import com.dber.base.entity.Account;
import com.dber.base.result.Result;
import com.dber.base.entity.Response;
import com.dber.plat.api.IPlatClient;
import com.dber.plat.api.entity.*;
import com.dber.plat.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/18
 */
@Service
public class PlatClientService implements IPlatClient {

    @Autowired
    private IAccountService accountService;

    @Autowired
    private IDictService dictService;

    @Autowired
    private IFitnessServiceService fitnessServiceService;

    @Autowired
    private IVipCardStrategyService vipCardStrategyService;

    @Autowired
    private IElementMedalService elementMedalService;

    @Autowired
    private IBookingStrategyService bookingStrategyService;

    @Override
    public Result<Account> getAccount(Account account) {
        Response<Account> response = Response.newSuccessResponse(accountService.queryOne(JSON.toJavaObject((JSON) JSON.toJSON(account), com.dber.plat.api.entity.Account.class)));
        return response.toResult();
    }

    @Override
    public Result<Account> saveAccount(Account account) {
        accountService.save(JSON.toJavaObject((JSON) JSON.toJSON(account), com.dber.plat.api.entity.Account.class));
        account.setPassword(null);
        return Response.newSuccessResponse(account).toResult();
    }

    @Override
    public Result<Collection<Dict>> getDictsByCategory(int cateogryId) {
        Dict dict = new Dict();
        dict.setCategoryId(cateogryId);
        Response<Collection<Dict>> response = Response.newSuccessResponse(dictService.queryWithoutPage(dict));
        return response.toResult();
    }

    @Override
    public Result<Collection<FitnessService>> getService() {
        Response<Collection<FitnessService>> response = Response.newSuccessResponse(fitnessServiceService.queryWithoutPage(null));
        return response.toResult();
    }

    @Override
    public Result<BookingStrategy> getGroupBookingStrategy() {
        Response<BookingStrategy> response = Response.newSuccessResponse(bookingStrategyService.get(1));
        return response.toResult();
    }

    @Override
    public Result<Collection<ElementMedal>> getElementMedals() {
        Response<Collection<ElementMedal>> response = Response.newSuccessResponse(elementMedalService.queryWithoutPage(null));
        return response.toResult();
    }

    @Override
    public Result<Collection<VipCardStrategy>> getVipCardStrategy() {
        Response<Collection<VipCardStrategy>> response = Response.newSuccessResponse(vipCardStrategyService.queryWithoutPage(null));
        return response.toResult();
    }
}