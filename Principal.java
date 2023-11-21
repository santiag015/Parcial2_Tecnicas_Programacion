import java.util.Scanner;

public class Principal {
Scanner scanner = new Scanner(System.in);

    static int [][] Matriz = null;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el tipo de servicio que requiere");
            System.out.println("1. Vuelos");
            System.out.println("2. Pasajeros");
            System.out.println("3. Reserva");
            System.out.println("4. Cancelar vuelo/reserva");

            int menu = scanner.nextInt();
        
        switch(menu){
            case 1: //Vuelo
                   
            case 2: //Pasajero
                    
            case 3: //Reserva
                    
            case 4: //Cancelar Vuelo/Reserva
                    
                break;
            default:
            System.out.println("Operación inválida");
        }//Switch
        
        
    }//Main
    
}//Class
