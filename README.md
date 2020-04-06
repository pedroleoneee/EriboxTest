# EriboxTest

## Problemas

- Não consegui rodar o hibernate com session factory ou outros que tentei também.
- Fiquei quase metade da manhã e parte da tarde toda tentando utilizar e configurar o hibernate e não consegui.

## O que fiz

- Criei a tela para listar os produtos
- Criei o mapeamento com services e DAO
- Criei o form para criação de um novo produto
- Criei as ações para Salvar, editar, atualizar e deletar. (Somente as chamadas)

### Compilação

- Não estava conseguindo rodar pois precisava do .classpath e .project que não vinha no projeto. Pois o Eclipse não abria e não encontrava o projeto.
- Reinstalação MySql. Tinha instalado o MySQL 8 que tinha uma criptografia especifica e mais segura. Precisei instalar a versão compativel com as anteriores.
- Fazer configuração do banco de dados no arquivo persistence.xml, colocar user and password que criei.


### INSTRUÇÕES

1. Criar um CRUD de 'Produto' usando as classes, páginas e configurações já existentes na aquitetura do projeto.

2. A arquitetura do projeto foi desenvolvida utilizando JSF (Primefaces), Spring Framework e JPA (Hibernate provider), Tomcat 9 e Java 8.

3. Caso você sinta necessidade, novas classes, configurações e páginas podem ser adicionadas, porém as já existentes devem ser utilizadas.

4. A aplicação está configurada para usar o banco MySQL utilzando o esquema eribox_test para acesso localhost.

5. O produto deve ter ao menos informações de nome, código e preço. 

6. Validações, coesão, acoplamento, estética e qualidade do código serão levados em consideração na avaliação.



INSTRUÇÕES DE ENVIO

1. Para envio do projeto você deve subir o projeto base para um repositório na sua conta do Github.

2. O repositório de envio deve ser privado.

4. Escrever no readme.md os passos para execução do seu teste.

3. Após finalizado a projeto adicione o usuário cristripoli como colaborador e envie o link de convite do seu repositório por email.
