//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( "=== INICIANDO DOWNLOADS SIMULTÂNNEO ===\n");

        Thread thread1 = new Thread(new Download("Documento.pdf"));

        Thread thread2 = new Thread(() -> {
            System.out.println("Iniciando download: Video.mp4");
            try { Thread.sleep(3000);
            } catch (InterruptedException e) {}
                System.out.println("-> CONCLUIDO: Video.mp4");});

        Thread thread3 = new Thread(() -> {
            System.out.println("Iniciando download: Video.jpg");
            try { Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("-> CONCLUIDO: Video.jpg");});
        thread1.start();
        thread2.start();
        thread3.start();
        }
    }
