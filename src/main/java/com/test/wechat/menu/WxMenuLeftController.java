package com.test.wechat.menu;

import com.mxixm.fastboot.weixin.annotation.WxAsyncMessage;
import com.mxixm.fastboot.weixin.annotation.WxButton;
import com.mxixm.fastboot.weixin.annotation.WxController;
import com.mxixm.fastboot.weixin.module.user.WxUser;
import com.mxixm.fastboot.weixin.module.web.WxRequest;
import lombok.extern.slf4j.Slf4j;



@WxController
@Slf4j
public class WxMenuLeftController {


    /**
     * 定义微信菜单
     */
    @WxButton(group = WxButton.Group.LEFT, main = true, name = "关于我")
    public void left() {
    }

    /**
     * 定义微信菜单，并接受事件
     * @return
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.FIRST,
            url = "http://123.57.177.220:8080",
            name= "个人简历")
    @WxAsyncMessage
    public void leftmySelf(WxRequest wxRequest, WxUser wxUser) {

    }



    /**
     * 定义微信菜单，并接受事件
     */
    @WxButton(type = WxButton.Type.VIEW,
            group = WxButton.Group.LEFT,
            order = WxButton.Order.SECOND,
            url = "https://github.com/liangyehao",
            name= "GitHub仓库")
    public void leftGitHub(WxRequest wxRequest, WxUser wxUser) {
        log.info("GitHub：{}",wxUser);
    }

}
