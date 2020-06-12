package com.github.viniciusfcf.meetup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jaxrs")
public class MeuJAXRS {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String methodname() {
        return "hello";
    }
}