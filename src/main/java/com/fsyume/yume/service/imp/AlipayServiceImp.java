package com.fsyume.yume.service.imp;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.fsyume.yume.config.AlipayClientConfig;
import com.fsyume.yume.service.AlipayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class AlipayServiceImp implements AlipayService {

    @Resource
    private AlipayClientConfig alipayClientConfig;

    @Override
    public String tradeCreate(Long pid) {
        log.info("生成订单");

        try {
            log.info("调用支付宝接口");

            // AlipayTradeWapPayRequest request = new AlipayTradeWapPayRequest(); // 手机网站支付

            AlipayTradePagePayRequest request = new AlipayTradePagePayRequest(); // 电脑网站支付
            // request.setNotifyUrl("");
            // request.setReturnUrl("");

            // 组装当前业务方法的请求参数
            JSONObject bizContent = new JSONObject();
            bizContent.put("out_trade_no", "1233");
            bizContent.put("total_amount", 1000.01);
            bizContent.put("subject", "Iphone6 16G");
            bizContent.put("product_code", "FAST_INSTANT_TRADE_PAY");
            // bizContent.put("qr_pay_mode", "4");
            // bizContent.put("qrcode_width",100);


            request.setBizContent(bizContent.toString());

            AlipayTradePagePayResponse response = alipayClientConfig.alipayClient().pageExecute(request);

            String body = response.getBody();

            if (response.isSuccess()) {
                log.info("调用成功，返回结果 ====> " + body);
                return body;
            } else {
                System.out.println("调用失败");
            }


        } catch (AlipayApiException e) {
            log.error(String.valueOf(e));
        }
        return null;
    }
}
