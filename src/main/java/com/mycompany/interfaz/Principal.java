/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

/**
 *
 * @author mauro
 */


import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
public class Principal {
    public static void main(String[] args) {
        Interfaz Ventana = new Interfaz();
        Ventana.CrearMenu();
        Ventana.Configuracion();
    }
    
}
