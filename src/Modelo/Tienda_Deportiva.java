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
public class Tienda_Deportiva {

   public String IdTienda;
    public String NombreTienda;
    public String DireccionTienda;
    public String HorarioAtencion;
    public String Imagen1;
    public String Imagen2;
    public String Imagen3;
    public int Telefono1;
    public int Telefono2;

    public Tienda_Deportiva(String IdTienda, String NombreTienda, String DireccionTienda, String HorarioAtencion, String Imagen1, String Imagen2, String Imagen3, int Telefono1, int Telefono2) {
        this.IdTienda = IdTienda;
        this.NombreTienda = NombreTienda;
        this.DireccionTienda = DireccionTienda;
        this.HorarioAtencion = HorarioAtencion;
        this.Imagen1 = Imagen1;
        this.Imagen2 = Imagen2;
        this.Imagen3 = Imagen3;
        this.Telefono1 = Telefono1;
        this.Telefono2 = Telefono2;
    }

    public String getIdTienda() {
        return IdTienda;
    }

    public void setIdTIenda(String IdTienda) {
        this.IdTienda = IdTienda;
    }

    public String getNombreTienda() {
        return NombreTienda;
    }

    public void setNombreTienda(String NombreTienda) {
        this.NombreTienda = NombreTienda;
    }

    public String getDireccionTienda() {
        return DireccionTienda;
    }

    public void setDireccionTienda(String DireccionTienda) {
        this.DireccionTienda = DireccionTienda;
    }

    public String getHorarioAtencion() {
        return HorarioAtencion;
    }

    public void setHorarioAtencion(String HorarioAtencion) {
        this.HorarioAtencion = HorarioAtencion;
    }

    public String getImagen1() {
        return Imagen1;
    }

    public void setImagen1(String Imagen1) {
        this.Imagen1 = Imagen1;
    }

    public String getImagen2() {
        return Imagen2;
    }

    public void setImagen2(String Imagen2) {
        this.Imagen2 = Imagen2;
    }

    public String getImagen3() {
        return Imagen3;
    }

    public void setImagen3(String Imagen3) {
        this.Imagen3 = Imagen3;
    }

    public int getTelefono1() {
        return Telefono1;
    }

    public void setTelefono1(int Telefono1) {
        this.Telefono1 = Telefono1;
    }

    public int getTelefono2() {
        return Telefono2;
    }

    public void setTelefono2(int Telefono2) {
        this.Telefono2 = Telefono2;
    }

    public ResultSet traerDatosTiendas(String sql) {

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
        return "Tienda_Deportiva{" + "IdTienda=" + IdTienda + ", NombreTienda=" + NombreTienda + ", DireccionTienda=" + DireccionTienda + ", HorarioAtencion=" + HorarioAtencion + ", Imagen1=" + Imagen1 + ", Imagen2=" + Imagen2 + ", Imagen3=" + Imagen3 + ", Telefono1=" + Telefono1 + ", Telefono2=" + Telefono2 + '}';
    }

}
