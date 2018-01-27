package com.dber.plat.api;

import com.dber.base.entity.Account;
import com.dber.base.login.ILoginHelper;
import com.dber.base.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/14
 */
@Import({PlatClient.class})
public abstract class PlatLoginHelper implements ILoginHelper {

    @Autowired
    private PlatClient platClient;

    @Override
    public Account getAccount(Account account) {
        Result<Account> result = platClient.getAccount(account);
        return result.getResponse();
    }

    @Override
    public Result<Account> saveAccount(Account account) {
        Integer id = account.getId();
        Result<Account> result = platClient.saveAccount(account);
        if (id == null) {
            addAccount(result.getResponse());
        }
        return result;
    }

    protected abstract void addAccount(Account account);
}
