package com.ali.wechat.controller;

import com.ali.wechat.api.WechatMPApi;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private WechatMPApi wechatMPApi;

    @GetMapping("/getAccessToken")
    public JSONObject getAccessToken(@RequestParam String grant_type,
                                     @RequestParam String appid,
                                     @RequestParam String secret){
        JSONObject accessToken = wechatMPApi.getAccessToken(grant_type, appid, secret);
        return accessToken;
    }

    @GetMapping("/getUserInfo")
    public JSONObject getUserInfo(@RequestParam String access_token,
                                  @RequestParam String openid,
                                  @RequestParam String lang){
        JSONObject userInfo = wechatMPApi.getUserInfo(access_token, openid, lang);
        return userInfo;
    }
}
