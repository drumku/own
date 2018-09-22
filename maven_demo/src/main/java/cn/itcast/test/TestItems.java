package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.pojo.Items;
import cn.itcast.service.ItemsService;
import cn.itcast.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItems {
    @Test
    public void findById(){
        //读取spring配置文件，获得spring容器
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        //获得代理对象
//        ItemsDao itemsDao=context.getBean(ItemsDao.class);
//        Items items=itemsDao.findById(1);
        ItemsService itemsService=context.getBean(ItemsService.class);
        Items items=itemsService.findById(1);
        System.out.println(items);
    }
}
