import java.util.List;

public class Estagiarios extends Funcionarios{
  private Double bolsa;
  private List<String> profVinculo;

  public Estagiarios(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
    super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
  }

  public Estagiarios(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario,
                     Double bolsa, List<String> profVinculo) {
    super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    this.bolsa = bolsa;
    this.profVinculo = profVinculo;
  }

  public Double getBolsa() {
    return bolsa;
  }

  public void setBolsa(Double bolsa) {
    this.bolsa = bolsa;
  }

  public List<String> getProfVinculo() {
    return profVinculo;
  }

  public void setProfVinculo(List<String> profVinculo) {
    this.profVinculo = profVinculo;
  }

  @Override
  public double aumentoSalario() {
    return 0;
  }

  public void professorVinculo(List<String> profVinculo, String nome, String cpf, Integer numeroRegistro,
               String orgaoLotacao, Double salario,
               String nivelGraduacao, String disciplina, Integer qtdAlunos, Integer qtdTurmas) {
    Professores professorResponsavel = new Professores(nome, cpf, numeroRegistro, orgaoLotacao, salario,
        nivelGraduacao, disciplina, qtdAlunos, qtdTurmas);

    if (profVinculo.size() <= 1) {
      profVinculo.add(String.valueOf(professorResponsavel));
      System.out.println("Professor responsável: " + professorResponsavel);
    } else {
      System.out.println("Você já está vinculado a 1 professor!!!");
    }

  }
}
