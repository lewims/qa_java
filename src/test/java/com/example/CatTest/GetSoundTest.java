package com.example.CatTest;

import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetSoundTest {
    Feline feline = new Feline();
     Cat cat = new Cat(feline);
     @Test
      public void getSoundReturnsMeow() {
          Assert.assertEquals("Метод «getSound» класса Cat не возвращает «Мяу»", "Мяу", cat.getSound());
          System.out.println("Метод «getSound» класса Cat возвращает «Мяу»");
      }

}
