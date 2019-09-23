package com.eurekabpo.intership.config;

import com.eurekabpo.intership.services.MemoryService;
import com.eurekabpo.intership.services.NameService;
import com.eurekabpo.intership.services.TaskEntityService;
import com.eurekabpo.intership.services.TimeService;
import com.eurekabpo.intership.services.implementations.MemoryServiceImpl;
import com.eurekabpo.intership.services.implementations.NameServiceImpl;
import com.eurekabpo.intership.services.implementations.TaskServiceImpl;
import com.eurekabpo.intership.services.implementations.TimeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.eurekabpo.intership")
@EnableJpaRepositories("com.eurekabpo.intership.repositories")
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
