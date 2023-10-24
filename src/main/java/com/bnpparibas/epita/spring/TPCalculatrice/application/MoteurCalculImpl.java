package com.bnpparibas.epita.spring.TPCalculatrice.application;

import org.springframework.stereotype.Service;

@Service
public class MoteurCalculImpl implements IMoteurCalcul{

    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b){
        return a-b;
    }
    @Override
    public double multiple(double a, double b){
        return a*b;
    }

    @Override
    public double square(double a){
        return a*a;
    }

    @Override
    public double divide(double a, double b){
        return a/b;
    }

}
