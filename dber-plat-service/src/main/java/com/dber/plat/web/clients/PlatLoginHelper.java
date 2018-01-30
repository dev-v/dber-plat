package com.dber.plat.web.clients;

import com.dber.base.entity.Account;
import com.dber.base.result.Result;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/27
 */
public class PlatLoginHelper extends com.dber.plat.api.PlatLoginHelper {
    @Override
    public Result<Account> saveAccount(Account account) {
        throw new IllegalStateException();
    }

    @Override
    protected void addAccount(Account account) {

    }
}
