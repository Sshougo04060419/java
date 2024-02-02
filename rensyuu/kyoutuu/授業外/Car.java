package 授業外;

class Car extends Vehicle {
    double weight;
    public void Car_weight(int weight){
    this.weight = weight;
    }

    public void Spec(){
        super.Spec();
        System.out.println("重量は"+this.weight+"kgです");
    }
}


