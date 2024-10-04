package com.ruoyi.manage.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.TbRegionMapper;
import com.ruoyi.manage.domain.TbRegion;
import com.ruoyi.manage.service.ITbRegionService;

/**
 * 区域名Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
@Service
public class TbRegionServiceImpl implements ITbRegionService 
{
    @Autowired
    private TbRegionMapper tbRegionMapper;

    /**
     * 查询区域名
     * 
     * @param id 区域名主键
     * @return 区域名
     */
    @Override
    public TbRegion selectTbRegionById(Long id)
    {
        return tbRegionMapper.selectTbRegionById(id);
    }

    /**
     * 查询区域名列表
     * 
     * @param tbRegion 区域名
     * @return 区域名
     */
    @Override
    public List<TbRegion> selectTbRegionList(TbRegion tbRegion)
    {
        return tbRegionMapper.selectTbRegionList(tbRegion);
    }

    /**
     * 新增区域名
     * 
     * @param tbRegion 区域名
     * @return 结果
     */
    @Override
    public int insertTbRegion(TbRegion tbRegion)
    {
        tbRegion.setCreateTime(DateUtils.getNowDate());
        return tbRegionMapper.insertTbRegion(tbRegion);
    }

    /**
     * 修改区域名
     * 
     * @param tbRegion 区域名
     * @return 结果
     */
    @Override
    public int updateTbRegion(TbRegion tbRegion)
    {
        tbRegion.setUpdateTime(DateUtils.getNowDate());
        return tbRegionMapper.updateTbRegion(tbRegion);
    }

    /**
     * 批量删除区域名
     * 
     * @param ids 需要删除的区域名主键
     * @return 结果
     */
    @Override
    public int deleteTbRegionByIds(Long[] ids)
    {
        return tbRegionMapper.deleteTbRegionByIds(ids);
    }

    /**
     * 删除区域名信息
     * 
     * @param id 区域名主键
     * @return 结果
     */
    @Override
    public int deleteTbRegionById(Long id)
    {
        return tbRegionMapper.deleteTbRegionById(id);
    }
}
