package facade;

import singleton.Configuracao;
import strategy.*;

public class NotificacaoFacade {

    public void enviarMensagem(String mensagem, String canal) {
        Notificador notificador;

        switch (canal.toLowerCase()) {
            case "email":
                notificador = new EmailNotificador();
                break;
            case "sms":
                notificador = new SmsNotificador();
                break;
            case "whatsapp":
                notificador = new WhatsAppNotificador();
                break;
            default:
                System.out.println("Canal de notificação desconhecido.");
                return;
        }

        System.out.println("Remetente: " + Configuracao.getInstancia().getRemetente());
        notificador.notificar(mensagem);
    }
}
