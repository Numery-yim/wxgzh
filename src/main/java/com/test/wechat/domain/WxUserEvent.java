package com.test.wechat.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WxUserEvent implements Serializable {
    private Long id;

    /**
     * 用于openid
     */
    private String openId;

    /**
     * 操作事件
     */
    private String event;

    /**
     * 操作时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_OPEN_ID = "OPEN_ID";

    public static final String COL_EVENT = "EVENT";

    public static final String COL_CREATE_TIME = "CREATE_TIME";
}
