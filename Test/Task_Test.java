import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class Task_Test {
    private Tasks task;

    @Before
    public void setupUp(){
        task = new Tasks();
    }

    @After
    public void tearDown(){
        task = null;
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1_0_1(){
        task.task1(0,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1_0_2(){
        task.task1(1,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test1_0_3(){
        task.task1(0,1);
    }

    @Test
    public void test1_1(){
        String expected = "1 координатная четверть";
        String actual = task.task1(5,4);
        assertEquals(expected, actual);
    }
    @Test
    public void test1_2(){
        String expected = "2 координатная четверть";
        String actual = task.task1(-4,4);
        assertEquals(expected, actual);
    }
    @Test
    public void test1_3(){
        String expected = "3 координатная четверть";
        String actual = task.task1(-4,-8);
        assertEquals(expected, actual);
    }
    @Test
    public void test1_4(){
        String expected = "4 координатная четверть";
        String actual = task.task1(6,-4);
        assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test2_0(){
        task.task2(-1, 5);
    }

    @Test
    public void test2_1(){
        double expected = 16;
        double actual = task.task2(4,4);
        assertEquals(expected, actual);
    }
    @Test
    public void test2_2(){
        double expected = 7;
        double actual = task.task2(3,4);
        assertEquals(expected, actual);

    }
    @Test(expected = IllegalArgumentException.class)
    public void test3_0_1(){
        task.task3(-2,1,1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test3_0_2(){
        task.task3(2,-1,1);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test3_0_3(){
        task.task3(2,1,0);
    }
    @Test
    public void test3_1(){
        double expected = 12;
        double actual = task.task3(4,4,4);
        assertEquals(expected, actual);
    }
    @Test
    public void test4_1(){
        double expected = 21;
        double actual = task.task4(3,2,3);
        assertEquals(expected, actual);
    }
    @Test
    public void test4_2(){
        double expected = 8;
        double actual = task.task4(0,2,3);
        assertEquals(expected, actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void test5_0(){
        task.task5(-1);
    }
    @Test
    public void test5_1(){
        String expected = "E";
        String actual = task.task5(22);
        assertEquals(expected, actual);
    }
    @Test
    public void test5_2(){
        String expected = "D";
        String actual = task.task5(48);
        assertEquals(expected, actual);
    }
}
