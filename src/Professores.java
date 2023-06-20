public class Professores extends Funcionarios{
  private String nivelGraduacao;
  private String disciplina;
  private Integer qtdAlunos;
  private Integer qtdTurmas;



  public Professores(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario,
                     String nivelGraduacao, String disciplina, Integer qtdAlunos, Integer qtdTurmas) {
    super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    this.nivelGraduacao = nivelGraduacao;
    this.disciplina = disciplina;
    this.qtdAlunos = qtdAlunos;
    this.qtdTurmas = qtdTurmas;
  }

  public String getNivelGraduacao() {
    return nivelGraduacao;
  }

  public void setNivelGraduacao(String nivelGraduacao) {
    this.nivelGraduacao = nivelGraduacao;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public Integer getQtdAlunos() {
    return qtdAlunos;
  }

  public void setQtdAlunos(Integer qtdAlunos) {
    this.qtdAlunos = qtdAlunos;
  }

  public Integer getQtdTurmas() {
    return qtdTurmas;
  }

  public void setQtdTurmas(Integer qtdTurmas) {
    this.qtdTurmas = qtdTurmas;
  }

  @Override
  public double aumentoSalario() {
    double salario;
    salario = getSalario() + (getSalario() * 0.10);
    this.setSalario(salario);
    return salario;
  }

  public Integer adicionaTurma() {
    return this.qtdTurmas++;
  }
}
