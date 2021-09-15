package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class TestDao {
    public static void main(String[] args) {
        ApplicationContext cont = new ClassPathXmlApplicationContext("spring_mybatis.xml");
        // ItemsDao itemsDao = (ItemsDao) cont.getBean("itemsDao");
        ItemsDao bean = cont.getBean(ItemsDao.class);
        List<Items> all = bean.findAll();
        for (Items items : all) {
            System.out.println("items = " + items);
        }
        Items items = new Items();
        items.setName("卧龙凤雏");
        items.setPrice(998f);
        items.setPic("北京");
        items.setCreatetime(new Date());
        bean.save(items);

    }
}
