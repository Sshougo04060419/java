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
        System.out.println("大きさは"+this.size+"です");
        System.out.println("名前は"+this.name+"です");
    }
}





class Car extends Vehicle {
    double weight;
    public void Car_weight(int weight){
    this.weight = weight;
    }
    public void Spec(){
        super.Spec();
        System.out.println("重量は"+this.weight+"です");
    }
}
