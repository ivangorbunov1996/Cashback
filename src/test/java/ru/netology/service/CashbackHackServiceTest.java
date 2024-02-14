package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1010;
        int actual = service.remain(amount);
        int expected = 990;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(actual, expected);
    }
}
