package PracticaObligatoria;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bienvenida = true;
        int tipo = 0, opc = 0;
        Baraja b = null;       
        System.out.println("BIENVENIDO!! \n Elige un menú...");
        System.out.println("1. Menú de Baraja.");
        System.out.println("2. Menú de Juegos.");
        System.out.println("3. Salir...");

        switch (opc) {
            case 1:
                System.out.println("1. CREAR MAZO");
                System.out.println("2. BARAJAR MAZO");
                System.out.println("3. MOSTRAR MAZO");
                System.out.println("4. SACAR CARTA");
                System.out.println("5. SACAR NÜMERO DE CARTAS");
                System.out.println("6. NÚMERO DE CARTAS RESTANTES");
                System.out.println("7. REINICIAR");
                int opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Dime el tipo (1. Póker | 2. Española)");
                        tipo = sc.nextInt();

                        b = new Baraja(tipo);
                        break;
                    case 2:
                        if (b != null) {
                            b.barajar();
                        }
                        else {
                            System.out.println("No es posible barajar algo que no existe...");
                        }
                        break;
                    case 3:
                        
                        break;
                    default:
                        break;
                }
                break;

            default:
                break;
        }

    }
}
