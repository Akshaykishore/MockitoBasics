package impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import service.MathService;


@RunWith(MockitoJUnitRunner.class)
public class MathServiceImplTest {

    @Mock
    MathService mathService;

    MathServiceImpl classundertest;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        classundertest = new MathServiceImpl();
    }


    @Test
    public void test_doubleLong_Pass() {
        long expected = 20;
        Mockito.when(mathService.doubleLong(Mockito.anyLong())).thenReturn(expected);

        long actual = classundertest.doubleLong(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_tripleLong_Pass() {
        long expected = 30;
        Mockito.when(mathService.tripleLong(Mockito.anyLong())).thenReturn(expected);

        long actual = classundertest.tripleLong(10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_sum_Pass() {
        long expected = 10;
        Mockito.when(mathService.addition(Mockito.anyLong())).thenReturn(expected);

        long actual = classundertest.addition(10);

        Assert.assertEquals(expected, actual);
    }

}