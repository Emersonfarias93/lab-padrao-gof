# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:

- #### Singleton
- #### Strategy/Repository
- #### Facade

## Endpoints Cliente REST Controller
### GET /clientes/{id}
Este endpoint recupera um cliente específico pelo seu id.

* URL: /clientes/{id}
* Método HTTP: GET

Parâmetros:

* id (obrigatório): O ID do cliente que deseja recuperar.

Resposta de Sucesso:
* Código: 200 OK
* Corpo: JSON contendo os dados do cliente.

Resposta de Erro:

* Código: 404 Not Found: Se o cliente com o ID especificado não for encontrado.

Exemplo de Requisição:

```bash
GET /clientes/1
Exemplo de Resposta:
```

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```
### PUT /clientes/{id}

Este endpoint atualiza os dados de um cliente específico.

* URL: /clientes/{id}
* Método HTTP: PUT 

Parâmetros:

* id (obrigatório): O ID do cliente que deseja atualizar.

Corpo da Requisição:

* JSON contendo os dados do cliente a serem atualizados.

Resposta de Sucesso:

* Código: 200 OK
* Corpo: JSON contendo os dados atualizados do cliente.

Resposta de Erro:

* Código: 404 Not Found: Se o cliente com o ID especificado não for encontrado.
* Código: 400 Bad Request: Se os dados da requisição forem inválidos.

Exemplo de Requisição:

```bash
PUT /clientes/1
```

Corpo:

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```

Exemplo de Resposta:

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```

### DELETE /clientes/{id}

Este endpoint remove um cliente específico.

* URL: /clientes/{id}
* Método HTTP: DELETE

Parâmetros:

* id (obrigatório): O ID do cliente que deseja remover.

Resposta de Sucesso:

* Código: 204 No Content

Resposta de Erro:

* Código: 404 Not Found: Se o cliente com o ID especificado não for encontrado.

Exemplo de Requisição:

```bash
DELETE /clientes/1
```

Exemplo de Resposta:

```
Sem corpo de resposta.
```

### GET /clientes

Este endpoint recupera todos os clientes.

* URL: /clientes
* Método HTTP: GET

Resposta de Sucesso:

* Código: 200 OK
* Corpo: JSON contendo uma lista de todos os clientes.

Exemplo de Requisição:

```bash
GET /clientes
```
Exemplo de Resposta:

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```

### POST /clientes
   Este endpoint cria um novo cliente.

* URL: /clientes
* Método HTTP: POST

Corpo da Requisição:

* JSON contendo os dados do cliente a ser criado.

Resposta de Sucesso:

* Código: 201 Created
* Corpo: JSON contendo os dados do cliente criado.

Resposta de Erro:

* Código: 400 Bad Request: Se os dados da requisição forem inválidos.

Exemplo de Requisição:

```bash
POST /clientes
```

Corpo:

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```

Exemplo de Resposta:

```json
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
```
Criado por: Emerson de Farias Santos
