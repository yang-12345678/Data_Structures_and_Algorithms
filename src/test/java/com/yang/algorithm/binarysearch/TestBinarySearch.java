package com.yang.algorithm.binarysearch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.yang.algorithm.binarysearch.BinarySearch.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestBinarySearch {

    @Test
    @DisplayName("binarySearchBasic 找到")
    public void test1() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 53};
        assertEquals(0, binarySearchBasic(a, 7));
        assertEquals(1, binarySearchBasic(a, 13));
        assertEquals(2, binarySearchBasic(a, 21));
        assertEquals(3, binarySearchBasic(a, 30));
        assertEquals(4, binarySearchBasic(a, 38));
        assertEquals(5, binarySearchBasic(a, 44));
        assertEquals(6, binarySearchBasic(a, 52));
        assertEquals(7, binarySearchBasic(a, 53));

        assertEquals(-1, binarySearchBasic(a, 0));
        assertEquals(-1, binarySearchBasic(a, 15));
        assertEquals(-1, binarySearchBasic(a, 60));
    }



}
