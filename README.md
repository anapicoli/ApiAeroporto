# ✈️ API RESTful de Aeroportos

Esta API foi desenvolvida com **Spring Boot** para gerenciar informações de aeroportos no Brasil, permitindo operações CRUD completas (criar, listar, buscar, atualizar e excluir).

---

## 🧱 Tecnologias Utilizadas
- **Java JDK 17+**
- **Spring Boot** (Web, Data JPA)
- **MySQL** (via **XAMPP**)
- **Maven**
- **Postman** (para testes)
- **IntelliJ IDEA**

---

## 🗂️ Estrutura de Pastas
```
aeroportos/
 ├── src/main/java/com/exemplo/aeroportos/
 │    ├── controller/
 │    │    └── aeroportocontroller.java
 │    ├── model/
 │    │    └── aeroporto.java
 │    ├── repository/
 │    │    └── aeroportorepository.java
 │    ├── service/
 │    │    └── aeroportoservice.java
 │    └── aeroportosapplication.java
 │
 └── src/main/resources/
      └── application.properties
```

---

## 🚀 Executando o Projeto

1. Abra o projeto no **IntelliJ**.
2. Execute a classe principal:
   ```
   aeroportosapplication.java
   ```
3. A API será iniciada em:
   ```
   http://localhost:8080
   ```

---

## 📡 Endpoints Disponíveis

### ➕ Criar aeroporto  
**POST** `http://localhost:8080/aeroportos`  
**Body (JSON):**
```json
{
  "nome": "Aeroporto Santos Dumont",
  "codigoIATA": "SDU",
  "cidade": "Rio de Janeiro",
  "estado": "RJ",
  "pais": "Brasil"
}
```

---

### 📋 Listar todos os aeroportos  
**GET** `http://localhost:8080/aeroportos`

---

### 🔍 Buscar aeroporto por ID  
**GET** `http://localhost:8080/aeroportos/{id}`  
Exemplo:  
`http://localhost:8080/aeroportos/1`

---

### ✏️ Atualizar aeroporto  
**PUT** `http://localhost:8080/aeroportos/{id}`  
**Body (JSON):**
```json
{
  "nome": "Aeroporto Internacional de Guarulhos",
  "codigoIATA": "GRU",
  "cidade": "Guarulhos",
  "estado": "SP",
  "pais": "Brasil"
}
```

---

### 🗑️ Excluir aeroporto  
**DELETE** `http://localhost:8080/aeroportos/{id}`  
Exemplo:  
`http://localhost:8080/aeroportos/1`

---

## 🧾 Exemplo de Dados

| Nome                                               | Código IATA  | Cidade         | Estado | País    |
|----------------------------------------------------|--------------|----------------|--------|---------|
| Aeroporto Internacional de Guarulhos               | GRU          | Guarulhos      | SP     | Brasil  |
| Aeroporto Santos Dumont                            | SDU          | Rio de Janeiro | RJ     | Brasil  |
| Aeroporto Internacional de Brasília                | BSB          | Brasília       | DF     | Brasil  |
| Aeroporto Internacional de Confins – Tancredo Neves| CNF          | Confins        | MG     | Brasil  |
| Aeroporto Internacional de Salvador                | SSA          | Salvador       | BA     | Brasil  |

---

## ✅ Testando no Postman

1. Abra o **Postman**.
2. Crie uma nova Collection chamada **API Aeroportos**.
3. Adicione as rotas listadas acima.
4. Execute cada endpoint conforme o tipo (GET, POST, PUT, DELETE).
5. Verifique as respostas JSON retornadas pela API.

---

## 💡 Observações

- Todos os endpoints utilizam o formato JSON.
- O campo `id` é **gerado automaticamente** pelo banco de dados.
- Se receber **405 (Method Not Allowed)**, verifique se o método HTTP no Postman corresponde ao endpoint.

---

## 👩‍💻 Autoria
Desenvolvido por **Ana Picoli**
