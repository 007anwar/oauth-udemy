package com.example.oauth.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;
@Entity
@Data
public class Role implements GrantedAuthority {
    @Id
    private int id;
    @NotEmpty
    private String name;
    @ManyToMany(mappedBy = "role")
    private Set<User> users;

    @Override
    public String getAuthority() {
        return name;
    }
}
