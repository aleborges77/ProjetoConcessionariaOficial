package model;

import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

// Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public static Cliente cadastrarCliente() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome do cliente:", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(null, "Informe o CPF do cliente:", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
        String endereco = JOptionPane.showInputDialog(null, "Informe o endereço do cliente:", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);

        return new Cliente(nome, cpf, endereco);
    }
}

