package com.test.wechat.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.test.wechat.dto.tuling.TulingReqDto;
import com.test.wechat.dto.tuling.TulingResDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class TulingUtil {
    private static  String tulingUrl = "http://openapi.tuling123.com/openapi/api/v2";

    public static TulingResDto getTulingResult(RestTemplate restTemplate,TulingReqDto dto){

        String result = restTemplate.postForObject(tulingUrl, dto, String.class);
        JSONObject jsonObject = JSON.parseObject(result);
        TulingResDto tulingResDto = JSON.toJavaObject(jsonObject, TulingResDto.class);
        return tulingResDto;
    }
}
