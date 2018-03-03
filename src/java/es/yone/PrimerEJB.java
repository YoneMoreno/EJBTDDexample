/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.yone;

/**
 *
 * @author YonePC
 */
public class PrimerEJB {

    public String saluda(String nombre) {
        if (nombre == null) {
            return "Hola desconocido";
        }
        return "Hola " + nombre;
    }
}
