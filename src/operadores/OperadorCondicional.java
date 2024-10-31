package operadores;

public class OperadorCondicional {
    public static void main(String[] args) {
        //Operador AND
        String color = "azul";
        String marcaAuto = "Toyota";
        String resultado = "";
        if(color.equals("azul") && marcaAuto.equals("Toyota")){
            resultado = "Mi auto es color " + color + "y de la Marca" + marcaAuto;
        }else if(color.equals("rojo") && marcaAuto.equalsIgnoreCase("Nissan")){
            resultado = "Mi auto es color " + color + "y de la Marca" + marcaAuto;
        }
        System.out.println(resultado);

        //Operador OR
        int numero1 = 5;
        int numero2 = 10;
        String resultadoNumero = "";
        if(numero1 == numero2 || numero1 < numero2){
            resultadoNumero = "Numero1 es igual o menor al Numero2";
        } else{
            resultadoNumero = "No cumple condicion";
        }
        System.out.println(resultadoNumero);

        //Operador NOT
        boolean EstadoEncendido = false;
        String resultadoCondicion = "";
        if(!EstadoEncendido){
            resultadoCondicion = "Esta apagado";
        } else{
            resultadoCondicion = "No Esta encendido";
        }
        System.out.println(resultadoCondicion);

    }
}
