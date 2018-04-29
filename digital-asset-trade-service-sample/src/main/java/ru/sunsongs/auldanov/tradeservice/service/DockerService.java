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

    //@see: https://github.com/blacklabelops/volumerize
    //0.run kinds of dockerized microservice.e.g:Wordpress,Mediawiki,Phabricator,Jenkins...
    //1. attach the microservice' data to folders inside the container
    // and tell blacklabelops/volumerize to backup folder /source to folder /backup.
    //2.execute commands inside the container, e.g. doing an immediate single-backup or multi-backup:docker exec volumerize backup
    //3.Restore:
    //3.1 First stop your Volumerize container and start a another container with the same environment variables
    // and the same volume but without read only mode!
    //3.2 Then stop the backup container and restore with the following command.
    // The only difference is that we exclude the read only option :ro from the source volume and added it to the backup volume:
    //3.3 Triggers a once time restore. The container for executing the restore command will be deleted afterwards：
    //docker start volumerize
    //3.4 You can pass the --dry-run parameter to the restore command in order to test the restore functionality:
    //3.5 in order to see the differences between backup and source you need the verify command:
    //Duplicity Parameters
    //Symmetric Backup Encryption
    //Asymmetric Key-Based Backup Encryption
    //Enforcing Full Backups Periodically

    //Creates an backup with the containers configuration
    public void backup(){}

    //Creates a full backup with the containers configuration
    public void backupFull(){}

    //Creates an incremental backup with the containers configuration
    public void backupIncremental(){}

    //Compare the latest backup to your local files
    public void verify(){}

    //Be Careful! Triggers an immediate force restore with the latest backup
    public void restore(){}

    //Same script that will be triggered by the periodic schedule
    public void periodicBackup(){}

    //Starts the specified Docker containers
    public void startContainers(){}

    //Stops the specified Docker containers
    public void stopContainers(){}


    //Delete older backups
    public void removeOlderThan(){}

    //Cleanup of old Cache locks.
    public void cleanCacheLocks(){}

}
