import java.util.Scanner;

public class hiperAngulo {
    public hiperAngulo() {
        System.out.println("1. seno hiperbolico del angulo");
        System.out.println("2. coseno hiperbolico del angulo");
        System.out.println("3. tangente hiperbolica del angulo");
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        int a= lector.nextInt();
        if(a==1){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(hipSin(angulo));
        }
        if(a==2){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(hipCos(angulo));
        }
        if(a==3){
            System.out.println("Ingrese el valor del angulo: ");
            double angulo = lector.nextDouble();
            System.out.println(hipTan(angulo));
        }
        Main.menu();
    }
    public static double hipSin(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.sinh(angulo);
    }
    public static double hipCos(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.cosh(angulo);
    }
    public static double hipTan(double angulo){
        angulo=Math.toRadians(angulo);
        return Math.tanh(angulo);
    }
}
