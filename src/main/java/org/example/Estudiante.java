package org.example;

public class Estudiante {
    String nombre;
    String cedula;
    int edad;
    String apellido;
    String telefono;
    String correo;

    public Estudiante(String nombre, String cedula, int edad, String apellido, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    //metodos

    @Override
    public String toString() {
        return "nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "cedula: " + cedula + '\n' +
                "edad: " + edad + '\n' +
                "telefono: " + telefono + '\n' +
                "Correo: " + correo + '\n';
    }
}
