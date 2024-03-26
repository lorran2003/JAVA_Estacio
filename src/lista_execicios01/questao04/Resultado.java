package src.lista_execicios01.questao04;

public class Resultado {
    private int expressao01 = 5 * 4 / 6 + 7;
    private int expressao02 = 5 * 4 / (6 + 7);
    private float expressao03 = (float) (5 * 4.0 / 6 + 7);
    private int expressao04 = 5 * 4 % 6 + 7 ;
    private float expressao05 = 5 * 4 / (float) 6 + 7 ;
    private float expressao06 = (float) ((float) (4 / 3) + (3.0 * 5)) ;
    private float expressao07 = (float) (4 / 3.0) + (3 * 5);
    private int expressao08 = (int) (4 / 3.0) + (3 * 5);

    public String resultados(){
        return "Resultado das expressoes: \n" + expressao01 + "\n" + expressao02 + "\n" + expressao03 + "\n" + expressao04 + "\n" + expressao05 + "\n" + expressao06 + "\n" + expressao07 + "\n" + expressao08 + "\n";
    }
}
