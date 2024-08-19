public class StaticExample {
  //
    /*
 Các phương thức tĩnh không thể truy cập vào biến thể hiện hoặc các phương thức. Ngoài ra, chúng ta thực sự không nên gọi các phương thức tĩnh có tham chiếu đối tượng (p). Bản thân điều đó không phải là bất hợp pháp, nhưng nó được coi là mã hóa kém.
     */

    /*
    Block thường được thực thi mỗi khi một đối tượng của lớp được tạo ra. Nó được gọi trước constructor, ngay sau khi bộ nhớ cho đối tượng được cấp phát.
    Block thường chạy trước bất kỳ constructor nào và có thể được sử dụng để thực hiện một số thao tác khởi tạo chung cho tất cả các constructor của lớp.
    Static block được thực thi một lần duy nhất khi lớp được nạp vào bộ nhớ, trước khi bất kỳ đối tượng nào của lớp được tạo ra và trước khi bất kỳ phương thức static nào được gọi.

     */
  {
      count = 30;
  }
    static int count = 0;

    static {
        System.out.println("Static block is executed.");
        count = 100; // Khởi tạo giá trị cho biến static
        displayCount(); // truy cập static method
    }
    // Constructor
    public StaticExample() {
        count++; // Tăng biến đếm mỗi khi một đối tượng được tạo ra
    }

    // Phương thức static (phương thức tĩnh)
    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        // Trước khi tạo đối tượng nào
        StaticExample.displayCount(); // Kết quả: Number of objects created: 0

        // Tạo đối tượng
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        // Sau khi tạo các đối tượng
        StaticExample.displayCount(); // Kết quả: Number of objects created: 3

        // Truy cập trực tiếp biến static qua tên lớp
        System.out.println("Accessing static variable directly: " + StaticExample.count); // Kết quả: 3
    }
}
