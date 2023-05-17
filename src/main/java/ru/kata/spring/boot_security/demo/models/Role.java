package ru.kata.spring.boot_security.demo.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue
    @Column(name = "role_id")
    private Long id;
    @Column(name = "name")
    private String role;

    static final String ROLE_PREFIX = "ROLE_";

    public Role(String role) {
        this.role = role;
    }

    public Role() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   // public String getRole() {
//        return role;
//    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return  ROLE_PREFIX+role;
    }

}
