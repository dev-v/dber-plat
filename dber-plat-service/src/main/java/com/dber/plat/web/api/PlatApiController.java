package com.dber.plat.web.api;

import com.dber.base.IClient;
import com.dber.base.entity.Account;
import com.dber.base.enums.DberSystem;
import com.dber.base.enums.ImgType;
import com.dber.base.result.Result;
import com.dber.base.util.BaseKeyUtil;
import com.dber.plat.api.entity.BookingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: 任何客户端api-server请务必实现IClient标记接口</li>
 * <li>访问需授权</li>
 * <li>本类获取数据时建议从数据源本身获取，redis等缓存建议在api-sdk上面做</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/12
 */
@RestController
@RequestMapping("/api/")
public class PlatApiController implements IClient {

    @Autowired
    private PlatClientService clientService;

    @RequestMapping("getAccount")
    public Result<Account> getAccount(Account account, @RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        account.setSystem(system.getValue());
        account.setPassword(null);
        return clientService.getAccount(account);
    }

    @RequestMapping("saveAccount")
    public Result<Account> saveAccount(Account account, @RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        account.setSystem(system.getValue());
        return clientService.saveAccount(account);
    }

    @RequestMapping("getGroupBookingStrategy")
    public Result<BookingStrategy> getGroupBookingStrategy() {
        return clientService.getGroupBookingStrategy();
    }

}