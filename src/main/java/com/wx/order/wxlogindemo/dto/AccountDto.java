package com.wx.order.wxlogindemo.dto;

import com.wx.order.wxlogindemo.enums.Gender;
import lombok.Data;

/**
 * @Author: Wayne.Wu
 * @Description
 * @Date: 2021/1/26 11:24
 **/
@Data
public class AccountDto {
    private Long id;
    private String username;
    private Long phone;
    private Gender gender;
    private String vcode;
    private String password;
    private String promotionCode;
    private String InvitationCode;
    private String clientAssertion;
    private String code;
}
