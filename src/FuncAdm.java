public class FuncAdm extends Funcionarios{
  String funcaoAdministrativa;
  String senioridade;

  public FuncAdm(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
    super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    this.funcaoAdministrativa = funcaoAdministrativa;
    this.senioridade = senioridade;
  }

  public String getFuncaoAdministrativa() {
    return funcaoAdministrativa;
  }

  public void setFuncaoAdministrativa(String funcaoAdministrativa) {
    this.funcaoAdministrativa = funcaoAdministrativa;
  }

  public String getSenioridade() {
    return senioridade;
  }

  public void setSenioridade(String senioridade) {
    this.senioridade = senioridade;
  }

  @Override
  public double aumentoSalario() {
    return this.getSalario() * 0.10;
  }


}
