/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subClase;

import superClase.Persona;

/**
 *
 * @author ATKZ
 */
public class Estudiante extends Persona {
    
    private String carrera;

    public Estudiante(String nombre, String carrera, String dni) {
        super(nombre, dni);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

   public void mostrarDatos(){
       System.out.println("Nombre: " + super.getNombre());
       System.out.println("Dni: " + super.getDni());
       System.out.println("carrera: " + carrera);
   }
    
    
}
