package 授業外;

class Vehicle {
    int size;
    String name;

    public void car_size(int size){
        this.size = size;
    }

    public void car_name(String name){
        this.name = name;
    }

    public void Spec(){
        System.out.println("大きさは"+this.size+"mです");
        System.out.println("名前は"+this.name+"です");
    }
}