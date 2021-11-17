
package General;

import java.io.Serializable;

public class Peticion implements Serializable{
    private AccionServidora accion;
    private Object datosEntrada;
    private Object datosSalida;

    public Peticion() {
    }

    
    public Peticion(AccionServidora accion, Object datosEntrada) {
        this.accion = accion;
        this.datosEntrada = datosEntrada;
    }

    public AccionServidora getAccion() {
        return accion;
    }

    public void setAccion(AccionServidora accion) {
        this.accion = accion;
    }

    public Object getDatosEntrada() {
        return datosEntrada;
    }

    public void setDatosEntrada(Object datosEntrada) {
        this.datosEntrada = datosEntrada;
    }

    public Object getDatosSalida() {
        return datosSalida;
    }

    public void setDatosSalida(Object datosSalida) {
        this.datosSalida = datosSalida;
    }

    @Override
    public String toString() {
        return "Peticion{" + "accion=" + accion + ", datosEntrada=" + datosEntrada + ", datosSalida=" + datosSalida + '}';
    }
}
