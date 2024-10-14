package Interfaz;

public class App {
    public static void main(String[] args) {
        String nombre,apellido,direccion,curso;
        double notas[];
        int Opcion=0,edad;

        do
        {
            // sout
            System.out.println("--------          Escuela  STJava                       -----------");
            System.out.println("--------  1.- Registrar Alumno    ---------------------------------");
            System.out.println("--------  2.- Registrar Nombre    ---------------------------------");
            System.out.println("--------  3.- Registrar Apellido  ---------------------------------");
            System.out.println("--------  4.- Registrar Edad      ---------------------------------");
            System.out.println("--------  5.- Registrar Notas     ---------------------------------");
            System.out.println("--------  6.- Salir               ---------------------------------");
            System.out.println("-   Por favor seleccione una opción para continuar                -");
            Opcion=Leer.datoInt();

            switch (Opcion) {
                case 1:
                    // Ingreso.
                    System.out.println(" Op 1 ");
                    System.out.println("Por favor ingrese el nombre: ");
                    nombre=Leer.dato();
                    System.out.println("Por favor ingrese el apellido: ");
                    apellido=Leer.dato();
                    System.out.println("Por favor ingrese el dirección: ");
                    direccion=Leer.dato();
                    System.out.println("Por favor ingrese la edad: ");
                    edad=Leer.datoInt();

                    int cantidadNotas;   //>=3 <= 7
                    do{
                        System.out.println("Por favor ingrese la cantidad de notas que tiene el alumno (mínimo 3 notas y máximo 7 notas): ");
                        cantidadNotas=Leer.datoInt();

                    }while(cantidadNotas <3 || cantidadNotas >7);
                    notas = new double[cantidadNotas];
                    for (int i = 0; i < notas.length; i++) {
                        do {
                            System.out.println("Ingrese nota " + (i+1) +": ");
                            notas[i]=Leer.datoDouble();
                        }while(notas[i]<1 || notas[i] >10);

                    }


                    break;
                case 2:
                    // secuencia de sentencias.
                    System.out.println(" Op 2 ");
                    System.out.println("Por favor ingrese el nombre: ");
                    nombre=Leer.dato();
                    break;
                case 3:
                    // secuencia de sentencias.
                    System.out.println(" Op 3 ");
                    break;
                case 4:
                    // secuencia de sentencias.
                    System.out.println(" Op 4 ");
                    break;
                case 5:
                    // secuencia de sentencias.
                    System.out.println(" Op 5 ");
                    break;
            }

        }
        while(Opcion!=6);

        // Metodos:
        //  peorNota()
        //  mejorNota()
        //  promedioNota();
        //  evaluarSituacionAcademica();
    }
}
