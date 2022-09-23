package com.nuoye.localdata.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.nuoye.localdata.dao.TypeDao;
import com.nuoye.localdata.entity.TypeEntity;

/**
 * 获取 type
 */
@Database(entities = {TypeEntity.class},version = 1)
public abstract class TypeDataBase extends RoomDatabase {
    /**
     *
     * @return TypeDao
     */
    public abstract TypeDao getTypeDao();
}
