package com.authine.cloudpivot.ext.model.doo;

import com.authine.cloudpivot.ext.model.dto.MeetingDetailModel;
import com.authine.cloudpivot.ext.model.dto.Skudto;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.*;

@Data
public class SwGoodsDo {
    @NotBlank(message = "创建者不能为空")
    private String creater;

    private Date createTime;

    private String updater;

    private Byte deleted;

    private String ysResult;
    //是否提交成功1：成功 2：失败',
    private Byte endCommit;
    @NotBlank(message = "货物名称不能为空")
    @Length(min = 1,max = 100,message = "货物名称最多100字")
    private String goodsName;
    @NotBlank(message = "货物编号不能为空")
    @Length(min = 1,max = 50,message = "货物编号最多150字")
    private String goodsCode;
   /* @NotBlank(message = "货物详情不能为空")
    @Length(min = 1,max = 100,message = "货物详情最多100字")*/
    private String goodsDetail;

    private String goodsHeadPic;
   /* @NotBlank(message = "仓库id不能为空")
    @Length(min = 1,max = 50,message = "仓库id最多36字")*/
    private String swStoreId;
    @NotBlank(message = "货物采购公司不能为空")
    @Length(min = 1,max = 50,message = "货物采购公司最多36字")
    private String goodsCompany;
   /* @NotBlank(message = "仓库名称不能为空")
    @Length(min = 1,max = 50,message = "仓库名称最多50字")*/
    private String swStoreName;

    private Integer goodsTotalNum;

    private BigDecimal skuPrice;

    private String skuCode;



    //public List<Skudto> details=new ArrayList<Integer>();
    private List<Skudto> details=new ArrayList<>();



}
