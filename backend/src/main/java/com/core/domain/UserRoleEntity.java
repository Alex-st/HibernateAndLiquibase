package com.core.domain;

import com.core.domain.enums.UserRoleEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Oleksandr on 5/5/2016.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER_ROLE")
public class UserRoleEntity {

    @Id
    @Column(name = "USER_ROLE_ID")
    @GeneratedValue(generator = "USR_ROLE_GEN")
    @SequenceGenerator(name = "USR_ROLE_GEN", sequenceName = "user_role_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "USER_ROLE_NAME")
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

}
