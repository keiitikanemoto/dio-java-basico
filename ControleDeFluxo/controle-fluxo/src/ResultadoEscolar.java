public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 3.0;

        /*if (nota >= 7) {
            System.out.println("APROVADO");
        } else if (nota >= 5 && nota < 7){
            System.out.println("RECUPERAÇÃO");
        } else{
            System.out.println("REPROVADO");
        }*/
        
            String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado"; //operador ternário com else if

            System.out.println(resultado);

        
    }
}
