package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SwStoreupdateDo {

    private List<String> ids=new ArrayList<>();

    private String userId;
}
