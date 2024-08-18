package com.example.FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetFamilyTest {

    @Test
    public void GetFamilyReturnWrightStatement() {
        Feline feline = new Feline();
        Assert.assertEquals("метод «getFamily» класса Feline возвращает неверное значение", "Кошачьи", feline.getFamily());
        System.out.println("метод «getFamily» класса Feline возвращает правильное значение");
    }
}
