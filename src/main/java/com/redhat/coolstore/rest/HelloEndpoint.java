package com.redhat.coolstore.rest;

import javax.ws.rs.*;

@Path("/hello")
public class HelloEndpoint {

    @GET
    @Path("/")
    public String sayHello() {
        return "Hello from JBoss EAP!";
    }
}
