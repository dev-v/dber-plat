package com.dber.plat.web.clients;

import com.dber.base.login.LoginCheckController;
import com.dber.base.result.Page;
import com.dber.base.result.Result;
import com.dber.shop.api.IShopClient;
import com.dber.shop.api.ShopClient;
import com.dber.shop.api.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/28
 */
@Configuration
@Import({ShopClient.class})
@RestController
@RequestMapping("/shop/")
public class ShopApiController extends LoginCheckController {

    @Autowired
    private IShopClient shopClient;

    @RequestMapping("save")
    public Result<Integer> save(Shop shop) {
        return shopClient.save(shop);
    }

    @RequestMapping("setBasePrice")
    public Result<Integer> setBasePrice(Shop shop) {
        return shopClient.setBasePrice(shop);
    }

    @RequestMapping("/query/{currentPage}")
    public Result<Page<Shop>> query(@PathVariable int currentPage, Shop data) {
        Result<Page<Shop>> result = shopClient.query(currentPage, data);
        return result;
    }
}