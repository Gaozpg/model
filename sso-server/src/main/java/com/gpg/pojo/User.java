package com.gpg.pojo;

import com.gpg.pojo.jdtn.Jurisdiction;
import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String userPass;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Jurisdiction> jdtList;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private UserInfo userInfo;
    private Integer userType;
}
