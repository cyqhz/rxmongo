package com.github.cyqhz.rxmongo.web.rest;

import com.github.cyqhz.api.LogRpcService;
import com.github.cyqhz.rxmongo.entity.Log;
import com.github.cyqhz.rxmongo.service.LogService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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
