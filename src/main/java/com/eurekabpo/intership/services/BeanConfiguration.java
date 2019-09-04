package com.eurekabpo.intership.services;

import com.eurekabpo.intership.services.implementations.MemoryServiceImpl;
import com.eurekabpo.intership.services.implementations.NameServiceImpl;
import com.eurekabpo.intership.services.implementations.TimeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    MemoryService memoryService() {
        return new MemoryServiceImpl();
    }

    @Bean
    TimeService timeService() {
        return new TimeServiceImpl();
    }

    @Bean
    NameService nameService() {
        return new NameServiceImpl();
    }

}
