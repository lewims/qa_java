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


@RunWith(Parameterized.class)
public class GetKittensTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    private final String sex;

    @Mock
    Predator predator;

    public GetKittensTest(String sex) {
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
    public void getKittensInvokeGetOffspring() throws Exception {

        Lion lion = new Lion(predator, sex);
        lion.getKittens();
        Mockito.verify(predator, Mockito.times(1)).getOffspring();
        System.out.println("Метод «getKittens» класса Lion вызывает  метод «getOffspring»");
    }

    @Test
    public void getKittensReturnsKittensCountEqualsOne() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        Assert.assertEquals("Метод «getKittens» класса Lion не возвращает kittensCount = 1",1, lion.getKittens());
        System.out.println("Метод «getKittens» класса Lion возвращает kittensCount = 1");
    }
}

