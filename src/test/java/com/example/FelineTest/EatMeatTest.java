package com.example.FelineTest;


import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.Arrays;
import java.util.List;



@RunWith(MockitoJUnitRunner.class)
public class EatMeatTest {

    @Spy
  Feline feline;

    @Test
    public void EatMeatInvokesGetFoodMethod() throws Exception {
        feline.eatMeat();
      Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
      System.out.println("Метод «getFood» класса Feline вызван ровно 1 раз");

      }

      @Test
    public void EatMeatReturnWrightStatement() throws Exception {
          List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
          List<String> actual = feline.eatMeat();
          Assert.assertEquals("метод «eatMeat» класса Feline возвращает неверное значение", expected, actual);

          System.out.println("Метод «eatMeat» класса Feline возвращает правильное значение");
      }

    }

