/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colabanco;

/**
 *
 * @author DAVID GUTIERREZ SOLANO & JHONNY CASCANTE
 * @version 1.1
 */
public class Ventana {  //Clase Ventana de atencion (Estilo cajero)
    //Atributos de Clase Ventana
    public ListaClientes cliente;   //Lista Simple para Clientes
    public String nombre;   //Nombre de cliente
    private boolean ocupado;    //Situacion de la caja (Ocupada o libre)
    //Metodo constructor de la Clase Ventana
    public Ventana(String nombre) {
        this.cliente = new ListaClientes();
        this.nombre = nombre;
        this.ocupado=false;
    }
    //Metodo que indica si la Ventana esta Ocupada
    public boolean VantanaOcupada(){return ocupado;}
    //Metodo que establece el estado de "ocupado"
    public void SetVentanaOcupada(boolean ocupado){this.ocupado=ocupado;}    
}
