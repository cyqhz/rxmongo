package com.github.cyqhz.rxmongo.repo;

import com.github.cyqhz.rxmongo.entity.Log;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends ReactiveMongoRepository<Log, String> {
}