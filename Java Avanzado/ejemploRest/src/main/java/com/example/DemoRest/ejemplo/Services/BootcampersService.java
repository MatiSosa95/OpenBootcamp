package com.example.DemoRest.ejemplo.Services;

import com.example.DemoRest.ejemplo.Model.Bootcampers;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BootcampersService {

    private static List<Bootcampers> bootcampers= new ArrayList<>();

    public List<Bootcampers> getAll(){return bootcampers;}

    public void add(Bootcampers bootcamper){
        bootcampers.add(bootcamper);
    }

    public Bootcampers get(String name){
        for(Bootcampers bootcampers: bootcampers){
            if (bootcampers.getName().equalsIgnoreCase(name)){
                return bootcampers;
            }
        }
        return null;
    }

     public void delete(String name){

       bootcampers= bootcampers.stream().filter(x->!x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());

     }

     public void update(String name, Bootcampers newBoot){
           bootcampers.forEach(bootcamp->{
               if (bootcamp.getName().equalsIgnoreCase(name)){
                   bootcamp.setName(newBoot.getName());
                   bootcamp.setId(newBoot.getId());
               }
           });
     }


}
