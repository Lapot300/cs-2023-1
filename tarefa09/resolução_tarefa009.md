# Tarefa Individual 009 - 15/05/2023

[6 dicas fundamentais para um código de qualidade.](https://www.youtube.com/watch?v=MMAu_1KMcMA)

2. Elaborar um texto sobre um deles, destacando:
   
    2.1 - A idéias principais do texto;
    A ideia principal do vídeo feito pelo Filipe Deschamps (ótimo criador de conteúdo que acompanho desde 2019), é mostrar 6 dicas propostas pelo Daan no seu artigo do medium [Things That You Can Do to Improve Code Quality](https://betterprogramming.pub/things-that-you-can-do-to-improve-code-quality-c746c30e7521)

    1° *Princípio dos quatro olhos*: Um princípio em que o autor recomenda que além de quem escreveu o código, tenha mais 2 pessoas (por isso os 4 olhos) para analisar e verificar os principais pontos, como por exemplo: regras de negócio, se o código está realmente legível, se não possui falhas de segurança, etc...

    2° *Integração contínua*: O conceito de CI (Continuous Integration), vem ganhando espaço há muito tempo, e as dicas que são sugeridas são: tentar ao máximo diminuir o tempo de build para que assim essa etapa não demore muito, sempre "limpar" o ambiente em que tal aplicação irá ser implantada para que não ocorra "vícios", ou seja, não tenha nenhuma influência externa, e por último, *NUNCA* deixar que a branch master "quebre" por algum motivo, e caso isso aconteça, corrija o mais rápido possível.

    3° *Convenções no código*: Essa etapa é muito importante, na sua equipe é recomendado que haja um padrão de nome para variáveis, métodos, classes e etc... Tendo essa lista de padrões (convenções), tenha certeza que toda a equipe a utilize e se sinta segura em qualquer parte do código sem que haja alguma situação do tipo "Essa parte do código aqui, o Fulano que programou, é a cara dele".

    4° *Testes, testes e testes*: Nesse ponto o Filipe sai um pouco do foco que o artigo traz, mas aborda mais um tema bastante importante, sobre o artigo, o autor traz a importância de usar os testes da maneira descrita na famosa pirâmide onde a base são os testes unitários (garantem o bom funcionamento das pequenas partes), e vão subindo até os testes E2E (que garantem o funcionamento do todo, o sistema em si). O Filipe no vídeo traz uma situação que não é muito difícil de ser vivenciada. Imagine que você está programando uma aplicação e precisa implementar os testes, você começaria pelos testes E2E ou pelos unitários? (Supondo que você não tenha muito tempo e provavelmente o primeiro que implementar já será o suficiente para soltar a aplicação ao cliente), e nessa situação ele explica o motivo de talvez escolher os testes E2E, pois, dessa maneira, você terá certeza que o sistema se comporta da maneira que o cliente espera

    5° *Analisar bugs*: Ter uma aplicação sem bugs é algo quase impossível, porém, a maneira com que a equipe lida com esses bugs é muito importante. Quando um bug ocorre devemos analisar a importância dele, se for um bug muito crítico, devemos corrigi-lo imediatamente. Ao corrigir, devemos nos perguntar: "Qual o motivo de não testarmos isso (de maneira certa) antes?", "Onde mais esse erro pode ocorrer?", "O que deu errado de fato?" e o mais importante "Como prevenimos que isso não aconteça novamente?". 

    6° *Métricas de código*: O Filipe explica uma métrica em específico, a Complexidade Ciclomática, que relaciona os "caminhos válidos" (condicionais, combinações) que seu código tem, um estudo aponta que funções e métodos que possuem uma alta complexidade também tendem a conter o maior número de bugs, ou seja, a simplicidade ganha, e teoricamente, quanto menos complexidade, menos defeito.

    2.2 - O que é novidade para você, em relação ao conteúdo do artigo;

    Métricas de código foi algo que abriu um pouco a minha mente quando vi, e que realmente faz sentido, às vezes uma função ela é tão complicada que a dificuldade não é dar manutenção em si e sim entender primeiro o que acontece ali dentro. Além disso, a parte de testes revelou alguns aspectos importante para mim. No meu serviço (trabalho aquina UFG mesmo, no LabTIME), poucas aplicações possuem testes e visto que sempre que refatoramos algo que já existe, isso dificulta bastante a etapa de validação se o código está pronto ou não

    2.3 - O que já era conhecido por você.

    Princípio dos quatro olhos é algo que já venho implementando (junto com um colega de trabalho) onde sempre um está de olho no código do outro e quando a gente acha que está bom, mandamos para o "sênior" da equipe para ele poder verificar se não há nenhum problema. A parte de integração contínua é muito legal, nós trabalhamos com o Jenkins aqui no serviço. Analisar bugs/Convenções no código são práticas que foram ensinadas para mim quando entrei na empresa e até hoje utilizamos.

3. Escrever um parágrafo com suas palavras comentando o contéudo do artigo.

    No geral é um artigo muito interessante pois traz conhecimentos básicos e avançados da programação, com certeza ao implementá-los em seu ambiente de desenvolvimento a melhora será significativa. Além disso, também traz aspectos de equipe, ou seja, esses princípios abordados no artigo sendo aplicados por toda uma equipe de desenvolvimento com certeza terá um resultado muito mais expressivo do que apenas por uma pessoa. 