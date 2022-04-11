package com.authine.cloudpivot.ext.controller.meeting;

import com.authine.cloudpivot.ext.utils.HttpRequestUtils;
import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthBearerClientRequest;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthAccessTokenResponse;
import org.apache.oltu.oauth2.client.response.OAuthResourceResponse;
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
    public static String accessToken(){
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

    @GetMapping("/formload")
    public String formload() throws Exception {
        String s = accessToken();
        //获取token
        String accessToken = accessToken();
        System.out.println("-----------客户端/accessToken--------------");
        System.out.println(accessToken);

        //表单load
        String loadResponse = formLoadMethod(accessToken, RESOURCE_HOST, "xjianhuiyi01", "a1", "2c2c80857fe3233c017fe3c2b9cd0090");
        System.out.println("-----------客户端/formLoadResponse-----------");
        System.out.println(loadResponse);

//        //表单save
//        String saveResponse = formSaveMethod(accessToken, RESOURCE_HOST,"a68dc51c00257f8cf3b346a6826d3016",saveBody);
//        System.out.println("-----------客户端/formSaveResponse-----------");
//        System.out.println(saveResponse);
//
//        //表单list
//        String listResponse = formListMethod(accessToken, RESOURCE_HOST,"a68dc51c00257f8cf3b346a6826d3016",listBody);
//        System.out.println("-----------客户端/formListResponse-----------");
//        System.out.println(listResponse);
//
//        //表单delete
//        String deleteResponse = formDeleteMethod(accessToken, RESOURCE_HOST, "device", "69dc9a64e7daa7185e99233f46fda98f", "a68dc51c00257f8cf3b346a6826d3016");
//        System.out.println("-----------客户端/formDeleteResponse-----------");
//        System.out.println(deleteResponse);
        return "success";
    }

    public static void main(String[] args) throws Exception {
        String s = accessToken();
        //获取token
        String accessToken = accessToken();
        System.out.println("-----------客户端/accessToken--------------");
        System.out.println(accessToken);

        //表单load
        String loadResponse = formLoadMethod(accessToken, RESOURCE_HOST, "xjianhuiyi01", "a1", "2c2c80857ffe0f57017ffe346e240a1c");
        System.out.println("-----------客户端/formLoadResponse-----------");
        System.out.println(loadResponse);

    }

    /**
     * 表单load
     * @param token
     * @param host
     * @param schemaCode
     * @param objectId
     * @param userId
     * @return
     * @throws Exception
     */
    public static String formLoadMethod(String token, String host, String schemaCode,String objectId, String userId) throws Exception{
        OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());

        String loadUrl = host + (host.endsWith("/")?"":"/") + "api/openapi/runtime/form/load";
        //设置参数
        OAuthClientRequest.AuthenticationRequestBuilder authenticationRequestBuilder = new OAuthClientRequest.AuthenticationRequestBuilder(loadUrl);
        authenticationRequestBuilder.setParameter("schemaCode",schemaCode);
        authenticationRequestBuilder.setParameter("objectId",objectId);
        authenticationRequestBuilder.setParameter("userId",userId);

        //设置token
        OAuthClientRequest oAuthClientRequest = authenticationRequestBuilder.buildQueryMessage();
        OAuthBearerClientRequest oauthRequest = new OAuthBearerClientRequest(oAuthClientRequest.getLocationUri());
        oauthRequest.setAccessToken(token);

        //请求OpenAPI接口
        OAuthResourceResponse resource = oAuthClient.resource(oauthRequest.buildQueryMessage(), OAuth.HttpMethod.GET, OAuthResourceResponse.class);
        String body = resource.getBody();
        return body;
    }

}
