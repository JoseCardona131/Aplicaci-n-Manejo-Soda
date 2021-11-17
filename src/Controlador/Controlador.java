
package Controlador;

import General.Peticion;


public class Controlador {
    
    public Controlador(){}
    
    public Peticion procesar(Peticion laPeticion){
        switch(laPeticion.getAccion()){
            case LOGIN_USUARIO:
                break;
            case REGISTRO_USUARIO:
                break;
            case LOGIN_ADMIN:
                break;
            case REGISTRO_ADMIN:
                break;
            case LOGOUT:
                break;
            case MODIFICAR_CLIENTE:
                break;
            case MENSAJE_ERROR:
                break;
            case MENSAJE_EXITO:
                break;
            case NUEVO_PEDIDO:
                break;
            case AGREGAR_PRODUCTO_PEDIDO:
                break;
            case VER_CARRITO:
                break;
            case HACER_PEDIDO:
                break;
            case CANCELAR_PEDIDO:
                break;
            case REGRESAR_VENTANA:
                break;
            case VER_CATALOGO:
                break;
            case ESTADISTICAS_PEDIDOS:
                break;
            case TOP_10_PRODUCTOS:
                break;
            case PRODUCTOS_NO_COMPRADOS:
                break;
            case RELACION_PORCENTUAL_PRODUCTOS:
                break;
            case VER_PEDIDOS:
                break;
            case DETALLE_PEDIDO:
                break;
            case ABRIR_MODIFICAR_CATALOGO:
                break;
            case ABRIR_AGREGAR_P:
                break;
            case AGREGAR_PRODUCTO:
                break;
            case ABRIR_ELIMINAR_P:
                laPeticion.setDatosSalida(true);
                break;
            case ELIMINAR_PRODUCTO:
                break;
            case ABRIR_MODIFICAR_P:
                break;
            case MODIFICAR_PRODUCTO:
                break;
            case MODIFICAR_ADMIN:
                break;
            
        }
    return laPeticion;
            
            
    }
    
}
