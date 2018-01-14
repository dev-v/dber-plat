package com.dber.plat.web.api;

import com.dber.base.IClient;
import com.dber.base.enums.DberSystem;
import com.dber.base.util.BaseKeyUtil;
import com.dber.base.web.vo.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: 任何客户端api-server请务必实现IClient标记接口</li>
 * <li>访问需授权：http://host:port/api/test?auth_params_system=plat&auth_params_key=123</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/12
 */
@RestController
@RequestMapping("/api")
public class PlatApiController implements IClient{

    /**
     * @param system 客户端系统
     * @return
     */
    @RequestMapping("/test")
    public Response test(@RequestParam(BaseKeyUtil.auth_params_system) DberSystem system) {
        return Response.newSuccessResponse(system);
    }

}
