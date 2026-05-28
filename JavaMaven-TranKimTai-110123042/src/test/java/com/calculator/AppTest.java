package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCoNghiem() {
        System.out.println("=== DANG TEST PHUONG TRINH: 2x + 4 = 0 ===");
        System.out.println("-> Ket qua may chay: " + App.giaiPhuongTrinhBac1(2, 4));
        assertEquals("CN", App.giaiPhuongTrinhBac1(2, 4));
    }

    @Test
    public void testVoSoNghiem() {
        System.out.println("=== DANG TEST PHUONG TRINH: 0x + 0 = 0 ===");
        System.out.println("-> Ket qua may chay: " + App.giaiPhuongTrinhBac1(0, 0));
        assertEquals("VSN", App.giaiPhuongTrinhBac1(0, 0));
    }

    @Test
    public void testVoNghiem() {
        System.out.println("=== DANG TEST PHUONG TRINH: 0x + 3 = 0 ===");
        System.out.println("-> Ket qua may chay: " + App.giaiPhuongTrinhBac1(0, 3));
        assertEquals("VN", App.giaiPhuongTrinhBac1(0, 3));
    }
}