package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void distance(){
        int in11 =0;
        int in12 =0;
        int in13 =2;
        int in14 =0;
        double expected = 2;
        double out = Point.distance(in11, in12, in13, in14);
        Assert.assertEquals(expected, out, 0.01);
    }
}
