package com.ruoyi.manage.mapper;

import java.util.List;
import com.ruoyi.manage.domain.TbBook;
import com.ruoyi.manage.domain.vo.TbBookVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 书籍管理Mapper接口
 * 
 * @author ruoyi
 * @date 2024-10-04
 */
@Mapper
public interface TbBookMapper 
{
    /**
     * 查询书籍管理
     * 
     * @param id 书籍管理主键
     * @return 书籍管理
     */
    public TbBook selectTbBookById(Long id);

    /**
     * 查询书籍管理列表
     * 
     * @param tbBook 书籍管理
     * @return 书籍管理集合
     */
    public List<TbBook> selectTbBookList(TbBook tbBook);

    /**
     * 查询书籍管理列表
     *
     * @param tbBook 书籍管理
     * @return 书籍管理集合
     */
    public List<TbBookVo> selectTbBookVoList(TbBook tbBook);

    /**
     * 新增书籍管理
     * 
     * @param tbBook 书籍管理
     * @return 结果
     */
    public int insertTbBook(TbBook tbBook);

    /**
     * 修改书籍管理
     * 
     * @param tbBook 书籍管理
     * @return 结果
     */
    public int updateTbBook(TbBook tbBook);

    /**
     * 删除书籍管理
     * 
     * @param id 书籍管理主键
     * @return 结果
     */
    public int deleteTbBookById(Long id);

    /**
     * 批量删除书籍管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbBookByIds(Long[] ids);
}
