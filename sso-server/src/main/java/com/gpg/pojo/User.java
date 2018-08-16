package com.gpg.pojo;

import com.gpg.pojo.jdtn.Jurisdiction;
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
public class User implements Serializable {

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
