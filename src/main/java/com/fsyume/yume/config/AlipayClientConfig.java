package com.fsyume.yume.config;

import com.alipay.api.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@Slf4j
public class AlipayClientConfig {

    @Resource
    private AlipayMateConfig alipayMateConfig;

    @Bean
    public AlipayClient alipayClient() throws AlipayApiException {

        AlipayConfig alipayConfig = new AlipayConfig();
        // 设置网关地址
        alipayConfig.setServerUrl(alipayMateConfig.getGatewayUrl());
        // 设置应用ID
        alipayConfig.setAppId(alipayMateConfig.getApp_id());
        // 设置应用私钥
        alipayConfig.setPrivateKey(alipayMateConfig.getMerchant_private_key());
        // 设置请求格式，固定值json
        alipayConfig.setFormat(AlipayConstants.FORMAT_JSON);
        // 设置字符集
        alipayConfig.setCharset(alipayMateConfig.getCharset());
        // 设置签名类型
        alipayConfig.setSignType(alipayMateConfig.getSign_type());
        // 设置支付宝公钥
        alipayConfig.setAlipayPublicKey(alipayMateConfig.getAlipay_public_key());

        // 实例化客户端
        return new DefaultAlipayClient(alipayConfig);
    }
}
