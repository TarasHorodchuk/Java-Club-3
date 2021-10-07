package com.softserve.team1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeginnerReduceButGrowTest {

    @Test
    public void testSomething() {
        assertEquals(6, BeginnerReduceButGrow.grow(new int[]{1,2,3}));
        assertEquals(16, BeginnerReduceButGrow.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, BeginnerReduceButGrow.grow(new int[]{2,2,2,2,2,2}));
    }
}