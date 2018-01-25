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
        Country country1 = new Country("Poland", new BigDecimal("123456789"));
        Country country2 = new Country("Germany", new BigDecimal("1234567899"));
        Country country3 = new Country("France", new BigDecimal("12345678999"));
        Country country4 = new Country("Canada", new BigDecimal("123456789"));
        Country country5 = new Country("Mexico", new BigDecimal("1234567899"));
        Country country6 = new Country("United States", new BigDecimal("12345678999"));
        Country country7 = new Country("Brazil", new BigDecimal("987654321"));
        Country country8 = new Country("Argentina", new BigDecimal("9876543211"));
        Country country9 = new Country("Chile", new BigDecimal("98765432111"));
        Country country10 = new Country("South Africa", new BigDecimal("987654321"));
        Country country11 = new Country("Nigeria", new BigDecimal("9876543211"));
        Country country12 = new Country("Egypt", new BigDecimal("98765432111"));

        Continent europe = new Continent("Europe");
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(country4);
        northAmerica.addCountry(country5);
        northAmerica.addCountry(country6);
        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(country7);
        southAmerica.addCountry(country8);
        southAmerica.addCountry(country9);
        Continent africa = new Continent("Africa");
        africa.addCountry(country10);
        africa.addCountry(country11);
        africa.addCountry(country12);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(africa);


        //When
        BigDecimal expectedResult = world.getPeopleQuantity();
        BigDecimal actualResult = new BigDecimal("246666666660");
        //Then
        Assert.assertEquals(expectedResult,actualResult);
    }
}
