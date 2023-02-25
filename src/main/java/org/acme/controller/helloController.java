package org.acme.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.ValidationException;

import org.acme.dto.response.ResultDTO;
import org.acme.service.HelloService;

@Path("/sayhello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class helloController {
    @Inject
    private HelloService helloService;

    @GET
    @CaptureTransaction
    @Operation(summary="say hello", description="say hello")
    public Response sayHello() throws ValidationException, Exception{
        String response = helloService.sayHello();
        return Response.ok().entity(response).build();
    }

}
