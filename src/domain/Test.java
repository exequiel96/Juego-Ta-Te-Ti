package domain;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int contador = 0;
        var ganador1 = 0;
        var ganador2 = 0;
        var empates = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Bienvenido a Piedra, Papel o Tijera");
            System.out.println("----------------------\nJugador 1:\n 1.Piedra \n 2.Papel \n 3.Tijera \n 4. Salir\n"
                    + "-------------------------");
            var jugador1 = sc.nextLine();
            if (jugador1 != null) {
                if (jugador1.equals("1")) {
                    System.out.println("  Piedra");
                } else if (jugador1.equals("2")) {
                    System.out.println("  Papel");
                } else if (jugador1.equals("3")) {
                    System.out.println("  Tijera");
                } else if (jugador1.equals("4")) {
                    System.out.println("Has abandonado la partida");
                    break;
                } else {
                    System.out.println("Introduce un valor valido");
                    jugador1 = sc.nextLine();
                }

                System.out.println("----------------------\nJugador 2:\n 1.Piedra \n 2.Papel \n 3.Tijera \n 4. Salir\n"
                        + "------------------------");
                var jugador2 = sc.nextLine();
                if (jugador2.equals("1")) {
                    System.out.println("  Piedra");
                } else if (jugador2.equals("2")) {
                    System.out.println("  Papel");
                } else if (jugador2.equals("3")) {
                    System.out.println("  Tijera");
                } else if (jugador2.equals("4")) {
                    System.out.println("Has abandonado la partida");
                    break;
                }

                if (jugador1.equals("1") && jugador2.equals("2")) {
                    System.out.println("------------------\nGana el jugador 2");
                    ganador2++;
                }
                if (jugador1.equals("1") && jugador2.equals("3")) {
                    System.out.println("------------------\nGana el jugador 1");
                    ganador1++;
                }
                if (jugador1.equals("2") && jugador2.equals("1")) {
                    System.out.println("------------------\nGana el jugador 1");
                    ganador1++;
                }
                if (jugador1.equals("2") && jugador2.equals("3")) {
                    System.out.println("------------------\nGana el jugador 2");
                    ganador2++;
                }
                if (jugador1.equals("3") && jugador2.equals("1")) {
                    System.out.println("------------------\nGana el jugador 1");
                    ganador1++;
                }
                if (jugador1.equals("3") && jugador2.equals("2")) {
                    System.out.println("------------------\nGana el jugador 2");
                    ganador2++;
                }
                if (jugador1.equals("1") && jugador2.equals("1") || jugador1.equals("2") && jugador2.equals("2") || jugador1.equals("3") && jugador2.equals("3")) {
                    System.out.println("\n------------------\nEmpate");
                    empates++;
                }

                Scanner scanner = new Scanner(System.in);
                System.out.println("--------------------------------------------------------\nHa terminado la sesion de juego!!");
                System.out.println("¿Quiere jugar de nuevo?  SI / NO");
                String revancha = scanner.nextLine();
                //revancha = revancha.toUpperCase();
                if (revancha.equalsIgnoreCase("si")) {
                    System.out.println("Muy bien, vamos a otra ronda");
                    contador = 0;
                } else if(revancha.equalsIgnoreCase("no")) {
                    System.out.println("Hasta pronto!!!");
                    break;
                }
            }

        } while (contador == 0);
        if (ganador1 == ganador2) {
            System.out.println("El juego termino en empate");
            System.out.println("\nHa habido " + empates + " empates.");
        } else if (ganador1 > ganador2) {
            System.out.println("\nEl jugador que mas veces ha ganado es Jugador 1. Ha ganado: " + ganador1 + " veces.");

        } else {
            System.out.println("\nEl jugador que mas veces ha ganado es Jugador 2. Ha ganado: " + ganador2 + " veces.");

        }

    }
}
