package com.gpg.pojo.jdtn;

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
@ToString
/**
 * 权限表
 */
public class Jdt implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jdtId;
    /**权限名称*/
    private String jdtName;
    /**权限类型*/
    private Integer jdtType;
    /**权限备注*/
    private String remarks;
}
