/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALIENWARE X17 R2
 */
public abstract class Jugador {
    String nombre;
    char ficha;

    public Jugador(String n, char f) {
        this.nombre = n;
        this.ficha = f;
    }

    abstract int jugar();
}