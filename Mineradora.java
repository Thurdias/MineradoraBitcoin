import java.math.BigInteger;
import java.security.MessageDigest;

public class Mineradora extends Thread{
	// Constantes da classe
	private static final String ZEROS = "000000000";
	// Propriedades da classe
	private String inicio = "";
	private String fim = "";
	// Método construtor da classe
	public Mineradora(String inicio, String fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}
	
	// Métodos da classe
	private String calcularHash(String texto) throws Exception{
		String retorno = "";
		
		MessageDigest hash = MessageDigest.getInstance("SHA-256");
		hash.reset();
		hash.update(texto.getBytes("UTF-8"));
		byte[] resultado = hash.digest();
		
		for(int i = 0; i < resultado.length; i++) {
			String temp = Integer.toHexString(0xFF & resultado[i]);
			
			retorno += ((temp.length() == 2 ? "" : "0") + temp);
		}
		return retorno;
	}
	
	// Método de execução paralela da classe
	public void run() {
		try {
		BigInteger numeroInicial = new BigInteger(inicio);
		BigInteger numeroFinal = new BigInteger(fim);
		
		for(BigInteger i = numeroInicial; i.compareTo(numeroFinal) < 0; i = i.add(BigInteger.ONE)) {
			if (calcularHash(calcularHash(i.toString())).startsWith(ZEROS)) {
				System.out.println("ACHEI !!!! ESTAMOS BILIONÁRIOS !!!!");
				System.out.println(i);
				System.exit(0);
			}
		}
		} catch (Exception erro) {System.out.println(erro);}
	}	
}
