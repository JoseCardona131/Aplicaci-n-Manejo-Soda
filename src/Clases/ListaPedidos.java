/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

public class ListaPedidos {
    
    private static ArrayList<Pedido> ListaPEdidos;

    public ListaPedidos() {
    }

    public static ArrayList<Pedido> getListaPEdidos() {
        return ListaPEdidos;
    }

    public static void setListaPEdidos(ArrayList<Pedido> ListaPEdidos) {
        ListaPedidos.ListaPEdidos = ListaPEdidos;
    }
    
    // Funciones para modificar la lista
    public void agregarPedido(Pedido nuevoP){
        ListaPEdidos.add(nuevoP);
    } 

    // Función para llenar la lista con los datos almacenados en el excel de pedidos
    
    
    
}
