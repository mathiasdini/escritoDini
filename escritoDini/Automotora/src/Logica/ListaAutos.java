package Logica;

import java.util.ArrayList;


public class ListaAutos {

    public ArrayList<Auto> autos;

    public ListaAutos() {
        this.autos = new ArrayList<>();
    }

    public void agregar(Auto auto) {
        autos.add(auto);
    }

    public void borrar(Auto auto) {
        autos.remove(auto);
    }

    public Auto obtenerXMatricula(String matricula) {
        for (Auto auto : autos) {
            if (auto.getMatricula().equals(matricula)) {
                return auto;
            }
        }
        return null;
    }

    public boolean estaAuto(String matricula) {
        for (Auto auto : autos) {
            if (auto.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    public void listarAutos() {
        for (Auto auto : autos) {
            System.out.println(auto.toString());
        }
    }
}
