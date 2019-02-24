package org.demo.layui.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhaol on 2018/11/19.
 */
public interface BaseMapper<T, E> {
    long countByExample(E example);

    int deleteByExample(E example);

    int deleteByPrimaryKey(Long id);

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(Long id);

    T selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByExample(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
