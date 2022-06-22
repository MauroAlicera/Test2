/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaz;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author mauro
 */
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazEntrada  extends Frame implements WindowListener, ActionListener, KeyListener   {
    private Label lblNombre, lblApellidos,lblRut,lblFechaNacimiento,lblRegion,lblMensaje;
    private Button btnAceptar, btnLimpiar,btnReporte;
    private TextField txtNombre,txtApellidos,txtRut,txtFechaNacimiento;
    private Choice chRegion;
    boolean presion=false;
    
     public InterfaceClientes(String titulo){
          super(titulo);
          

          this.addWindowListener(this);
          
          
         
     }
     public void ConstuirFormulario(){
         
         this.setSize(1000, 600);// w,h
         this.setLayout(null);
         this.setVisible(true);
         
	 Color formColor = new Color(53, 59, 72);
	 setBackground(formColor);
         
         
         Font titleFont = new Font("arial", Font.BOLD, 25);
	 Font labelFont =new  Font("arial", Font.PLAIN, 18);
	 Font textFont =new  Font("arial", Font.PLAIN, 15);
         
         
         
         lblMensaje=new Label("");
         lblMensaje.setForeground(Color.RED);
         lblMensaje.setBounds(400,50,400,30);
         
         lblNombre=new Label("Nombre");  
	 lblNombre.setBounds(250,100,150,30);
	 lblNombre.setFont(labelFont);  
	 lblNombre.setForeground(Color.WHITE);
         
         
         txtNombre=new TextField();
	 txtNombre.setBounds(400,100,400,30);
	 txtNombre.setFont(textFont);
         

         lblApellidos=new Label("Apellidos");  
	 lblApellidos.setBounds(250,150,150,30);
	 lblApellidos.setFont(labelFont);  
	 lblApellidos.setForeground(Color.WHITE);
         
         txtApellidos=new TextField();
	 txtApellidos.setBounds(400,150,400,30);
	 txtApellidos.setFont(textFont);
         
         
         lblRut=new Label("Rut");  
	 lblRut.setBounds(250,200,150,30);
	 lblRut.setFont(labelFont);  
	 lblRut.setForeground(Color.WHITE);
         
         txtRut=new TextField();
	 txtRut.setBounds(400,200,400,30);
	 txtRut.setFont(textFont);
         
         
         lblFechaNacimiento=new Label("Fecha Nacimiento");  
	 lblFechaNacimiento.setBounds(250,250,150,30);
	 lblFechaNacimiento.setFont(labelFont);  
	 lblFechaNacimiento.setForeground(Color.WHITE);
         
         
         txtFechaNacimiento=new TextField();
	 txtFechaNacimiento.setBounds(400,250,400,30);
	 txtFechaNacimiento.setFont(textFont);
         txtFechaNacimiento.setText("DD/MM/YYYY");
         

         lblRegion=new Label("Region");  
	 lblRegion.setBounds(250,300,150,30);
	 lblRegion.setFont(labelFont);  
	 lblRegion.setForeground(Color.WHITE);
         
         chRegion=new Choice();
         chRegion.setBounds(400,300,400,50); 
         chRegion.addItem("");
         
         for(int i=0;i<cliente.getRegion().length;i++)
                chRegion.addItem(cliente.getRegion()[i]);
         
         btnAceptar=new Button("Crear");
         btnAceptar.setBounds(400,350,100,50);
	 btnAceptar.setFont(textFont);

         btnLimpiar=new Button("Limpiar");
         btnLimpiar.setBounds(500,350,100,50);
	 btnLimpiar.setFont(textFont);
         
         
         btnAceptar.addActionListener(this);
         btnLimpiar.addActionListener(this);
         txtFechaNacimiento.addKeyListener(this);
         
         
         add(lblMensaje);
	 add(lblNombre);
         add(txtNombre);
         add(lblApellidos);
         add(txtApellidos);
         add(lblRut);
         add(txtRut);
         add(lblFechaNacimiento);
         add(txtFechaNacimiento);
         add (lblRegion); 
         add (chRegion);
         add(btnAceptar);
         add(btnLimpiar);
  
     
    
}
     }
