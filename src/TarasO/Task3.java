package TarasO;

import java.util.Scanner;

public class Task3 {
    public void getVolumeOfCuboid() {
        System.out.println("Enter length,width,height ");
        Scanner leng = new Scanner(System.in);
        Scanner wid = new Scanner(System.in);
        Scanner heig = new Scanner(System.in);
        double lengs = leng.nextDouble();
        double width = wid.nextDouble();
        double height = heig.nextDouble();
        System.out.println(lengs*width*height + " m^3");

    }
}
