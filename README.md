# Sistema de Notificação Multicanal - Java Puro

Este projeto demonstra o uso de **Padrões de Projeto** com Java puro, aplicando os seguintes padrões:

- 🧠 **Strategy**: Alternância entre notificadores (Email, SMS, WhatsApp)
- ♻️ **Singleton**: Compartilhamento de configurações
- 🧩 **Facade**: Interface simplificada de envio de notificações

## Como executar

1. Compile todos os arquivos:
```bash
javac Main.java facade/*.java singleton/*.java strategy/*.java
```

2. Execute:
```bash
java Main
```

## Estrutura

```
notificacao/
├── Main.java
├── facade/
│   └── NotificacaoFacade.java
├── singleton/
│   └── Configuracao.java
└── strategy/
    ├── Notificador.java
    ├── EmailNotificador.java
    ├── SmsNotificador.java
    └── WhatsAppNotificador.java
```

---
Projeto criado para fins didáticos com base nos estudos de Design Patterns.
