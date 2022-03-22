
package pkgswitch;


public class Switch {

    public static void main(String[] args) {
       int dia = 3;
       String nombreDia;
       
       switch (dia) {
           case 1: nombreDia = "Lunes";
           break;
           case 2: nombreDia = "Martes";
           break;
           case 3: nombreDia = "Miércoles";
           break;
           case 4: nombreDia = "Jueves";
           break;
           case 5: nombreDia = "Viernes";
           break;
           case 6: nombreDia = "Sábado";
           break;
           case 7: nombreDia = "Domingo";
           break;
           default: nombreDia = "número de día inválido";
           break;
       }
       
        System.out.println("El día seleccionado de la semana es: " + nombreDia);
        System.out.println("************************************************");

    }
    
}
