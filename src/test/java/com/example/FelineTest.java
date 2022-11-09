package com.example;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {

    // Проверка метода eatMeat класса Feline
    @Test
    public void eatMeatReturnFoodList() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = feline.eatMeat();
        Assert.assertEquals("Incorrect food list for predator", expectedFoodList, actualFoodList);
    }

    // Проверка метода getFamily класса Feline
    @Test
    public void getFamilyReturnCorrectResult() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Incorrect family name", expectedFamily, actualFamily);
    }

    // Проверка метода getKittens (без параметров) класса Feline
    @Test
    public void getKittensReturnOneKitten(){
        Feline feline = new Feline();
        int expectedCountKittens = 1;
        int actualCountKittens = feline.getKittens();
        Assert.assertEquals("Number of kittens must be equal to one", expectedCountKittens, actualCountKittens);
    }

    // Проверка метода getKittens (с параметрами) класса Feline
    @Test
    public void getKittensReturnCorrectNumberKittens(){
        Feline feline = new Feline();
        int expectedCountKittens = 5;
        int actualCountKittens = feline.getKittens(5);
        Assert.assertEquals("Incorrect number Kittens", expectedCountKittens, actualCountKittens);

    }

}
