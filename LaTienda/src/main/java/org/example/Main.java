package org.example;

import org.example.clases.Empleado;

public class Main {
    public static void main(String[] args) {

        //DENTRO DEL METODO MAIN ESCRIBO MI PROGRAMA Y CREO LOS OBJETOS
        //CREANDO UNA VARIABLE

        int edad = 5;
        System.out.println(edad);

        //CREANDO NUESTRO PRIMER OBJETO
        //LOS OBJETOS SON COPIAS DE UNA CLASE
        //LOS OBJETOS SON INSTANCIAS DE UNA CLASE
        //LOS OBJETOS SON VARIABLES QUE SE CREAN PARA PODER INICIALIZAR
        //LOS ATRIBUTOS DE UNA CLASE

        //CREANDO UN OBJETO
        //CREANDO UN OBJETO UTILIZANDO UN CONSTRUCTOR VACIO
        Cliente objeto = new Cliente();
        //YO USO UN OBJETO PARA ACCEDER A LOS ATRIBUTOS Y METODOS DE LA CLASE POR SEPARADO
        objeto.edad=20;
        objeto.nombre="Juan Gabriel Correa Vasquez";
        System.out.println(objeto.edad);
        System.out.println(objeto.nombre);

        //CREANDO UN OBJETO UTILIZANDO UN CONSTRUCTOR LLENO

        Cliente objetoDos = new Cliente("Sara",30,"3225768910","calle 50",10);
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);

        //CREANDO UN OBJETO DENTRO DE LA CLASE EMPLEADO
        Empleado objetoTres = new Empleado();
        System.out.println(objetoTres.nombre);



    }
}