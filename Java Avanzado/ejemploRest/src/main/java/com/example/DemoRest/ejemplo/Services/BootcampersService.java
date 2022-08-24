package com.example.DemoRest.ejemplo.Services;

import com.example.DemoRest.ejemplo.Model.Bootcampers;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcampersService {

    private List<Bootcampers> bootcampers= new ArrayList<>();

    public List<Bootcampers> getAll(){return bootcampers;}

    public void add(Bootcampers bootcamper){
        bootcampers.add(bootcamper);
    }
}
