package org.demo.layui.service;

import org.demo.layui.entity.Page;

import java.util.List;

public interface BaseService<T, E> {

    int removeByExample(E example);

    int removeByPrimaryKey(Long id);

    int removeByPrimaryKey(String id);

    int save(T record);

    int saveSelective(T record);

    List<T> listByExample(E example);

    T getByPrimaryKey(Long id);

    T getByPrimaryKey(String id);

    int editByExampleSelective(T record, E example);

    int editByExample(T record, E example);

    int editByPrimaryKeySelective(T record);

    int editByPrimaryKey(T record);

    Page listPageByExample(String currentPage, String pageSize, E example);

}
