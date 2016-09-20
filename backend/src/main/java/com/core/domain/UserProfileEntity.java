package com.core.domain;

import com.core.domain.enums.Languages;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Oleksandr on 4/20/2016.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER_PROFILE")
public class UserProfileEntity {

    @Id
    @Column(name = "USERP_ID")
    @GeneratedValue(generator = "USRP_GEN")
    @SequenceGenerator(name = "USRP_GEN", sequenceName = "user_profile_SEQ", allocationSize = 20)
    private Long id;

    @Column(name = "USERP_NAME", nullable = false)
    private String name;

    @Column(name = "USERP_SURNAME")
    private String surname;

    @Column(name = "USERP_EMAIL", unique=true, nullable = false)
    private String email;

    @Column(name = "USERP_LOGIN", unique=true, nullable = false)
    private String login;

    @Column(name= "USERP_BIRTHDAY")
    @Temporal(value=TemporalType.DATE)
    private Date birthday;

    @Column(name= "USERP_LANGUAGE")
    @Enumerated(EnumType.STRING)
    private Languages language;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false, updatable = false)
    private UserEntity user;

}
