package com.example.myproject.http

import fr.litarvan.paladin.AfterEvent
import fr.litarvan.paladin.BeforeEvent
import fr.litarvan.paladin.http.Middleware
import fr.litarvan.paladin.http.Request
import fr.litarvan.paladin.http.Response
import fr.litarvan.paladin.http.routing.Route
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMiddleware extends Middleware
{
    private static final Logger log = LoggerFactory.getLogger("ExampleMiddleware")

    @Override
    void before(BeforeEvent event, Request request, Response response, Route route)
    {
        log.info("Calling ${request.method} ${request.uri}")
        // You can cancel function using event.cancelled = true and event.result = 'New result'
;    }

    @Override
    void after(AfterEvent event, Request request, Response response, Route route)
    {
        log.info("Called ${request.method} ${request.uri}")
        // You can edit the result using event.result
    }
}