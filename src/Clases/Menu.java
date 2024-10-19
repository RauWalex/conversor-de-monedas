package Clases;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private String moneda1;
    private String moneda2;

    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public void mostrarMenuUsuario(){
        int seleccionMenu;
        String msjCantidadIngresar = "Ingresa la cantidad a convertir ";
        int aux1 = 0;
        while (aux1==0){
            System.out.print("""
                         ----- Menu Opciones-----
                         1. Convertir Dolar estado unidenses(USD) a pesos colombianos(COP)  \s
                         2. Convertir Pesos colombianos(COP) a Dolar estado unidense(USD)
                         3. Convertir Euros(EUR) a Dolar estadounidense(USD)
                         4. Convertir Dolar estadounidense(USD) a Euros(EUR)
                         5. Convertir Euros(EUR) a pesos colombianos(COP)                        \s
                         6. Convertir Pesos colombianos(COP) a Euros(EUR)                      \s
                         Selecciona una opccion: \s""");

            try{
                seleccionMenu = Integer.parseInt(sc.nextLine());
                switch (seleccionMenu) {
                    case 1: {
                        System.out.println("Convertir Dolar estado unidenses(USD) a pesos comlombianos(COP)");
                        moneda1 = "USD";
                        moneda2 = "COP";
                        aux1=1;
                        System.out.print(msjCantidadIngresar);
                        break;
                    }case 2: {
                        System.out.print("Convertir Pesos colombianos(COP) a Dolar estado unidense(USD)");
                        moneda1 = "COP";
                        moneda2 = "USD";
                        aux1=1;
                        System.out.println(msjCantidadIngresar);
                        break;
                    }case 3: {
                        System.out.println("3. Convertir Euros(EUR) a Dolar estadounidense(USD)");
                        moneda1 = "EUR";
                        moneda2 = "USD";
                        aux1=1;
                        System.out.print(msjCantidadIngresar);
                        break;
                    }case 4: {
                        System.out.println("4. Convertir Dolar estadounidense(USD) a Euros(EUR)");
                        moneda1 = "USD";
                        moneda2 = "EUR";
                        aux1=1;
                        System.out.print("Ingresa la cantidad a comvertir");
                        break;
                    }case 5: {
                        System.out.println("Convertir Euros(EUR) a pesos comlombianos(COP):");
                        moneda1 = "EUR";
                        moneda2 = "COP";
                        aux1=1;
                        System.out.println(msjCantidadIngresar);
                        break;
                    }case 6: {
                        System.out.println("6. Convertir Pesos colombianos(COP) a Euros(EUR)  ");
                        moneda1 = "COP";
                        moneda2 = "EUR";
                        aux1=1;
                        System.out.print(msjCantidadIngresar);
                        break;
                    }default: {
                        System.out.println("Selecciona una opcion..");
                        break;
                    }
                }
            }catch (NumberFormatException e){
                System.out.println("Ingresaste mal el valor");
                System.out.println(e.getMessage());
            }catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }

    public boolean mostrarPreguntaSalidaMenu(){
        System.out.println("Ecribe 1 para continuar con el programa 2 para salir...");
        return sc.nextLine().equals("1");
    }
}
