package ru.sunsongs.auldanov.tradeservice.controller;

import com.shekhargulati.reactivex.docker.client.RxDockerClient;
import com.shekhargulati.reactivex.docker.client.representations.DockerVersion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.sunsongs.auldanov.tradeservice.service.DockerService;

import javax.annotation.concurrent.ThreadSafe;

import static java.util.Objects.requireNonNull;

@ThreadSafe
@RestController
public class DockerRestController {

    private final DockerService dockerService;

    protected final Log logger = LogFactory.getLog(this.getClass());

    @Autowired
    public DockerRestController(DockerService dockerService) {
        this.dockerService = requireNonNull(dockerService);
        //@see:https://github.com/shekhargulati/rx-docker-client
        //Create a new Docker client using DOCKER_HOST and DOCKER_CERT_PATH environment variables
//        RxDockerClient client = RxDockerClient.fromDefaultEnv();
//        RxDockerClient client = RxDockerClient.newDockerClient("unix:///var/run/docker.sock","");
        // Getting Docker version
//        DockerVersion dockerVersion = client.serverVersion();
//        logger.info(dockerVersion.version()); // 1.8.3
    }
}
