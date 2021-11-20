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
public class Pedido {
    
    private String nombreCliente;
    
    private String apellidoCLiente;
    
    private String codigoPedido;
    
    private String Fecha;
    
    private String Hora;
    
    private double CostoTotal;
    
    private double CaloriasTotales;
    
    private ArrayList<Platillo> productosOrdenados;
    
    
    // Constructor Default
    public Pedido(){}
    
    // Constructor Sobrecargado
    public Pedido(String nombreCliente, String apellidoCLiente, String codigoPedido, String Fecha, String Hora, double CostoTotal, double CaloriasTotales) {
        this.nombreCliente = nombreCliente;
        this.apellidoCLiente = apellidoCLiente;
        this.codigoPedido = codigoPedido;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.CostoTotal = CostoTotal;
        this.CaloriasTotales = CaloriasTotales;
    }
    
    // Setters y Getters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCLiente() {
        return apellidoCLiente;
    }

    public void setApellidoCLiente(String apellidoCLiente) {
        this.apellidoCLiente = apellidoCLiente;
    }

    public String getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    public double getCaloriasTotales() {
        return CaloriasTotales;
    }

    public void setCaloriasTotales(double CaloriasTotales) {
        this.CaloriasTotales = CaloriasTotales;
    }

    public ArrayList<Platillo> getProductosOrdenados() {
        return productosOrdenados;
    }

    public void setProductosOrdenados(ArrayList<Platillo> productosOrdenados) {
        this.productosOrdenados = productosOrdenados;
    }
    
    
    
    
    
}
