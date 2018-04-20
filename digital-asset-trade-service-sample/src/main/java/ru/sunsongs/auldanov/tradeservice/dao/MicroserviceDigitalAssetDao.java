package ru.sunsongs.auldanov.tradeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sunsongs.auldanov.tradeservice.dao.entity.MicroserviceDigitalAsset;

public interface MicroserviceDigitalAssetDao extends JpaRepository<MicroserviceDigitalAsset,Long> {
}
