package com.ruoyi.manage.domain.vo;

import com.ruoyi.manage.domain.TbBook;

public class TbBookVo extends TbBook {

    private String categoryName;
    private String regionName;

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public TbBookVo(){};

    public TbBookVo(String categoryName, String regionName) {
        this.categoryName = categoryName;
        this.regionName = regionName;
    }

    @Override
    public String toString() {
        return "TbBookVo [categoryName=" + categoryName + ", regionName=" + regionName + ", getAuthor()=" + getAuthor()
                + ", getBookName()=" + getBookName() + ", getCategoryId()=" + getCategoryId() + ", getCover()="
                + getCover() + ", getCreateBy()=" + getCreateBy() + ", getCreateTime()=" + getCreateTime()
                + ", getId()=" + getId() + ", getParams()="+ getParams() + ", getPrice()=" + getPrice();
    }
}
