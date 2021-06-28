import java.util.*;

public class Main {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        System.out.println("1. Operaciones trigonometricas sobre un angulo");
        System.out.println("2. Operaciones trigonometricas inversas sobre un angulo");
        System.out.println("3. Operaciones trigonometricas hiperbolicas sobre un angulo");
        Scanner lector= new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        int a=lector.nextInt();
        if(a==1){
            new sobreAngulo();
        }
        if(a==2){
            new sobreInvAngulo();
        }
        if(a==3){
            new hiperAngulo();
        }
        if(a==4){
        }
        if (a!=1 && a!=2 && a!=3 && a!=4){
            System.out.println("ERROR: Usted ha ingresado una opcion incorrecta");
            Main.menu();
        }
    }
}
