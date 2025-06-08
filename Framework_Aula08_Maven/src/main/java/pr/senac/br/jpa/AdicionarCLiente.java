package pr.senac.br.jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import RelacionamentoUni.Cliente;
import RelacionamentoUni.Conta;

public class AdicionarCLiente {

	public static void main(String[] args) {
     
        Conta conta = new Conta();
        conta.setSaldo(1500.0); 

        
        Cliente cliente = new Cliente(
                "02850338962",         // CPF (String)
                2000,                  // Ano de nascimento (int)
                "Maria Clara Almeida", // Nome (String)
                "maria@gmail.com",     // Email (String)
                conta                  // Conta (Conta)
        );


        // Configuração do EntityManager
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
        EntityManager manager = factory.createEntityManager();

        // Persistindo os dados
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
        System.out.println("CPF do cliente: " + cliente.getCpf());

        // Encerrando o EntityManager e o EntityManagerFactory
        manager.close();
        factory.close();
    }
}