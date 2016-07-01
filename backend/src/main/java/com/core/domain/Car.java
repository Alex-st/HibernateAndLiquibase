package com.core.domain;

import com.core.domain.enums.CarType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

/**
 * Created by Oleksandr_Samosonok on 7/21/2016.
 */
@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Car {

    @Column(name = "CAR_MODEL", nullable = false)
    private String carModel;

    @Column(name = "CAR_YEAR")
    private Date productionYear;

    @Column(name = "ENGINE_VOLUME")
    private Double engineVolume;

    @Column(name = "CAR_TYPE")
    @Enumerated(EnumType.STRING)
    private CarType carType;

}
