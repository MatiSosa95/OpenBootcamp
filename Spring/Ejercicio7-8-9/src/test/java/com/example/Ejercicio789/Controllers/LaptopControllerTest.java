package com.example.Ejercicio789.Controllers;

import com.example.Ejercicio789.Entity.Laptop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class LaptopControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;
    @LocalServerPort
    private int port;

    @BeforeEach
    void setUp() {
        restTemplateBuilder= restTemplateBuilder.rootUri("http://localhost:"+port);
        testRestTemplate= new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void findAll() {
        ResponseEntity<Laptop[]> response=
        testRestTemplate.getForEntity("/api/laptops", Laptop[].class);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(200,response.getStatusCodeValue());
        List<Laptop> laptops=Arrays.asList(response.getBody());
        System.out.println(laptops.size());
    }

    @Test
    void findOneById() {
        ResponseEntity<Laptop> response=
                testRestTemplate.getForEntity("/api/laptops/1", Laptop.class);

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());

    }


    @Test
    void create() {
        HttpHeaders header= new HttpHeaders();
        //Esto es para decirle que mandaremos y recibiremos un json
        header.setContentType(MediaType.APPLICATION_JSON);
        header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        String json= """
                {
                    "marca": "Laptop Creada por Test",
                    "microprocesadorNombre": "AMD",
                    "color": "Plateado",
                    "sistemaOperativo": "Windows 11",
                    "tamañoPantalla": 15.5,
                    "pantallaTactil": false
                  }
                """;

        HttpEntity<String> request= new HttpEntity<>(json,header);
        ResponseEntity<Laptop> response= testRestTemplate.exchange("/api/create",HttpMethod.POST,request,Laptop.class);
        Laptop result= response.getBody();

        assertEquals(1l, result.getId());
        assertEquals("Laptop Creada por Test", result.getMarca());
    }
}

