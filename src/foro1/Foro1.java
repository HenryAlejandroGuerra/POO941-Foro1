package foro1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hmartinez99
 */
public class Foro1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String opcion = "";
        List<String> carnet = new ArrayList<>();
        List<String> nombre = new ArrayList<>();
        
        System.out.println("BIENVENIDOS AL REGISTRO DE ALUMNOS");
        System.out.println("----------------------------------");
        while (!opcion.equals("5")) {
            System.out.println("Escriba una opción del Menú");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Buscar Alumno por Carnet");
            System.out.println("3. Eliminar Alumno por Carnet");
            System.out.println("4. Mostrar todos los Alumnos");
            System.out.println("5. Salir del programa");
            System.out.println("----------------------------------");
            
            System.out.print("Opción: ");
            opcion = scan.nextLine();
            System.out.println("----------------------------------");
            
            switch (opcion){
                case "1" :
                    System.out.println("Ingrese el carnet del estudiante: ");
                    String carn = scan.nextLine();
                    System.out.println("Ingrese el nombre completo del estudiante: ");
                    String nomb = scan.nextLine();
                    System.out.println("----------------------------------");
                    
                    carnet.add(carn);
                    nombre.add(nomb);
                    break;
                case "2" :
                    System.out.println("Ingrese el carnet del estudiante: ");
                    String carnetBuscar = scan.nextLine();
                    System.out.println("----------------------------------");
                    boolean encontrado = false;
                    for (int i = 0; i < carnet.size(); i++) {
                        if(carnet.get(i).equals(carnetBuscar)){
                            System.out.println("Alumno Encontrado: ");
                            System.out.println("----------------------------------");
                            System.out.println("Carnet: "+carnet.get(i));
                            System.out.println("Nombre: "+nombre.get(i));
                            System.out.println("----------------------------------");
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("----------------------------------");
                        System.out.println("Alumno no Encontrado");
                        System.out.println("----------------------------------");
                    }
                    break;
                case "3" :
                    System.out.println("Ingrese el carnet del estudiante: ");
                    String carnetEliminar = scan.nextLine();
                    System.out.println("----------------------------------");
                    boolean encontradoEliminar = false;
                    
                    List<String> carnetViejos = new ArrayList<>();
                    List<String> nombreViejos = new ArrayList<>();
        
                    for (int i = 0; i < carnet.size(); i++) {
                        if(carnet.get(i).equals(carnetEliminar)){
                            System.out.println("Alumno Encontrado: ");
                            System.out.println("----------------------------------");
                            System.out.println("Carnet: "+carnet.get(i));
                            System.out.println("Nombre: "+nombre.get(i));
                            System.out.println("----------------------------------");
                            
                            encontradoEliminar = true;
                            System.out.println("¿Está seguro de eliminar este alumno? Y/N");
                            String eliminar = scan.nextLine();
                            
                            if(eliminar.equals("Y") || eliminar.equals("y")){
                                carnetViejos.addAll(carnet);
                                nombreViejos.addAll(nombre);
                                
                                carnet.clear();
                                nombre.clear();
                                for (int j = 0; j < carnetViejos.size(); j++) {
                                    if(!carnetViejos.get(j).equals(carnetEliminar)){
                                        carnet.add(carnetViejos.get(j));
                                        nombre.add(nombreViejos.get(j));
                                    }
                                }
                            }
                        }
                    }
                    if(!encontradoEliminar){
                        System.out.println("----------------------------------");
                        System.out.println("Alumno no Encontrado");
                        System.out.println("----------------------------------");
                    }
                    break;
                case "4" :
                    System.out.println("Lista de Alumnos: ");
                    System.out.println("----------------------------------");
                    for (int i = 0; i < carnet.size(); i++) {
                        System.out.println("Carnet: "+carnet.get(i));
                        System.out.println("Nombre: "+nombre.get(i));
                        System.out.println("----------------------------------");
                    }
                    break;
                case "5" :
                    System.out.println("¡¡¡Gracias, vuelva pronto!!!");
                    break;
                default :
                    System.out.println("Opción escrita errónea, intente con una opción correcta");
                    System.out.println("----------------------------------");
                    break;
            }
        }
        
    }
    
}
