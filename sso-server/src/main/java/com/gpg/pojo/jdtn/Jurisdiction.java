package com.gpg.pojo.jdtn;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;
@Entity
@Setter
@Getter
@Accessors(chain = true)
public class Jurisdiction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jdtId;
    private String jdtName;
    @OneToMany
    private List<JdtUrl> jdUrls;
    private String remarks;
}
