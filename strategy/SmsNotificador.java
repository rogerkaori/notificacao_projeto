package strategy;

public class SmsNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
