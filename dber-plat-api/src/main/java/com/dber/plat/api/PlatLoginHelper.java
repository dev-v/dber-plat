package com.dber.plat.api;

import com.dber.base.entity.Account;
import com.dber.base.result.Result;
import com.dber.base.login.ILoginHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/14
 */
@Configuration
@Import({PlatClient.class})
public class PlatLoginHelper implements ILoginHelper {

    @Autowired
    private PlatClient platClient;

    @Override
    public Account getAccount(Account account) {
        Result<Account> result = platClient.getAccount(account);
        return result.getResponse();
    }

    @Override
    public Result<Account> saveAccount(Account account) {
        Result<Account> result=platClient.saveAccount(account);
        return result;
    }
}
