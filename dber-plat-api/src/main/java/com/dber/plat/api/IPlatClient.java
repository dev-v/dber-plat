package com.dber.plat.api;

import com.dber.base.entity.Account;
import com.dber.base.result.Result;

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
     * @param account
     * @return
     */
    Result<Account> getAccount(Account account);

    Result<Account> saveAccount(Account account);
}
