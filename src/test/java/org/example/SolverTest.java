package org.example;

import org.junit.*;


import static org.junit.Assert.*;

public class SolverTest {
    Solver solver;

    @Before
    public void beforeTest() {
        solver = new Solver();
    }

    @Test
    public void positiveDiscriminant() {
        int result = solver.numberOfRoots(1, 10, 1);
        assertEquals(2, result);
    }

    @Test
    public void negativeDiscriminant() {
        int result = solver.numberOfRoots(10, 1, 15);
        assertEquals(0, result);
    }

    @Test
    public void zeroDiscriminant() {
        int result = solver.numberOfRoots(4, 4, 1);
        assertEquals(1, result);
    }
}
