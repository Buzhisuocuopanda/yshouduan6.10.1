package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
public class SwMeetingZoomupdateDO {

    private List<String> ids=new ArrayList<>();

    private String userId;


}
