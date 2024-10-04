package com.ruoyi.manage.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.manage.domain.vo.TbBookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.manage.mapper.TbBookMapper;
import com.ruoyi.manage.domain.TbBook;
import com.ruoyi.manage.service.ITbBookService;

/**
 * 书籍管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
@Service
public class TbBookServiceImpl implements ITbBookService 
{
    @Autowired
    private TbBookMapper tbBookMapper;

    /**
     * 查询书籍管理
     * 
     * @param id 书籍管理主键
     * @return 书籍管理
     */
    @Override
    public TbBook selectTbBookById(Long id)
    {
        return tbBookMapper.selectTbBookById(id);
    }

    /**
     * 查询书籍管理列表
     * 
     * @param tbBook 书籍管理
     * @return 书籍管理
     */
    @Override
    public List<TbBook> selectTbBookList(TbBook tbBook)
    {
        return tbBookMapper.selectTbBookList(tbBook);
    }

    @Override
    public List<TbBookVo> selectTbBookVoList(TbBook tbBook) {
       return tbBookMapper.selectTbBookVoList(tbBook) ;
    }

    /**
     * 新增书籍管理
     * 
     * @param tbBook 书籍管理
     * @return 结果
     */
    @Override
    public int insertTbBook(TbBook tbBook)
    {
        tbBook.setCreateTime(DateUtils.getNowDate());
        return tbBookMapper.insertTbBook(tbBook);
    }

    /**
     * 修改书籍管理
     * 
     * @param tbBook 书籍管理
     * @return 结果
     */
    @Override
    public int updateTbBook(TbBook tbBook)
    {
        tbBook.setUpdateTime(DateUtils.getNowDate());
        return tbBookMapper.updateTbBook(tbBook);
    }

    /**
     * 批量删除书籍管理
     * 
     * @param ids 需要删除的书籍管理主键
     * @return 结果
     */
    @Override
    public int deleteTbBookByIds(Long[] ids)
    {
        return tbBookMapper.deleteTbBookByIds(ids);
    }

    /**
     * 删除书籍管理信息
     * 
     * @param id 书籍管理主键
     * @return 结果
     */
    @Override
    public int deleteTbBookById(Long id)
    {
        return tbBookMapper.deleteTbBookById(id);
    }
}
