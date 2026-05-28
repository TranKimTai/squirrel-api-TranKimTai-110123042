package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testCoNghiem() {
        // Trường hợp a != 0 (Ví dụ: 2x + 4 = 0) -> CN
        assertEquals("CN", App.giaiPhuongTrinhBac1(2, 4));
    }

    @Test
    public void testVoSoNghiem() {
        // Trường hợp a = 0, b = 0 (0x + 0 = 0) -> VSN
        assertEquals("VSN", App.giaiPhuongTrinhBac1(0, 0));
    }

    @Test
    public void testVoNghiem() {
        // Trường hợp a = 0, b != 0 (0x + 3 = 0) -> VN
        assertEquals("VN", App.giaiPhuongTrinhBac1(0, 3));
    }
}