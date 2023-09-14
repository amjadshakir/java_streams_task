package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise003 {

    public static void main(String[] args) throws IOException {

        groupByColour();

    }

    public static void groupByColour() throws IOException {
        // I would like information for some cars returned in a specific way.
        // I'm looking for cars that are less than 20000 and made in 1995
        // Group the results together by their colour and print to the console

        List<Car> cars = MockData.getCars();

        // write your solution here
        cars.stream()
                .filter(car -> car.price() < 20000)
                .filter(car -> car.year() == 1995)
                .forEach(System.out::println);

    }

}




