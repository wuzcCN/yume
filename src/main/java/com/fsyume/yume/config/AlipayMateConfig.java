package com.fsyume.yume.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class AlipayMateConfig {
    @Value("${alipay.app_id}")
    private String app_id;

    @Value("${alipay.merchant_private_key}")
    private String merchant_private_key;

    @Value("${alipay.alipay_public_key}")
    private String alipay_public_key;

    @Value("${alipay.notify_ur1}")
    private String notify_ur1;

    @Value("${alipay.return_ur1}")
    private String return_ur1;

    @Value("${alipay.sign_type}")
    private String sign_type;

    @Value("${alipay.charset}")
    private String charset;

    @Value("${alipay.gatewayUrl}")
    private String gatewayUrl;


}
