package cn.itcast.dao;

import cn.itcast.pojo.Items;
import org.springframework.stereotype.Repository;

@Repository("itemsDao")
public interface ItemsDao {

    /**
     * 查询所有
     * @param id
     * @return
     */
    public Items findById(int id);
}
