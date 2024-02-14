package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1010;
        int actual = service.remain(amount);
        int expected = 990;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 990;
        int actual = service.remain(amount);
        int expected = 10;
        assertEquals(expected, actual);
    }
}