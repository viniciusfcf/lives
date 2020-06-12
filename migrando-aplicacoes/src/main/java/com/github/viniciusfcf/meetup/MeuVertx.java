package com.github.viniciusfcf.meetup;

import javax.enterprise.event.Observes;

import io.vertx.ext.web.Router;

public class MeuVertx {

    public void start(@Observes final Router router) {
        router.get("/vertx").handler(rc -> rc.response().end("Ola do Vertx"));
    }

}