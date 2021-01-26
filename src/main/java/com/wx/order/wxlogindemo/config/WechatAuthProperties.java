package com.wx.order.wxlogindemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: Wayne.Wu
 * @Description
 * @Date: 2021/1/26 11:23
 **/
@Component
public class WechatAuthProperties {

    @Value("${auth.wechat.sessionHost}")
    private String sessionHost;

    @Value("${auth.wechat.appId}")
    private String appId;

    @Value("${auth.wechat.secret}")
    private String secret;

    @Value("${auth.wechat.grantType}")
    private String grantType;
}
