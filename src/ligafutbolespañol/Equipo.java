/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligafutbolespañol;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Equipo {//abstract lo vamos a incluir en todos los padres

    private String nombre;
    private int anofundacion;
    private Entrenador entrenador;
    private Masajista masajista;
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnofundacion() {
        return anofundacion;
    }

    public void setAnofundacion(int anofundacion) {
        this.anofundacion = anofundacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Masajista getMasajista() {
        return masajista;
    }

    public void setMasajista(Masajista masajista) {
        this.masajista = masajista;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void aniadirJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void borrarJugador(Jugador jugador) {
        this.jugadores.remove(jugador);
    }

}
