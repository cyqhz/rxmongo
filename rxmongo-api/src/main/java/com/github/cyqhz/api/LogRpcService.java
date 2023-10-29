package com.github.cyqhz.api;

import com.github.cyqhz.api.dto.LogDto;

import java.util.List;

public interface LogRpcService {

    List<LogDto> findAllLogs();
}
