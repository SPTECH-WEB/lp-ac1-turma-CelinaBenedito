package school.sptech;

public class Turma {
private String nome;
private Double mensalidade;
private Integer qtdAluno;
private Boolean ativa;

    public Turma(String nome, Double mensalidade){
        this.nome = nome;
        this.mensalidade = mensalidade;
        this. qtdAluno = 0;
        this.ativa = true;
    }

    public void matricular(Integer qtd){
        if(ativa == true){
            if(qtd != null && qtd > 0){
                qtdAluno+=qtd;
            }
        }
    }

    public Integer cancelar(Integer qtd){
        if(ativa == true){
            if(qtd != null && qtd > 0 && qtd<=qtdAluno){
                qtdAluno-=qtd;
                return qtd; //validar caso n funcione troocar para qtdAluno
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }

    public Integer desativar(){
        if(ativa == true){
           Integer antigaQtdAluno = qtdAluno;
           ativa = false;
           qtdAluno = 0;
           return antigaQtdAluno;
        }
        else{
            return null;
        }
    }

    public void transferir(Turma destino, Integer qtdATransferir){
        if(destino != null && destino.ativa == true ){
            if(qtdATransferir != null && qtdATransferir > 0){
                if(qtdAluno>=qtdATransferir){
                    if(ativa == true){
                        qtdAluno-=qtdATransferir;
                        destino.qtdAluno+= qtdATransferir;
                    }

                }
            }
        }
    }

    public Boolean reajustarMensalidade(Double reajuste){
        if(reajuste != null && reajuste>0){
            mensalidade = mensalidade * (1+ reajuste);
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade(){
        return mensalidade;
    }

    public Integer getQtdAluno(){
        return qtdAluno;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
