package com.github.cyqhz.rxmongo.service;

import com.github.cyqhz.rxmongo.entity.Log;
import reactor.core.publisher.Flux;

public interface LogService {

    Flux<Log> findAllLogs();
}
