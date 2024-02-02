package 授業外;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.car_size(5);//元の情報
        vehicle.car_name("普通車");//元の情報

        Car car = new Car();
        car.car_size(2);
        car.car_name("軽自動車");
        car.Car_weight(1500);//追加した情報



        
        System.out.println("Vehicleの情報:");
        vehicle.Spec();
        //1行空ける
        System.out.println();

        System.out.println("Carの情報:");
        car.Spec();
    }
}




