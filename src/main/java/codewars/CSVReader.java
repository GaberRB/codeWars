package codewars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CSVReader {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\grios\\Desktop\\Cursos\\hacker-rank\\src\\main\\resources\\example.csv"; // substitua pelo nome do seu arquivo CSV
        String[] columnNames = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line != null) {
                columnNames = line.split(",");
            }
            for (int i = 0; i < columnNames.length; i++) {
                System.out.println((i + 1) + ". " + columnNames[i]);
            }

            Scanner scanner = new Scanner(System.in);
            System.out.print("Entre com o número da coluna que você deseja exibir: ");
            int columnNumber = scanner.nextInt();
            if (columnNumber < 1 || columnNumber > columnNames.length) {
                System.out.println("Número de coluna inválido.");
                return;
            }

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[columnNumber - 1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
