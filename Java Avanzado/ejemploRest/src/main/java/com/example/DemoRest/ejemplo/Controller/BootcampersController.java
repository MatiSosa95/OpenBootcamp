package com.example.DemoRest.ejemplo.Controller;

import com.example.DemoRest.ejemplo.Model.Bootcampers;
import com.example.DemoRest.ejemplo.Services.BootcampersService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcampersService bootcampersService;


    public BootcampersController(BootcampersService bootcampersService) {this.bootcampersService = bootcampersService;}

    @GET
    @Path("/bootcampers")
    public List<Bootcampers> listarTodos(){
        return bootcampersService.getAll();
    }
}
