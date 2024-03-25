/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIENWARE X17 R2
 */
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class JugadorPersona extends Jugador {
    private final Scanner scanner;

    public JugadorPersona(String n, char f) {
        super(n, f);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int jugar() {
        System.out.println("=>Ingrese posición del 0 al 8 desde teclado (" + this.ficha + "):");
        
        // Variable para almacenar la posición ingresada por el jugador
        AtomicInteger posicion = new AtomicInteger(-1);
        
        // Crear un hilo para el temporizador
        Thread temporizador = new Thread(() -> {
            try {
                // Esperar 10 segundos
                Thread.sleep(5000);
                // Si el jugador no ha ingresado una posición, mostrar un mensaje
                if (posicion.get() == -1) {
                    System.out.println("¡Tiempo agotado! Se ha seleccionado una posición aleatoria.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        // Iniciar el temporizador
        temporizador.start();
        return posicion.get();
}
}
