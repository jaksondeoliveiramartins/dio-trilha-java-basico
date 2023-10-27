public class MinhaClasse {

public static void main(String[] args) {
        System.out.print("OI Tudo bem, Sejam Bem Vindos !");

        String primeiroNome ="Jakson";

        String segundoNome=" Oliveira Martins ";
//Todo Metodo tem seus parametros!!!
        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println(nomeCompleto);

    }
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat("").concat(segundoNome);
}
    
}
