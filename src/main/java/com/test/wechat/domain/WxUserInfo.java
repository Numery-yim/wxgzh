package com.test.wechat.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WxUserInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    private String subscribe;

    /**
     * 微信openid
     */
    private String openId;

    private String nickName;

    private String sex;

    private String city;

    private String country;

    private String province;

    private String language;

    private String headImgUrl;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date subscribeTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    private String remark;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_SUBSCRIBE = "SUBSCRIBE";

    public static final String COL_OPEN_ID = "OPEN_ID";

    public static final String COL_NICK_NAME = "NICK_NAME";

    public static final String COL_SEX = "SEX";

    public static final String COL_CITY = "CITY";

    public static final String COL_COUNTRY = "COUNTRY";

    public static final String COL_PROVINCE = "PROVINCE";

    public static final String COL_LANGUAGE = "LANGUAGE";

    public static final String COL_HEAD_IMG_URL = "HEAD_IMG_URL";

    public static final String COL_SUBSCRIBE_TIME = "SUBSCRIBE_TIME";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_REMARK = "REMARK";
}
