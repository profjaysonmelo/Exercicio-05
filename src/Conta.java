
public class Conta {

	private String numAgencia;
	private String numConta;
	private double saldo;
	
	public Conta(String numAgencia, String numConta, double saldo) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String exibirDados() {
		return "Ag.: " + this.numAgencia + " / CC: " + this.numConta + " / R$ " + this.saldo;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(String numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}
