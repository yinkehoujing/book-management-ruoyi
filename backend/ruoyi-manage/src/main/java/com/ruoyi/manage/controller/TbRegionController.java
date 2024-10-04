package com.ruoyi.manage.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.manage.domain.TbRegion;
import com.ruoyi.manage.service.ITbRegionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 区域名Controller
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
@RestController
@RequestMapping("/manage/region")
public class TbRegionController extends BaseController
{
    @Autowired
    private ITbRegionService tbRegionService;

    /**
     * 查询区域名列表
     */
    @PreAuthorize("@ss.hasPermi('manage:region:list')")
    @GetMapping("/list")
    public TableDataInfo list(TbRegion tbRegion)
    {
        startPage();
        List<TbRegion> list = tbRegionService.selectTbRegionList(tbRegion);
        return getDataTable(list);
    }

    /**
     * 导出区域名列表
     */
    @PreAuthorize("@ss.hasPermi('manage:region:export')")
    @Log(title = "区域名", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbRegion tbRegion)
    {
        List<TbRegion> list = tbRegionService.selectTbRegionList(tbRegion);
        ExcelUtil<TbRegion> util = new ExcelUtil<TbRegion>(TbRegion.class);
        util.exportExcel(response, list, "区域名数据");
    }

    /**
     * 获取区域名详细信息
     */
    @PreAuthorize("@ss.hasPermi('manage:region:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbRegionService.selectTbRegionById(id));
    }

    /**
     * 新增区域名
     */
    @PreAuthorize("@ss.hasPermi('manage:region:add')")
    @Log(title = "区域名", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbRegion tbRegion)
    {
        return toAjax(tbRegionService.insertTbRegion(tbRegion));
    }

    /**
     * 修改区域名
     */
    @PreAuthorize("@ss.hasPermi('manage:region:edit')")
    @Log(title = "区域名", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbRegion tbRegion)
    {
        return toAjax(tbRegionService.updateTbRegion(tbRegion));
    }

    /**
     * 删除区域名
     */
    @PreAuthorize("@ss.hasPermi('manage:region:remove')")
    @Log(title = "区域名", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbRegionService.deleteTbRegionByIds(ids));
    }
}
