/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author jcard
 */
public class ListaClientes {
    
    private static ArrayList<ClienteSoda> listaClientes;

    public ListaClientes() {
        ListaClientes.listaClientes = new ArrayList();
    }

    public ListaClientes(ArrayList<ClienteSoda> listaClientes) {
        ListaClientes.listaClientes = new ArrayList();
        ListaClientes.listaClientes = listaClientes;
    }

    public ArrayList<ClienteSoda> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<ClienteSoda> listaClientes) {
        ListaClientes.listaClientes = listaClientes;
    }
    
    // Metodo para modificar la lista
    public boolean EliminarCliente(String Code){
        
        for (ClienteSoda actual: listaClientes){
            
            if (actual.getCodigo().equals(Code)){
                
                listaClientes.remove(actual);
                return true;
            }
        
        }
        return false;
    }
    
    public void agregarCliente(ClienteSoda nuevoCliente){
        listaClientes.add(nuevoCliente);
    }
    
    public void modificarCliente(String codigo, String nuevoNom, String nuevoAp, String nuevoNum, String nuevoCorreo, String NeoContraseña){
        
        // Se busca el cliente
        for (ClienteSoda actual: listaClientes){
            
            if (actual.getCodigo().equals(codigo)){
                
                if (!nuevoNom.equals("")){
                    actual.setNombre(nuevoNom);
                }
                
                if (!nuevoAp.equals("")){
                    actual.setApellido(nuevoAp);
                }
                if (!nuevoNum.equals("")){
                    actual.setNumero(nuevoNum);
                }
                if (!nuevoCorreo.equals("")){
                    actual.setCorreo(nuevoCorreo);
                }
                if (!NeoContraseña.equals("")){
                    actual.setContraseña(NeoContraseña);
                }
                break;
                
            }   
        }   
    }
    
    
}
