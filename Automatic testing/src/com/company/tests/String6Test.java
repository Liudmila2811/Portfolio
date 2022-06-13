package com.company.tests;

import com.company.Array.Array3;
import com.company.Array.String6;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class String6Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream(); // Создаем свою консоль
    private final PrintStream origOut = System.out; // Сохраняем системную консоль

    @BeforeEach
    public void setupStream(){
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreStream(){
        System.setOut(origOut);
    }

    @Test
    public void test(){
        String6.main(new String[]{});
        assertEquals("String 1: This is exercise 1\r\n" +
                "String 2: This is Exercise 1\r\n" +
                "\"This is exercise 1\" is equal to \"This is Exercise 1\"\r\n", out.toString());
    }

    @Test
    public void compareStrings(){
        assertEquals("\"This is exercise 1\" is equal to \"This is Exercise 1\"",
                String6.compareStrings(new String("This is exercise 1"),
                        new String ("This is Exercise 1")));
    }

}
