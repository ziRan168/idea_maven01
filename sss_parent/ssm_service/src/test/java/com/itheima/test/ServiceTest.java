package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ServiceTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService itemsService = context.getBean(ItemsServiceImpl.class);
        // ItemsService itemsService = context.getBean(ItemsService.class);
        Items items = new Items();
        items.setName("测试事务");
        itemsService.save(items);
    }
}
