package com.example.CatTest;

import com.example.Cat;
import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GetFoodTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodInvokeGetMeatMethod() throws Exception {

        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
        System.out.println("Метод «getFood» класса Cat вызываает метод «eatMeat»");
    }

    @Test
    public void getFoodReturnsPredatorDiet() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actual = cat.getFood();

        Assert.assertEquals("метод «getFood» класса Cat не возвращает рацион хищника", expected, actual);
        System.out.println("метод «getFood» класса Cat возвращает рацион хищника");
    }

}
