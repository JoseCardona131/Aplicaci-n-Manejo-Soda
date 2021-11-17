/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @EQUIPO Fama
 */
public class CatalogoPlatillos {
    
    private static ArrayList<Platillo> ListaProductos;

    public CatalogoPlatillos() {
    }
    
    public static ArrayList<Platillo> getListaProductos() {
        return ListaProductos;
    }

    public static void setListaProductos(ArrayList<Platillo> ListaProductos) {
        CatalogoPlatillos.ListaProductos = ListaProductos;
    }
    
    public static void AgregarAListaProductos(Platillo nuevoProducto){
        
        ListaProductos.add(nuevoProducto);
        
    }
    
    public static boolean QuitarDeListaProductos(String codigoProducto){
        
        for (Platillo actual: ListaProductos){
            if (actual.getCodigoProducto().equals(codigoProducto)){
                ListaProductos.remove(actual);
                return true;
            }
        }
        return false;
    }
    
    public static boolean ModificarProductoLista(String codigoProducto, String NombreNuevo, String NuevaDescrip, String NuevoTamanio, String nuevaCantPzs, 
            String NuevasCalsPorcion, String NuevasCalPzs, String nuevoPrecio){
        
        // Primero se busca el elemento
        for (Platillo actual: ListaProductos){
            
            // Si se encuentra un platillo con ese código
            if (actual.getCodigoProducto().equals(codigoProducto)){
                
                // Se van a modificar los datos diferentes de vacío
                if (!codigoProducto.equals("")){
                    
                    actual.setCodigoProducto(codigoProducto);
                }

                if (!NombreNuevo.equals("")){
                    
                    actual.setNombre(NombreNuevo);
                }

                if (!NuevaDescrip.equals("")){
                    
                    actual.setDescripcion(nuevoPrecio);
                }

                if (!NuevoTamanio.equals("")){
                    
                    actual.setTamanioPorcion(Double.parseDouble(NuevoTamanio));
                }
                
                if (!nuevaCantPzs.equals("")){
                    
                    actual.setPiezasPorcion(Integer.parseInt(nuevaCantPzs));
                }
                
                if (!NuevasCalPzs.equals("")){
                    
                    actual.setCaloriasPieza(Double.parseDouble(NuevasCalPzs));
                }
                
                if (!NuevasCalsPorcion.equals("")){
                    
                    actual.setCaloriasPorcion(Double.parseDouble(NuevasCalsPorcion));
                }
                if (!nuevoPrecio.equals("")){
                    
                    actual.setPrecio(Double.parseDouble(nuevoPrecio));
                }
                
                return true;
            }
  
        }
        return false;
    
    }
}
