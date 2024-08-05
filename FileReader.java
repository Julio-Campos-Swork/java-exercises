import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class FileReader {

    public static void main(String[] args) {

        // Creamos instancia del filepath
        Path filePath = Paths.get("C:/file.txt");

        // Creamos el try para la lectura con la Api Stream
        // Files.lines lee todas lineas del archivo
        try (Stream<String> linesStream = Files.lines(filePath)) { // try-catch-resource nos ayuda a cerrarlo sin problemas
            // Agregamos las lineas a una lista (aqui podemos hacer procesamiento como encriptacion)
            List<String> lines = linesStream.collect(Collectors.toList());

                // impresionpara verificar que si haga lo correcto
            lines.forEach(System.out::println);
        } catch (IOException e) {
            //Mnejo basico de errpres de lectura de archivos
            e.printStackTrace();
        }

    }
}
