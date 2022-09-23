package com.nuoye.localdata.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nuoye.localdata.entity.TypeEntity;

import java.util.List;

/**
 * 类型的查询。
 * @author yangfan6
 */
@Dao
public interface TypeDao {
    /**
     * 删除
     * @param entity entity
     */
    @Delete
    void delete(TypeEntity entity);

    /**
     * 插入输入
     * @param entities entities
     */
    @Insert
    void insertAll(TypeEntity ... entities);

    /**
     * 查询所有
     * @return 查询所有
     */
    @Query("select * from typeentity")
    List<TypeEntity> getAll();

    /**
     * 更新
     * @param entity entity
     */
    @Update
    void update(TypeEntity... entity);
}
