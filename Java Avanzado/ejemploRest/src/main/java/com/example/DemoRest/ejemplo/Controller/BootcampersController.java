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


    public BootcampersController(BootcampersService bootcampersService) {this.bootcampersService = bootcampersService;
    this.bootcampersService.add(new Bootcampers("Uno", 123456789));
        this.bootcampersService.add(new Bootcampers("Dos", 789456123));
        this.bootcampersService.add(new Bootcampers("Tres", 456789123));
        this.bootcampersService.add(new Bootcampers("Cuatro", 456123789));
        this.bootcampersService.add(new Bootcampers("Cinco", 123789456));
    }

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
}
