package com.authine.cloudpivot.ext.controller.meeting;

import com.authine.cloudpivot.ext.utils.HttpRequestUtils;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ClassName SwDemoTokenController
 * Description
 * Create by gfy
 * Date 2022/3/31 16:28
 */
@RequestMapping("/api/meeting")
@RestController
public class SwDemoTokenController {
    //客户端信息
    private static final String CLIENT_ID = "xclient";
    private static final String CLIENT_SECRET = "0a417ecce58c31b32364ce19ca8fcd15";

    //获取token的地址
    private static final String ACCESS_TOKEN_URL="http://117.78.3.177/api/oauth/token";
    //read、write
    private static final String SCOPE = "read";

    //资源服务地址
    private static final String RESOURCE_HOST = "http://117.78.3.177";

    /**
     * OpenAPI 获取token
     * @return
     */
    @GetMapping("/token")
    public  String accessToken(){
        String accessToken = null;
        OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());

        OAuthClientRequest accessTokenRequest = null;
        OAuthAccessTokenResponse oAuthResponse = null;
        try {
            accessTokenRequest = OAuthClientRequest
                    .tokenLocation(ACCESS_TOKEN_URL)
                    .setGrantType(GrantType.CLIENT_CREDENTIALS)
                    .setClientId(CLIENT_ID)
                    .setClientSecret(CLIENT_SECRET)
                    .setScope(SCOPE)
                    .buildQueryMessage();

            //去服务端请求access token，并返回响应
            oAuthResponse = oAuthClient.accessToken(accessTokenRequest, OAuth.HttpMethod.POST);
        } catch (OAuthSystemException e) {
            e.printStackTrace();
        } catch (OAuthProblemException e){
            e.printStackTrace();
        }
        if(oAuthResponse!=null){
            //获取服务端返回过来的access token
            accessToken = oAuthResponse.getAccessToken();
            String tokenType = oAuthResponse.getTokenType();
            System.out.println("-----------客户端/tokenType---------------");
            System.out.println(tokenType);
        }
        return accessToken;
    }

//    @GetMapping("/formload")
//    public String formload(){
//        String s = accessToken();
//        HttpRequestUtils.httpGet()
//    }

}
