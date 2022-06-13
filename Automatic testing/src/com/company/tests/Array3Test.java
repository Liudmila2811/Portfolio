package com.company.tests;

import com.company.Array.Array3;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Array3Test {
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
        Array3.main(new String[]{});
        Assertions.assertEquals("Original numeric array : [1789, 2035, 1899, 1456, 2013, 1458, " +
                "2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456]\r\n" +
                "Sorted numeric array : [1254, 1456, 1456, 1457, 1458, 1472, 1789, 1899, 2013, 2035, " +
                "2165, 2365, 2456, 2458]\r\n" +
                "Original string array : [Java, Python, PHP, C#, C Programming, C++]\r\n" +
                "Sorted string array : [C Programming, C#, C++, Java, PHP, Python]\r\n", out.toString());
    }

    @Test
    public void getNumericArray(){
        assertEquals("Sorted numeric array : [1254, 1456, 1456, 1457, " +
                        "1458, 1472, 1789, 1899, 2013, 2035, 2165, 2365, 2456, 2458]",
                Array3.getNumericArray(new int[]{1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365,
                        1456, 2165, 1457, 2456}));
    }

    @Test
    public void getStringArray(){
        assertEquals("Sorted string array : [C Programming, C#, C++, Java, PHP, Python]",
                Array3.getStringArray(new String[]{
                        "Java",
                        "Python",
                        "PHP",
                        "C#",
                        "C Programming",
                        "C++"
                }));
    }

}
