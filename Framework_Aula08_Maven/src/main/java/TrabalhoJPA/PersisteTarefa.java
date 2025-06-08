package TrabalhoJPA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import pr.senac.br.modelo.Tarefa;

/**
 * Classe que controla as Tarefas: permite cadastrar, alterar, excluir.
 * Faz o acesso ao banco de dados. 
 */

public class PersisteTarefa {

	private EntityManager manager;

	
	public PersisteTarefa() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		manager = factory.createEntityManager();
	}

	

    public ArrayList<Tarefa> listarTodos() {
        return null;
    }

  
    public boolean cadastrarTarefa(Tarefa tarefa) {
        try {
            manager.getTransaction().begin(); 
            manager.persist(tarefa); 
            manager.getTransaction().commit(); 
            return true; 
        } catch (Exception e) {
            manager.getTransaction().rollback();
            e.printStackTrace();
            return false; 
        }
    }

    public Tarefa buscarTarefaCodigo(Long codigo) {
        try {
            return manager.find(Tarefa.class, codigo); 
        } catch (Exception e) {
            e.printStackTrace();
            return null; 
        }
    }

    public boolean excluirTarefa(Long codigo) {
        try {
            Tarefa tarefa = buscarTarefaCodigo(codigo); 
            if (tarefa != null) { 
                manager.getTransaction().begin(); 
                manager.remove(tarefa); 
                manager.getTransaction().commit(); 
                return true; 
            }
            return false; 
        } catch (Exception e) {
            manager.getTransaction().rollback(); 
            e.printStackTrace();
            return false; 
        }
    }

  
    public boolean concluirTarefa(Long codigo) {
        try {
            Tarefa tarefa = buscarTarefaCodigo(codigo); 
            if (tarefa != null) { 
                manager.getTransaction().begin(); 
                tarefa.setFinalizado(true); 
                tarefa.setDataConclusao(LocalDate.now()); 
                manager.merge(tarefa); 
                manager.getTransaction().commit(); 
                return true; 
            }
            return false; 
        } catch (Exception e) {
            manager.getTransaction().rollback(); 
            e.printStackTrace();
            return false; 
        }
    }
}