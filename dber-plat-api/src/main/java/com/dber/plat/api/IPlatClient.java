package com.dber.plat.api;

import com.dber.base.entity.Account;
import com.dber.base.enums.ImgType;
import com.dber.base.result.Result;
import com.dber.plat.api.entity.*;

import java.util.Collection;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author chenw
 * @version 1.0
 * @since 2018/1/15
 */
public interface IPlatClient {
    /**
     * 根据账户名称或电话或id查询账号
     *
     * @param account
     * @return
     */
    Result<Account> getAccount(Account account);

    Result<Account> saveAccount(Account account);

    Result<Collection<Dict>> getDictsByCategory(int cateogryId);

    Result<Collection<FitnessService>> getService();

    Result<BookingStrategy> getGroupBookingStrategy();

    Result<Collection<ElementMedal>> getElementMedals();

    Result<Collection<VipCardStrategy>> getVipCardStrategy();
}
