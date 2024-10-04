package com.ruoyi.manage.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.TbCategoryMapper;
import com.ruoyi.manage.domain.TbCategory;
import com.ruoyi.manage.service.ITbCategoryService;

/**
 * 类别管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
@Service
public class TbCategoryServiceImpl implements ITbCategoryService 
{
    @Autowired
    private TbCategoryMapper tbCategoryMapper;

    /**
     * 查询类别管理
     * 
     * @param id 类别管理主键
     * @return 类别管理
     */
    @Override
    public TbCategory selectTbCategoryById(Long id)
    {
        return tbCategoryMapper.selectTbCategoryById(id);
    }

    /**
     * 查询类别管理列表
     * 
     * @param tbCategory 类别管理
     * @return 类别管理
     */
    @Override
    public List<TbCategory> selectTbCategoryList(TbCategory tbCategory)
    {
        return tbCategoryMapper.selectTbCategoryList(tbCategory);
    }

    /**
     * 新增类别管理
     * 
     * @param tbCategory 类别管理
     * @return 结果
     */
    @Override
    public int insertTbCategory(TbCategory tbCategory)
    {
        tbCategory.setCreateTime(DateUtils.getNowDate());
        return tbCategoryMapper.insertTbCategory(tbCategory);
    }

    /**
     * 修改类别管理
     * 
     * @param tbCategory 类别管理
     * @return 结果
     */
    @Override
    public int updateTbCategory(TbCategory tbCategory)
    {
        tbCategory.setUpdateTime(DateUtils.getNowDate());
        return tbCategoryMapper.updateTbCategory(tbCategory);
    }

    /**
     * 批量删除类别管理
     * 
     * @param ids 需要删除的类别管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCategoryByIds(Long[] ids)
    {
        return tbCategoryMapper.deleteTbCategoryByIds(ids);
    }

    /**
     * 删除类别管理信息
     * 
     * @param id 类别管理主键
     * @return 结果
     */
    @Override
    public int deleteTbCategoryById(Long id)
    {
        return tbCategoryMapper.deleteTbCategoryById(id);
    }
}
