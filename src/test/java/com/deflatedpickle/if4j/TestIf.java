package com.deflatedpickle.if4j;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestIf {
    private If if_ = new If();

    @Test
    public void ifEqualsButBetter() {
        assertTrue((Boolean) if_.equalsButBetter(true, true));
    }

    @Test
    public void ifCastToBoolean() {
        assertTrue(if_.castToBoolean(true));
    }

    @Test
    public void ifBooleanTrue() {
        assertTrue((Boolean) if_.ifBoolean(true));
    }

    @Test
    public void ifAllTrue() {
        assertTrue((Boolean) if_.if4j(true));
    }

    @Test
    public void ifBooleanFalse() {
        assertTrue((Boolean) if_.ifBoolean(false));
    }

    @Test
    public void ifAllFalse() {
        assertTrue((Boolean) if_.if4j(false));
    }
}
