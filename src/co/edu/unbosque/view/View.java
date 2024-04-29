package co.edu.unbosque.view;

import javax.swing.*;

public class View {
	
	public int ingresarOpcion() {
		
		 // Implementación las opciones del JComboBox
       String[] opciones = {"1. Ingrese Pasajeros\n", "2. Agregar Documentos de Embarcage\n", "3. Simular Abordaje\n", 
       		             "4. Salir"};

       // Crear el JComboBox con las opciones creadas anteriormente
       JComboBox<String> comboBox = new JComboBox<>(opciones);
    // Crear un ImageIcon con la ruta de la imagen
       ImageIcon icono = new ImageIcon("Recursos/Aeropuerto.gif");

       // Mostrar el JOptionPane con el JComboBox implementado
       int opcionElegida = JOptionPane.showOptionDialog(
               null,
               comboBox,
               "Bienvenido Al Aeropuesto EL Dorado",
               JOptionPane.OK_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE,
               icono,
               null,
               null
       );

       // Verificar si se seleccionó una opción y devolver el índice seleccionado
       if (opcionElegida == JOptionPane.OK_OPTION) {
           return comboBox.getSelectedIndex();
       } else if (opcionElegida == JOptionPane.CLOSED_OPTION) {
           // Si preciona cancel pues devuelve 3 para salir
           return 3;
       } else {
           // devuelve 3 si presion la x
           return 3;
       }
	}
	
	public String ingresarNombre() {
		
		String nombre= "";
		nombre= JOptionPane.showInputDialog(null,"Ingrese el nombre del pasajero");
		
		return nombre;
	}
	
	
	public int ingresarEntero(String msg) {
		
	     int numeroIngresado = 0;
	        boolean entradaValida = false;

	        while (!entradaValida) {
	            try {
	                // Solicitar la entrada del usuario usando JOptionPane
	                String input = JOptionPane.showInputDialog(msg);

	                // Verificar si se presionó Cancelar
	                if (input == null) {
	                    // Manejar la cancelación según sea necesario (puedes devolver un valor predeterminado o lanzar una excepción)
	                    return -1;
	                }

	                // Intentar convertir la entrada a un entero
	                numeroIngresado = Integer.parseInt(input);

	                // Si no se produce una excepción, la entrada es válida
	                entradaValida = true;
	            } catch (NumberFormatException e) {
	                // Si ocurre una excepción al intentar convertir a entero, mostrar un mensaje de error y volver a solicitar la entrada
	                JOptionPane.showMessageDialog(null, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }

	        // Devolver el número ingresado
	        return numeroIngresado;
	}
	
	public void mostrarMensaje(String msg) {
		
		 // Crear un ImageIcon con la ruta de la imagen
        ImageIcon icono = new ImageIcon("Recursos/Avion.gif");

        // Mostrar el mensaje con la imagen
        JOptionPane.showMessageDialog(null, msg, "Proceso Final", JOptionPane.INFORMATION_MESSAGE, icono);	
        
	}

}
