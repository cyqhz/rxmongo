package com.github.cyqhz.rxmongo.rpc;

import com.github.cyqhz.api.dto.LogDto;
import com.github.cyqhz.rxmongo.service.LogService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@DubboService
public class LogRpcRpcService implements com.github.cyqhz.api.LogRpcService {

    @Resource
    LogService logService;

    @Override
    public List<LogDto> findAllLogs() {

        return logService.findAllLogs().toStream().map(l -> {
            LogDto logDto = new LogDto();
            BeanUtils.copyProperties(l, logDto);
            return logDto;
        }).collect(Collectors.toList());
    }
}
