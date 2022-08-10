package org.fasttrackit.Homework18;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping
public class CountryReader {
    @GetMapping
    String sayHello(){
        System.out.println("Calling sayHello");
        return "Hello";

    }

    // nu citeste fisierul countries2.txt


    CountryService countryService = new CountryService(ReadingFromFiles.readFileBuffered("File/countries2.txt"));


}

record Format (String name,String capital,int population,String area , String continent,String neighbour1,String neighbour2) {
    Format {
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String capital() {
        return capital;
    }

    @Override
    public int population() {
        return population;
    }

    @Override
    public String area() {
        return area;
    }

    @Override
    public String continent() {
        return continent;
    }

    @Override
    public String neighbour1() {
        return neighbour1;
    }

    @Override
    public String neighbour2() {
        return neighbour2;
    }

    @Override
    public String toString() {
        return "Format{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area='" + area + '\'' +
                ", continent='" + continent + '\'' +
                ", neighbour1='" + neighbour1 + '\'' +
                ", neighbour2='" + neighbour2 + '\'' +
                '}';
    }
}