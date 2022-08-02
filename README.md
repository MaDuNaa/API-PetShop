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

![uml -API-1](https://user-images.githubusercontent.com/97975671/182435102-17eceb3e-4c8f-4035-838a-f53aebf5ee76.PNG)

![UML-API-2](https://user-images.githubusercontent.com/97975671/182435121-92fc33b2-f785-4878-8e77-ce2adc4fa484.PNG)

## Banner do Projeto no Spring

![banner projeto](https://user-images.githubusercontent.com/97975671/182434980-dffde29e-2501-46cc-a787-adfd50973a3b.PNG)

## Imagens Swagger e Postman (alguns cruds)

![Swagger projeto](https://user-images.githubusercontent.com/97975671/182435081-182d6a79-e604-4264-93e4-4df64ed4ba2b.PNG)

< div align = "centro" >
< img src = "https://user-images.githubusercontent.com/97975671/182435037-f7bc03fb-77bb-4fa9-8895-f9010fee313d.PNG" />
</ div >

----------------------------------------------------------------------------------------------
## Autor
Matheus Nascimento
