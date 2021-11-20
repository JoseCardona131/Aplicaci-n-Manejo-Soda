
package Controlador;

import General.Peticion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controlador {
    
    public Controlador(){}
    
    public Peticion procesar(Peticion laPeticion){
        switch(laPeticion.getAccion()){
            case LOGIN_USUARIO:
                     
                // Se deben de obtener los datos de ingreso
                String datosRecibidos[] = (String[]) laPeticion.getDatosEntrada();
                
                // Se procede a revisar la validez de los datos enviados por el usuario al servidor
             
                // Primero se revisa si  el correo tiene un formato valido
                Pattern patron = Pattern.compile("^(.+)@(.+)$");
                Matcher matcorreo = patron.matcher(datosRecibidos[0]);
                
                // Si el patrón es correcto
                if (matcorreo.matches()){
                    
                    // Se revisa que la contraseña no sea vacío
                    System.out.println(datosRecibidos[1]); 
                    if (datosRecibidos[1].equals("")){ 
                        laPeticion.setDatosSalida("ContraVac");
                    }
                    
                    else{
                    
                        laPeticion.setDatosSalida("Validando Credenciales...");
                    }
                              
                }
                // Si el patrón es Incorrecto
                else{
                    laPeticion.setDatosSalida("CorreoInc");
                }
                
                break;
                
            case REGISTRO_USUARIO:
                laPeticion.setDatosSalida(true);
                break;
            case ABRIR_LOGIN_ADMIN:
                laPeticion.setDatosSalida(true);
                break;
            case INGRESO_ADMIN:
                
                // Se revisará la validez de la contraseña
                // Primero se revisa que no sea vacía
                String datosEn[] = (String[]) laPeticion.getDatosEntrada();
                String contra_dada = datosEn[0];
                String contra_verdadera = datosEn[1];
                
                if (contra_dada.equals("")){
                    laPeticion.setDatosSalida("ConVacia");
                }
                else{
                    // Si no esta vacia se revisa que este en el archivo
                    // De momento se revisa con una constante
                    if (contra_dada.equals(contra_verdadera)){
                        laPeticion.setDatosSalida("Bien");
                    }
                    // Si la contraseña no coincide
                    else{
                        laPeticion.setDatosSalida("Incorrecta");
                    }
                }
                break;
                
            case LOGOUT:
                break;
            case ABRIR_MODIFICAR_CLIENTE:
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
                laPeticion.setDatosSalida(true);
                break;
            case ESTADISTICAS_PEDIDOS:
                 laPeticion.setDatosSalida(true);
                break;
            case TOP_10_PRODUCTOS:
                break;
            case PRODUCTOS_NO_COMPRADOS:
                break;
            case RELACION_PORCENTUAL_PRODUCTOS:
                break;
            case VER_PEDIDOS:
                laPeticion.setDatosSalida(true);
                break;
            case DETALLE_PEDIDO:
                break;
            case ABRIR_MODIFICAR_CATALOGO:
                laPeticion.setDatosSalida(true);
                break;
            case ABRIR_AGREGAR_P:
                laPeticion.setDatosSalida(true);
                break;
            case AGREGAR_PRODUCTO:
                break;
            case ABRIR_ELIMINAR_P:
                laPeticion.setDatosSalida(true);
                break;
            case ELIMINAR_PRODUCTO:
                break;
            case ABRIR_MODIFICAR_P:
                laPeticion.setDatosSalida(true);
                break;
                
            case ABRIR_MODIFICAR_ENCONTRADO:
                laPeticion.setDatosSalida(true);
                break;
                
            case MODIFICAR_PRODUCTO:
                break;
            case MODIFICAR_ADMIN:
                laPeticion.setDatosSalida(true);
                break;
            case CERRAR_VENTANA:
                laPeticion.setDatosSalida(true);
                break;
            
        }
    return laPeticion;
            
            
    }
    
}
