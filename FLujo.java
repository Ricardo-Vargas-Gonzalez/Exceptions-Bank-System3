public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        try {
            metodo1();
        } /* Puede haber ocaciones en las que se 
        * necesite usar Exception de manera general
        * aunque  de igual modo se puede lanzar la 
        * exception creada por uno mismmo
        * es decir, en las excepciones también
        * aplica la herencia y el polimorfismo 
        * aunque lo mejor, siempre será ser lo mas
        * especifico posible */
        catch (Exception e) {
            
            e.printStackTrace();
        }
        System.out.println("Fin main");
    }

    public static void metodo1() throws MyException {
        System.out.println("Inicio de metodo1");
        
        metodo2();

        System.out.println("Fin de metodo1");
    }

    public static void metodo2() throws MyException{
        System.out.println("Inicio de metodo2");
        /* Solo se puede usar Throw para lanzar 
        * objetos que son excepciones, 
        todas las excepciones son objetos */
        int a = 50/0;
        Cuenta c = null;
        c.deposita();
        throw new MyException("My exception was launched");
    }
}
