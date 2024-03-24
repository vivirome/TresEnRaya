/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIENWARE X17 R2
 */
import java.util.Scanner;
public class JugadorPersona extends Jugador {
    public JugadorPersona(String n, char f) {
        super(n, f);
    }

    @Override
    public int jugar() {
        Scanner s = new Scanner(System.in);
        System.out.println("=>Ingrese posición del 0 al 8 desde teclado (" + this.ficha + "):");
        int r = -1;
        try {
            r = s.nextInt();
        } catch (Exception e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
            return jugar(); 
        }
        if (r < 0 || r > 8) {
            System.out.println("Posición inválida. Debe estar entre 0 y 8.");
            return jugar(); 
        }
        return r;
    }
}