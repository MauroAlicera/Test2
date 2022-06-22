/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.interfaz;

/**
 *
 * @author mauro
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Interfaz extends Frame {
     private MenuBar menu;
     
        public Interfaz(){
        
         this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
    
            });
         }
                 
        public void Configuracion(){
             
                this.setTitle("Convertidor de Calorias");
                this.setSize(1000, 600);// w,h
                this.setLocation(100,100);
                
                
                
                Font titleFont = new Font("arial", Font.BOLD, 25);
                Font labelFont =new  Font("arial", Font.PLAIN, 18);
                Font textFont =new  Font("arial", Font.PLAIN, 15);
         
                
                FlowLayout miFlowLayout = new FlowLayout(FlowLayout.CENTER);
                
                Label lblMessage= new Label("App de calculo calorico");
               
                
                
               
                this.setLayout( miFlowLayout );
                this.add(lblMessage);
                
                this.setVisible(true);
                
                
                
                
         }
         
        public void CrearMenu(){
             menu= new MenuBar();
             
             Menu menuA = new Menu( "Agregar Comidas y Ejercios" );
             Menu menuB = new Menu( "Calcular el balanze calorico" );
             
             MenuItem submenuC=new MenuItem("Opciones De Agregar");
             menuA.add(submenuC);
             MenuItem submenuR=new MenuItem("Opciones De Observar");
             menuA.add(submenuR);
          
             
             
             
             
             //actionlistener
             
             submenuC.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                         
                         
                         
                         
                    }
                    
             });
             
             
             submenuR.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       
                        
                         
                    }
                    
             });
             
             
             
             
             menu.add(menuA);
             menu.add(menuB);
             setMenuBar(menu); 
             
         }
    
}
