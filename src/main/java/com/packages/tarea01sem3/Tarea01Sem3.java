/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.packages.tarea01sem3;

import clases.Persona;

/**
 *
 * @author ATKZ
 */

public class Tarea01Sem3 {

    public static void main(String[] args) {
        Persona p = new Persona("Angel", 24, "87654321");
        p.mostrarDatos();
        
        p.setNombre("Luis");
        p.setEdad(25);
        p.setDni("12345678");
        p.mostrarDatos();
    }
}
