/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;

/**
 *
 * @author Jhonny Londoño G
 */
public class Restaurantes {
    
    public String IdRestaurante;
    public String NombreRestaurante;
    public String HorarioAtencion;
    public String DirecionRestaurante;
    //String Imagen1;
    //String Imagen2;
    //String Imagen3;
    public  String Telefono1;
    public String  Telefono2;

    public Restaurantes(String IdRestaurante, String NombreRestaurante, String HorarioAtencion, String DirecionRestaurante, String Telefono1, String Telefono2) {
        this.IdRestaurante = IdRestaurante;
        this.NombreRestaurante = NombreRestaurante;
        this.HorarioAtencion = HorarioAtencion;
        this.DirecionRestaurante = DirecionRestaurante;
        this.Telefono1 = Telefono1;
        this.Telefono2 = Telefono2;
    }

    public String getIdRestaurante() {
        return IdRestaurante;
    }

    public String getNombreRestaurante() {
        return NombreRestaurante;
    }

    public String getHorarioAtencion() {
        return HorarioAtencion;
    }

    public String getDirecionRestaurante() {
        return DirecionRestaurante;
    }

    public String getTelefono1() {
        return Telefono1;
    }

    public String getTelefono2() {
        return Telefono2;
    }

    public void setIdRestaurante(String IdRestaurante) {
        this.IdRestaurante = IdRestaurante;
    }

    public void setNombreRestaurante(String NombreRestaurante) {
        this.NombreRestaurante = NombreRestaurante;
    }

    public void setHorarioAtencion(String HorarioAtencion) {
        this.HorarioAtencion = HorarioAtencion;
    }

    public void setDirecionRestaurante(String DirecionRestaurante) {
        this.DirecionRestaurante = DirecionRestaurante;
    }

    public void setTelefono1(String Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public void setTelefono2(String Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public ResultSet traerDatosRestaurante(String sql) {

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
        return "Restaurantes{" + "IdRestaurante=" + IdRestaurante + ", NombreRestaurante=" + NombreRestaurante + ", HorarioAtencion=" + HorarioAtencion + ", DirecionRestaurante=" + DirecionRestaurante + ", Telefono1=" + Telefono1 + ", Telefono2=" + Telefono2 + '}';
    }
    
}
