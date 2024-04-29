package co.edu.unbosque.model;


import java.util.*;

public class Abordaje {
	
    private Queue<Pasajero> colaEspera;
    private Stack<String> documentosEmbarque;
    
    private StringBuilder resultadoAbordajes;
    private Pasajero pasajero;
    private String documento;

    
    
    public Abordaje() {
    	
    	colaEspera = new LinkedList<>();
    	documentosEmbarque = new Stack<>();
    	resultadoAbordajes = new StringBuilder();
    	        
    }
    
    
    public void ingresarPasajero(String nombre) {
        colaEspera.add(new Pasajero(nombre));
    }

    public void ingresarDocumento(String documento) {
        documentosEmbarque.push(documento);
    }
    
    public String simularAbordaje() {
    	
        // Verificar que haya al menos 3 nombres y documentos
        if (colaEspera.size() < 3 || documentosEmbarque.size() < 3) {
            return "Debe haber al menos 3 nombres y 3 documentos para simular el abordaje.";
        }
    	
        // Mientras haya pasajeros en la cola
        while (!colaEspera.isEmpty()) {
            // Extraer un pasajero de la cola
            pasajero = colaEspera.poll();

            // Extraer su respectivo documento de la pila
            if (!documentosEmbarque.isEmpty()) {
                documento = documentosEmbarque.pop();

                // Acumular el mensaje indicando que el pasajero está siendo abordado con su documento
                resultadoAbordajes.append("Abordando a ").append(pasajero.getNombre()).append(" con documento ").append(documento).append("\n");
            } else {
                // En caso de no haber más documentos de embarque disponibles
                resultadoAbordajes.append("No hay más documentos de embarque disponibles.\n");
            }
        }

        // Después del bucle, verifica si aún quedan documentos sin procesar en la pila
        if (!documentosEmbarque.isEmpty()) {
            resultadoAbordajes.append("Hay documentos sin procesar en la pila.\n");
        } else {
            resultadoAbordajes.append("Todos los pasajeros han sido abordados correctamente.\n");
        }

        return resultadoAbordajes.toString();
    }

}
