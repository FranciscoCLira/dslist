# DSList Games Playlist 
[![NPM]() 

# Sobre o projeto

https://dslist-production-15a9.up.railway.app/games ou 
    /games/{id_game} ou 
    /lists ou 
    /lists/{id_game}/games
    /lists/(id_game}/replacement  onde replacement: Body {indice_origem, indice_destino}

DsList � uma aplica��o back end web constru�da durante a **Semana do Intensivão Java Spring** (#dslist), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplica��o consiste na geração da base da dados de jogos e suas playlists para se efetuar requisições HTTP/REST via JSON por lista de jogos, jogo, de jogos, playlistas, jogo por playlista, bem como permitir a alteração da posição de um jogo na playlist.

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

## Implanta��o em produ��o
- Back end: Railway Server
- Front end web: (N/A) - Requisições HTTP/REST via JSON
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pr�-requisitos: Java 21, ou alterar para outra versão no arquivo pom.xml e system.properties

```bash
# clonar reposit�rio
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

