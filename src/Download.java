public class Download implements Runnable {
    private String nomeArquivos;
    public Download (String nomeArquivos){
        this.nomeArquivos = nomeArquivos;
    }
    @Override
    public void run() {
        System.out.println("Iniciando Download: " + nomeArquivos);
        try {Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println("Erro no download...");
        }
        System.out.println("-> Concluido: " + nomeArquivos);
    }
}
