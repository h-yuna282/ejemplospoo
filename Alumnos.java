/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author CBN
 */
public class Alumnos extends personal{
    protected String codigo, facultad, programa;
    protected int semestres;

    public Alumnos(String codigo, String facultad, String programa, int semestre, String tipoDocumento, String documento, String Apellidos, String nombres, int edad, boolean activoString codigo, String facultad, String programa, int semestre); {
        super(tipoDocumento, documento, Apellidos, nombres, edad, activo);
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestres = semestres;
    }

    
    
}
