package com.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Oleksandr on 5/10/2016.
 */
@Getter
@Setter
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractAdvert {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEFAULT_ADVERT_GEN")
    private Long id;

    @Column(name = "ADVERT_TEXT", nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name = "AUTHOR_ID", nullable = false)
    private UserProfileEntity author;

    @Column(name = "IS_ADVERT_ACTIVE", nullable = false)
    private boolean isActive;

    @Column(name = "ADVERT_PUBLISH_DATE")
    @Temporal(TemporalType.DATE )
    private Date publishDate;

    @PrePersist
    protected void onCreate() {
        publishDate = Calendar.getInstance().getTime();
    }

    @PreUpdate
    protected void onUpdate() {
        publishDate = Calendar.getInstance().getTime();
    }
}
