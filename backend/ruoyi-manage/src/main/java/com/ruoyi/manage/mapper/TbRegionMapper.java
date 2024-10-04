package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.TbRegion;

/**
 * 区域名Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
public interface TbRegionMapper 
{
    /**
     * 查询区域名
     * 
     * @param id 区域名主键
     * @return 区域名
     */
    public TbRegion selectTbRegionById(Long id);

    /**
     * 查询区域名列表
     * 
     * @param tbRegion 区域名
     * @return 区域名集合
     */
    public List<TbRegion> selectTbRegionList(TbRegion tbRegion);

    /**
     * 新增区域名
     * 
     * @param tbRegion 区域名
     * @return 结果
     */
    public int insertTbRegion(TbRegion tbRegion);

    /**
     * 修改区域名
     * 
     * @param tbRegion 区域名
     * @return 结果
     */
    public int updateTbRegion(TbRegion tbRegion);

    /**
     * 删除区域名
     * 
     * @param id 区域名主键
     * @return 结果
     */
    public int deleteTbRegionById(Long id);

    /**
     * 批量删除区域名
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbRegionByIds(Long[] ids);
}
