package ui;
import dados.Cliente;
import dados.ColecaoClientes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import dados.*;

public class painelCadastrarCliente extends JPanel {
    private Cliente cliente;
    private Aplicacao aplicacao;
    private ColecaoClientes colecao;

    private JTextField campoCodigo;
    private JTextField campoNome;
    private JTextField campoEmail;
    private JButton botaoCadastrar;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;
    private JLabel mensagem;

    public painelCadastrarCliente(Aplicacao aplicacao, Cliente cliente)
    {
        
        super();
        
        colecao = new ColecaoClientes();
        this.cliente = cliente;
        this.aplicacao = aplicacao;
        
        
        

        GridLayout layout = new GridLayout(3,3);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite os dados do cliente");
        JLabel lCodigo = new JLabel("Codigo");
        campoCodigo = new JTextField(10);
        JLabel lNome = new JLabel("Nome");
        campoNome = new JTextField(10);
        JLabel lEmail = new JLabel("Email");
        campoEmail = new JTextField(10);
        botaoCadastrar = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        pRotulo.add(mensagem);
        this.add(pRotulo);

        JPanel pCodigo = new JPanel(new GridLayout(2,3));
        pCodigo.add(lCodigo);
        pCodigo.add(lNome);
        pCodigo.add(lEmail);
        pCodigo.add(campoCodigo);
        pCodigo.add(campoNome);
        pCodigo.add(campoEmail);
        this.add(pCodigo);

        JPanel pBotoes = new JPanel(new GridLayout(1, 4));
        pBotoes.add(botaoCadastrar);
        pBotoes.add(botaoLimpar);
        pBotoes.add(botaoVoltar);
        pBotoes.add(botaoTerminar);
        this.add(pBotoes);

    

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int codigo = Integer.parseInt(campoCodigo.getText());
                }
                catch(NumberFormatException ex){
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("O código deve ser um número inteiro");
                    return;
                }
                if (campoCodigo.getText().equals("") || campoNome.getText().equals("") || campoEmail.getText().equals("")) {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Preencha todos os campos");
                    return;
                } else if (colecao.consultaClienteBoolean(Integer.parseInt(campoCodigo.getText()), campoEmail.getText()) == true) {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Cliente já cadastrado");
                    return;
                } else {
                    try {
                        int codigo = Integer.parseInt(campoCodigo.getText());
                        cliente.setCod(codigo);
                        cliente.setNome(campoNome.getText());
                        cliente.setEmail(campoEmail.getText());
                        colecao.insereCliente(cliente);
                        mensagem.setForeground(Color.GREEN);
                        mensagem.setText("Cliente cadastrado com sucesso");
                    } catch (NumberFormatException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("O código deve ser um número inteiro");
                    } catch (NullPointerException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar cliente");
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar cliente");
                    } catch (Exception ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar cliente");
                    }
                }
            }
        });
        

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoCodigo.setText("");
                campoNome.setText("");
                campoEmail.setText("");
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(1);
            }
        });

        botaoTerminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        
    }
}

    /* 
    public void atualiza(){
        campoCodigo.setText(cliente.getCod());
        campoNome.setText(cliente.getNome());
        campoEmail.setText(cliente.getEmail());
    }
    */

