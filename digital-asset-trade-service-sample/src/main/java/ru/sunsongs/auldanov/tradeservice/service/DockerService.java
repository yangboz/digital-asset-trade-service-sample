package ru.sunsongs.auldanov.tradeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sunsongs.auldanov.tradeservice.dao.MicroserviceDigitalAssetDao;

import javax.annotation.Nonnull;

import static java.util.Objects.requireNonNull;

@Service
public class DockerService {

    private MicroserviceDigitalAssetDao microserviceDigitalAssetDao;

    @Autowired
    public DockerService(@Nonnull MicroserviceDigitalAssetDao microserviceDigitalAssetDao){
        this.microserviceDigitalAssetDao = requireNonNull(microserviceDigitalAssetDao);
    }

}
