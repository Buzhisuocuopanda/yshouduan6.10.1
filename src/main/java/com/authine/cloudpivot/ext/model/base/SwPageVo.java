package com.authine.cloudpivot.ext.model.base;

import com.authine.cloudpivot.engine.api.model.runtime.ModelViewQueryModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.domain.Page;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * ClassName SwPageVo
 * Description
 * Create by gfy
 * Date 2022/2/23 11:10
 */
@ApiModel("分页返回对象")
public class SwPageVo<T> implements Serializable{
        @JsonIgnore
    private Page<T> page;
    private ModelViewQueryModel view;
    @JsonIgnore
    private PageInfo<T> page2;

    public SwPageVo(Page<T> page) {
        this.page = page;
    }

    public SwPageVo(PageInfo<T> page) {
        this.page2 = page;
    }


    @ApiModelProperty("总页数")
    public int getTotalPages() {
        if (this.page != null) {
            return this.page.getTotalPages();
        } else {
            return this.page2 != null ? page2.getPages() : 0;
        }
    }

    @ApiModelProperty("数据总个数")
    public long getTotalElements() {
        if (this.page != null) {
            return this.page.getTotalElements();
        } else {
            return this.page2 != null ? this.page2.getTotal() : 0L;
        }
    }

    @ApiModelProperty("汇总行数")
    public Long getSumLine() {
        if (this.page != null) {
            return 0L;
        } else {
            //暂时不用
            return  0L;
        }
    }

    @ApiModelProperty("汇总行数")
    public void setSumLine(Integer sumLine) {
        if (this.page2 != null) {
            //暂时不用

//            this.page2.setSumLine(sumLine);
        }

    }

    @ApiModelProperty("汇总数据项")
    public void setSumMap(Map<String, Object> sumMap) {
        if (this.page2 != null) {
            //暂时不用
//            this.page2.setSumMap(sumMap);
        }

    }

    @ApiModelProperty("汇总数据项")
    public Map<String, Object> getSumMap() {
        if (this.page != null) {
            return Maps.newHashMap();
        } else {
            //暂时不用
//            return (Map)(this.page2 != null ? this.page2.getSumMap() : Maps.newHashMap());
            return Maps.newHashMap();
        }
    }

    @ApiModelProperty("业务对象数组")
    public List<T> getContent() {
        if (this.page != null) {
            return this.page.getContent();
        } else {
            return this.page2 != null ? (List<T>) this.page2.getList() : null;
        }
    }

    public ModelViewQueryModel getView() {
        return this.view;
    }

    public void setView(ModelViewQueryModel view) {
        this.view = view;
    }
}
