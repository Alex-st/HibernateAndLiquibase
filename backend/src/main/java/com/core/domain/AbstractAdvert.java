package com.core.domain;

import com.core.domain.enums.AdvertTypeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "ADVERT_TEXT", nullable = false)
    private String text;

    @Column(name= "ADVERT_AUTHOR")
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private UserProfileEntity author;

    @Column(name = "IS_ADVERT_ACTIVE", nullable = false)
    private boolean isActive;

    @Column(name = "ADVERT_PUBLISH_DATE")
    @Temporal(TemporalType.DATE )
    private Date publishDate;

}
