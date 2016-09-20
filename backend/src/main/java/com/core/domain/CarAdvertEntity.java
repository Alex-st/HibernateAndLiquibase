package com.core.domain;

import com.core.domain.enums.AdvertTypeEnum;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.EnumType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Embedded;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;


/**
 * Created by Oleksandr on 5/20/2016.
 */
@Getter
@Setter
@Entity
@Table(name = "CAR_ADVERT")
@AttributeOverride(name = "id", column = @Column(name = "CAR_ADVERT_ID"))
/* Override default generator for this class, so every subclass of AbstractAdvert should have own overrided generator */
@SequenceGenerator(name = "DEFAULT_ADVERT_GEN", sequenceName = "car_advert_SEQ", allocationSize = 20)
public class CarAdvertEntity extends AbstractAdvert{

    @Column(name = "ADVERT_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private AdvertTypeEnum advertType;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "carModel", column = @Column(name = "CAR_MODEL")),
            @AttributeOverride(name = "engineVolume", column = @Column(name = "CAR_ENGINE_VOLUME")),
            @AttributeOverride(name = "carType", column = @Column(name = "CAR_TYPE")),
            @AttributeOverride(name = "productionYear", column = @Column(name = "CAR_PRODUCTION_YEAR"))
    })
    private Car car;
}
