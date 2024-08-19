

// Lớp trừu tượng
abstract class Animal1 {
    // Thuộc tính thông thường
    String name;

    // Constructor để khởi tạo tên
    public Animal1(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng (không có phần thân)
    abstract void sound();

    // Phương thức thông thường
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Lớp con kế thừa từ lớp trừu tượng Animal
class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }

    // Ghi đè phương thức trừu tượng
    @Override
    void sound() {
        System.out.println(name + " barks");
    }
}

// Lớp con kế thừa từ lớp trừu tượng Animal
class Cat extends Animal1 {
    public Cat(String name) {
        super(name);
    }

    // Ghi đè phương thức trừu tượng
    @Override
    void sound() {
        System.out.println(name + " meows");
    }
}

public class Main_s3 {
    public static void main(String[] args) {
        // Animal animal = new Animal("Generic Animal"); // Lỗi: Không thể khởi tạo lớp trừu tượng

        Dog1 dog = new Dog1("Buddy");
        Cat cat = new Cat("Whiskers");
        System.out.println(cat instanceof Animal1);
        dog.sound();  // Kết quả: Buddy barks
        dog.sleep();  // Kết quả: Buddy is sleeping.

        cat.sound();  // Kết quả: Whiskers meows
        cat.sleep();  // Kết quả: Whiskers is sleeping.
    }
}

