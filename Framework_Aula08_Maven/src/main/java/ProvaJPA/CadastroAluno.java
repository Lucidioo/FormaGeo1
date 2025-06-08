package ProvaJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CadastroAluno {

	    public static void main(String[] args) {
	   
	        EntityManagerFactory alun = Persistence.createEntityManagerFactory("cadastro_aluno");
	        EntityManager alno = alun.createEntityManager();

	        try {
	         
	        	alno.getTransaction().begin();
 
	            Turma turma = new Turma();
	            turma.setDescricao("turma de java");
	            turma.setTurno("noite");
          
	            alno.persist(turma);
	     
	            Aluno aluno1 = new Aluno();
	            aluno1.setCpf("12345678901");
	            aluno1.setNome("joao da slva");
	            aluno1.setEmail("joao.silva@example.com");
	            aluno1.setSexo("M");
	            aluno1.setTurma(turma);

	            Aluno aluno2 = new Aluno();
	            aluno2.setCpf("09876543210");
	            aluno2.setNome("maria oliveira");
	            aluno2.setEmail("maria.oliveira@example.com");
	            aluno2.setSexo("F");
	            aluno2.setTurma(turma);
           
	            alno.persist(aluno1);
	            alno.persist(aluno2);
	           
	            alno.getTransaction().commit();

	            System.out.println("aluno cadastrado");
	        } catch (Exception e) {
	        	alno.getTransaction().rollback();
	            e.printStackTrace();
	        } finally {
	        	alno.close();
	        	alno.close();
	        }
	    }
	}