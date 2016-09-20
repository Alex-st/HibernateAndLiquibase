package com.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Oleksandr on 5/5/2016.
 */
@Getter
@Setter
@Entity
@Table(name = "T_USER")
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(generator = "USR_GEN")
    @SequenceGenerator(name = "USR_GEN", sequenceName = "t_user_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "USER_LOGIN", unique=true, nullable = false)
    private String login;

    @Column(name = "USER_PASS", nullable = false)
    private String password;

    @Column(name = "USER_ENABLED", nullable = false)
    private Boolean isEnabled;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinTable(name = "USER_ROLES_MAPPING", joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ROLE_ID"))
    private Set<UserRoleEntity> userRoles;
}
