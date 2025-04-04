# Board API - Java Spring Boot | Decola Tech 2025

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Java](https://img.shields.io/badge/Java-17-orange)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2-brightgreen)](https://spring.io/projects/spring-boot)

## 📝 Descrição

O projeto Board API é uma aplicação de gerenciamento de tarefas desenvolvida como parte do programa **Decola Tech 2025** da DIO. Esta API permite a criação, organização e rastreamento de tarefas em quadros personalizados, similar a ferramentas como Trello ou Asana.

## 🔧 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2**
- **Spring Data JPA**
- **Spring Security**
- **Liquibase**
- **Lombok**

## 📋 Funcionalidades

- **Gerenciamento de Usuários**: Cadastro, autenticação e perfis de usuário
- **Quadros (Boards)**: Criação e gerenciamento de quadros de tarefas
- **Tarefas (Tasks)**: Criar, atualizar, excluir e mover tarefas entre status
- **Categorias**: Organizar tarefas por categorias personalizadas
- **Busca e Filtros**: Encontrar tarefas por diversos critérios
- **Autenticação JWT**: Segurança baseada em tokens

## 🔑 Entidades Principais

- **User**: Gerenciamento de usuários e autenticação
- **Board**: Quadros de organização de tarefas
- **Task**: Tarefas com título, descrição, status, prioridade
- **Category**: Categorização de tarefas

## ⚙️ Requisitos para Execução

- JDK 17+
- Liquibase (para ambiente de produção)

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/devpbleite/board-java-spring-decola-tech-2025.git
   cd board-java-spring-decola-tech-2025
   ```

2. Configure o banco de dados no arquivo `liquibase.properties`

3. Execute a aplicação:
 ```bash
  gradlew.bat bootRun
   ```


## 🔗 Links Úteis

- [Documentação Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Programa Decola Tech 2025](https://www.dio.me/bootcamp/decola-tech-2025)

## ✒️ Autor

- **Pablo Leite** - [devpbleite](https://github.com/devpbleite)

---

⌨️ com ❤️ por [devpbleite](https://github.com/devpbleite) | Decola Tech 2025
