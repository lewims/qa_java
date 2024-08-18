package com.example.LionTest;


import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DoesHaveManeTest {
Predator predator;
private final String sex;
private final boolean expectedManeStatus;

public DoesHaveManeTest (String sex, boolean expectedManeStatus) {
    this.sex = sex;
    this.expectedManeStatus = expectedManeStatus;
}

@Parameterized.Parameters
    public static Object[][] getManeStatus() {
    return new Object[][] {
            { "Самец", true},
            { "Самка", false},
    };
}

@Test
    public void doesHaveManeReturnsWrightManeStatus() throws Exception {
    Lion lion = new Lion(predator, sex);
boolean actual = lion.doesHaveMane();
    Assert.assertEquals("Метод «doesHaveMane» класса Lion присваевает неверное значение", expectedManeStatus,actual);
    System.out.println("Метод «doesHaveMane» класса Lion присваевает неверное значение");
}
}
