# 🏧 Simulador de Caixa Eletrônico (ATM)

Este é um projeto de estudo desenvolvido em **Java**, focado na lógica de programação, controle de fluxo e manipulação de dados via console. O objetivo foi replicar as funcionalidades básicas de um terminal bancário, aplicando conceitos de validação de segurança e operações financeiras simples.

> **Nota:** Este projeto foi uma tradução e refatoração de uma lógica originalmente escrita em C para Java.

## 🚀 Funcionalidades

O sistema conta com um fluxo de segurança e um menu interativo:

* **🔐 Autenticação Segura:**
  * Validação de senha (Senha padrão: `2026`).
  * Limite de **3 tentativas** de login.
  * Bloqueio do sistema após exceder as tentativas.

* **📋 Menu Interativo:**
  * Navegação controlada por estrutura de repetição (`while`) e seleção (`switch-case`).

* **💰 Consulta de Saldo:**
  * Visualização formatada do saldo atual.

* **💸 Saque:**
  * Input de valor decimal.
  * Validação de saldo insuficiente (impede saldo negativo).
  * Atualização dinâmica do saldo após o saque.

* **🚪 Encerramento:**
  * Opção segura para sair do sistema e encerrar o loop.

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem:** Java (JDK)
* **Entrada de Dados:** Classe `Scanner` (com `Locale.US` para leitura de decimais com ponto).
* **Estruturas de Repetição:** * `while`: Para o loop de tentativas de senha e manutenção do menu principal.
* **Estruturas Condicionais:** * `if / else`: Para validação de senha e verificação de fundos.
  * `switch / case`: Para o roteamento das opções do menu.
* **Variáveis de Controle:** * Uso de `boolean` (flags) para gerenciar o estado do login (`senhaAcertou`) e do loop (`querSair`).

## ⚙️ Como executar

1. Certifique-se de ter o **Java (JDK)** instalado.
2. Clone este repositório ou copie o código para um arquivo `Main.java`.
3. Compile e execute através do seu terminal ou IDE (IntelliJ, Eclipse, VS Code).

```bash
javac Main.java
java Main
```

## 🧪 Como Testar (Dados de Acesso)

Para acessar o menu principal, utilize a senha pré-configurada no código:

* **Senha:** `2026`
* **Saldo Inicial:** `R$ 3450.00`

---

### 👨‍💻 Autor
Desenvolvido por **Leandro** durante estudos de migração de lógica C para Java.
