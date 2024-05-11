# Projeto A3 – Fila de prioridade para Hospital  <br> Estrutura de Dados e Análise de Algoritmos

O projeto utiliza a linguagem Java para criar uma fila de pacientes com prioridades definidas através de alguns parâmetros analisados. Para atingir esse objetivo foi utilizado a estrutura de dados Fila que são úteis para realizar ordenação de dados, e para implementar filas de prioridade eficientes. Uma das aplicações de filas de prioridade é a alocação de recursos, como no gerenciamento de memória e tempo de processamento realizado pelo sistema operacional.

## Definição das Prioridades:
Em uma unidade médica de urgência e emergência hospitalar, cada paciente a ser atendido recebe uma classificação de risco para definir a prioridade do atendimento. Para definirmos as prioridades, utilizamos as cores vermelho (0), laranja (1), amarelo (2), verde (3), e azul (4), cada qual com os seguintes significados: 
• Vermelho: quadro clínico implica em risco de morte, e que o caso deve ser rapidamente encaminhado para a sala de emergência. 
• Laranja e amarelo: o paciente não tem risco iminente de morte, mas o atendimento é prioritário, pois o tempo de espera pode aumentar a gravidade do caso. 
• Verde: não há risco de morte e o paciente deverá ser atendido após os casos vermelhos, laranjas e amarelos. 
• Azul: quadros crônicos, sem sofrimento agudo. 
<p align="center">
    Os parâmetros para que seja encontrada  a prioridade do paciente é definido pelo esquema a seguir:<br><br>
<img src= "https://github.com/Andrey-de-Freitas-Souza/Projeto-EDAA/blob/main/FilaDeEspera/src/main/resources/Imagens/Diagrama.png?raw=true">
</p>
## Tela inicial:
Na tela inicial do projeto, o usuário pode chamar o próximo da fila, através do botão “Chamar”, acessar a tela de triagem através do botão “Triagem” e por fim acessar essa documentação através do botão “Documentação”. Pela tela inicial, também é possível visualizar a ordenação da fila e os registros dos últimos pacientes chamados.
<p align="center">
<img src= "https://github.com/Andrey-de-Freitas-Souza/Projeto-EDAA/blob/main/FilaDeEspera/src/main/resources/Imagens/TelaInicialGitHub.png?raw=true">
</p>
## Tela Triagem: 
Na tela de Triagem, o usuário pode realizar o cadastro de um novo paciente, para isso ele deve preencher os dados do paciente e os sintomas que ele possui, assim após o usuário apertar o botão registrar, o sistema irá calcular a idade do paciente e analisar os demais fatores necessários para definir a prioridade, e então após retornar a tela inicial, já conseguirá visualizar em que lugar o paciente está na fila. <br><br>
<p align="center">
<img src= "https://github.com/Andrey-de-Freitas-Souza/Projeto-EDAA/blob/main/FilaDeEspera/src/main/resources/Imagens/TelaTriagemGitHub.png?raw=true">
</p>


## Grupo

- Rafael Rossetto Guitarrari (RA: 823158602)
- Andrey de Freitas Souza (RA: 823217536)
- <a href="https://www.linkedin.com/in/andrey-de-freitas-souza-91206b26a/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
<a href = "mailto:andreyfrsouza@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>   
- Gabriel Farah De Lima (RA: 822231424)
- Fabrício de Barros Narbon (RA: 822227166)
- Bianca Alves Ribeiro (RA: 8222240261)
- Luiz Gustavo França de Abreu (RA: 823210075)
- Gabrielle Garcia Paz (RA: 823126085)
- Webster Diógenes Rodrigues (RA: 8222242764)

## Contato

Para qualquer dúvida ou sugestão relacionada a este projeto, entre em contato com algum dos membros do grupo listados acima.
