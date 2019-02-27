package exercicios;

import play.mvc.*;


public class ExerciciosController extends Controller {

    public Result olaMundo()
    {
        return ok("OlaMundo");
    }

    public Result maior2(int a, int b)
    {
        int c = a;
        c = (c > b) ? a : b;
        return ok("O maior número é: " + c);
    }

    public Result maior5(String values)
    {   
        String result;
        String [] maior5List = values.split("/");
        int intTemp, maior, i;

        try {
            maior = Integer.parseInt(maior5List[0]);		
        }catch (NumberFormatException e) {
            result = "\"" + maior5List[0] + "\" não é um valor válido. Digite apenas números inteiros.";
            return ok(result);
        }

        for(i = 1; i < maior5List.length; i++)
        {
            try {
                intTemp = Integer.parseInt(maior5List[i]);
                maior = (intTemp > maior) ? intTemp : maior;
            }catch (NumberFormatException e) {
                result = "\"" + maior5List[i] + "\" não é um valor válido. Digite apenas números inteiros.";
                return ok(result);
            }
        }

        return ok("O maior número é: " + maior);
    }

    public Result vogais(String text)
    {
        int vogaisCount = 0, i;
        text.toLowerCase();
        for(i = 0; i < text.length(); i++)
        {
            char x = text.charAt(i);
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                vogaisCount++;
            }
        }
        return ok("O total de vogais é: " + vogaisCount);
    }

    public Result impar(String impar)
    {
        int intTemp;
        String result;
        try {
            intTemp = Integer.parseInt(impar);
        }catch (NumberFormatException e) {
            return ok("\"" + impar + "\" não é um valor válido. Digite apenas números inteiros.");
        }
        intTemp %= 2;
        return ok((intTemp == 0) ? "Falso" : "Verdadeiro");
    }

    public Result intervalo(int a, int b)
    {
        int i = a, m = b;
        String result = "";

        m = (a > b) ? a : b;

        for(i = (a > b) ? b : a; i <= m; i++)
        {
            result += i + " ";
        }
        return ok(result);
    }

    public Result fatorial(int n)
    {
        int i, result = 1, aux = n;
        if(n == 0 || n == 1) return ok("O Fatorial de " + n + " é: 1");

        for(i = 1; aux > 1; aux = (aux - 1))
        {
            result = result * aux;
        }
        return ok("O Fatorial de " + n + " é: " + result);
    }

    public Result divisores(int n)
    {
        int i, limit = n / 2, aux = n;
        String divisores = "";

        for(i = 1; i <= limit; i++)
        {
            if((n % i) == 0){
                divisores += i + " ";
            }
        }
        return ok(divisores + aux);
    }

    public Result mdc(int a, int b)
    {
        return ok("Irei fazer");
    }

    public Result transcreveNumero(String n)
    {
        int i;
        String result = "";
        for(i = 0; i < n.length(); i++)
        {
            char x = n.charAt(i);

            switch (x) {
                case '0':
                    result += "Zero ";
                break;
                case '1':
                    result += "Um ";
                break;
                case '2':
                    result += "Dois ";
                break;
                case '3':
                    result += "Três ";
                break;
                case '4':
                    result += "Quatro ";    
                break;
                case '5':
                    result += "Cinco ";
                break;
                case '6':
                    result += "Seis ";
                break;
                case '7':
                    result += "Sete ";
                break;
                case '8':
                    result += "Oito ";
                break;
                case '9':
                    result += "Nove ";
                break;
                default:

                break;
            }
        }
        return ok(result);
    }

}