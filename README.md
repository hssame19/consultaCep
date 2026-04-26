# Busca CEP - Java
Aplicação simples em Java que consome uma API pública para recuperar informações de endereço a partir de um CEP brasileiro.
## O que faz
Aceita um CEP inserido pelo usuário, consome a API ViaCEP, realiza o parse da resposta JSON e exibe os dados de endereço formatados (cep, logradouro, bairro, município e estado).
## Tecnologias
* Java (HttpClient);
* Jackson (Parsing do JSON).
## Exemplo
* Input: 01310200
* Saída:

        Cep: 01310-200
        Logradouro: Avenida Paulista
        Bairro: Bela Vista
        Município: São Paulo
        Estado: SP
