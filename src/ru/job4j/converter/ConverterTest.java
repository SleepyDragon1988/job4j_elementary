package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class ConverterTest {


    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubletoEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubletoDollar(in);
        Assert.assertEquals(expected, out);
    }
}
