package ru.sunsongs.auldanov.tradeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.sunsongs.auldanov.tradeservice.service.DockerService;

import static java.util.Objects.requireNonNull;

@RestController
public class DockerRestController {

    private final DockerService dockerService;
    @Autowired
    public DockerRestController(DockerService dockerService) {
        this.dockerService = requireNonNull(dockerService);
    }
}
