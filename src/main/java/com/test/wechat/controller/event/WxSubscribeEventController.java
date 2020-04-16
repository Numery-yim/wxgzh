package com.test.wechat.controller.event;

import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.annotation.WxEventMapping;
import com.mxixm.fastboot.weixin.module.event.WxEvent;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import com.test.wechat.domain.WxUserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.scheduling.annotation.Async;

import java.util.Date;

@WxController
@Slf4j
public class WxSubscribeEventController {

    /**
     * 退订
     * 接受微信事件
     *
     * @param wxRequest
     * @param wxUser
     */
    @WxEventMapping(type = WxEvent.Type.UNSUBSCRIBE)
    public void unsubscribe(WxRequest wxRequest, WxUser wxUser) {
        System.out.println(wxUser.getNickName() + "退订了公众号");
    }

    /**
     * 订阅
     *
     * @param wxRequest
     * @param wxUser
     * @return
     */
    @WxEventMapping(type = WxEvent.Type.SUBSCRIBE)
    public String subscribe(WxRequest wxRequest, WxUser wxUser) {
        System.out.println(wxUser.getNickName() + "订了公众号");
        saveWxUserInfo(wxUser);
        log.info("wxRequest==>{},\nwxUser==>{}", wxRequest, wxUser);
        return "非常感谢 " + wxUser.getNickName() + "/:rose  关注yim的个人公众号^_^   /:rose";
    }

    @Async
    public void saveWxUserInfo(WxUser wxUser) {
        WxUserInfo wxUserInfo = new WxUserInfo();
        BeanUtils.copyProperties(wxUser, wxUserInfo);
        wxUserInfo.setSex(wxUser.getSex()+"");
        wxUserInfo.setSubscribe(wxUser.getSubscribe()+"");
        wxUserInfo.setCreateTime(new Date());
//        wxUserInfoService.save(wxUserInfo);
        System.out.println("保存用户信息："+wxUserInfo);
    }

}
