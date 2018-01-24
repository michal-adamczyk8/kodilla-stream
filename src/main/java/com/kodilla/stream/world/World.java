package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents;

    public World(final List<Continent> listOfContinents) {
        this.listOfContinents = new ArrayList<>();
    }

    public List<Continent> getListOfContinents(){
        return listOfContinents;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal worldPeopleQuantity = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return worldPeopleQuantity;

    }
}

