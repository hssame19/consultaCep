import java.util.Scanner;

public class ConsultaCep {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        System.out.println("Digite um CEP válido (sem o traço)");
        System.out.println("Exemplos: 22220000, 01310200, etc");
        String cep = scanner.nextLine();
        System.out.println();

        service.consultarCep(cep);

    }
}