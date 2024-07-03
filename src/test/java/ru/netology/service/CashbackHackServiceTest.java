package ru.netology.service;

//import org.junit.jupiter.api.Test;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void lessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;

        int actual = cashbackHackService.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);

    }

    @Test
    public void moreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }

    @Test
    public void boundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void boundary1() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void boundary2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}

