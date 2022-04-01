package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName SwMeetingCancleDo
 * Description
 * Create by gfy
 * Date 2022/3/9 16:58
 */
@Data
public class SwMeetingCancleDo {

    private List<String> ids=new ArrayList<>();


    private String userId;

}
