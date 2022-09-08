package com.fsyume.yume.controller;

import com.fsyume.yume.service.AlipayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/alipay")
@CrossOrigin
@Slf4j
public class AlipayController {

    @Resource
    private AlipayService alipayService;

    @PostMapping("/pay/{pid}")
    public Map tradePagePay(@PathVariable Long pid){
        Map<String, Object> map = new HashMap<>();
        log.info("统一收单下单支付页面接口调用");

        String formStr = alipayService.tradeCreate(pid);

        map.put("formStr",formStr);
        return map;
    }
}
