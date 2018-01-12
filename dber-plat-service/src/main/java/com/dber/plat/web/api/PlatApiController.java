package com.dber.plat.web.api;

import com.dber.base.web.controller.AbstractController;
import com.dber.base.web.vo.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/12
 */
@RestController
@RequestMapping("/api")
public class PlatApiController {

    @RequestMapping("/test")
    public Response<String> test() {
        return Response.newSuccessResponse("test");
    }
}
