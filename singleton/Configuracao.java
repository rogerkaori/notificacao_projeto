package singleton;

public class Configuracao {
    private static Configuracao instancia;

    private String remetente = "sistema@notificacoes.com";

    private Configuracao() {
        // simulação de carregamento de config
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getRemetente() {
        return remetente;
    }
}
