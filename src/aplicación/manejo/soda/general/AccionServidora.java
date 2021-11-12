/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicación.manejo.soda.general;

/**
 * Tipos de acciones que podrá ejecutar el servidor principal de la aplicación, son usadas como parámetro 
 * al enviarle una petición al servidor
 * 
 * @author EQUIPO 7
 */

public enum AccionServidora {
    LOGIN_USUARIO, REGISTRO_USUARIO, LOGIN_ADMIN, REGISTRO_ADMIN, LOGOUT, MODIFICAR_CLIENTE, MODIFICAR_ADMIN, MENSAJE_ERROR, MENSAJE_EXITO, 
    NUEVO_PEDIDO, AGREGAR_PRODUCTO_PEDIDO, VER_CARRITO, HACER_PEDIDO, CANCELAR_PEDIDO, REGRESAR_VENTANA,VER_CATALOGO,ESTADISTICAS_PEDIDOS, 
    TOP_10_PRODUCTOS, PRODUCTOS_NO_COMPRADOS, RELACION_PORCENTUAL_PRODUCTOS, VER_PEDIDOS, DETALLE_PEDIDO, ABRIR_MODIFICAR_CATALOGO,
    ABRIR_AGREGAR_P, AGREGAR_PRODUCTO, ABRIR_ELIMINAR_P, ELIMINAR_PRODUCTO, ABRIR_MODIFICAR_P, MODIFICAR_PRODUCTO
}
