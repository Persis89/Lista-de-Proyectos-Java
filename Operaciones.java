public class Operaciones {

    public static void main(String []args){

        String Figura= JOptionPane.showInputDialog("Dame Figura: ");

        switch(Figura){

            case "circulo" : System.out.println("Es un circulo");
            break;

            case "cuadrado" : System.out.println("Es un cuadrado");
            break;

            default: System.out.println("Es un Triangulo");
        }
    }
}