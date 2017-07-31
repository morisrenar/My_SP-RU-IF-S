package com.smnirjhor.facilities.ictcenter.idprovidesconsumer.consumer;

import com.smnirjhor.facilities.ictcenter.idprovidesconsumer.IdProvidesConsumer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/27/17.
 */
@Entity
public class Consumer {
    @Id
    private String idProvidesConsumerId;
    private String idProvidesConsumerName;
    private String idProvidesConsumerPassword;
    @ManyToOne
    private IdProvidesConsumer idProvidesConsumer;

    public Consumer() {
    }

    public Consumer(String idProvidesConsumerId, String idProvidesConsumerName, String idProvidesConsumerPassword, IdProvidesConsumer idProvidesConsumer) {
        this.idProvidesConsumerId = idProvidesConsumerId;
        this.idProvidesConsumerName = idProvidesConsumerName;
        this.idProvidesConsumerPassword = idProvidesConsumerPassword;
        this.idProvidesConsumer = idProvidesConsumer;
    }

    public String getIdProvidesConsumerId() {
        return idProvidesConsumerId;
    }

    public void setIdProvidesConsumerId(String idProvidesConsumerId) {
        this.idProvidesConsumerId = idProvidesConsumerId;
    }

    public String getIdProvidesConsumerName() {
        return idProvidesConsumerName;
    }

    public void setIdProvidesConsumerName(String idProvidesConsumerName) {
        this.idProvidesConsumerName = idProvidesConsumerName;
    }

    public String getIdProvidesConsumerPassword() {
        return idProvidesConsumerPassword;
    }

    public void setIdProvidesConsumerPassword(String idProvidesConsumerPassword) {
        this.idProvidesConsumerPassword = idProvidesConsumerPassword;
    }

    public IdProvidesConsumer getIdProvidesConsumer() {
        return idProvidesConsumer;
    }

    public void setIdProvidesConsumer(IdProvidesConsumer idProvidesConsumer) {
        this.idProvidesConsumer = idProvidesConsumer;
    }
}
