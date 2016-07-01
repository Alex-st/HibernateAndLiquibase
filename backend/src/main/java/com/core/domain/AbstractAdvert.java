package com.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Oleksandr_Samosonok on 5/10/2016.
 */
@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractAdvert {

    @Id
    private Long id;

    @Column(nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private UserProfileEntity author;

    @Column(nullable = false)
    private boolean isActive;

}
