package com.github.cyqhz.rxmongo.web.rest;

import com.github.cyqhz.rxmongo.entity.Log;
import com.github.cyqhz.rxmongo.service.LogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Resource
    private LogService logService;

    @GetMapping("/findAllLogs")
    public Flux<Log> findAllLogs() {
        return logService.findAllLogs();
    }
}
