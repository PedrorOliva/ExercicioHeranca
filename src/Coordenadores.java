import java.util.List;

public class Coordenadores extends Funcionarios{
  List<String> profSupervisao;

  public Coordenadores(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
    super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    this.profSupervisao = profSupervisao;
  }

  public List<String> getProfSupervisao() {
    return profSupervisao;
  }

  public void setProfSupervisao(List<String> profSupervisao) {
    this.profSupervisao = profSupervisao;
  }

  @Override
  public double aumentoSalario() {
    double salario;
    salario = getSalario() + (getSalario() * 0.5);
    this.setSalario(salario);
    return salario;
  }

  public void adicionaProfessor(List<String> profSupervisao, String nome, String cpf, Integer numeroRegistro,
                                String orgaoLotacao, Double salario,
                                String nivelGraduacao, String disciplina, Integer qtdAlunos, Integer qtdTurmas) {
    Professores novoProfessor = new Professores(nome,cpf, numeroRegistro, orgaoLotacao, salario,
        nivelGraduacao, disciplina, qtdAlunos, qtdTurmas );

    if(profSupervisao.size() <= 10) {
      profSupervisao.add(String.valueOf(novoProfessor));
      System.out.println("Novo professor cadastrado!!");
    } else {
      System.out.println("Você não pode ter mais do que 10 professores!!!");
    }
  }
}
