import java.util.Scanner;

public class sobreInvAngulo {
    public sobreInvAngulo(){
        System.out.println("1. arcsin del angulo");
        System.out.println("2. arcos del angulo");
        System.out.println("3. arctan del angulo");
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        int a= lector.nextInt();
        if(a==1){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(arcsin(angulo));
        }
        if(a==2){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(arccos(angulo));
        }
        if(a==3){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(arctan(angulo));
        }
        Main.menu();
    }
    public static double arcsin(double angulo){
        double enRadianes=Math.toRadians(angulo);
        double senoRad=Math.sin(enRadianes);
        double arcoseno = Math.asin(senoRad);
        return arcoseno;
    }
    public static double arccos(double angulo){
        angulo=Math.toRadians(angulo);
        angulo=Math.cos(angulo);
        return Math.acos(angulo);
    }
    public static double arctan(double angulo){
        angulo=Math.toRadians(angulo);
        angulo=Math.tan(angulo);
        return Math.atan(angulo);
    }
}
