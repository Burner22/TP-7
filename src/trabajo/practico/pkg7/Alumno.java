
package trabajo.practico.pkg7;

import java.util.*;
import javax.swing.JOptionPane;


public class Alumno {
    private int legajo;
    private String apellido, nombre;
    
    HashSet <Materia> mater = new HashSet <> ();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria (Materia materia){
         
         if (mater.add(materia)){
             JOptionPane.showMessageDialog(null, "Alumno Inscripto");
         }
         else{
             JOptionPane.showMessageDialog(null, "El alumno ya esta inscripto en esa materia");
         }
    }
    
    public int cantidadMaterias(){
        return mater.size();
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }

    @Override
    public int hashCode() {
        return this.legajo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
    
}
