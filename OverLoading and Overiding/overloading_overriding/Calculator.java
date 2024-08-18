public class Calculator {
// overloading
// Overloading xảy ra khi hai hoặc nhiều phương thức trong cùng một lớp có cùng tên nhưng khác nhau về số lượng hoặc kiểu tham số

    // Phương thức cộng hai số nguyên
    public int add(int a, int b) {
        return a + b;
    }

    // Phương thức cộng ba số nguyên
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Phương thức cộng hai số thực
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));          // Gọi phương thức add(int, int)
        System.out.println(calc.add(1, 2, 3));       // Gọi phương thức add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));      // Gọi phương thức add(double, double)
    }
}

