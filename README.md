# Excepciones y errores en java

## Notas del Proyecto

Es necesario resaltar que, si bien en el presente (Bank-System 3) se encuentra
el desarrollo básico de los errores y excepciones este tema
se implementa tambien en el segundo proyecto (Bank-System 2) disponible en :
<https://github.com/Ricardo-Vargas-Gonzalez/PMHC-BANK-SYSTEM-2>

### Ejemplo de Try-catch

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
