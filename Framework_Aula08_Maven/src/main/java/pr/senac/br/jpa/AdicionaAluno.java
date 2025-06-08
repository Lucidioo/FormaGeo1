package pr.senac.br.jpa;

//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//import pr.senac.br.modelo.Aluno;

//public class AdicionaAluno {
//
//    public static void main(String[] args) {
//        Aluno aluno = new Aluno(
//                "Maria Clara Almeida",
//                "02850338962",
//                "63675658",
//                "maria@gmail.com",
//                2000
//        );
//
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("");
//        EntityManager manager = factory.createEntityManager();
//
//        manager.getTransaction().begin();
//        manager.persist(aluno);
//        manager.getTransaction().commit();
//        System.out.println("ID do aluno: " + aluno.getMatricula());
//
//        manager.close();
//        factory.close();
//    }
//}
//
