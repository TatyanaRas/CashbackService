package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void lessThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 500;
        int actual = cashbackHackService.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);

    }

    @Test
    void moreThanBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    void boundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}

