package cn.itcast.service;

import cn.itcast.pojo.Items;

public interface ItemsService {
    /**
     * 查询所有
     * @param id
     * @return
     */
    public Items findById(int id);
}
