import org.testng.Assert; // Thư viện để so sánh và xác minh kết quả
import org.testng.annotations.BeforeMethod; // Ghi chú dùng để chạy một phương thức trước mỗi test
import org.testng.annotations.BeforeTest; // Ghi chú dùng để chạy một phương thức trước tất cả test
import org.testng.annotations.Test; // Ghi chú đánh dấu một phương thức là test
import org.example.Calculator; // Import lớp Calculator từ package org.example

public class TestCalculator {
    Calculator calculator; // Khai báo đối tượng máy tính

    @BeforeTest
    public void init() {
        calculator = new Calculator(); // Khởi tạo máy tính trước khi chạy tất cả các test
    }

    @BeforeMethod
    public void reset() {
        calculator.reset(); // Đặt lại trạng thái máy tính trước mỗi test
    }

    @Test
    public void testPlusCorrectly() {
        calculator.plus(10); // Cộng 10 vào kết quả hiện tại
        Assert.assertEquals(10, calculator.getResult()); // Kiểm tra xem kết quả có đúng là 10 không
    }

    @Test
    public void testMinusCorrectly() {
        calculator.plus(10); // Cộng 10
        calculator.minus(5); // Trừ 5
        Assert.assertEquals(5, calculator.getResult()); // Kết quả mong đợi là 5
    }

    @Test
    public void testMulCorrectly() {
        calculator.plus(10); // Cộng 10
        calculator.mul(0); // Nhân với 0
        Assert.assertEquals(0, calculator.getResult()); // Kết quả mong đợi là 0
    }

    @Test
    public void testDivCorrectly() {
        calculator.plus(100); // Cộng 100
        calculator.div(0); // Chia cho 0
        Assert.assertEquals(0, calculator.getResult()); // Giả sử máy tính trả về 0 nếu chia cho 0
    }
}
