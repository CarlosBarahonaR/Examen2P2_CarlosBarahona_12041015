/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_carlosbarahona_12041015;

/**
 *
 * @author Admin
 */
public class Canciones {

    private String nombre;
    private String categoría;
    private String caracteres;

    public Canciones(String nombre, String categoría, String caracteres) {
        this.nombre = nombre;
        this.categoría = categoría;
        this.caracteres = caracteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    @Override
    public String toString() {
        return "Canciones{" + "nombre=" + nombre + ", categor\u00eda=" + categoría + ", caracteres=" + caracteres + '}';
    }

}
