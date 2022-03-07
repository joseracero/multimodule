package com.jart.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import service.DatabaseService;

@Controller(value = "/multimodule")
public class MyController {

    @Inject
    private DatabaseService databaseService;

    @Get(value = "/welcome")
    public HttpResponse getData() {

        databaseService.doSomething();
        return HttpResponse.ok("<html><h1>Hello!!!</h1></html>");
    }
}
