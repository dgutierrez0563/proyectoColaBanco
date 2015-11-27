/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colabanco;

/**
 *
 * @author 68NK7
 */
public class ListaClientes {    //Clase para Lista Simple
    //Atributos de la Lista Simple
    public NodoCliente primero;
    public NodoCliente ultimo;
    public int tamano;
    //Constructor para la clase ListaClientes
    public ListaClientes() {
        this.primero = null;
        this.ultimo = null;
        this.tamano=0;
    }
    
    public boolean esVacio(){
        if(primero==null){return true;}
        else{return false;}
    }
    public void agregarCliente(Clientes Datos){
        NodoCliente nuevoNodo=new NodoCliente(Datos);
        if(esVacio()){  //Situacion si la lista esta Vacia inserta datos
            primero=nuevoNodo;
        }else{
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;
        }
        tamano++;
    }
    public void borrarCliente(){
        ClaseMensajes mensaje=new ClaseMensajes();
        if(esVacio()){
            mensaje.FilaVacia();//Llamada de metodo que muestre en JOptionPane (la lista esta vacia o la ventana)
        }else{
            primero=primero.siguiente;
        }
        tamano--;
        
    }
}
