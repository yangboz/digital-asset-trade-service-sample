package ru.sunsongs.auldanov.tradeservice.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "ms_digital_asset")
public class MicroserviceDigitalAsset extends AbstractDigitalAsset {

    public MicroserviceDigitalAsset(String metadata, int type, BigDecimal value) {
        super(metadata, type, value);
    }
}
