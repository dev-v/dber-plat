package com.dber.plat.api;

import com.dber.base.DefaultClientUtil;
import com.dber.base.IClientUtil;
import com.dber.plat.api.entity.Account;
import com.dber.plat.api.entity.DberSystem;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public class PlatClient implements IPlatClient {

    private static PlatClient instance;
    private IClientUtil clientUtil;
    private DberSystem system;
    private String key;

    private PlatClient(DberSystem system, String key) {
        this.system = system;
        this.key = key;
        this.clientUtil = DefaultClientUtil.getClientUtil("", system.toString(), key);
    }

    public static final IPlatClient getInstance(DberSystem system, String key) {
        if (instance == null) {
            instance = new PlatClient(system, key);
        }
        return instance;
    }

    @Override
    public boolean save(Account account) {
        return false;
    }

    @Override
    public Account getAccountByName(String name) {
        return null;
    }

    @Override
    public Account getAccountByCellPhone(String cellphone) {
        return null;
    }
}
