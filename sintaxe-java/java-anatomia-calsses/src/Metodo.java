public class Metodo {

    // Definimos como void pois não será retornado nenhum valor

    public static void main(String[] args) {
        String primeiroNome = "Caio";
        String segundoNome = "José";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    
    // Definimos como String para ser retornado uma string

    public static String  nomeCompleto(String primeiroNome, String segundoNome) {
        return /* "Resultado do método " + */ primeiroNome.concat(" ").concat(segundoNome);
    }

}



