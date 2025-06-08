//package pr.senac.br.modelo;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import ProvaJPA.Turma;
//
//@Entity
//@Table(name = "aluno")
//public class Aluno {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "matricula")
//    private Long matricula;
//
//
//    @Column(name = "cpf", nullable = false, length = 11, unique = true)
//    private String cpf;
//
//
//    @Column(name = "nome", nullable = false, length = 60)
//    private String nome;
//
//    @Column(name = "email", nullable = false, length = 100)
//    private String email;
//
//
//    @Column(name = "sexo", nullable = false, length = 1)
//    private String sexo;
//
//    @ManyToOne(optional = false)
//    @JoinColumn(name = "turma_codigo", nullable = false)
//    private Turma turma;
//
// 
//    public Long getMatricula() {
//        return matricula;
//    }
//
//    @Override
//	public String toString() {
//		return "Aluno [matricula=" + matricula + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", sexo="
//				+ sexo + ", turma=" + turma + "]";
//	}
//
//	
//
//    public String getCpf() {
//        return cpf;
//    }
//
//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getSexo() {
//        return sexo;
//    }
//
//    public void setSexo(String sexo) {
//        this.sexo = sexo;
//    }
//
//    public Turma getTurma() {
//        return turma;
//    }
//
//    public void setTurma(Turma turma) {
//        this.turma = turma;
//    }
//}