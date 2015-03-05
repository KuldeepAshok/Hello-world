package com.example.helloworld.resources;

import com.example.helloworld.core.User;
import com.yammer.dropwizard.auth.Auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/protected")
public class ProtectedResource {
    /*@GET
    public String showSecret(@Auth User user) {
        return String.format("Hey there, %s. You know the secret!", user.getName());
    }*/
    @GET
    @Path("{fib}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getFibNumber(@PathParam("fib") Integer n1)
    {   
        return "1";
    }
}
