
package ejercicio.pkg1.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1y2Colecciones {

   
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
               
         ArrayList<String>razas=new ArrayList();
        String perri;
       String mas;
             do{
                 System.out.println("ingrese una raza");
                 perri=leer.nextLine();
                 razas.add(perri);
             System.out.println("desea ingresar otra raza? si o no");           
              mas=leer.nextLine();
        }    while(mas.equals("si"));
    
             System.out.println("las razas ingresadas son= ");
         for (String p:razas) {   //para mostrar todas las razas alojadas en la lista
             System.out.print(p+" ");
        }System.out.println(" ");  
        
        System.out.println("ingrese un perro");
        String pe=leer.nextLine();
       
        Iterator<String>iterar= razas.iterator();
            while (iterar.hasNext()) {
             String po = iterar.next();
               if (po.equals(pe)) {
                iterar.remove(); }
               else if(iterar.hasNext()==false){System.out.println("no se encuentra en la lista el perro ingresado");}
  } System.out.println(razas);
}}

/* 1) Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/

/* 2) Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada*/