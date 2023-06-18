# 04. JPA, consultas SQL e JPQL: Desafio-consulta-vendas

# Sobre o Projeto:
Desafio de entrega 

![Web 0](https://github.com/williamsartijose/desafio-consulta-vendas/blob/main/DesafioVendass.png)


## Como o trabalho será corrigido?

Pré-requisitos: Java 17

1) Importação do projeto
O professor deverá ser capaz de fazer um simples clone do projeto Github, e importar e executar o mesmo na
IDE sem necessidade de qualquer configuração especial diferente daquelas das aulas.

2) Testes manuais no Postman
O professor já terá preparado em seu computador as seguintes requisições (link da collection Postman
abaixo). Todas elas deverão funcionar corretamente:
Coleção do Postman: https://www.getpostman.com/collections/dea7904f994cb87c3d12

```bash
# 2.1) Sumário de vendas por vendedor (teste 1)



GET /clients/1

# Busca paginada de clientes

GET /sales/summary?minDate=2022-01-01&maxDate=2022-06-30
Deverá retornar o sumário de vendas por vendedor no período informado:
[
{
"sellerName": "Anakin",
"total": 110571.0
},
{
"sellerName": "Logan",
"total": 83587.0
},
{
"sellerName": "Loki Odinson",
"total": 150597.0
},
{
"sellerName": "Padme",
"total": 135902.0
},
{
"sellerName": "Thor Odinson",
"total": 144896.0
}
]

# 2.2) Sumário de vendas por vendedor (teste 2)

GET /sales/summary
Deverá retornar o sumário de vendas por vendedor dos últimos 12 meses.

# 2.3) Relatório de vendas (teste 1)


GET /sales/report
Deverá retornar o relatório de vendas dos últimos 12 meses.

# 2.4) Relatório de vendas (teste 2)
GET /sales/report?minDate=2022-05-01&maxDate=2022-05-31&name=odinson
Deverá retornar o relatório de vendas do período/vendedor informados:
{
"content": [
{
"id": 9,
"date": "2022-05-22",
"amount": 19476.0,
"sellerName": "Loki Odinson"
},
{
"id": 10,
"date": "2022-05-18",
"amount": 20530.0,
"sellerName": "Thor Odinson"
},
{
"id": 12,
"date": "2022-05-06",
"amount": 21753.0,
"sellerName": "Loki Odinson"
}
],
...
```

# Salvar entidades associadas para-um
# Autor

William Sarti José

https://www.linkedin.com/in/william-analistadesistema/
