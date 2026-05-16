# 🍔 KI MASSA! - Sistema de Delivery

> 🚀 Sistema de gerenciamento de delivery desenvolvido em Java com foco em Programação Orientada a Objetos, regras de negócio, interatividade em terminal e integração com banco de dados PostgreSQL.

---

# 👥 Equipe

* **Beatriz Gonçalves da Silva** – RGM: 42640954
* **Enzo Moraes Sousa** – RGM: 47766786
* **Breno Brasil da Silva** – RGM: 48365963
* **Jean Phillipe Ferreira Lopes** – RGM: 48186066

---

# 🎯 Objetivo do Projeto

O **KI MASSA!** é um sistema de delivery desenvolvido em Java que simula o funcionamento de uma plataforma real de pedidos.

O projeto foi criado para aplicar conceitos de:

- Programação Orientada a Objetos (POO)
- Interfaces
- Encapsulamento
- Organização em camadas
- JDBC
- Banco de Dados PostgreSQL
- Regras de negócio
- Manipulação de listas
- Interatividade em terminal

---

# ⚙️ Funcionalidades

## ✅ Sistema Interativo

O sistema funciona diretamente no terminal com menu interativo:

```text
===== KI MASSA =====
1 - Criar pedido
2 - Atualizar status
3 - Ver pedido
4 - Ver historico
5 - Sair
```

---

# 📦 Funcionalidades do Sistema

- Cadastro de clientes
- Cadastro de produtos
- Cadastro de entregadores
- Criação de pedidos
- Atualização de status
- Histórico de pedidos
- Controle de estoque
- Controle de entregadores
- Cálculo automático do valor final
- Gerenciamento de entregas
- Validação de estoque insuficiente
- Logs automáticos de ações

---

# 🚚 Funcionalidades do Delivery

- Gerenciamento de pedidos
- Controle automático de estoque
- Histórico completo do pedido
- Atualização automática de status
- Atribuição de entregadores
- Controle de disponibilidade do entregador
- Pedido sai automaticamente para entrega

---

# 🧠 Regras de Negócio

## 🧾 Cálculo Automático do Pedido

O sistema calcula automaticamente:

- Subtotal do pedido
- Taxa de entrega
- Desconto progressivo
- Valor final

---

## 📌 Regras aplicadas

| Valor do Pedido | Desconto |
|---|---|
| Acima de R$100 | 5% |
| Acima de R$200 | 10% |
| Acima de R$300 | 15% |

---

## 🚚 Taxa de entrega

Taxa fixa:

```text
R$ 8,00
```

---

# 🛡️ Validações do Sistema

O sistema possui validações para evitar erros de negócio:

- Bloqueio de pedidos sem estoque
- Controle de entregador disponível
- Verificação de pedidos existentes
- Tratamento de opções inválidas
- Atualização segura de status

---

# 🏗️ Estrutura do Projeto

```text
src/
 └── br/com/kimassa
      ├── model
      ├── service
      ├── util
      ├── ui
      └── Main.java
```

---

# 💻 Tecnologias Utilizadas

- Java
- JDBC
- PostgreSQL
- Programação Orientada a Objetos
- Collections Framework
- Serialização
- Git e GitHub

---

# ▶️ Como Executar

## Compilar o projeto

```bash
javac -d out src/br/com/kimassa/util/*.java src/br/com/kimassa/model/*.java src/br/com/kimassa/service/*.java src/br/com/kimassa/ui/*.java src/br/com/kimassa/Main.java
```

---

## Executar o sistema

```bash
java -cp out br.com.kimassa.Main
```

---

# 📺 Apresentação do Projeto

🎥 Vídeo de apresentação:

[:contentReference[oaicite:0]{index=0}](https://www.youtube.com/watch?v=f9k7xcCl0jg)

---

# 📌 Considerações Finais

O projeto foi desenvolvido com foco em simular um sistema real de delivery, aplicando conceitos acadêmicos e boas práticas de desenvolvimento Java.

Além das funcionalidades básicas, o sistema implementa interatividade, validações de negócio e organização modular do código.
