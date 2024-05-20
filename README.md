# Desafio Controle de Fluxo 
* Para esse desafio, utilizei o NetBeans, que criou a estrutura do programa em um pacote.
* Dentro do pacote, criei 3 classes
* Classe Contador: Possui dois parâmetros que são números inteiros que serão subtraidos no método Contar para estabelecer a quantidade de contagens que serão feitas.
* Classe DesafioControleDeFluxo: É a classe principal que vai receber dois números via terminal, criar um objeto do tipo Contador e executar o método contar.
* Classe ParametrosInvalidosExceptions: É classe que define uma Exception usada no método contar da classe Contador
## Funcionamento 
* O programa lerá dois números inteiros, criar uma classe contador usando um método construtor e executará o método Contar.
* Caso o primeiro número informado seja maior do que o segundo, uma exceção é lançada
* Caso contrário o programa fará uma contagem de números inteiros a partir do 0 até n, em que n é a subtração do segundo número informado pelo primeiro número informado. 
