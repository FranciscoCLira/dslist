# DSList Games Playlist 
[![NPM](https://github.com/FranciscoCLira/dslist/blob/main/LICENSE) 

# Sobre o projeto

https://dslist-production-15a9.up.railway.app/games ou 
    /games/{id_game} ou 
    /lists ou 
    /lists/{id_game}/games
    /lists/(id_game}/replacement  onde replacement: Body {indice_origem, indice_destino}

DsList é uma aplicação back end web construida durante a **Semana do Intensivão Java Spring** (#dslist), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicaçãoo consiste da geração da Base de Dados de jogos e suas playlists, permitindo requisições HTTP/REST via JSON por lista dos jogos, jogo, , playlists, jogo por playlista, bem como requisições para a alteração da posição de um jogo dada a playlist, posição dos jogos na lista, origem e destino

## Layout mobile (N/A)
## Layout web (N/A)

## Modelo de domínio DSList
![Modelo Conceitual](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- JDK + IDE (compilador Java + editor)
- Git e Github
- Postman
- Docker
- Terminal Linux no Windows com WSL 
- Spring Boot
- JPA / Hibernate
- Maven

## Front end (N/A)

## Implantação em produção
- Back end: Railway Server
- Front end web: (N/A) - Requisições HTTP/REST via JSON
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 21, ou alterar para outra versão no arquivo pom.xml e system.properties

```bash
# clonar repositório
git clone https://github.com/FranciscoCLira/dslist

# entrar na pasta do projeto back end
cd dslist

# Na IDE Spring Tool Suite, importar o projeto: 
# Menu horizontal => File => Import => Maven => Existing Maven Project
# selecionar a pasta do projeto clonado - dslist 
# então reconhece o arquivo de dependencias do Maven ==> finish 
# Executar a aplicação ==> local ==> mouse/direito em dslist ==> restart 

# Autor

Francisco Casemiro Lira

https://www.linkedin.com/in/franciscoclira

