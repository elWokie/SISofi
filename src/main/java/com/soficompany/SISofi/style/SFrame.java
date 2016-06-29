package com.soficompany.SISofi.style;
import java.awt.BorderLayout;
import java.awt.Color;
public class SFrame extends javax.swing.JFrame{
	public SFrame(String titulo,int tipo){
		super(titulo);
		setBackground(new Color(89,89,89));
		if(tipo==CONTENEDOR){
			setLayout(new BorderLayout());
			setExtendedState(MAXIMIZED_BOTH);
		}
	}
	public static int CONTENEDOR = 0;
}
