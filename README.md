# Sistema de Gestão de Biblioteca Municipal

> **Trabalho de Campo** – Disciplina: Introdução a Algoritmos e Programação  
> **Curso:** Licenciatura em Engenharia Informática  
> **Faculdade:** Faculdade de Engenharia e Agricultura – UnISCED

---

## Descrição

O **Sistema de Gestão de Biblioteca Municipal** é uma aplicação desenvolvida em **Java**, executada em consola, que permite gerir o catálogo de livros, o registo de utilizadores, empréstimos, devoluções e estatísticas da biblioteca.

O sistema utiliza **vetores (arrays)** e **matrizes**, conforme os conteúdos da disciplina, armazenando todos os dados em memória durante a execução do programa.

---

## Funcionalidades

| Funcionalidade | Descrição |
|---|---|
| Registo de Livros | Inserir novos livros com ID único, título, autor, ano de publicação e quantidade disponível. |
| Consulta do Catálogo | Listar todos os livros registados. |
| Pesquisa de Livros | Pesquisar livros por título ou autor. |
| Gestão de Utilizadores | Registar e listar utilizadores da biblioteca. |
| Empréstimos | Registar empréstimos de livros para utilizadores existentes. |
| Devoluções | Registar devoluções e atualizar o stock disponível. |
| Estatísticas | Apresentar totais, livro mais emprestado e matriz do histórico de empréstimos. |

---

## Estrutura do Projeto

```text
Sistema-Gestao-Biblioteca/
│
├── src/
│   ├── Main.java
│   ├── Biblioteca.java
│   ├── Livro.java
│   ├── Utilizador.java
│   └── Emprestimo.java
│
├── README.md
└── DOCUMENTACAO.md
```

---

## Estruturas de Dados Utilizadas

O projeto utiliza as seguintes estruturas de dados:

- **Vetores (Arrays):**
  - `Livro[]`
  - `Utilizador[]`
  - `Emprestimo[]`

- **Matriz Bidimensional:**
  - `int[][] historicoEmprestimos`

A matriz regista o histórico de empréstimos realizados por cada utilizador para cada livro.

**Capacidade máxima:** 100 registos por categoria.

---

## Requisitos

- Java JDK 8 ou superior
- Terminal (CMD, PowerShell ou Terminal Linux)

---

## Como Compilar

Na pasta do projeto execute:

```bash
javac src/*.java
```

## Como Executar

```bash
java -cp src Main
```

---

## Exemplo de Utilização

```text
==============================================
       SISTEMA DE GESTÃO DE BIBLIOTECA
==============================================
1. Registar Livro
2. Listar Catálogo
3. Pesquisar Livro
4. Registar Utilizador
5. Listar Utilizadores
6. Efectuar Empréstimo
7. Efectuar Devolução
8. Listar Empréstimos
9. Estatísticas
0. Sair
==============================================
Escolha uma opção:
```

---

## Tratamento de Erros

O sistema inclui validações para:

- entradas numéricas inválidas;
- IDs duplicados;
- inexistência de livros ou utilizadores;
- falta de stock para empréstimos;
- devoluções repetidas;
- capacidade máxima dos vetores.

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Vetores (Arrays)
- Matrizes
- Terminal/Consola

---

## Repositório GitHub

Este projeto encontra-se disponível no GitHub.

**Repositório:** `https://github.com/consultoriadochris/Sistema-Gestao-Biblioteca`

---

## Autor

**José Luís Pedro Namburete**

Trabalho desenvolvido no âmbito da disciplina de **Introdução a Algoritmos e Programação** da **Universidade Aberta ISCED (UnISCED)**.

---

## Licença

Este projeto foi desenvolvido exclusivamente para fins académicos.
