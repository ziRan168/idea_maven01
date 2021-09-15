package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    /**
     * 列表访问
     * @return
     */
    @RequestMapping("/pages/list")
    public String list(Model model){
        List<Items> items = itemsService.findAll();
        model.addAttribute("items",items);
        return "items";
    }
    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping("/save")
    public String save(Items items){
        itemsService.save(items);
        //集合列表页跳转
        return "redirect:/items/list";
    }
}
