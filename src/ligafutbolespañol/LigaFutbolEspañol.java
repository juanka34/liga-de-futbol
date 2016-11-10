/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligafutbolespañol;

import java.util.ArrayList;

public class LigaFutbolEspañol {

    static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public static void rellenardatos() {

        EquipoPrimera e;

        for (int i = 0; i < 20; i++) {

             e = new EquipoPrimera();

            e.setCapacidad(30000 + i);
            e.anofundacion(i);

            Entrenador en = new Entrenador();
            en.setNombre("luis enrique" + i);
            en.setNacionalidad("español" + i);
            en.setEdad(45 + i);
            e.setEntrenador(en);

            Masajista m = new Masajista();
            m.setNombre("joselito" + i);
            m.setEdad(20 + i);
            m.setNummedico(100 + i);
            e.setMasajista(m);

            for (int j = 0; j < 22; j++) {

                Jugador j2 = new Jugador();
                j2.setNombre("messi" + i);
                j2.setEdad(21 + i);
                j2.setAltura(1.80 + i);
                j2.setPeso(72 + i);
                e.aniadirJugador(j2);

            }
             equipos.add(e);
        }

        EquipoSegunda es;
        for (int i = 0; i < 22; i++) {

            es = new EquipoSegunda();
            
            Entrenador en = new Entrenador();
            en.setNombre("cachola" + i);
            en.setNacionalidad("extremeña" + i);
            en.setEdad(49 + i);
            es.setEntrenador(en);

            Masajista m = new Masajista();
            m.setNombre("pepito" + i);
            m.setEdad(28 + i);
            m.setNummedico(69 + i);
            es.setMasajista(m);
           

            for (int j = 0; j < 22; j++) {

                Jugador j2 = new Jugador();
                j2.setNombre("pozo" + i);
                j2.setEdad(50 + i);
                j2.setAltura(1.50 + i);
                j2.setPeso(69 + i);
                es.aniadirJugador(j2);

            }
             equipos.add(es);
        }

    }

    public static void traspasar(Equipo origen, Equipo destino, Jugador j) {
     destino.aniadirJugador(j);
     origen.borrarJugador(j);
     

    }

    public static void altaybajadejugador() {

    }

    public static void cambiarentrenadorymasajista() {

    }

    public static void unirjugador() {

    }

    public static void main(String[] args) {

        rellenardatos();
        
        Jugador j=equipos.get(2).getJugadores().get(10);
          traspasar(equipos.get(2),equipos.get(8),j);  
    }

}
