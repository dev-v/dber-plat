package com.dber.plat.api;

import com.dber.plat.api.entity.Account;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/11
 */
public interface IPlatClient {
    String BASE_URL_KEY = "plat_base_url_key";

    /**
     * 保存账号
     *
     * @param account
     * @return
     */
    boolean save(Account account);

    Account getAccountByName(String name);

    Account getAccountByCellPhone(String cellphone);
}
