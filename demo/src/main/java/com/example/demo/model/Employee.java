package com.example.demo.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    public Employee() {

    }

    public Employee(Employee parent, Integer supervisorId) {
        this.parent = parent;
        this.supervisorId = supervisorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee parent;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "supervisorId")
    private Set<Employee> children;

    @Column(name = "supervisor_id")
    private Integer supervisorId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "p_fid", referencedColumnName = "id")
    private List<Properties> properties = new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
