package pythonjavaintegration.executables;

import java.io.IOException;
import org.json.simple.JSONObject;
import pythonjavaintegration.classes.Rutas;

/**
 * JsonAsParameterExample
 * @author Andrés Missiego
 */
public class JsonAsParameterExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Ruta al ejecutable de Python y el script Python
            Rutas rutas = new Rutas();
            String pythonExecutable = "python";
            String pythonScript = rutas.jsonAsParameterExample;
            String function = "cambiarTelefono";
            String telefono = "123-123-123";

            // JSON de ejemplo como cadena
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("\"nombre\"", "\"Pepe\"");
            jsonObject.put("\"edad\"", 24);
            jsonObject.put("\"ciudad\"", "\"Madrid\"");
            jsonObject.put("\"telefono\"", "\"234-567-890\"");
            String jsonParameter = jsonObject.toString();

            // Construir el comando para ejecutar el script Python con el parámetro JSON
            ProcessBuilder processBuilder = new ProcessBuilder(pythonExecutable, pythonScript, function, jsonParameter, telefono); //python <file_name> <arg1> ... <argN>

            // Ejecutar el comando y obtener el proceso resultante
            Process process = processBuilder.start();

            // Leer la salida del proceso (puede ser opcional dependiendo de tu caso de uso)
            // Aquí se imprime la salida del script Python en la consola de Java
            java.io.BufferedReader reader = new java.io.BufferedReader(
                    new java.io.InputStreamReader(process.getInputStream()));
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            System.out.println("Proceso finalizado con código de salida: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
