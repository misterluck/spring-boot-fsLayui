package org.demo.layui.service.impl;

import org.demo.layui.entity.BaseExample;
import org.demo.layui.entity.Page;
import org.demo.layui.mapper.BaseMapper;
import org.demo.layui.service.BaseService;

import java.util.List;

public abstract class BaseBusiness<T, E extends BaseExample> implements BaseService<T, E> {

    private BaseMapper<T, E> baseMapper;

    public void setBaseMapper(BaseMapper<T, E> baseMapper) {
        this.baseMapper = baseMapper;
    }

    @Override
    public int removeByExample(E example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public int removeByPrimaryKey(Long id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int removeByPrimaryKey(String id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int save(T record) {
        return baseMapper.insert(record);
    }

    @Override
    public int saveSelective(T record) {
        return baseMapper.insertSelective(record);
    }

    @Override
    public List<T> listByExample(E example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public T getByPrimaryKey(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public T getByPrimaryKey(String id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int editByExampleSelective(T record, E example) {
        return baseMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int editByExample(T record, E example) {
        return baseMapper.updateByExample(record, example);
    }

    @Override
    public int editByPrimaryKeySelective(T record) {
        return baseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int editByPrimaryKey(T record) {
        return baseMapper.updateByPrimaryKey(record);
    }

    @Override
    public Page listPageByExample(String currentPage, String pageSize, E example) {
        int start = (Integer.valueOf(currentPage)-1)*Integer.valueOf(pageSize);
        int end = Integer.valueOf(pageSize);
        String i = "1";
        if (i.equals(currentPage)){
            start = 0;
        }
        example.setOffset(start);
        example.setLimit(end);
        List<T> list = baseMapper.selectByExample(example);
        Page page = new Page();
        page.setData(list);
        long total = baseMapper.countByExample(example);
        page.setCount(String.valueOf(total));
        page.setPageSize(pageSize);
        page.setCurrentPage(currentPage);
        return page;
    }
}
