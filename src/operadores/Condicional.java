package operadores;

public class Condicional {

    public static void main(String[] args) {
        //Operador Ternario

        int edad = 25;
        String resultado = (edad >= 18)? "Mayor de edad" : "Menor de edad";

        System.out.println("Resulado Operador Ternario: " + resultado);

        //Condicionales if
        String resultadoCondicional = "Es menor de edad";
        if(edad >= 18){
            System.out.println("Mayor de edad");
        }
        System.out.println("ResultadoCondicional: " + resultadoCondicional);

        //Condicionales if else
        String resultadoCondicionalIfElse = "";
        if(edad >= 18){
            resultadoCondicionalIfElse = "Es mayo de edad";
        }else{
            resultadoCondicionalIfElse = "Es menor de edad";
        }
        System.out.println("ResultadoCondicional" + resultadoCondicionalIfElse);

        //Condicionales if else if
        String resultadoCondicionalIfElseIf = "";
        if(edad == 18){
            resultadoCondicionalIfElseIf = "Tiene 18 años";
        }else if (edad >= 18){
            resultadoCondicionalIfElseIf = "Es mayor a 18 años";
        }else{
            resultadoCondicionalIfElseIf = "Es menor a 18 años";
        }
        System.out.println("ResultadoCondicionalIfElseIf: " + resultadoCondicionalIfElseIf);

        //Condicionales switch
        int diaSemana = 3;
        String diaSemanaResultado = "";

        switch(diaSemana){
            case 1:
                diaSemanaResultado = "Lunes";
                break;
            case 2:
                diaSemanaResultado = "Martes";
                break;
            case 3:
                diaSemanaResultado = "Miércoles";
                break;
            case 4:
                diaSemanaResultado = "Jueves";
                break;
            case 5:
                diaSemanaResultado = "Viernes";
                break;
            case 6:
                diaSemanaResultado = "Sábado";
                break;
            case 7:
                diaSemanaResultado = "Domingo";
                break;
            default:
                diaSemanaResultado = "Día inválido";
        }
        System.out.println("Resultado Condicional Switch: " + diaSemanaResultado);
        //Switch Expression -Java moderno
        diaSemanaResultado = switch (diaSemana){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println("Resultado Condicional Switch Expression: " + diaSemanaResultado);

    }
}
