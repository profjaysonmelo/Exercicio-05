import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Conta c1 = new Conta("111-0","728-0",10000.00);
		
		System.out.println(c1.exibirDados());
		
		c1.setSaldo(9000.00);
		
		System.out.println(c1.exibirDados());
		
		Cliente cli1 = new Cliente("FILOMENO", "001.258.369-99");
		
		System.out.println(cli1.exibirDados());
		
		System.out.println("Endereço: "  + cli1.getEndereco());
		
		cli1.setEndereco("SC 401 - 3400");
		
		System.out.println("Endereço: "  + cli1.getEndereco());
		

	}

}
