package com.dber.plat.web.pub;

import com.dber.base.result.Result;
import com.dber.plat.api.entity.*;
import com.dber.plat.web.api.PlatClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2018/1/18
 */
@RestController
@RequestMapping("/pub/")
public class PlatPublicController {

    @Autowired
    private PlatClientService clientService;

    @RequestMapping("getDictByCategoryId/{categoryId}")
    public Result<Collection<Dict>> getDictByCategoryId(@PathVariable("categoryId") int categoryId) {
        return clientService.getDictsByCategory(categoryId);
    }

    @RequestMapping("getService")
    public Result<Collection<FitnessService>> getService() {
        return clientService.getService();
    }

    @RequestMapping("getBookingStrategy/{id}")
    public Result<BookingStrategy> getBookingStrategy(@PathVariable("id") int id) {
        return clientService.getBookingStrategy(id);
    }

    @RequestMapping("getElementMedals")
    public Result<Collection<ElementMedal>> getElementMedals() {
        return clientService.getElementMedals();
    }

    @RequestMapping("getVipCardStrategy")
    public Result<Collection<VipCardStrategy>> getVipCardStrategy() {
        return clientService.getVipCardStrategy();
    }
}
