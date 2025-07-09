package strategy;

public class WhatsAppNotificador implements Notificador {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }
}
