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
public class Rutina {
    public String IdRutina;
    public String NombreRutina;
    public String TipoRutina;
    public int CantidadRepeticiones;
    public String TiempoRepeticiones;
    public String TiempoDescanso;

    public Rutina(String IdRutina, String NombreRutina, String TipoRutina, int CantidadRepeticiones, String TiempoRepeticiones, String TiempoDescanso) {
        this.IdRutina = IdRutina;
        this.NombreRutina = NombreRutina;
        this.TipoRutina = TipoRutina;
        this.CantidadRepeticiones = CantidadRepeticiones;
        this.TiempoRepeticiones = TiempoRepeticiones;
        this.TiempoDescanso = TiempoDescanso;
    }

    public Rutina() {
       
    }

    public String getIdRutina() {
        return IdRutina;
    }

    public void setIdRutina(String IdRutina) {
        this.IdRutina = IdRutina;
    }

    public String getNombreRutina() {
        return NombreRutina;
    }

    public void setNombreRutina(String NombreRutina) {
        this.NombreRutina = NombreRutina;
    }

    public String getTipoRutina() {
        return TipoRutina;
    }

    public void setTipoRutina(String TipoRutina) {
        this.TipoRutina = TipoRutina;
    }

    public int getCantidadRepeticiones() {
        return CantidadRepeticiones;
    }

    public void setCantidadRepeticiones(int CantidadRepeticiones) {
        this.CantidadRepeticiones = CantidadRepeticiones;
    }

    public String getTiempoRepeticiones() {
        return TiempoRepeticiones;
    }

    public void setTiempoRepeticiones(String TiempoRepeticiones) {
        this.TiempoRepeticiones = TiempoRepeticiones;
    }

    public String getTiempoDescanso() {
        return TiempoDescanso;
    }

    public void setTiempoDescanso(String TiempoDescanso) {
        this.TiempoDescanso = TiempoDescanso;
    }
    
    public ResultSet traerDatosRutina(String sql){
        
        ResultSet rs = null;
        
        ConnectBD conn = new ConnectBD();
        
        if(conn.crearConexion()){
            
            try{
                rs = conn.getSt().executeQuery(sql);
            }catch(Exception ex){
                ex.printStackTrace();
            }
            
        }
        return rs;
    }

    @Override
    public String toString() {
        return "Rutina{" + "IdRutina=" + IdRutina + ", NombreRutina=" + NombreRutina + ", TipoRutina=" + TipoRutina + ", CantidadRepeticiones=" + CantidadRepeticiones + ", TiempoRepeticiones=" + TiempoRepeticiones + ", TiempoDescanso=" + TiempoDescanso + '}';
    }
    
}
