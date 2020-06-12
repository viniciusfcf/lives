package com.github.viniciusfcf.meetup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Multi;

@Path("/reativo")
public class ProgramacaoReativa {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Multi<String> methodname() {
        return Multi.createFrom().items("Ola", "Multi").onItem().apply(s -> "+"+s).onCompletion().continueWith("!");
    }
}