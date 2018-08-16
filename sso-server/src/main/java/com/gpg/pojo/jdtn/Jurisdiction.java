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
public class Jurisdiction implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jdtId;
    private String jdtName;
    @OneToMany
    private List<JdtUrl> jdtUrls;
    private String remarks;
}
