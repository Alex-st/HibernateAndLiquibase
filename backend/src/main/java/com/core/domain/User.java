package com.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Oleksandr_Samosonok on 5/5/2016.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue
//    @GeneratedValue(generator = "T_USR_GEN")
//    @SequenceGenerator(name = "T_USR_GEN", sequenceName = "T_USR_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "USER_LOGIN", unique=true, nullable = false)
    private String login;

    @Column(name = "USER_PASS", nullable = false)
    private String password;

    @Column(name = "USER_ENABLED", nullable = false)
    private Boolean isEnabled;

    @OneToMany
    private Set<UserRoleEntity> userRoles;
}
