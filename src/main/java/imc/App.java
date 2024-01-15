package imc;

import java.util.Scanner;



public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args 
     *      */
    public static void main(String[] args) {
        
        float altura = 0, peso = 0, imc = 0;

        try (Scanner lectura = new Scanner(System.in)) {
            System.out.println("Introduce tu altura en Metros");
            altura = lectura.nextFloat();
            System.out.println("Introduce tu peso en Kg");
            peso = lectura.nextFloat();
        }

        imc = peso/(altura*altura);

        if (imc <= 16) {
            System.out.println("Tu peso es bajo");

        }
        else if( imc > 16 && imc < 19){
            System.out.println("Tu peso es normal");
        }
        else if ( imc > 19 && imc <= 18.5) {
            System.out.println("Tienes sobrepeso");
        }
        else if (imc > 18.5 && imc < 25) {
            System.out.println("Tienes obesidad grado 1");
        }

    }
}
