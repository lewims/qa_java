package com.example.LionTest;

import com.example.Lion;
import com.example.Predator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.rules.ExpectedException;


@RunWith(Parameterized.class)
public class LionThrowsException {

    @Rule public ExpectedException exception = ExpectedException.none();

        Predator predator;
      private static   String sex;

      public LionThrowsException(String sex) {
          this.sex = sex;

      }

    @Parameterized.Parameters
    public static Object[][] getManeStatus() {
        return new Object[][] {
                { "Сомец"},
                { "Сумка"},
                {""},
        };
    }




    @Test
    public void LionWrongParameterThrowsException() throws Exception {
        exception.expect(Exception.class);
        exception.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        System.out.println("Нужное исключение при неверном параметре обрабатывается");

        Lion lion = new Lion(predator, sex);

    }
}


