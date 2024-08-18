


class Animal {
    // Phương thức bị ghi đè
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Lớp con
class Dog extends Animal {
    // Ghi đè phương thức sound() của lớp cha
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}public class Main_S2 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Tạo đối tượng lớp cha
        Animal myDog = new Dog();        // Tạo đối tượng lớp con

        myAnimal.sound();  // Gọi phương thức sound() từ lớp cha
        myDog.sound();     // Gọi phương thức sound() bị ghi đè từ lớp con
    }
}
