package com.umitkirtil.demos.vaadinflow2neo4jspringsec.backend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

/**
 * @author Umit KIRTIL
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Role extends AuditModel {

    @Basic
    private String role;

    @ManyToMany( fetch = FetchType.EAGER, mappedBy = "roles")
    private List<User> users = new ArrayList<>();
}