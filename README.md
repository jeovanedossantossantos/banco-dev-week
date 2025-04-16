![alt text](image.png)


# Executar a aplicação em dev

`./mvnw spring-boot:run -Dspring-boot.run.profiles=dev`

# Executar a aplicação dem prod

`./mvnw spring-boot:run -Dspring-boot.run.profiles=prd`

# Banco h2

`http://localhost:8080/h2-console/`

# Documentação 

`http://localhost:8080/swagger-ui/index.html`


# Estruturando objetos json

```
{
  "name": "Venilton", 
  "account":{
    "number": "00000000-0", 
  "agency": "0000", 
  "balance": 1324.64, 
  "limit": 1000.00 
  },
  "features":[
    {
      "icon":"",
      "description":"PIX"
    }
  ],
  "card":{
    "number": "xxxx xxxx xxxx 0000", 
    "limit": 1000.00
  },
  "news":[
    {
      "icon": "URL",
      "description": "O Santander tem soluções de crédito sob medida pra você." 
    }
  ]


}

```

<a href="https://jsoneditoronline.org">Json Editor Online</a>


# Usando ChatGpt para gera diagrama de classes

```mermaid
classDiagram
    class Client {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News[] news
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    Client "1" *-- "1" Account
    Client "1" *-- "1..N" Feature
    Client "1" *-- "1" Card
    Client "1" *-- "1..N" News

```