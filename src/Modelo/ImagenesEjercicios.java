/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;

/**
 *
 * @author juanp
 */
public class ImagenesEjercicios {
    
    public String IdImagen;
    public String DescripcionImagen;
    public String IdEjercicios;
    public String imagen;

    public ImagenesEjercicios(String IdImagen, String DescripcionImagen, String IdEjercicios, String imagen) {
        this.IdImagen = IdImagen;
        this.DescripcionImagen = DescripcionImagen;
        this.IdEjercicios = IdEjercicios;
        this.imagen = imagen;
    }

    public ImagenesEjercicios() {
       
    }

    public String getIdImagen() {
        return IdImagen;
    }

    public String getDescripcionImagen() {
        return DescripcionImagen;
    }

    public String getIdEjercicios() {
        return IdEjercicios;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIdImagen(String IdImagen) {
        this.IdImagen = IdImagen;
    }

    public void setDescripcionImagen(String DescripcionImagen) {
        this.DescripcionImagen = DescripcionImagen;
    }

    public void setIdEjercicios(String IdEjercicios) {
        this.IdEjercicios = IdEjercicios;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
public ResultSet traerDatosImagenesEjer(String sql) {

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
        return "ImagenesEjercicios{" + "IdImagen=" + IdImagen + ", DescripcionImagen=" + DescripcionImagen + ", IdEjercicios=" + IdEjercicios + ", imagen=" + imagen + '}';
    }
    
}
