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
@ToString
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String workNum;
    private String adminName;
    private String adminPass;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Jurisdiction> jdtList;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AdminInfo adminInfo;
    private Integer adminType;
}
