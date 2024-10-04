package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.TbCategory;

/**
 * 类别管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
public interface TbCategoryMapper 
{
    /**
     * 查询类别管理
     * 
     * @param id 类别管理主键
     * @return 类别管理
     */
    public TbCategory selectTbCategoryById(Long id);

    /**
     * 查询类别管理列表
     * 
     * @param tbCategory 类别管理
     * @return 类别管理集合
     */
    public List<TbCategory> selectTbCategoryList(TbCategory tbCategory);

    /**
     * 新增类别管理
     * 
     * @param tbCategory 类别管理
     * @return 结果
     */
    public int insertTbCategory(TbCategory tbCategory);

    /**
     * 修改类别管理
     * 
     * @param tbCategory 类别管理
     * @return 结果
     */
    public int updateTbCategory(TbCategory tbCategory);

    /**
     * 删除类别管理
     * 
     * @param id 类别管理主键
     * @return 结果
     */
    public int deleteTbCategoryById(Long id);

    /**
     * 批量删除类别管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbCategoryByIds(Long[] ids);
}
