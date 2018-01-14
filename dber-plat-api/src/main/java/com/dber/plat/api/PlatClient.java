package com.dber.plat.api;

import com.dber.base.AbstractClient;
import com.dber.base.entity.Account;
import com.dber.base.enums.DberSystem;
import com.dber.base.result.Result;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
@Configuration
@Import({PlatLoginHelper.class})
public class PlatClient extends AbstractClient {
    public PlatClient() {
        super(DberSystem.PLAT);
    }

    public Result<Account> getAccount(Account account) {
        return clientUtil.get("/api/getAccount", account, Account.class);
    }

    public Result<Integer> saveAccount(Account account) {
        return clientUtil.post("/api/saveAccount", account, Integer.class);
    }
}
