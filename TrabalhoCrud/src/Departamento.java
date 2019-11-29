
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wesley
 */
public class Departamento {
    private int Codigo;
    private String Nome;
    ArrayList<Funcionario> ListaFun;
    
    public Departamento(){
        ListaFun = new ArrayList();
    }

    public Departamento(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        ListaFun = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListaFun() {
        return ListaFun;
    }

    public void setListaFun(ArrayList<Funcionario> ListaFun) {
        this.ListaFun = ListaFun;
    }
    public void addFunc(Funcionario F){
        F.setDep(this);
        ListaFun.add(F);
    }
}
