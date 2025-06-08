package RelacionamentoUni;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class AdicionaCliente {

	public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RelacionamentoUniPU");
        EntityManager em = emf.createEntityManager();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("digite o cpf:");
            String cpf = scanner.nextLine();

            System.out.println("digite o nome:");
            String nome = scanner.nextLine();

            System.out.println("digite o email:");
            String email = scanner.nextLine();

            System.out.println("digite o ano de nascimento:");
            int anoNascimento = scanner.nextInt();

            System.out.println("digite o saldo da conta:");
            double saldo = scanner.nextDouble();
            scanner.nextLine(); 

            Conta conta = new Conta();
            conta.setSaldo(saldo);

            Cliente cliente = new Cliente(cpf, anoNascimento, nome, email, conta);

            try {
                em.getTransaction().begin();
                em.persist(conta);
                em.persist(cliente);
                em.getTransaction().commit();
                System.out.println("cliente adicionado com sucesso");
            } catch (Exception e) {
                em.getTransaction().rollback();
                System.out.println("Erro ao adicionar cliente: " + e.getMessage());
            }

            System.out.println("deseja cadastrar outro cliente? (s/n)");
            String resposta = scanner.nextLine();
            continuar = resposta.equalsIgnoreCase("s");
        }

     
        System.out.println("digite cpf do cliente:");
        String cpfBusca = scanner.nextLine();

        try {
            Cliente clienteEncontrado = em.find(Cliente.class, cpfBusca);

            if (clienteEncontrado != null) {
                System.out.println("cliente encontrado: " + clienteEncontrado);
            } else {
                System.out.println("cliente com cpf " + cpfBusca + " n encontrado.");
            }
        } catch (Exception e) {
            System.out.println("rrro ao buscar cliente: " + e.getMessage());
        } finally {
            em.close();
            emf.close();
            scanner.close();
        }
    }
}