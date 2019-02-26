package com.spring.test;

import com.spring.test.repository.CreateQuery;
import com.spring.test.repository.impl.CreateQueryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args)
    {
        CreateQuery createQuery = new CreateQueryImpl();
        createQuery.setData();
        SpringApplication.run(SpringTestApplication.class, args);
    }



}
