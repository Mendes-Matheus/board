# 🗂️ Gerenciador de Boards (Kanban Console App)

Este projeto é uma aplicação de console desenvolvida em Java que simula o gerenciamento de um quadro Kanban. É possível criar quadros (boards), adicionar colunas, cadastrar e gerenciar cards, mover cards entre colunas e realizar operações como bloqueio, desbloqueio e cancelamento de cards.

## 📦 Funcionalidades

### Menu Principal (`MainMenu`)

- **Criar um novo board** com colunas personalizadas.

- **Selecionar um board existente** e realizar operações com cards.

- **Excluir um board** com base no ID.

### Menu do Board (`BoardMenu`)

- **Criar um card** na coluna inicial do board.

- **Mover card** para a próxima coluna com base na ordem.

- **Bloquear / desbloquear cards** com justificativa.

- **Cancelar card** movendo-o para a coluna de cancelamento.

- **Visualizar detalhes do board**, colunas e cards.

- **Ver informações completas de um card** individualmente.

## 💾 Tecnologias Utilizadas

- **Java**

- **JDBC** 

- **Lombok**

- **MySQL**

## ✅ Exemplo de Fluxo

1. Crie um novo board com nome e colunas.

2. Selecione o board criado.

3. Adicione cards, visualize cards e mova-os entre colunas.

4. Utilize o sistema para bloquear, desbloquear ou cancelar cards.

5. Visualize o progresso das tarefas no board.

## 📌 Observações

- O sistema é interativo via terminal (CLI).

- As exceções de SQL são tratadas e exibidas diretamente no console.

---
