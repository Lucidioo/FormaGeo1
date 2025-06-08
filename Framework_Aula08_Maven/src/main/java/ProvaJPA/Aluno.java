package ProvaJPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Aluno {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "matricula", nullable = false, unique = true)
	    private int matricula;
	    
	    @Column(name = "cpf", nullable = false, length = 11, unique = true)
	    private String cpf;

	    @Column(name = "nome", nullable = false, length = 100)
	    private String nome;

	    @Column(name = "email", length = 100)
	    private String email;

	    @Column(name = "sexo", nullable = false)
	    private int sexo;
	   
	    public int getMatricula() {
	        return matricula;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        if (nome == null || nome.length() > 100) {
	            throw new IllegalArgumentException("nome nao pode ser nulo, e deve ter max 100 caracteres.");
	        }
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        if (cpf == null || cpf.length() != 11) {
	            throw new IllegalArgumentException("CPF deve ter 11 caracteres e n pode ser nulo.");
	        }
	        this.cpf = cpf;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        if (email != null && email.length() > 100) {
	            throw new IllegalArgumentException("email deve ter no max 100 caracteres.");
	        }
	        this.email = email;
	    }

		public void setSexo(String string) {
			// TODO Auto-generated method stub
			
		}

		public void setTurma(Turma turma) {
			// TODO Auto-generated method stub
			
		}

	
	}
	
	