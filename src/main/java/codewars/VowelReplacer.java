package codewars;
import static org.junit.Assert.assertEquals;

public class VowelReplacer {
    public static void main(String args[]) {
        System.out.println(replaceVowels("Era uma vez um cara que não conseguiu fazer este codigo, porem pediu para a inteligencia artifical gerar e percebeu o quão simples era ter feito"));
    }

    public static String replaceVowels(String text) {
        String replacedText = text.replaceAll("[AEIOUaeiou]", "av");
        return replacedText;
    }


}
