public class TestConexion {
    public static void main(String[] args) throws Exception {

        /* Try-With-Resources, es un metodo efectivo para implementar el uso de recursos
         * que necesitan ser cerrados, como lo son los archivos, conexiones a bases de datos
         * y conexiones a servidores, entre otros recursos que necesitan ser cerrados
         * para evitar fugas de memoria, además de que es una forma sencilla
         * de ahorrar lineas de código y de evitar el uso de bloques try-catch
         * anidados, ya que el bloque try-with-resources puede manejar varias excepciones
         * en un solo bloque, cabe señalar que este metodo solo es aplicable
         * cuando se usa la implementación autoclosable */
        try (Conexion con = new Conexion()) {
            con.leerDatos();
        } catch (IllegalStateException ex) {
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }

        /* esta estructura es valida para usarse cuando no existe la implementación
        * autoclosable y se necesita cerrar un recurso, como lo es una conexión
        * a una base de datos, un archivo, un servidor, etc.
        
        Conexion con = new Conexion();
        try {
            con.leerDatos();
            
        } catch (IllegalStateException ex) {
            System.out.println("Error de lectura");
            ex.printStackTrace();
        } finally {
            System.out.println("Ejecución del finally");
            con.cerrar();
        }
        */
    }
}
