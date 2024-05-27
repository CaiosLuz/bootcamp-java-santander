public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("18560000");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep esta fora do padrão");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return cep;
    }
}
