package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> listOfCountries;

    public Continent(final String continentName, final List<Country> listOfCountries) {
        this.continentName = continentName;
        this.listOfCountries = new ArrayList<>();
    }

    public List<Country> getListOfCountries(){
        return listOfCountries;
    }
}
