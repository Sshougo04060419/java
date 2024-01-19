package etc;

class Robot{
    String color;

    public void hello(){
        System.out.println("こんにちは");
    }

    public void getColor(){
        System.out.println("色は"+this.color+"です");
    }
}

class Main{
    public static void main(String[] args) {
        Robot exRobot = new Robot();
        exRobot.color = "青";
        System.out.println(exRobot.color);
    }
}


