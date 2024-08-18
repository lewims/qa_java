package com.example.FelineTest;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class GetOffspringTest {
    @Spy
    Feline feline;
    @Test
    public void GetOffspringInvokeGetKittens() {
    feline.getOffspring();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
        System.out.println("Метод «getOffspring» класса Feline вызывает меетод «getKittens»");


    }


}
