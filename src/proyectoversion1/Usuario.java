/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoversion1;

/**
 *
 * @author salva
 */
public class Usuario {
    String cedula;
    String nombres, apellidos;
    String telefono;
    String direccion;
    boolean esEmpleado; //Si no es empleado sera falso

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isesEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    @Override
    public String toString() {
        String aux;
        if(esEmpleado == true){
            aux="Empleado";
        }else{
            aux="Cliente";
        }
        return "\nCedula: " + cedula + "| Nombres: " + nombres + "| Apellidos: " + apellidos + "| Telefono: " + telefono + "| Direccion: " + direccion + "| Usuario: " + aux;
    }
    
    
}
