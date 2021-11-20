/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Platillo {
    
    private String codigoProducto;
    
    private String Nombre;
    
    private String Descripcion;
    
    private double TamanioPorcion;
    
    private int piezasPorcion;
    
    private double caloriasPorcion;
    
    private double caloriasPieza;
    
    private double Precio;

    
    public Platillo() {
    }
    
    public Platillo(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Platillo(String codigoProducto, String Nombre, String Descripcion, double TamanioPorcion, int piezasPorcion, double caloriasPorcion, double caloriasPieza, double Precio) {
        this.codigoProducto = codigoProducto;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.TamanioPorcion = TamanioPorcion;
        this.piezasPorcion = piezasPorcion;
        this.caloriasPorcion = caloriasPorcion;
        this.caloriasPieza = caloriasPieza;
        this.Precio = Precio;
    }
    
    
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getTamanioPorcion() {
        return TamanioPorcion;
    }

    public void setTamanioPorcion(double TamanioPorcion) {
        this.TamanioPorcion = TamanioPorcion;
    }

    public int getPiezasPorcion() {
        return piezasPorcion;
    }

    public void setPiezasPorcion(int piezasPorcion) {
        this.piezasPorcion = piezasPorcion;
    }

    public double getCaloriasPorcion() {
        return caloriasPorcion;
    }

    public void setCaloriasPorcion(double caloriasPorcion) {
        this.caloriasPorcion = caloriasPorcion;
    }

    public double getCaloriasPieza() {
        return caloriasPieza;
    }

    public void setCaloriasPieza(double caloriasPieza) {
        this.caloriasPieza = caloriasPieza;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}


