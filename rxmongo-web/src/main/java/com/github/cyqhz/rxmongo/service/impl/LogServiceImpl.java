package com.github.cyqhz.rxmongo.service.impl;

import com.github.cyqhz.rxmongo.entity.Log;
import com.github.cyqhz.rxmongo.repo.LogRepository;
import com.github.cyqhz.rxmongo.service.LogService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import javax.annotation.Resource;

@Service
public class LogServiceImpl implements LogService {

    @Resource
    private LogRepository logRepository;

    @Override
    public Flux<Log> findAllLogs() {
        return logRepository.findAll();
    }
}
