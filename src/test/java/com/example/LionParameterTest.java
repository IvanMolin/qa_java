package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)
public class LionParameterTest {
    private final String sexLion;
    private final boolean expectedHaveMane;

    public LionParameterTest(String sexLion, boolean expectedHaveMane) {
        this.sexLion = sexLion;
        this.expectedHaveMane = expectedHaveMane;
    }

    @Parameterized.Parameters
    public static Object[][] getHaseMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    private Feline feline;

// проерка метода doesHaveMane класса Lion
    @Test
    public void doesHaveManeReturnPresenceOfMane() throws Exception{
        Lion lion = new Lion(sexLion, feline);
        boolean actualHaveMane = lion.doesHaveMane();
        Assert.assertEquals("Incorrect behavior of mane presence method", expectedHaveMane, actualHaveMane);
    }





}
