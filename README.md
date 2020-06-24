<p align="center">
  <img width="512" height="135" src="https://github.com/eduardorcury/workshop-spring-boot-mongoDB/blob/master/mongo.jpg">
</p>

# Spring Boot App com MongoDB

> RESTful API com Spring Boot e banco de dados MongoDB.

## :wrench: &nbsp;&nbsp; Ferramentas utilizadas

- Java.
- [Spring Boot](https://github.com/spring-projects/spring-boot).
- Banco de dados NoSQL [MongoDB](https://github.com/mongodb/mongo).
- [Spring Data MongoDB](https://github.com/spring-projects/spring-data-mongodb).

## :bulb: &nbsp;&nbsp; Funcionalidades

A API possui 3 entidades:
- **User**: representa o usuário da API. Um usuário possui vários **Posts**.
- **Post**: representa uma publicação de um usuário. Cada Post possui vários **Comments**.
- **Comment**: representa um comentário. Cada comentário está localizado em um Post, e foi escrito por um usuário.

A representação visual do relacionamento das entidades é mostrada na imagem abaixo.

<p align="center">
  <img width="818" height="406" src="https://github.com/eduardorcury/workshop-spring-boot-mongoDB/blob/master/Diagrama%20Entidades.png">
</p>
