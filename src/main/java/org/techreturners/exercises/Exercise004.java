package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.data_models.PersonDTO;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise004 {

    public static void main(String[] args) throws IOException {

        findAverageCarPrice();
        dataFilteringAndTransformation();

    }

    public static void findAverageCarPrice() throws IOException {
        // Using streams() API find the average car price (to the nearest whole number) from the list of cars
        // Output the resulting double value to the console
        List<Car> cars = MockData.getCars();

        // write your solution here
       double averagePriceInDecimal =  cars.stream()
                .mapToDouble(Car::price)
                .average().orElse(0.0);
       long averagePrice =  Math.round(averagePriceInDecimal);
       System.out.println(averagePrice);
    }

    public static void dataFilteringAndTransformation() throws IOException {
        // I would like to do some object transformation and see a list of PersonDTO objects
        // for all people over the age of 65
        // The PersonDTO can be found in /data_models
        // Print the result to the console

        List<Person> people = MockData.getPeople();

        // write your solution here
        people.stream()
                .filter(person -> person.age() > 65)
                .map(PersonDTO::map)
                .forEach(System.out::println);

    }


}
