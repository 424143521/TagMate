package com.nuoye.localdata.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * 类型的type
 *
 * @author yangfan6
 */
@Entity
public class TypeEntity {
    /**
     * 作为主键
     */
    @PrimaryKey
    int typeId;
    /**
     * 作为显示名称。
     */
    @ColumnInfo
    String typeName="";
    /**
     * 作为描述
     */
    @ColumnInfo
    String typeDescribe="";
    /**
     * type 的目标，对应的是无咎和咎。
     */
    @ColumnInfo
    int typeTarget=0;
}
