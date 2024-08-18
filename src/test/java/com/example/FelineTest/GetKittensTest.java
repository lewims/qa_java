package com.example.FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class GetKittensTest {

@Test
    public void getKittensWithNoArgumentReturnsOne () {
    Feline feline = new Feline();
    Assert.assertEquals("«getKittens» класса Feline без параметров не возвращает kittensCount = 1",1,feline.getKittens());
    System.out.println("Метод «getKittens» класса Feline без параметров возвращает верный результат");
}

@Test
    public void getKittensWithArgumentReturnsWrightStatement() {
    Random random = new Random();
    Feline feline = new Feline();
    int kittensCount = random.nextInt(1000);
Assert.assertEquals("Метод «getKittens» класса Feline с параметром возвращает неверный kittenCount", kittensCount, feline.getKittens(kittensCount));
System.out.println("Метод «getKittens» класса Feline с параметром возвращает kittenCount, равный заданному аргументу");
}
}
