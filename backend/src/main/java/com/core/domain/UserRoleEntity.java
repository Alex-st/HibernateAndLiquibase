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
    @GeneratedValue
//    @GeneratedValue(generator = "T_USR_GEN")
//    @SequenceGenerator(name = "T_USR_GEN", sequenceName = "T_USR_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "USER_ROLE_NAME")
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRole;

}
