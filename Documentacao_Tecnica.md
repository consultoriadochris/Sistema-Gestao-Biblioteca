# SISTEMA DE GESTÃO DE UMA BIBLIOTECA EM JAVA

**UNIVERSIDADE ABERTA ISCED - UnISCED**  
Faculdade de Engenharia e Agricultura  
Curso de Licenciatura em Engenharia Informática  
Disciplina: Introdução a Algoritmos e Programação  
**TRABALHO DE CAMPO**

Jose Luís Pedro Namburete

Maputo, 19 de agosto de 2026

---

> **Jose Luís Pedro Namburete**
>
> **SISTEMA DE GESTÃO DE UMA BIBLIOTECA EM JAVA**
>
> Trabalho de Campo apresentado à Universidade Aberta ISCED (UnISCED), Faculdade de Engenharia e Agricultura, como requisito de avaliação contínua da disciplina de Introdução a Algoritmos e Programação, do Curso de Licenciatura em Engenharia Informática.
>
> Maputo, 19 de agosto de 2026

---

## ÍNDICE

1. [INTRODUÇÃO](#1-introdução)
2. [OBJETIVOS](#2-objetivos)
3. [REFERENCIAL TEÓRICO](#3-referencial-teórico)
   - 3.1. Algoritmos e programação
   - 3.2. Programação em Java
   - 3.3. Vetores ou arrays
   - 3.4. Matrizes
   - 3.5. Classes e objetos
   - 3.6. Tratamento de erros
4. [METODOLOGIA](#4-metodologia)
   - 4.1. Metodologia de pesquisa
   - 4.2. Metodologia de desenvolvimento de software
   - 4.3. Justificativa da metodologia escolhida
5. [DESENVOLVIMENTO](#5-desenvolvimento)
   - 5.1. Estrutura geral do sistema
   - 5.2. Estruturas de dados utilizadas
   - 5.3. Registo de livros
   - 5.4. Consulta do catálogo
   - 5.5. Registo de utilizadores
   - 5.6. Gestão de empréstimos
   - 5.7. Devolução de livros
   - 5.8. Estatísticas
   - 5.9. Matriz do histórico de empréstimos
   - 5.10. Tratamento de erros
6. [CONCLUSÃO](#6-conclusão)
7. [REFERÊNCIAS BIBLIOGRÁFICAS](#7-referências-bibliográficas)

---

## 1. INTRODUÇÃO

O crescimento do número de leitores e a necessidade de organizar de forma eficiente os recursos disponíveis numa biblioteca tornam importante a utilização de ferramentas informáticas para apoiar o registo, a consulta e o controlo dos empréstimos de livros.

Neste contexto, foi desenvolvido um **Sistema de Gestão de Biblioteca Municipal**, utilizando a linguagem de programação Java. O sistema foi concebido como uma aplicação executada em consola e utiliza estruturas de dados armazenadas em memória, nomeadamente vetores e matrizes.

O sistema permite realizar operações essenciais para a gestão de uma biblioteca, incluindo o registo de livros, consulta do catálogo, pesquisa por título ou autor, registo de utilizadores, realização de empréstimos, devolução de livros e apresentação de estatísticas.

A implementação procura aplicar, de forma prática, conhecimentos fundamentais de algoritmos e programação, tais como estruturas de decisão, estruturas de repetição, métodos, classes, objetos e estruturas de dados. Os algoritmos constituem uma base fundamental para a resolução sistemática de problemas computacionais e para a construção de soluções programáveis (Cormen et al., 2022).

A linguagem Java foi utilizada por disponibilizar mecanismos adequados para a programação orientada a objetos, incluindo classes, objetos, métodos e construtores (Oracle, n.d.). A organização do sistema em diferentes classes permite representar de forma estruturada os principais elementos da aplicação.

---

## 2. OBJETIVOS

### 2.1. Objetivo geral

Desenvolver um sistema informático simples para a gestão de uma Biblioteca Municipal, utilizando a linguagem Java e estruturas de dados em memória, capaz de controlar o catálogo de livros, os utilizadores, os empréstimos, as devoluções e as principais estatísticas da biblioteca.

### 2.2. Objetivos específicos

- Desenvolver uma funcionalidade para registar novos livros no catálogo;
- Permitir a consulta e listagem dos livros disponíveis;
- Implementar pesquisa de livros por título ou autor;
- Desenvolver o registo de utilizadores da biblioteca;
- Implementar o processo de empréstimo de livros;
- Implementar o processo de devolução dos livros;
- Atualizar a quantidade disponível após empréstimos e devoluções;
- Registar o histórico das operações de empréstimo;
- Apresentar o número total de empréstimos realizados;
- Identificar o livro mais emprestado;
- Utilizar vetores e uma matriz como estruturas de armazenamento em memória;
- Implementar mecanismos de validação e tratamento de erros.

---

## 3. REFERENCIAL TEÓRICO

### 3.1. Algoritmos e programação

Um algoritmo corresponde a uma sequência organizada de procedimentos destinada à resolução de um determinado problema. Na área da computação, os algoritmos constituem uma base para o desenvolvimento de soluções capazes de processar dados e produzir resultados de acordo com regras previamente definidas (Cormen et al., 2022).

No presente projeto, o problema foi dividido em diferentes operações, como registar livros, pesquisar livros, verificar a disponibilidade, efetuar empréstimos, registar devoluções e apresentar estatísticas. Esta decomposição permite transformar o problema geral de gestão da biblioteca em tarefas computacionais menores e mais controláveis.

A implementação utiliza também estruturas de controlo para determinar o comportamento do programa de acordo com as condições encontradas durante a execução. A linguagem Java disponibiliza estruturas de controlo para decisões, repetições e ramificações do fluxo de execução (Oracle, n.d.).

### 3.2. Programação em Java

Java é uma linguagem de programação que suporta o paradigma orientado a objetos e disponibiliza mecanismos para criação e utilização de classes, objetos, métodos e construtores (Oracle, n.d.).

No presente projeto, a aplicação foi organizada em diferentes classes, permitindo separar os principais elementos do sistema:

- *Livro;*
- *Utilizador;*
- *Emprestimo;*
- *Biblioteca;*
- *Main.*

A utilização de classes permite encapsular dados e comportamentos relacionados com uma determinada entidade. Na documentação oficial, uma classe pode conter campos, métodos e construtores, sendo estes utilizados para definir o estado e o comportamento dos objetos (Oracle, n.d.).

Essa organização contribui para uma estrutura de código mais modular e facilita a compreensão das responsabilidades de cada componente.

### 3.3. Vetores ou arrays

Os vetores, ou arrays, são estruturas utilizadas para armazenar um número fixo de elementos de um determinado tipo. Em Java, o tamanho de um array é definido no momento da sua criação e permanece fixo durante a sua existência (Oracle, n.d.).

No sistema desenvolvido foram utilizados os seguintes vetores:

- *Livro*
- *Utilizador*
- *Emprestimo*

O vetor *Livro* armazena os livros registados, *Utilizador* armazena os utilizadores e *Emprestimo* mantém os registos das operações de empréstimo.

A utilização dos vetores permite cumprir o requisito do trabalho relacionado com a manipulação de dados em memória através de arrays.

### 3.4. Matrizes

Uma matriz pode ser utilizada para representar dados organizados em duas dimensões, permitindo trabalhar com relações entre linhas e colunas.

No sistema foi utilizada a seguinte estrutura:

```java
int historicoEmprestimos;
```

Esta matriz representa a relação entre utilizadores e livros, permitindo registar quantas vezes determinado utilizador realizou empréstimos de determinado livro.

Conceptualmente, a estrutura pode ser representada da seguinte forma:

| | **Livro 1** | **Livro 2** | **Livro 3** |
|---|---|---|---|
| Utilizador 1 | 2 | 0 | 1 |
| Utilizador 2 | 0 | 3 | 0 |
| Utilizador 3 | 1 | 0 | 2 |

Neste contexto, a utilização conjunta de vetores e matriz permite representar diferentes dimensões dos dados utilizados pelo sistema, correspondendo ao requisito de utilização de estruturas de dados do trabalho.

### 3.5. Classes e objetos

A programação orientada a objetos permite organizar um sistema através de classes e objetos. Uma classe funciona como uma estrutura que define atributos e comportamentos, enquanto os objetos correspondem a instâncias criadas a partir dessas classes (Oracle, n.d.).

No sistema desenvolvido, cada livro é representado por um objeto da classe *Livro,* cada utilizador por um objeto da classe *Utilizador* e cada empréstimo por um objeto da classe *Emprestimo.*

A classe *Biblioteca* concentra as principais operações de gestão, enquanto a classe *Main* é responsável pela interação com o utilizador através do menu.

### 3.6. Tratamento de erros

O tratamento de erros constitui uma parte importante do desenvolvimento de software, pois permite lidar com situações que podem interromper ou alterar o fluxo normal de execução.

Em Java, as exceções são utilizadas para representar acontecimentos que interrompem o fluxo normal das instruções durante a execução do programa (Oracle, n.d.).

No presente sistema foram implementadas validações para situações como:

- entrada numérica inválida;
- IDs duplicados;
- livros inexistentes;
- utilizadores inexistentes;
- livros sem exemplares disponíveis;
- empréstimos inexistentes;
- devoluções repetidas;
- quantidade ou ano inválidos.

Estas verificações procuram garantir que as operações sejam executadas apenas quando os dados necessários são válidos.

---

## 4. METODOLOGIA

### 4.1. Metodologia de pesquisa

Para a realização do projeto foi adotada uma abordagem de pesquisa bibliográfica e aplicada.

A pesquisa bibliográfica foi utilizada para apoiar a compreensão dos conceitos relacionados com algoritmos, programação, estruturas de dados, linguagem Java e desenvolvimento de software.

Foram consultadas fontes bibliográficas e técnicas, incluindo literatura especializada em algoritmos e engenharia de software, bem como a documentação oficial da linguagem Java.

A componente aplicada esteve relacionada com a utilização dos conhecimentos estudados na construção de uma solução concreta para o problema apresentado no enunciado.

### 4.2. Metodologia de desenvolvimento de software

Para o desenvolvimento do sistema foi adotada uma abordagem **incremental**. Nesta abordagem, o sistema é desenvolvido progressivamente, permitindo implementar e verificar diferentes funcionalidades ao longo do processo.

Sommerville (2015) apresenta os processos de software como uma parte fundamental da engenharia de software e aborda diferentes abordagens de desenvolvimento, incluindo processos planificados e métodos ágeis.

No desenvolvimento deste projeto, o trabalho foi organizado nas seguintes etapas:

1. Análise do problema apresentado no enunciado;
2. Identificação das funcionalidades necessárias;
3. Definição das estruturas de dados;
4. Criação das classes do sistema;
5. Implementação do registo e consulta de livros;
6. Implementação dos utilizadores;
7. Implementação dos empréstimos e devoluções;
8. Implementação das estatísticas;
9. Implementação das validações;
10. Teste das funcionalidades;
11. Correção dos erros encontrados;
12. Documentação do sistema.

### 4.3. Justificativa da metodologia escolhida

A abordagem incremental foi considerada adequada ao projeto porque o sistema possui um conjunto definido de funcionalidades que podem ser implementadas e verificadas progressivamente.

A divisão do desenvolvimento em etapas permitiu testar componentes individuais antes da integração das funcionalidades. Por exemplo, o registo e consulta de livros puderam ser implementados antes da integração com o módulo de empréstimos.

Esta abordagem também facilitou a identificação e correção de problemas durante o desenvolvimento, contribuindo para uma implementação mais organizada. A engenharia de software reconhece a importância de processos estruturados de desenvolvimento, implementação e teste na construção de sistemas de software (Sommerville, 2015).

---

## 5. DESENVOLVIMENTO

### 5.1. Estrutura geral do sistema

O sistema foi desenvolvido em Java e organizado em cinco classes principais:

| **Classe** | **Responsabilidade** |
|---|---|
| *Main* | Apresentar o menu e receber as entradas do utilizador |
| *Biblioteca* | Gerir as operações principais do sistema |
| *Livro* | Representar os livros do catálogo |
| *Utilizador* | Representar os utilizadores |
| *Emprestimo* | Representar os empréstimos e devoluções |

A separação das classes permite organizar o sistema segundo as responsabilidades de cada componente, seguindo princípios básicos da programação orientada a objetos (Oracle, n.d.).

### 5.2. Estruturas de dados utilizadas

O sistema utiliza três vetores principais:

- *livros;*
- *utilizadores;*
- *emprestimos;*

Além dos vetores, é utilizada uma matriz:

```java
int historicoEmprestimos;
```

Os arrays permitem armazenar conjuntos de elementos do mesmo tipo, enquanto a matriz permite representar uma relação bidimensional entre utilizadores e livros (Oracle, n.d.).

A capacidade definida para os vetores e para a matriz é de 100 posições por categoria.

### 5.3. Registo de livros

A funcionalidade de registo permite inserir um novo livro no catálogo.

Para cada livro são armazenadas as seguintes informações:

- identificador;
- título;
- autor;
- ano de publicação;
- quantidade disponível;
- número de empréstimos realizados.

Antes de efetuar o registo, o sistema verifica se o ID já existe e se os dados introduzidos são válidos.

**Evidência da execução**

**Figura 1** — Registo de um novo livro

> *(Imagem: media/image2.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.4. Consulta do catálogo

A consulta do catálogo permite listar todos os livros registados.

O sistema apresenta informações como ID, título, autor, ano, quantidade disponível e número de empréstimos.

Também foi implementada uma funcionalidade de pesquisa que permite procurar livros através do título ou do autor.

**Evidência da execução**

**Figura 2** — Consulta do catálogo

> *(Imagem: media/image3.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.5. Registo de utilizadores

O sistema permite registar os utilizadores da biblioteca.

Para cada utilizador são armazenados:

- ID;
- nome;
- email;
- contacto.

O ID é utilizado como identificador do utilizador no sistema.

**Evidência da execução**

**Figura 3** — Registo de utilizador

> *(Imagem: media/image4.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.6. Gestão de empréstimos

A operação de empréstimo permite associar um livro disponível a um utilizador previamente registado.

Antes da realização do empréstimo, o sistema verifica:

1. se o livro existe;
2. se o utilizador existe;
3. se existe pelo menos um exemplar disponível.

Após um empréstimo válido, a quantidade disponível do livro é reduzida em uma unidade e o número de empréstimos do livro é incrementado.

Simultaneamente, a operação é registada no histórico de empréstimos.

**Evidência da execução**

**Figura 4** — Realização de empréstimo

> *(Imagem: media/image5.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.7. Devolução de livros

A funcionalidade de devolução permite registar a devolução de um livro anteriormente emprestado.

Quando a devolução é efetuada, o sistema:

- verifica se o empréstimo existe;
- verifica se ainda não foi devolvido;
- atualiza o estado do empréstimo;
- regista a data de devolução;
- aumenta a quantidade disponível do livro.

**Evidência da execução**

**Figura 5** — Registo de devolução

> *(Imagem: media/image6.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.8. Estatísticas

O sistema apresenta estatísticas relacionadas com a utilização da biblioteca.

Entre os dados apresentados encontram-se:

- total de livros registados;
- total de utilizadores;
- total de empréstimos realizados;
- livro mais emprestado;
- matriz do histórico de empréstimos.

A identificação do livro mais emprestado é realizada através da comparação do número de empréstimos registados para cada livro.

**Evidência da execução**

**Figura 6** — Estatísticas do sistema

> *(Imagem: media/image7.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.9. Matriz do histórico de empréstimos

A matriz `historicoEmprestimos` permite representar a relação entre os utilizadores e os livros.

Cada linha representa um utilizador e cada coluna representa um livro. O valor armazenado na interseção indica o número de empréstimos realizados.

**Evidência da execução**

**Figura 7** — Matriz do histórico de empréstimos

> *(Imagem: media/image7.png)*
>
> **Fonte:** Elaboração própria (2026).

### 5.10. Tratamento de erros

Foram implementadas verificações para impedir operações inválidas, incluindo:

- introdução de dados numéricos inválidos;
- registo de IDs duplicados;
- tentativa de empréstimo de livro inexistente;
- tentativa de empréstimo por utilizador inexistente;
- tentativa de empréstimo quando não há stock;
- tentativa de devolução de empréstimo inexistente;
- tentativa de devolver novamente um empréstimo já devolvido.

Estas validações estão relacionadas com a necessidade de controlar condições que podem impedir a execução correta das operações do sistema. Em Java, mecanismos de tratamento de exceções e validação contribuem para lidar com situações anormais durante a execução (Oracle, n.d.).

**Evidência da execução**

**Figura 8** — Tratamento de uma operação inválida

> *(Imagem: media/image8.png)*
>
> **Fonte:** Elaboração própria (2026).

---

## 6. CONCLUSÃO

O desenvolvimento do Sistema de Gestão de Biblioteca Municipal permitiu aplicar, de forma prática, conhecimentos fundamentais da disciplina de Introdução a Algoritmos e Programação.

O sistema foi concebido para implementar as principais funcionalidades definidas no enunciado, nomeadamente o registo e consulta de livros, registo de utilizadores, realização de empréstimos, devoluções e apresentação de estatísticas.

A utilização de vetores permitiu organizar os principais registos em memória, enquanto a matriz possibilitou representar o histórico cruzado entre utilizadores e livros. A utilização de classes contribuiu para organizar os dados e comportamentos associados às principais entidades do sistema, em consonância com os princípios básicos da programação orientada a objetos (Oracle, n.d.).

A implementação de mecanismos de validação contribuiu para reduzir a ocorrência de operações inválidas e tornar o sistema mais robusto durante a utilização.

De modo geral, o projeto permitiu consolidar conhecimentos relacionados com algoritmos, estruturas de dados, programação orientada a objetos, organização de código, desenvolvimento de software e tratamento de erros.

observados durante a execução do sistema.

---

## 7. REFERÊNCIAS BIBLIOGRÁFICAS

Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2022). *Introduction to algorithms* (4th ed.). MIT Press.

Oracle. (n.d.). *The Java tutorials: Classes and objects*. Oracle.

Oracle. (n.d.). *The Java tutorials: Arrays*. Oracle.

Oracle. (n.d.). *The Java tutorials: Exceptions*. Oracle.

Oracle. (n.d.). *The Java tutorials: Language basics*. Oracle.

Sommerville, I. (2015). *Software engineering* (10th ed.). Pearson.
