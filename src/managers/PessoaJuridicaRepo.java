package managers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import login.PessoaJuridica;

public class PessoaJuridicaRepo extends PessoaJuridica {

    private final ArrayList<PessoaJuridica> pessoaFisicas = new ArrayList<>();

    public void inserir(PessoaJuridica pessoaFisca) {
        this.pessoaFisicas.add(pessoaFisca);
    }

    public void alterar(PessoaJuridica pessoaFisca) {
        this.pessoaFisicas.set(this.pessoaFisicas.indexOf(pessoaFisca), pessoaFisca);
    }

    public void excluir(int ind) {
        this.pessoaFisicas.remove(ind);
    }

    public PessoaJuridica obter(int ind) {
        return this.pessoaFisicas.get(ind);
    }

    public ArrayList<PessoaJuridica> obterTodos() {
        return this.pessoaFisicas;
    }

    public void persistir(String nomeArquivo) throws Exception {
        try {
            File arquivo = new File(nomeArquivo);
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(arquivo));
            oos.writeObject(pessoaFisicas);
            oos.close();
        } catch (IOException e) {
        }
    }
}
