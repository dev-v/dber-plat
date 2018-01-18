package com.dber.plat.api;

import com.alibaba.fastjson.TypeReference;
import com.dber.base.AbstractClient;
import com.dber.base.entity.Account;
import com.dber.base.enums.DberSystem;
import com.dber.base.result.Result;
import com.dber.base.util.ResultTypeHelper;
import com.dber.plat.api.entity.*;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
@Service
public class PlatClient extends AbstractClient implements IPlatClient {
    public PlatClient() {
        super(DberSystem.PLAT);
    }

    public Result<Account> getAccount(Account account) {
        return clientUtil.get("/api/getAccount", account, ResultTypeHelper.getType(Account.class));
    }

    public Result<Account> saveAccount(Account account) {
        return clientUtil.post("/api/saveAccount", account, ResultTypeHelper.getType(Account.class));
    }

    @Override
    public Result<Collection<Dict>> getDictsByCategory(int cateogryId) {
        return clientUtil.get("/pub/getDictByCategoryId/" + cateogryId, ResultTypeHelper.getCollectionType(Dict.class));
    }

    @Override
    public Result<Collection<FitnessService>> getService() {
        return clientUtil.get("/pub/getService", ResultTypeHelper.getCollectionType(FitnessService.class));
    }

    @Override
    public Result<BookingStrategy> getBookingStrategy(int id) {
        return clientUtil.get("/pub/getBookingStrategy/" + id, ResultTypeHelper.getType(BookingStrategy.class));
    }

    @Override
    public Result<Collection<ElementMedal>> getElementMedals() {
        return clientUtil.get("/pub/getElementMedals", ResultTypeHelper.getCollectionType(ElementMedal.class));
    }

    @Override
    public Result<Collection<VipCardStrategy>> getVipCardStrategy() {
        return clientUtil.get("/pub/getVipCardStrategy", ResultTypeHelper.getCollectionType(VipCardStrategy.class));
    }
}