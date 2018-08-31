package com.gpg.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo implements Serializable {
    @Id
    private Long userId;
    /**性别 0-女，1-男*/
    private Integer sex;
    /**真实姓名*/
    private String realName;
    /**身份证号*/
    private String idCardNo;
    /**生日*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime birthday;
    /**注册时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime registerTime;
    /**备注信息*/
    private String remarks;

}
