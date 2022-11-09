package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

// проверка метода getKittens класса Lion
    @Test
    public void getKittensReturnOneKitten() throws Exception{
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedAmountKittens = 1;
        int actualAmountKittens = lion.getKittens();
        Assert.assertEquals("Incorrect amount Kittens", expectedAmountKittens, actualAmountKittens);
    }
// проверка метода getFood класса Lion
    @Test
    public void getFoodReturnCorrectFoodList() throws Exception{
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = lion.getFood();
        Assert.assertEquals("Incorrect food list for lion", expectedFoodList, actualFoodList);
    }
}
