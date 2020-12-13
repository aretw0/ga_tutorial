[![Java](https://img.shields.io/badge/Language-java-yellow)]() [![MAven](https://img.shields.io/badge/Build-Maven-blue)]() [![MAven](https://img.shields.io/badge/Testing-JUnit5-yellow)](https://opensource.org/licenses/MIT) [![License:MIT](https://img.shields.io/github/license/aretw0/ga_tutorial)](https://opensource.org/licenses/MIT) 

[![Github Actions](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/github_actions_logo_hd.png)]()

# Tópicos
  - [Introdução](README.md#introdução)
  - [Projeto e Repositório](README.md#projeto-e-repositório)
  - [Configuração](README.md#configuração)
  - [Execução](README.md#execução)
  - [Tecnologias](README.md#tecnologias)
  - [Referências](README.md#referências)
  - [Autores](README.md#autores)
  

# Introdução

O Github Actions permite que você crie fluxos de trabalho personalizados do ciclo de vida de desenvolvimento de software diretamente no seu repositório Github. Esses fluxos de trabalho são compostos por diferentes tarefas, chamadas ações, que podem ser executadas automaticamente em determinados eventos. Isso permite que você inclua recursos de integração contínua (CI) e implantação contínua (CD) e muitos outros recursos diretamente em seu repositório.

Esta apresentação demonstra a configuração e uso do GA (Github Actions) em um repositório de um projeto java. O projeto java utilizado foi criado usando o Maven. O maven faz uso de um arquivo xml geralmente chamado ‘pom.xml’ que descreve tudo o que maven precisa e pode fazer para testar, buildar e empacotar aquele projeto.

# Projeto e repositório 

Crie um projeto usando maven e o coloque em um repositório no github

Usando o maven é possível criar um projeto java básico:

```
mvn archetype:generate \ 
-DgroupId=br.ufpe.cinmoto.testingtools_ga.app \
-DartifactId=testingtools_ga -DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.4 -DinteractiveMode=false
```

# Configuração 
Configurando o repositório para usar Github Actions

Em seu repositório clique na aba "`actions`":

[![Aba Actions](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/1%20-%20actions.png)]()

Sugestões aparecerão baseadas no projeto:

[![Sugestões](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/2%20-%20get_start.png)]()

Na sugestão ‘Java with Maven’ clique em  "`set up this workflow`":

[![workflow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/3%20-%20java_with_maven.png)]())]()

Aparecerá este editor de texto abaixo:

[![Sugestões](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/4%20-%20editing_maven.yml.png)]()

Preencha o editor de texto com o conteúdo abaixo respeitando a indentação mostrada. 

[![Prenchendo o Maven](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/5%20-%20preenchendo_maven.yml.png)]()

Após isso clique no botão para fazer o commit "`start commit`":

[![Commit](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/6%20-%20start_commit.png)]()

# Execução 

Github Actions em ação ( Acompanhando o seu workflow )

Agora na aba "`Actions`" será possível acompanhar as execuções dos workflows do repositório:

[![Follow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/7%20-%20acompanhamento_dos_workflows.png)]()

Cada execução será acionada automaticamente a partir de eventos que definimos no arquivo do workflow (push e pull request). Nesse caso o evento foi um push do commit que fizemos do novo arquivo (maven.yml). Com certeza esta é a primeira execução de qualquer repositório que passe a usar o GA.

Clicando na execução em andamento do workflow que adicionados temos esta página:

[![Follow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/8%20-%20workflow_em_andamento.png)]() 

Na lateral esquerda clicando em build (nome do job) podemos ver sua execução de forma mais detalhada

[![Follow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/9%20-%20execu%C3%A7%C3%A3o_detalhada.png)]()

[![Follow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/10%20-%20execu%C3%A7%C3%A3o_detalhada.png)]() 

Ao fim de uma execução bem sucedida (todos os testes passaram) é possível fazer download do artefato (.jar) zipado.

[![Follow](https://raw.githubusercontent.com/FDPS-CIN/images-readme/master/images_updated/11%20-%20fim_da_execucao.png)]()

# Tecnologias

  - [Java](https://www.java.com/pt-BR/) - Java é uma linguagem de programação baseada em classes e orientada a objetos
  - [Junit](https://junit.org/junit5/) - JUnit é uma das estruturas de teste unitário mais populares no ecossistema Java
  - [Maven](https://maven.apache.org/) -  Maven é ferramenta de gerenciamento e automação de depedências
  - [Github Actions](https://github.com/features/actions) - tecnologia que automatiza todo fluxo de trabalho no desenvolvimento de software, adotando as premissas da filosofia CI / CD. A tecnologia permite a criação, teste e implantação seu código-fonte direto do GitHub.


# Referências

- [Iniciando com  Maven em Cinco Minutos](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
- [Mexendo no Arquivo Pom.xml](https://maven.apache.org/pom.html)
- [Construindo e Testando Java com Maven](https://docs.github.com/en/free-pro-team@latest/actions/guides/building-and-testing-java-with-maven)
- [Sobre Github Actions](https://github.com/features/actions)
- [Introdução ao Github Actions](https://gabrieltanner.org/blog/an-introduction-to-github-actions)
- [Documentação do Github Actions](https://docs.github.com/pt/free-pro-team@latest/actions)

# Autores
- [@aretw0](https://github.com/aretw0) - Arthur Aleksandro
- [@jV1ct0r](https://github.com/jV1ct0r) - João Victor
- [@Telemaco98](https://github.com/Telemaco98) - Shirley Ohara
- [@ruanmed](https://github.com/ruanmed) - Ruan Bahia
- [@jcrbsa](https://github.com/jcrbsa) - Richardson Bruno

# Licença :warning:
Este projeto é licenciado sobre a licença MIT

ga_tutorial is licensed under the following MIT license(MIT) 

Again, see the included `LICENSE <LICENSE>`_ file for specific legal details.

Copyright © 2018 CIN-Motorola FPDS GA WorkGroup,

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


