# 🍔 KI MASSA! - Sistema de Delivery

> 🚀 Sistema de gerenciamento de delivery desenvolvido em Java com foco em Programação Orientada a Objetos, regras de negócio e integração com banco de dados PostgreSQL.

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
- Regras de negócio complexas

---

# ⚙️ Funcionalidades

## ✅ CRUD Completo

O sistema permite:

- Cadastro de clientes
- Cadastro de produtos
- Cadastro de entregadores
- Criação de pedidos
- Atualização de status
- Exclusão de registros

---

# 🚚 Funcionalidades do Delivery

- Gerenciamento de pedidos
- Controle de estoque
- Histórico de pedidos
- Controle de entregadores
- Atualização automática de status
- Atribuição de entregadores
- Cálculo automático do valor final

---

# 🧠 Regras de Negócio

## 🧾 Cálculo Automático do Pedido

O sistema calcula automaticamente:

- Subtotal do pedido
- Taxa de entrega
- Desconto progressivo
- Valor final

### 📌 Regras aplicadas

| Valor do Pedido | Desconto |
|---|---|
| Acima de R$100 | 5% |
| Acima de R$200 | 10% |
| Acima de R$300 | 15% |

### 🚚 Taxa de entrega

Taxa fixa:

```text
R$ 8,00
