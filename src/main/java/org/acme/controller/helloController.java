package org.acme.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.xml.bind.ValidationException;

import org.acme.service.HelloService;

@Path("/sayhello")
public class helloController {
    @Inject
    private HelloService helloService;

    @GET
    public Response sayHello() throws ValidationException, Exception{
        String response = helloService.sayHello();
        return Response.ok().entity(response).build();
    }

}
