package org.mvnsearch.account;

import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> findById(Integer id);
}