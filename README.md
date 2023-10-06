# OpenLib
Implementação da modelagem disponibilizada na disciplina de LP2

1) O SBCOpenLib é um sistema usado para gerenciar o envio de artigos para uma revista científica e o seu processo de revisão por pares.
➔ Para que um artigo seja publicado em uma revista,
ele deve ter pelo menos 3 revisões positivas de avaliadores especialistas, de um total de 5 revisões. Para que o artigo seja cadastrado na plataforma deve ser informado o seu título, autores e link para o documento. Um identificador numérico inteiro é gerado para identificar unicamente o artigo nas operações da plataforma. É possível verificar a aprovação de um artigo e obter a sua representação textual para ser exibida na interface com o usuário.
➔ Os revisores também devem ser cadastrados na plataforma, identificados unicamente por seu email. Além disso, deve ser informado o seu nome e afiliação (que é a universidade ou centro de pesquisa do qual faz parte). A cada nova revisão realizada, o revisor recebe 1 ponto. De acordo com os seus pontos, é atribuída uma badge ao revisor. Para pontos<10, "Pesquisador P2"; Para 10<pontos<20, "Pesquisador P1" e pontos>30, "Pesquisador Produtivo". A representação textual do revisor, além de seus dados, deve incluir a badge. O revisor deve manter um registro cronológico dos artigos que ele revisou, para que o sistema ofereça a funcionalidade de listar estes artigos.
➔ Cada revisão é única e feita exatamente para um artigo. Elas devem informar o revisor, adata da realização, bem como o texto e o status da avaliação (aprovado ou reprovado). A sua representação textual deve informar todos esses dados, incluindo a badge do revisor. Um revisor não deve avaliar o mesmo artigo mais de uma vez.
Considere que a classe SBCOpenLibController seria invocada pelo Main para realizar as ações especificadas para o sistema. Essa classe deve ter métodos para implementar as funcionalidades seguintes:
● cadastrarRevisor( email:String, nome:String, afiliacao:String ):void
● listarRevisor(email:String):String
● listarRevisores():String[]
● listarRevisoresPorBadge(badge:String):String[]
● cadastrarArtigo( titulo:String, autores:String, link:String ):int
● ehArtigoAprovado(idArtigo:int):boolean
● listarArtigo(idArtigo:int):String
● listarArtigos():String[]
● listarArtigosPorStatus( aprovado:boolean ): String[]
● realizarRevisao( idArtigo:int, emailRevisor:String, data:String, texto:String, status:boolean ): void
● listarRevisoesArtigo(idArtigo:int):String[]
● listarArtigosRevisados( emailRevisor:String):String[]
