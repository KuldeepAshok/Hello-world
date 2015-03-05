package com.example.helloworld.resources;

import com.example.helloworld.core.User;
import com.yammer.dropwizard.auth.Auth;
import com.example.helloworld.core.CalculateFib;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/kuldeep")
public class Fibonacii {
    @GET
    @Path("{fib}")
    @Produces(MediaType.APPLICATION_JSON)
    public Integer getFibNumber(@PathParam("fib") Integer n)
    {   
    	//System.out.println(CalculateFib.Fib(n));
        return CalculateFib.Fib(n);
    }
}
