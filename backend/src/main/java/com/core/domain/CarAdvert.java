package com.core.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Oleksandr_Samosonok on 5/20/2016.
 */
@Getter
@Setter
@Entity
@Table(name = "CAR_ADVERT")
public class CarAdvert extends AbstractAdvert{

    @Column(name = "CAR_MODEL")
    public String carModel;

    @Column(name = "ENGINE_VOLUME")
    public Double engineVolume;

    @Column(name = "CADVERT_PUBLISH_DATE")
    @Temporal(TemporalType.DATE )
    public Date publishDate;
}
