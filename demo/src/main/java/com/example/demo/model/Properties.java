package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTIES")
public class Properties {

    public Properties() {

    }

    public Properties(String k, String v) {
        super();
        this.key = k;
        this.value = v;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;
    @Column(name = "key")
    private String key;
    @Column(name = "value")
    private String value;

}
