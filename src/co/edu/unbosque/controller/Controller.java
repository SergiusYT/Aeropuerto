package co.edu.unbosque.controller;

import co.edu.unbosque.model.Abordaje;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private Abordaje model;
	
	
	
	public Controller() {
		
		view = new View();
		model = new Abordaje();
		ejecutar();
	}
	
	public void ejecutar() {
		
		boolean salir = false;
		
		while(!salir) {
		
		int  opcion = view.ingresarOpcion();
		
		switch(opcion) {
		
			case 0:
				
				String nombrePasajero = view.ingresarNombre();
                model.ingresarPasajero(nombrePasajero);
                
                break;

            case 1:
            	
                String numeroDocumento = String.valueOf(view.ingresarEntero("Ingrese el número de documento: "));
                model.ingresarDocumento(numeroDocumento);
                
                break;
				
			case 2:
				
				view.mostrarMensaje(model.simularAbordaje());
				
				break;
				
			case 3:
				
				salir = true;
			    System.exit(0);
				break;
				
		}
	  }	
	}
}		
