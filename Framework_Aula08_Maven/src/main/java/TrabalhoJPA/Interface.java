package TrabalhoJPA;

import java.util.ArrayList;
import java.util.Scanner;
import pr.senac.br.modelo.Tarefa;

public class Interface {

	Scanner entrada = new Scanner(System.in);

	public int menuPrincipal() {
		int op;
		Scanner entrada = new Scanner(System.in);

		System.out.println("------------------------------------");
		System.out.println("----------   MENU   ----------------");
		System.out.println("------------------------------------");
		System.out.println("1 - Incluir Tarefa ");
		System.out.println("2 - Consultar Tarefa por Codigo ");
		System.out.println("3 - Listar Tarefas ");
		System.out.println("4 - Excluir Tarefa ");
		System.out.println("5 - Concluir Tarefa ");

		System.out.println("10 - SAIR ");

		op = entrada.nextInt();

		while ((op > 5 && op != 10)   || op <= 0) {

			System.out.println("------------------------------------");
			System.out.println("----------   MENU   ----------------");
			System.out.println("------------------------------------");
			System.out.println("1 - Incluir Tarefa ");
			System.out.println("2 - Consultar Tarefa por Codigo  ");
			System.out.println("3 - Listar Tarefas ");
			System.out.println("4 - Excluir Tarefa ");
			System.out.println("5 - Concluir Tarefa ");

			System.out.println("10 - SAIR ");
			op = entrada.nextInt();

		}
		return op;
	}

	public Long lerCodigoTarefa() {
        Long codigo;
        do {
            System.out.print("Informe o cod da tarefa: ");
            codigo = entrada.nextLong();
        } while (codigo <= 0);
        return codigo;
    }

    public String lerDescricaoTarefa() {
        String descricao;
        entrada.nextLine();
        do {
            System.out.print("Informe a descricao da tarefa: ");
            descricao = entrada.nextLine();
        } while (descricao.length() < 5);
        return descricao;
    }

    public void mostraTarefa(Tarefa tarefa) {
        if (tarefa != null) {
            System.out.println(tarefa.toString());
        } else {
            System.out.println("Nao achei a tarefa!");
        }
    }

    public void listarTarefas(ArrayList<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa.toString());
            }
        }
    }

    public void mostraMensagem(String msg) {
        System.out.println("-------------");
        System.out.println(msg);
        System.out.println("-------------");
    }

    public Tarefa novaTarefa() {
        String descricao = lerDescricaoTarefa();
        return new Tarefa(descricao, false, null);
    }
}
