package com.sebferrer.as;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Entry points for the Jetty server
 */
@Path("/service")
public class EntryPoint {
    @GET
    @Path("test1")
    @Produces(MediaType.APPLICATION_JSON)
    public String testGet(@QueryParam("value") String value) {
        return "{\"output\": \"" + value + "\"}";
    }

    @POST
    @Path("test2")
    @Produces(MediaType.APPLICATION_JSON)
    public String testPost(@FormParam("value") String value) {
        return "{\"output\": \"" + value + "\"}";
    }
}

