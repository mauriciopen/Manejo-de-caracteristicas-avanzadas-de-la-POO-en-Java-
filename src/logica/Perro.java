/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Fontanar483
 */
public class Perro {
    private String codigo;
    private String nombre;
    private String raza;
    private String localidad;
    private String cedulaDueño;
    private String nombreDueño;
    
     public Perro(String codigo, String nombre, String raza, String localidad, String cedulaDueño, String nombreDueño) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.cedulaDueño = cedulaDueño;
        this.nombreDueño = nombreDueño;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCedulaDueño() {
        return cedulaDueño;
    }

    public void setCedulaDueño(String cedulaDueño) {
        this.cedulaDueño = cedulaDueño;
    }
    
     
}
