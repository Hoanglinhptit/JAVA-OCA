// Lớp cha
class Vehicle {
    // Biến final (biến hằng)
    final int maxSpeed;

    // Constructor để khởi tạo biến final
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed; // Giá trị chỉ có thể gán một lần
    }

    // Phương thức final không thể bị ghi đè
    public final void displaySpeed() {
        System.out.println("Max speed is: " + maxSpeed + " km/h");
    }

    // Phương thức thông thường
    public void start() {
        System.out.println("Vehicle is starting");
    }
}

// Lớp con kế thừa từ lớp Vehicle
class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    // @Override
    // public void displaySpeed() {
    //     // Lỗi: Không thể ghi đè phương thức final từ lớp cha
    // }

    // Ghi đè phương thức start()
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// Lớp final không thể được kế thừa
final class Bike extends Vehicle {
    public Bike(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

// public class SuperBike extends Bike {
//     // Lỗi: Không thể kế thừa từ lớp final
// }

public class Final {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(150);
        vehicle.displaySpeed();  // Kết quả: Max speed is: 150 km/h
        vehicle.start();         // Kết quả: Vehicle is starting

        Car car = new Car(180);
        car.displaySpeed();      // Kết quả: Max speed is: 180 km/h
        car.start();             // Kết quả: Car is starting

        Bike bike = new Bike(120);
        bike.displaySpeed();     // Kết quả: Max speed is: 120 km/h
        bike.start();            // Kết quả: Bike is starting
    }
}

