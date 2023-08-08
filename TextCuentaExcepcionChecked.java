public class TextCuentaExcepcionChecked {
    
    public static void main(String[] args) {
    
    Cuenta cuenta = new Cuenta();
    try {
        cuenta.deposita();
    } catch (MyException e) {
        e.printStackTrace();
    }
    }
}
