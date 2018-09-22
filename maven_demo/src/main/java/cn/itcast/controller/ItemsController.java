package cn.itcast.controller;

import cn.itcast.pojo.Items;
import cn.itcast.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ItemsController {
    @Resource
    private ItemsService itemsService;

    @RequestMapping("/itemDetail")
    public String findById(HttpServletRequest request){
        Items items=itemsService.findById(1);
        request.setAttribute("item",items);
        return "itemDetail";
    }
}
