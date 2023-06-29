# Projeto Trilha  

## Simulador de pet virtual

Um programa que simula a tarefa de cuidar de um pet virtual.
O usuário pode criar um pet a partir de algumas das espécies pré definidas:
um cachorro, um gato, e um pinguim e lhe dar um nome.
O usuário Deve alimentar, cuidar de sua higiene e brincar com o pet para mantê-lo saudável.
A progressão se dá com o avanço da idade do mascote e seus parâmetros de saúde no decorrer do tempo.
Por fim, o desempenho do usuário é calculado de acordo com sua progressão.  
Vários conceitos de OO podem ser implementados nesse projeto.
Cada espécie pode ser uma classe que herda da classe abstrata Pet.
O usuário instancia seu mascote em tempo de execução.
Mais opções de customização e uma GUI podem ser implementadas posteriormente.  

### Especificações

Um pet tem como parâmetros de saúde sua fome, felicidade, limpeza e pontos de vida.
Estes são valores que variam de 0 a 100.
Sendo fome um atributo negativo, portanto fome = 100 significa que o pet esta faminto.
A execução do programa se divide em turnos.
A cada turno os parâmetros de saúde do pet diminuem (o valor em fome começa em 0 e aumenta),
e cabe ao usuário agir para que estes não caiam a um nível baixo.
O pet inicia com 100 pontos de vida, e os perde caso seus parâmetros de bem estar caiam,
ou se ocorrer o evento aleatório 'adoecimento'.
O pet pode morrer de velhice caso o atributo idade seja alto o suficiente:
maior que 15 turnos.  
O usuário tem uma ação a cada turno: alimentar, brincar, limpar ou medicar o pet.  

Alimentar: diminui a fome do pet em 30 pontos  
Brincar: aumenta a felicidade.  
Limpar: aumenta a limpeza.  
Medicar: Pode curar a doença do pet, caso doente == true.  

Ao início de cada turno os atributos são atualizados da seguinte forma:  
Sua fome aumenta em 15 pontos;  
Sua limpeza diminui em 10 pontos;  
Sua felicidade diminui em 10 pontos;  

Ao fim de cada turno o estado de saúde é atualizado da seguinte forma:  
Se fome >= 70, o pet está com fome e perde 10 pontos de vida.  
Se limpeza <= 45, o pet está sujo e e pode adoecer com probabilidade de 30%.  
Se felicidade >= 70, o pet está feliz e pode, com 50% de chance, regenerar 10pontos de vida.  
Se felicidade <= 40, o pet está infeliz e pode, com 50% de chance, perder 20 pontos de vida;  
O pet envelhece e sua idade aumenta 1 ponto.  
Se velho o suficiente (idade > 15), o pet tem 55% de chance de morrer.  
Se doente, o pet tem 20% de chance de morrer ao fim do turno.

A pontuação do jogador para um pet é calculado após o último turno da seguinte forma:  
pontuação = idade*100 + limpeza*10 + felicidade*10 - fome*10  

O jogador pode revisar sua pontuação e status de algum dos pets instanciados
durante a execução a partir de uma busca por nome.