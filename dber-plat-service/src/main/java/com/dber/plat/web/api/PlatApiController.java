package com.dber.plat.web.api;

import com.dber.base.IClient;
import com.dber.base.enums.DberSystem;
import com.dber.base.util.BaseKeyUtil;
import com.dber.base.web.vo.Response;
import com.dber.plat.api.entity.Account;
import com.dber.plat.service.IAccountService;
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
@RequestMapping("/api")
public class PlatApiController implements IClient {

    @Autowired
    private IAccountService accountService;

    /**
     * @param system 客户端系统
     * @return
     */
    @RequestMapping("/test")
    public Response test(@RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        return Response.newSuccessResponse(system);
    }

    @RequestMapping("/getAccount")
    public Response<Account> getAccount(Account account, @RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        account.setSystem(system.getValue());
        account.setPassword(null);
        return Response.newSuccessResponse(accountService.queryOne(account));
    }

    @RequestMapping("/saveAccount")
    public Response<Account> saveAccount(Account account, @RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        account.setSystem(system.getValue());
        accountService.save(account);
        account.setPassword(null);
        return Response.newSuccessResponse(account);
    }

}