package com.example.Ejercicio456.Controllers;

import com.example.Ejercicio456.Entity.Laptop;
import com.example.Ejercicio456.Repository.LaptopRepository;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class LaptopController {

    private LaptopRepository lr;

    public LaptopController(LaptopRepository lr) {
        this.lr = lr;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> listarLaptops(){
        return lr.findAll();

    }
    @PostMapping("/api/create")
    public void addLaptop(@RequestBody Laptop laptop){
        lr.save(laptop);


    }
}
