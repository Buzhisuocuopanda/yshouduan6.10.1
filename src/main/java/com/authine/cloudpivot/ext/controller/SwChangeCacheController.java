package com.authine.cloudpivot.ext.controller;

import com.authine.cloudpivot.engine.domain.Client;
import com.authine.cloudpivot.engine.service.SystemSetting.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName SwChangeCacheController
 * Description
 * Create by gfy
 * Date 2022/4/1 13:17
 */
@RestController
@RequestMapping("/login")
public class SwChangeCacheController {

    @Resource
    private ClientService clientService;
    @GetMapping("/changeClient")
    public String changeClient(){
        Client api = clientService.getByClientId("api");
        api.setRegisteredRedirectUris("http://117.78.3.177/admin,http://117.78.3.177/admin#/oauth,http://117.78.3.177/oauth");
        clientService.update(api);
        return "success";
    }

}
