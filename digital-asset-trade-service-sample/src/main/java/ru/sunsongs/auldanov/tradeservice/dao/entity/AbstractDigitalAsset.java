package ru.sunsongs.auldanov.tradeservice.dao.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Date;

@MappedSuperclass
//@see:https://en.wikipedia.org/wiki/Digital_asset#Digital_asset_metadata
public class AbstractDigitalAsset extends AbstractEntity{
    private String metadata;
    private int type;//Types of digital assets include, but are not exclusive to: photography, logos, illustrations, animations, audiovisual media, presentations, spreadsheets, word documents, electronic mails, and a multitude of other digital formats and their respective metadata.
    private BigDecimal value;
    private Date created;
    private long version;

    public AbstractDigitalAsset(String metadata, int type, BigDecimal value) {
        this.metadata = metadata;
        this.type = type;
        this.value = value;
        this.created = new Date();
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Version
    @Column(name = "version")
    public long getVersion() {
        return version;
    }

    @Column(name = "metadata")
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    @Min(0)
    @Column(name = "value")
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created")
    public Date getCreated() {
        return created;
    }

}
