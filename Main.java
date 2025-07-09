import facade.NotificacaoFacade;

public class Main {
    public static void main(String[] args) {
        NotificacaoFacade facade = new NotificacaoFacade();

        facade.enviarMensagem("Bem-vindo ao sistema!", "email");
        facade.enviarMensagem("Seu código de verificação é 123456", "sms");
        facade.enviarMensagem("Temos novidades para você!", "whatsapp");
        facade.enviarMensagem("Teste com canal inválido", "fax");
    }
}
