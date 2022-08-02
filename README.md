# Api de Pet Shop (atendimento veterinário) - Starter #4

Este projeto foi desenvolvido no periodo de treinamento oferecido pelo Grupo GFT no programa
Starter #4, neste treinamento vimos Spring Boot, diversos End Points, API, Consumir uma API, Spring Security, Swagger...
No projeto tem Cruds para Clientes, Veterinarios, Animais, Atendimentos , Historicos......


## Nessa API de Sistema de Atendimento Veterinario é possivel :

 * No Crud de Clientes :
     Buscar todos os Clientes ou um de cada vez ,
        Editar os dados que quiser,
          Criar um novo cliente com seu dog,
            E ainda excluir o cliente que desejar ,

    ( NÃO E POSSIVEL EXCLUIR CLIENTES QUE ESTEJAM CADASTRADOS EM ATENDIMENTOS )

 * No Crud de Veterinario :
     Buscar todos os Medicos ou um de cada vez,
        Editar os dados que quiser,
          Criar um novo Medico ,
            E tambem excluir um medico ,

   ( NÃO E POSSIVEL EXCLUIR MEDICOS QUE ESTEJAM CADASTRADOS EM ATENDIMENTOS )

* No Crud de Cachorros :
    Buscar todos os Cachorros ou um de cada vez,
      Editar os dados dos dogs,
        Criar um novo doguinho,
          E ainda excluir o dog desejado,

    ( NÃO E POSSIVEL EXCLUIR CACHORROS QUE ESTEJAM CADASTRADOS EM ATENDIMENTOS )

* No Crud de Atendimento :
    Buscar todos os Atendimento ou um por vez,
       Criar um novo Atendimento , nele com os medicos, clientes e dogs,
         Editar os dados dos Atendimentos,
           E tambem excluir o Atendimento que quiser,
 
* No Crud de Historicos : ( de Atendimentos )
     Buscar todos os Historicos ,
       Buscar Historicos por id,
         Os historicos sao de Atendimento entao e preciso excluir um Atendimento para,
         cair no Historico.  

* No Crud de Racas :
     Buscar todas as racas do consumo da API The dog,
       Buscar raca Por nome e Por id,        
         Aqui voce pode buscar a raca do seu dog para cadastrar ele no Crud de cachorros 

* No Crud de Usuarios :
    E possivel criar um novo usuario para se logar ,
      E tambem no autenticar ou login e so entrar com o usuario que voce cadastrou,
       ou com os que ja existem.   

* No crud de Gatos :
    Buscar todos os gatos ou um de cada vez,
      Editar os dados dos gatos ,
        Criar um novo gato  ,
         Excluir um gato ,

* No crud de Atendimento de Gatos :
    Buscar todos os Atendimento ou um por vez,
       Criar um novo Atendimento , nele com os medicos, clientes e gatos,
         Editar os dados dos Atendimentos,
           E tambem excluir o Atendimento que quiser,

* No Crud de Racas de Gatos :  
    Buscar todas as racas do consumo da API The cat,
       Buscar raca Por nome e Por id,        
         Aqui voce pode buscar a raca do seu gato para cadastrar ele no Crud de gatos          



```bash

#Executar o projeto
Para entrar no projeto na web basta digitar a URL abaixo no seu navegador (swagger)

http://localhost:8080/swagger-ui.html#/

( JSON do Postman esta junto com o projeto )

Feito isso ja tera acesso mais tambem logar nos usuarios abaixos ou cadastre um novo.
#Usuario e senha para acessar a aplicação.

1 - math@gmail.com
    Senha:1234

2 - usu@gmail.com
    Senha:12345

Lembrando que o admin tem acesso total ao site e o user so visualização.

```


## Banco de dados já esta populado para teste
-=======================================================================

## Como executar o projeto

Pré-requisitos: 

* Java 17 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* Spring Tools Suits.
* Controle de versão GIT instalado na sua máquina.
* Postman


# Tecnologias utilizadas e IDES

## Back end
- Java
- Spring API
- Spring Boot
- Spring Security ( JWT )
- Spring Data JPA
- Bean Validation
- Maven
- Mysql
- Swagger
- Postman
- Flyway
- Web Client
etc...

## UMLs que fiz para seguir de base (alguns)

![uml_-API-1](/uploads/2687f8501593428bf238ad80b4fdd25f/uml_-API-1.PNG)


![UML-API-2](/uploads/ae705b9f89b80ecfbbba57ac2fa5c34e/UML-API-2.PNG)

## Banner do Projeto no Spring

![banner_projeto](/uploads/6bc73c10812ac9c73b1002e70e4729fc/banner_projeto.PNG)

## Imagens Swagger e Postman (alguns cruds)

![Swagger_projeto](/uploads/5cab4920ddb4628d85ac0dc6c72e013c/Swagger_projeto.PNG)

<div align="center">
<img src="/uploads/433195c4c2defc8c5c89fc8817d47d67/Postman_Projeto.PNG" />
</div>

----------------------------------------------------------------------------
## Autor
Matheus Nascimento
