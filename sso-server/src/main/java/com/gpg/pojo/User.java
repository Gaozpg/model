package com.gpg.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
/**
 * 用户表
 */
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userPass;
    /**注册邮箱*/
    private String email;
    /**手机号*/
    private String phone;
    /**用户状态*/
    private Integer userType;
}
