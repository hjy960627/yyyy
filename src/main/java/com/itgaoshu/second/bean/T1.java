package com.itgaoshu.second.bean;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Table(name = "T1")
public class T1 implements Serializable {
    @Id
    private Integer id;
    private String name;
    private Double salary;
}
