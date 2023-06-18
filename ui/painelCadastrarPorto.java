package ui;
import dados.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class painelCadastrarPorto extends JPanel
{
    private Aplicacao aplicacao;
    private Porto porto;
    private ColecaoPortos colecao;

    private JTextField campoId;
    private JTextField campoNome;
    private JTextField campoPais;
    private JButton botaoCadastrar;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;
    private JLabel mensagem;

    public painelCadastrarPorto(Aplicacao aplicacao, Porto porto)
    {
        super();
        
        colecao = new ColecaoPortos();
        this.aplicacao = aplicacao;
        this.porto = porto;

        GridLayout layout = new GridLayout(3,3);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite os dados do porto");
        JLabel lId = new JLabel("Id");
        campoId = new JTextField(10);
        JLabel lNome = new JLabel("Nome");
        campoNome = new JTextField(10);
        JLabel lPais = new JLabel("Pais");
        campoPais = new JTextField(10);
        botaoCadastrar = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        pRotulo.add(mensagem);
        this.add(pRotulo);

        JPanel pId = new JPanel(new GridLayout(2,3));
        pId.add(lId);
        pId.add(lNome);
        pId.add(lPais);
        pId.add(campoId);
        pId.add(campoNome);
        pId.add(campoPais);
        this.add(pId);

        JPanel pBotoes = new JPanel(new GridLayout(1,4));
        pBotoes.add(botaoCadastrar);
        pBotoes.add(botaoLimpar);
        pBotoes.add(botaoVoltar);
        pBotoes.add(botaoTerminar);
        this.add(pBotoes);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Integer.parseInt(campoId.getText());
                }
                catch(NumberFormatException ex){
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("O Identificador deve ser um número inteiro");
                    return;
                }
                if (campoId.getText().equals("") || campoNome.getText().equals("") || campoPais.getText().equals("")) {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Preencha todos os campos");
                    return;
                } else if (colecao.consultaPortoBoolean(Integer.parseInt(campoId.getText()))==true) {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Porto já cadastrado");
                    return;
                } else {
                    try {
                        int codigo = Integer.parseInt(campoId.getText());
                        porto.setId(codigo);
                        porto.setNome(campoNome.getText());
                        porto.setPais(campoPais.getText());
                        colecao.inserePorto(porto);
                        mensagem.setForeground(Color.GREEN);
                        mensagem.setText("Porto cadastrado com sucesso");
                    } catch (NumberFormatException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("O código deve ser um número inteiro");
                    } catch (NullPointerException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar porto");
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar porto");
                    } catch (Exception ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar porto");
                    }
                }
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoId.setText("");
                campoNome.setText("");
                campoPais.setText("");
                mensagem.setText("");
            }
        });

        botaoTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(1);
            }
        });
    }
}
