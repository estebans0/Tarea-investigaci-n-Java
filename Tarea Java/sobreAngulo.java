import java.util.*;

public class sobreAngulo {
    public sobreAngulo(){
        System.out.println("1. seno del angulo");
        System.out.println("2. coseno del angulo");
        System.out.println("3. tangente del angulo");
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        int a= lector.nextInt();
        if(a==1){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(seno(angulo));
        }
        if(a==2){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(coseno(angulo));
        }
        if(a==3){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(tangente(angulo));
        }
        Main.menu();
    }
    public static double seno(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.sin(angulo);
    }
    public static double coseno(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.cos(angulo);
    }
    public static double tangente(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.tan(angulo);
    }
}
