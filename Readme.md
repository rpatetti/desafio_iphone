# Desafio de POO - Modelando um iPhone

Este repositório contém a resolução do **Desafio de Projeto de Programação Orientada a Objetos (POO)** proposto no bootcamp **Santander 2024 - Backend com Java** da [Digital Innovation One](https://www.dio.me/).

O objetivo do desafio é abstrair o lançamento do primeiro iPhone, de 2007, e modelar em UML e implementar em Java suas três principais funcionalidades: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**.

## O Conceito

Com base na apresentação de Steve Jobs, o desafio consiste em reconhecer que um único aparelho (iPhone) desempenha múltiplos papéis. A forma mais elegante de representar isso em POO é através do uso de **Interfaces**, onde cada interface define um "contrato" de funcionalidades que a classe principal deve "assinar" e implementar.

As funcionalidades foram divididas da seguinte forma:

-   **`ReprodutorMusical`**: Define comportamentos esperados de um player de música.
    
    -   `tocar()`
        
    -   `pausar()`
        
    -   `selecionarMusica(String musica)`
        
-   **`AparelhoTelefonico`**: Define comportamentos de um telefone.
    
    -   `ligar(String numero)`
        
    -   `atender()`
        
    -   `iniciarCorreioVoz()`
        
-   **`NavegadorInternet`**: Define comportamentos de um browser.
    
    -   `exibirPagina(String url)`
        
    -   `adicionarNovaAba()`
        
    -   `atualizarPagina()`
        

A classe `Iphone` é a classe concreta que implementa essas três interfaces, centralizando todas as funcionalidades em um único dispositivo.

## Diagrama UML

O diagrama abaixo ilustra a estrutura de classes e interfaces do projeto:

![Descrição da imagem](https://github.com/rpatetti/assets/blob/main/Diagrama_UML_Iphone.png?raw=true)

## Tecnologias Utilizadas

-   **Java 17**: Linguagem de programação principal.
    
-   **UML (Unified Modeling Language)**: Para a concepção e modelagem do sistema.
    

## Como Executar

1.  Clone este repositório:
    
    Bash
    
    ```
    git clone https://github.com/seu-usuario/seu-repositorio.git
    
    ```
    
2.  Navegue até o diretório do projeto.
    
3.  Compile os arquivos Java (a partir da pasta `src`):
    
    Bash
    
    ```
    javac com/seu_nome/desafio/iphone/*.java com/seu_nome/desafio/iphone/funcionalidades/*.java
    
    ```
    
4.  Execute a classe de teste:
    
    Bash
    
    ```
    java com.seu_nome.desafio.iphone.MeuIphone
    
    ```
    

Alternativamente, importe o projeto em sua IDE Java preferida (Eclipse, IntelliJ, VS Code) e execute a classe `MeuIphone.java`.

## Contato

**Rafael Patetti** - [Linkedin](www.linkedin.com/in/rafael-patetti-02b4a913b) - patetti.rafael@gmail.com

