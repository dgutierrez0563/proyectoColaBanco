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
public class NodoCliente {
    //Atributos de del NodoCliente
    public NodoCliente siguiente;
    public Clientes dato; 
    //Constructor del NodoCliente

    public NodoCliente(Clientes dato) {
        this.dato = dato;
        siguiente=null;
    }
    
    
}
