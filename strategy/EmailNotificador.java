package strategy;

public class EmailNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando EMAIL: " + mensagem);
    }
}
