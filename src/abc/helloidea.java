package abc;

import sun.awt.geom.AreaOp;
public class helloidea {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.seat = 7;
        vehicle.color = "绿色";
        System.out.println(vehicle.seat);
        System.out.println(vehicle.color);
    }
}
class Vehicle{
    int seat = 0;
    String color="绿色";
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行。。。");
    }
}
