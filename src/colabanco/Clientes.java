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
public class Clientes { //Clase de Clientes
    //Atributos de la clase
    private String nombre;
    private String cedula;
    private char prioridad;
    private int FilaNumero;
    private int TiempoSolicitud;
    //Construcor de la clase

    public Clientes(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    //Meodos set y get de los atributos en clase Clientes
    public void setNombre(String nombre){this.nombre=nombre;}
    public String getNombre(){return nombre;}
    
    public void setCedula(String cedula){this.cedula=cedula;}
    public String getCedula(){return cedula;}
    
    public void setPrioridad(char prioridad){this.prioridad=prioridad;}
    public char getPrioridad(){return prioridad;}
    
    public void setFilaNumero(int FilaNumero){this.FilaNumero=FilaNumero;}
    public int getFilaNumero(){return FilaNumero;}
    
    public void setTiempoSolicitud(int TiempoSolicitud){this.TiempoSolicitud=TiempoSolicitud;}
    public int getTiempoSolicitud(){return TiempoSolicitud;}
    //Metodo toString de impresion de datos del cliente
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nCedula: " +cedula+"\nPrioridad: "+prioridad+"\nFila Numero: "+FilaNumero+"\nTiempo de Tramite: "+TiempoSolicitud;
    } 
}
