package cn.itcast.service.impl;

import cn.itcast.dao.ItemsDao;
import cn.itcast.pojo.Items;
import cn.itcast.service.ItemsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Resource
    private ItemsDao itemsDao;

    public Items findById(int id) {
        return itemsDao.findById(id);
    }
}
