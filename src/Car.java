public class Car extends Toyota{
    void driving(){
        System.out.println("driving");
    }
    int y=55;
    int gety(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        System.out.println(toyota.getX());
        Car car=new Car();
        System.out.println(car.gety(1,2,3));
        car.driving();
    }
}

