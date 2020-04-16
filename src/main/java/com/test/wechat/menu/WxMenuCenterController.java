package com.test.wechat.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;


@WxController
public class WxMenuCenterController {


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.MIDDLE, main = true, name = "学习工具")
    public void center() {
    }


    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FIRST,
            url = "https://fanyi.baidu.com/?aldtype=16047#auto/zh",
            name = "百度翻译")
    @WxAsyncMessage
    public void youdaofanyi(WxRequest wxRequest) {
    }

    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.SECOND,
            url = "https://blog.csdn.net/",
            name= "CSDN博客")
    public void leftCSDN(WxRequest wxRequest, WxUser wxUser) {

    }


    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.THIRD,
            url = "https://gitee.com/explore",
            name= "码云仓库")
    public void gitee(WxRequest wxRequest, WxUser wxUser) {

    }
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.MIDDLE,
            order = WxButton.Order.FORTH,
            url = "https://www.icourse163.org/#",
            name = "慕课")
    @WxAsyncMessage
    public void MOOC(WxRequest wxRequest) {
    }
}
