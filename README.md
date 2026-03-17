# 📌 Projeto Backend

API RESTful desenvolvida em **Java com Spring Boot e Spring Data JPA. ** 
A API: gerenciamento de clientes, catálogo de produtos com categorias, pedidos e pagamento  .

---

## 🚀 Tecnologias Utilizadas
- Java 25+
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de Dados: H2 só para teste
- Maven

---

## 📂 Estrutura do Projeto
src/main/java/com/meuportfolio/backend<img width="1317" height="249" alt="image" src="https://github.com/user-attachments/assets/06dd832a-66f8-49e5-99e0-3ba8071a35c0" />


##🔑 Configuração
No arquivo application.properties configure
spring.profiles.active=test

spring.jpa.open-in-view=true

No arquivo application-test.properties configure

spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true


<img width="451" height="331" alt="Captura de tela 2026-03-17 102921" src="https://github.com/user-attachments/assets/36d9dd20-1257-4cb6-8f32-30676629a7ca" />

##📌 Endpoints Principais

## Usuários

| Método | Rota        | Descrição                |
|--------|-------------|--------------------------|
| POST   | /users      | Criar novo usuário       |
| GET    | /users      | Listar todos os usuários |
| GET    | /users/{id} | Buscar usuário por ID    |
| PUT    | /users/{id} | Atualizar usuário        |
| DELETE | /users/{id} | Remover usuário          |


👨‍💻 Autor
- Nome: Damião Regis
- LinkedIn: https://www.linkedin.com/in/dami%C3%A3o-regis-8877a1206/
- GitHub: https://github.com/damiaoregis

