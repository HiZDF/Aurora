package com.lzhpo.aurora.admin.mapper;


import com.lzhpo.aurora.admin.entity.UpdateLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p> Author：lzhpo </p>
 * <p> Title：</p>
 * <p> Description：</p>
 */
public interface UpdateLogMapper {

    // 查询所有更新记录
    List getUpdateLog(@Param("start") int start, @Param("limit") int limit);
    // 通过description查询更新记录
    List getUpdateLogByDesc(String desc);
    //删除更新记录
    void deleteUpdateLogByID(Integer id);
    // 新增更新记录
    void addUpdateLogData(UpdateLog updateLog);
    //批量删除更新记录
    void batchDelete(String[] ids);
    // 编辑更新记录
    void editUpdateLogById(UpdateLog updateLog);
    // 查询总共有多少条数据
    int UpdateLogCount();

}