package com.example.DemoRest.ejemplo.Controller;

import com.example.DemoRest.ejemplo.Model.Bootcampers;
import com.example.DemoRest.ejemplo.Services.BootcampersService;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcampersService bootcampersService;


    public BootcampersController(BootcampersService bootcampersService) {this.bootcampersService = bootcampersService; }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcampers> listarTodos(){
        return bootcampersService.getAll();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcampers usuario(@PathParam("name") String name){
    return bootcampersService.get(name);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response addBootcamper(Bootcampers bootcampers){
        bootcampersService.add(bootcampers);

        return Response.created(URI.create("/bootcampers/" + bootcampers.getName())).build();

    }

    @DELETE
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    @Consumes("application/json")
    public void borrarBootcamper(@PathParam("name") String name){
    bootcampersService.delete(name);
    }

    @PUT
    @Path("/bootcampers/{name}")
    public void updateUser(@PathParam("name") String name, Bootcampers boot){
        bootcampersService.update(name, boot);
    }



}
