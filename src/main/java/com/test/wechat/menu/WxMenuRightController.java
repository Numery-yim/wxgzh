package com.test.wechat.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.web.WxRequest;


@WxController
public class WxMenuRightController {

    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.RIGHT, main = true, name = "疫情咨询")
    public void right() {
    }


    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.FIRST,
            url = "https://voice.baidu.com/act/newpneumonia/newpneumonia/",
            name = "百度疫情信息")
    @WxAsyncMessage
    public void baidu(WxRequest wxRequest) {
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.SECOND,
            url = "https://news.qq.com/zt2020/page/feiyan.htm#/global",
            name = "腾讯疫情信息")
    @WxAsyncMessage
    public void tengxun(WxRequest wxRequest) {
    }

    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.RIGHT,
            order = WxButton.Order.THIRD,
            url = "https://ncov.dxy.cn/ncovh5/view/pneumonia?scene=2&clicktime=1579658964&enterid=1579658964&from=timeline&isappinstalled=0",
            name = "丁香医生疫情信息")
    @WxAsyncMessage
    public void dingxiangyisheng(WxRequest wxRequest) {
    }
}
