package aplicacao;

import entidade.Pessoa;
import repositorio.Teste;

public class mainteste {
    public static void main(String[] args) {
        Teste repositorioTeste = new Teste();
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();


        p1.setCpf(Integer.parseInt("7020"));
        p1.setNome("julio lima");
        p1.setRg(Integer.parseInt("1004"));
        p1.setTelefone(Integer.parseInt("8198"));
        p1.setEmail("DevJulioLima@gmail.com");

        p2.setCpf(Integer.parseInt("7025"));
        p2.setNome("Adrian ryan");
        p2.setRg(Integer.parseInt("1005"));
        p2.setTelefone(Integer.parseInt("8199"));
        p2.setEmail("Adryanrian@gmail.com");

        p3.setCpf(Integer.parseInt("7022"));
        p3.setNome("Paulo andre");
        p3.setRg(Integer.parseInt("1006"));
        p3.setTelefone(Integer.parseInt("8190"));
        p3.setEmail("Pauloandre@gmail.com");

        repositorioTeste.cadastrarPessoa(p1);
        repositorioTeste.cadastrarPessoa(p2);
        repositorioTeste.cadastrarPessoa(p3);

    }

    }

