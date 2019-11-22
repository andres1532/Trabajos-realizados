/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Jhonny Londoño G
 */
public class Imagen extends javax.swing.JPanel {
    String IdImagen;
    String Imagen;
    String DescripcionImagen;
    String ruta;
    

    public Imagen(String IdImagen, String Imagen, String DescripcionImagen) {
        this.IdImagen = IdImagen;
        this.Imagen = Imagen;
        this.DescripcionImagen = DescripcionImagen;
    }
    
    public Imagen(int x, int y, String ruta){
        this.setSize(x, y);
        this.ruta = ruta;
    }
    
    public void paint(Graphics g){
        Dimension height = getSize();
        ImageIcon img = new ImageIcon(getClass().getResource(ruta));
        
        g.drawImage( img.getImage(), 0,0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

    public String getIdImagen() {
        return IdImagen;
    }

    public void setIdImagen(String IdImagen) {
        this.IdImagen = IdImagen;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getDescripcionImagen() {
        return DescripcionImagen;
    }

    public void setDescripcionImagen(String DescripcionImagen) {
        this.DescripcionImagen = DescripcionImagen;
    }

    
    
    
    
    @Override
    public String toString() {
        return "Imagen{" + "IdImagen=" + IdImagen + ", Imagen=" + Imagen + ", DescripcionImagen=" + DescripcionImagen + '}';
    }
    
}
