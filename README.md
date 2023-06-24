# Algoritmo de Mineração de Bitcoin
## Descrição do código
### A classe "Mineradora" contém os seguintes elementos:

### - private static final String ZEROS = "000000000"; - Uma constante que define o padrão de zeros que o hash do número encontrado deve iniciar.

### - private String inicio = ""; - Uma propriedade que armazena a string que representa o início do intervalo de números a serem testados durante a mineração.

### - private String fim = ""; - Uma propriedade que armazena a string que representa o fim do intervalo de números.

### - public Mineradora(String inicio, String fim) - O construtor da classe, que recebe as strings inicio e fim para definir o intervalo de números a serem testados.

### - private String calcularHash(String texto) throws Exception - Um método privado que recebe uma string texto como entrada e retorna o hash SHA-256 correspondente. Ele utiliza a classe MessageDigest para calcular o hash e retorna o resultado como uma string.

### - public void run() - O método run sobrescrito da classe Thread, que é chamado quando a thread é iniciada. Esse método realiza a mineração no intervalo de números definido e imprime uma mensagem caso um número que atenda ao padrão de zeros seja encontrado.
