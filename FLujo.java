public class FLujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }

    public static void metodo1() {
        System.out.println("Inicio de metodo1");
        metodo2();
        System.out.println("Fin de metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio de metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try { // intenta ejecutar el código
                if (i == 3) { int num = 0;
                int resultado = i / num;
                System.out.println(resultado);
                }
                String test = null;
                System.out.println(test.toString());

            } /* Se pueden atrapar dos excepciones en el mismo bloque de código */
             catch (ArithmeticException | NullPointerException exception) { // atrapa el error
                System.out.println("Error: " + exception.getMessage());
                exception.printStackTrace(); /* Imprime toda la pila por la que el error pasó */
            }
        }
        System.out.println("Fin de metodo2");
    }
}
