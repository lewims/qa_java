package com.example.LionTest;


import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class GetFoodTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Predator predator;

    private final String sex;

    public GetFoodTest(String sex) {
        this.sex = sex;
    }


    @Parameterized.Parameters
    public static Object[][] getManeStatus() {
        return new Object[][] {
                { "Самец"},
                { "Самка"},
        };
    }

    @Test
    public void getFoodInvokesEatMet() throws Exception{
        Lion lion = new Lion(predator, sex);
        lion.getFood();
        Mockito.verify(predator, Mockito.times(1)).eatMeat();
        System.out.println("Метод «getFood» класса Lion вызываает метод «eatMeat»");
    }

    @Test
    public void getFoodReturnsPredatorDiet() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();

        Assert.assertEquals("метод «getFood» класса Lion не возвращает рацион хищника", expected, actual);
        System.out.println("метод «getFood» класса Lion возвращает рацион хищника");
    }





    }



