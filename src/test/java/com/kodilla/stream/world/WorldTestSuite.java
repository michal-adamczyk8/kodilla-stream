package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPopleQuantity(){
        //Given
        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(new Country("Poland", new BigDecimal("123456789")));
        europeanCountries.add(new Country("Germany", new BigDecimal("1234567899")));
        europeanCountries.add(new Country("France", new BigDecimal("12345678999")));
        List<Country> northAmericanCountires = new ArrayList<>();
        northAmericanCountires.add(new Country("Canada", new BigDecimal("123456789")));
        northAmericanCountires.add(new Country("Mexico", new BigDecimal("1234567899")));
        northAmericanCountires.add(new Country("United States", new BigDecimal("12345678999")));
        List<Country> southAmericanCountires = new ArrayList<>();
        southAmericanCountires.add(new Country("Brazil", new BigDecimal("987654321")));
        southAmericanCountires.add(new Country("Argentina", new BigDecimal("9876543211")));
        southAmericanCountires.add(new Country("Chile", new BigDecimal("98765432111")));
        List<Country> africanCountires = new ArrayList<>();
        africanCountires.add(new Country("South Africa", new BigDecimal("987654321")));
        africanCountires.add(new Country("Nigeria", new BigDecimal("9876543211")));
        africanCountires.add(new Country("Egypt", new BigDecimal("9876543211")));

        Continent europe = new Continent("Europe", europeanCountries);
        Continent northAmerica = new Continent("North America", northAmericanCountires);
        Continent southAmerica = new Continent("South America", southAmericanCountires);
        Continent africa = new Continent("Africa", africanCountires);

        List<Continent> listOfContinents = new ArrayList<>();
        listOfContinents.add(europe);
        listOfContinents.add(northAmerica);
        listOfContinents.add(southAmerica);
        listOfContinents.add(africa);

        //When
        World world = new World(listOfContinents);
        BigDecimal expectedResult = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expectedResult,"246666666660");
    }
}
