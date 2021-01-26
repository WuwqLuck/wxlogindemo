package com.wx.order.wxlogindemo.dto;

import com.wx.order.wxlogindemo.enums.Gender;
import lombok.Data;

/**
 * @Author: Wayne.Wu
 * @Description
 * @Date: 2021/1/26 11:24
 **/
@Data
public class Consumer {
    private Long id;
    private String username;
    private String wechatOpenid;
    private Long phone;
    private String nickname;
    private String avatarUrl;
    private Gender gender;
    private String email;
    private Long lastLoginTime;
    private Boolean deleted;
    private Long createdBy;
    private Long createdAt;
    private Long updatedBy;
    private Long updatedAt;
}
