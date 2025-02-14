import models.YouTubeChannel;
import models.Subscriber;

public class Main {
    public static void main(String[] args) {
        // Crear un canal de YouTube
        YouTubeChannel channel = new YouTubeChannel("ProgrammingTutorials");

        // Crear algunos suscriptores
        Subscriber sub1 = new Subscriber("Juan");
        Subscriber sub2 = new Subscriber("María");
        Subscriber sub3 = new Subscriber("Pedro");

        // Suscribir observadores al canal
        channel.subscribe(sub1);
        channel.subscribe(sub2);
        channel.subscribe(sub3);

        // Simular la subida de un video
        System.out.println("\n--- Subiendo primer video ---");
        channel.uploadVideo("Tutorial de Java para principiantes");

        // Dar de baja a un suscriptor
        System.out.println("\n--- María se da de baja ---");
        channel.unsubscribe(sub2);

        // Subir otro video
        System.out.println("\n--- Subiendo segundo video ---");
        channel.uploadVideo("Patrones de diseño en Java");
    }
}