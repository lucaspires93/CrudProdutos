# 🛒 API REST de Gerenciamento de Produtos – Spring Boot + PostgreSQL

Esta aplicação consiste em uma API REST completa desenvolvida com Spring Boot para o gerenciamento de produtos, permitindo criar, listar, atualizar e remover registros. O projeto foi desenvolvido seguindo boas práticas de arquitetura, incluindo camadas separadas para Controller, Service e Repository, além de integração com banco PostgreSQL por meio do Spring Data JPA. Todos os endpoints foram testados com auxílio do Postman, garantindo o correto funcionamento das funções de CRUD. A aplicação também conta com um sistema de tratamento global de exceções, oferecendo respostas padronizadas e mais profissionais.

---

## 🚀 Tecnologias e Ferramentas Utilizadas

- **Java**  
- **Spring Boot**  
- **Spring Web**  
- **Spring Data JPA**  
- **Hibernate**  
- **PostgreSQL**  
- **Lombok**  
- **Maven**  
- **Postman** (testes de endpoints)

---

## 🧩 Arquitetura do Projeto

A aplicação foi estruturada seguindo uma arquitetura organizada em camadas, garantindo separação clara de responsabilidades:

### **🔹 Model (Entidade)**
Contém a estrutura do produto armazenado no banco, com os atributos:
- `id`
- `nome`
- `quantidade`
- `preco`

Utiliza anotações JPA para mapeamento e Lombok para eliminar boilerplate.

### **🔹 Repository**
Implementado com Spring Data JPA, oferecendo:
- Salvamento de dados  
- Consulta por ID  
- Listagem completa  
- Exclusão de registros  
- Operações sem necessidade de SQL manual  

### **🔹 Service**
Onde ficam as regras de negócio:
- Validação de produto existente  
- Atualização parcial  
- Delegação das operações do Repository  
- Lançamento de exceções personalizadas  

### **🔹 Controller**
Exposição dos endpoints REST:
- Criar produto (POST)  
- Listar produtos (GET)  
- Buscar por ID (GET)  
- Atualizar produto (PUT)  
- Excluir produto (DELETE)  

### **🔹 Global Exception Handler**
Garante respostas de erro padronizadas e claras em formato JSON contendo:
- timestamp  
- código de status  
- descrição do erro  
- mensagem personalizada  

---

## 📦 Funcionalidades da API

✔ Criar um novo produto  
✔ Buscar produto por ID  
✔ Listar todos os produtos cadastrados  
✔ Atualizar dados de um produto (parcial ou totalmente)  
✔ Deletar produto por ID  
✔ Retornar erros padronizados com mensagens específicas  
✔ Persistência garantida via PostgreSQL  

---

## 🧠 Aprendizados Adquiridos

Durante o desenvolvimento desta aplicação, diversos conceitos importantes foram aplicados e reforçados:

- Construção completa de uma **API REST profissional** usando Spring Boot.  
- Uso do **Spring Data JPA** para persistência simplificada.  
- Integração com banco **PostgreSQL** e configuração do datasource.  
- Modelagem de entidades com JPA e domínio de anotações essenciais.  
- Estruturação do código em camadas seguindo boas práticas.  
- Implementação de **tratamento global de exceções**, elevando o nível profissional do projeto.  
- Criação de lógica de **atualização parcial**, mantendo valores existentes quando o usuário não enviar novos.  
- Realização de testes práticos via **Postman**, entendendo rotas, métodos HTTP e fluxos completos.  
- Otimização do código com **Lombok**, aprendendo a reduzir repetição.  
- Melhoria no entendimento de arquitetura limpa e organização de pacotes.  

---

## 🗂 Estrutura JSON do Produto

```json
{
  "nome": "Teclado Mecânico",
  "quantidade": 10,
  "preco": 299.90
}
