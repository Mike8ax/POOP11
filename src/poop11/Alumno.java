/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author poo01alu09
 */
public class Alumno {
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private int numCuenta;
    private int edad;
    private float primedio;

    public Alumno() {
    }
    
    

    public Alumno(String nombre, String apePaterno, String apeMaterno, int numCuenta, int edad, float primedio) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.primedio = primedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPrimedio() {
        return primedio;
    }

    public void setPrimedio(float primedio) {
        this.primedio = primedio;
    }

    @Override
    public String toString() {
        return "Alumno : \n" + " nombre:" + nombre + "\n apePaterno:_" + apePaterno + "\n apeMaterno:" + apeMaterno + "\n numCuenta:" + numCuenta + "\n edad:" + edad + "\n promedio:" + primedio;
    }
    
    
}
