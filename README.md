# Sistema de Controle de Estoque

Sistema desenvolvido em **Java Spring Boot** com interface web integrada (HTML/CSS) para gerenciamento de estoque, utilizando **MySQL** como banco de dados.

---

## Tecnologias Utilizadas

- Java 11+
- Spring Boot (Web, Data JPA)
- Thymeleaf
- MySQL
- Maven
- Postman (para testes de API)

---

## Funcionalidades Principais

- Cadastro, edição e remoção de produtos
- Consulta e listagem de produtos em estoque
- Controle de entrada e saída de produtos
- Organização simples e eficiente para gerenciamento de estoque

---

## Estrutura do Projeto

- Backend: Spring Boot com camadas Controller, Service e Repository
- Frontend: Páginas HTML/CSS integradas servidas pelo Spring Boot
- Banco de dados: MySQL, configurado via application.properties
- Testes e validações realizados com Postman

---

## Como Executar Localmente

### Pré-requisitos

- Java 11 ou superior instalado
- MySQL configurado e rodando
- Maven instalado

### Passos para rodar

1. Clone o repositório:  
   ```bash
   git clone https://github.com/guizgabrielle/Sistema-de-controle-de-estoque.git

2. Configure as credenciais do MySQL no arquivo `src/main/resources/application.properties`.  
3. Execute o banco de dados MySQL localmente.  
4. Compile e rode a aplicação via Maven:  
   ```bash
   mvn spring-boot:run
   ```  
5. Acesse o sistema via navegador em:  
   ```
   http://localhost:8080/
   ```  
6. Para testar endpoints REST, utilize o Postman com as rotas configuradas.
   
