package com.bnpparibas.epita.spring.TPCalculatrice.exposition;

import com.bnpparibas.epita.spring.TPCalculatrice.application.IMoteurCalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/calculette")
public class CalculatriceController {

    @Autowired
    IMoteurCalcul moteurCalcul;

    @GetMapping("/sum/{a}/{b}")
    public double sum(@PathVariable("a") double a, @PathVariable("b") double b){
        return moteurCalcul.sum(a,b);
    }
    @GetMapping("/minus/{a}/{b}")
    double minus(@PathVariable("a") double a, @PathVariable("b") double b){
        return moteurCalcul.minus(a,b);
    }
    @GetMapping("/multiple/{a}/{b}")
    double multiple(@PathVariable("a") double a, @PathVariable("b") double b){
        return moteurCalcul.multiple(a,b);
    }
    @GetMapping("/square/{a}")
    double square(@PathVariable("a") double a){
        return moteurCalcul.square(a);
    }
    @GetMapping("/divide/{a}/{b}")
    double divide(@PathVariable("a") double a, @PathVariable("b") double b){
        if(b!=0){
            return moteurCalcul.divide(a,b);
        }else{
            return 0.0;
        }

    }

}
