import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {

        Path messagePath = Path.of("C:\\Users\\lamer\\IdeaProjects\\Reading_Writing\\FromTomToManuel\\message.txt");
        Path animalPath = Path.of("C:\\Users\\lamer\\IdeaProjects\\Reading_Writing\\FromTomToManuel\\animal.txt");

        try {
            if (Files.notExists(messagePath.getParent())) {
                Files.createDirectory(messagePath.getParent());
                Files.createDirectory(animalPath.getParent());
            }
            if (Files.notExists(messagePath)) {
                Files.createFile(messagePath);
                Files.createFile(animalPath);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the best joke you can think of:");
        String message = scanner.nextLine();
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(messagePath.toString()))) {
            bufferedWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Animal animal = new Animal("Fluffy", false);

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(animalPath.toString()))) {
            bufferedWriter.write(animal.getName() + "♠" + animal.getEdible());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader(animalPath.toString());
             BufferedReader bufferedReader = new BufferedReader(fileReader)){

            String word;
            while ((word= bufferedReader.readLine())!=null){

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}