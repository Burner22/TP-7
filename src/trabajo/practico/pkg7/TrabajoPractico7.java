
package trabajo.practico.pkg7;


public class TrabajoPractico7 {

    public static void main(String[] args) {

     Materia m1 = new Materia (152, 1, "Ingles I");
     Materia m2 = new Materia (145,1,"Matematicas");
     Materia m3 = new Materia (123,1,"Laboratorio I");
     Materia m4 = new Materia (123,1,"Laboratorio I");
        
     Alumno a1 = new Alumno (1001, "Lopes","Martin");   
     Alumno a2 = new Alumno (1002, "Martinez", "Brenda");
    
     a1.agregarMateria(m1);
     a1.agregarMateria(m2);
     a1.agregarMateria(m3);
     
     a2.agregarMateria(m1);
     a2.agregarMateria(m2);
     a2.agregarMateria(m3);
     a1.agregarMateria(m4);
     
     System.out.println(a1.cantidadMaterias());
     System.out.println(a2.cantidadMaterias());
    
    
    
    }
    
}
