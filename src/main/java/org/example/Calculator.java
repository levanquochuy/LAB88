package org.example;

/**
 * Lớp Calculator mô phỏng một máy tính đơn giản có thể thực hiện các phép toán:
 * cộng, trừ, nhân, chia với một giá trị kết quả lưu trữ bên trong.
 */
public class Calculator {
    private int result = 0; // Biến lưu kết quả hiện tại, mặc định là 0

    // Lấy kết quả hiện tại
    public int getResult() {
        return result;
    }

    // Đặt lại kết quả mới
    public void setResult(int result) {
        this.result = result;
    }

    // Reset kết quả về 0
    public void reset() {
        this.result = 0;
    }

    // Cộng một số vào kết quả hiện tại
    public void plus(Integer num) {
        if (num == null) {
            reset();
            return;
        }

        try {
            result += num;
        } catch (Exception e) {
            reset();
        }
    }

    // Trừ một số khỏi kết quả hiện tại
    public void minus(Integer num) {
        if (num == null) {
            reset();
            return;
        }

        try {
            result -= num;
        } catch (Exception e) {
            reset();
        }
    }

    // Nhân một số với kết quả hiện tại
    public void mul(Integer num) {
        if (num == null) {
            reset();
            return;
        }

        try {
            result *= num;
        } catch (Exception e) {
            reset();
        }
    }

    // Chia kết quả hiện tại cho một số
    public void div(Integer num) {
        if (num == null || num == 0) {
            reset(); // Tránh chia cho 0 hoặc null
            return;
        }

        try {
            result /= num;
        } catch (Exception e) {
            reset();
        }
    }
}
