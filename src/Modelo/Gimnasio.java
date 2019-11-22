/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jhonny Londoño G
 */
public class Gimnasio {
    
    public String IdGimnasio;
    public String NombreGimnasio;
    public String DescripcionGimnasio;
    public String HorarioAtencion;
    public String DireccionGimnasio;
    public String Imagen1;
    public String Imagen2;
    public String Imagen3;
    public String Telefono1;
    public String Telefono2;

    public Gimnasio(String IdGimnasio, String NombreGimnasio, String HorarioAtencion, String DireccionGimnasio, String Imagen1, String Imagen2, String Imagen3, String Telefono1, String Telefono2) {
        this.IdGimnasio = IdGimnasio;
        this.NombreGimnasio = NombreGimnasio;
        this.HorarioAtencion = HorarioAtencion;
        this.DireccionGimnasio = DireccionGimnasio;
        this.Imagen1 = Imagen1;
        this.Imagen2 = Imagen2;
        this.Imagen3 = Imagen3;
        this.Telefono1 = Telefono1;
        this.Telefono2 = Telefono2;
    }

    public Gimnasio() {
        
    }

    public String getIdGimnasio() {
        return IdGimnasio;
    }

    public String getNombreGimnasio() {
        return NombreGimnasio;
    }

    public String getDescripcionGimnasio() {
        return DescripcionGimnasio;
    }

    public String getHorarioAtencion() {
        return HorarioAtencion;
    }

    public String getDireccionGimnasio() {
        return DireccionGimnasio;
    }

    public String getImagen1() {
        return Imagen1;
    }

    public String getImagen2() {
        return Imagen2;
    }

    public String getImagen3() {
        return Imagen3;
    }

    public String getTelefono1() {
        return Telefono1;
    }

    public String getTelefono2() {
        return Telefono2;
    }

    public void setIdGimnasio(String IdGimnasio) {
        this.IdGimnasio = IdGimnasio;
    }

    public void setNombreGimnasio(String NombreGimnasio) {
        this.NombreGimnasio = NombreGimnasio;
    }

    public void setDescripcionGimnasio(String DescripcionGimnasio) {
        this.DescripcionGimnasio = DescripcionGimnasio;
    }

    public void setHorarioAtencion(String HorarioAtencion) {
        this.HorarioAtencion = HorarioAtencion;
    }

    public void setDireccionGimnasio(String DireccionGimnasio) {
        this.DireccionGimnasio = DireccionGimnasio;
    }

    public void setImagen1(String Imagen1) {
        this.Imagen1 = Imagen1;
    }

    public void setImagen2(String Imagen2) {
        this.Imagen2 = Imagen2;
    }

    public void setImagen3(String Imagen3) {
        this.Imagen3 = Imagen3;
    }

    public void setTelefono1(String Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public void setTelefono2(String Telefono2) {
        this.Telefono2 = Telefono2;
    }

     public ResultSet traerDatosGimnasio(String sql) {

        ResultSet rs = null;

        ConnectBD conn = new ConnectBD();

        if (conn.crearConexion()) {
            try {
                rs = conn.getSt().executeQuery(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return rs;

    
    }
    
    @Override
    public String toString() {
        return "Gimnasio{" + "IdGimnasio=" + IdGimnasio + ", NombreGimnasio=" + NombreGimnasio + ", DescripcionGimnasio=" + DescripcionGimnasio + ", HorarioAtencion=" + HorarioAtencion + ", DireccionGimnasio=" + DireccionGimnasio + ", Imagen1=" + Imagen1 + ", Imagen2=" + Imagen2 + ", Imagen3=" + Imagen3 + ", Telefono1=" + Telefono1 + ", Telefono2=" + Telefono2 + '}';
    }
    
}
