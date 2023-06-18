package ui;
import dados.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class painelCadastrarNavio extends JPanel
{
    private Navio navio;
    private Aplicacao aplicacao;
    private ColecaoNavios colecao;

    private JTextField campoNome;
    private JTextField campoVelocidade;
    private JTextField campoAutonomia;
    private JTextField campoCustoPorMilha;

    private JButton botaoCadastrar;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;

    private JLabel mensagem;

    public painelCadastrarNavio(Aplicacao aplicacao, Navio navio)
    {
        super();

        colecao = new ColecaoNavios();
        this.aplicacao = aplicacao;
        this.navio = navio;

        GridLayout layout = new GridLayout(4,4);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite os dados do navio");
        JLabel lNome = new JLabel("Nome");
        campoNome = new JTextField(10);
        JLabel lVelocidade = new JLabel("Velocidade");
        campoVelocidade = new JTextField(10);
        JLabel lAutonomia = new JLabel("Autonomia");
        campoAutonomia = new JTextField(10);
        JLabel lCustoPorMilha = new JLabel("Custo por milha");
        campoCustoPorMilha = new JTextField(10);
        botaoCadastrar = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        pRotulo.add(mensagem);
        this.add(pRotulo);

        JPanel pCodigo = new JPanel(new GridLayout(2,4));
        pCodigo.add(lNome);
        pCodigo.add(lVelocidade);
        pCodigo.add(lAutonomia);
        pCodigo.add(lCustoPorMilha);
        pCodigo.add(campoNome);
        pCodigo.add(campoVelocidade);
        pCodigo.add(campoAutonomia);
        pCodigo.add(campoCustoPorMilha);
        this.add(pCodigo);

        JPanel pBotoes = new JPanel(new GridLayout(1,4));
        pBotoes.add(botaoCadastrar);
        pBotoes.add(botaoLimpar);
        pBotoes.add(botaoVoltar);
        pBotoes.add(botaoTerminar);
        this.add(pBotoes);

         botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Esse TryCatch nao esta entrando!
                try
                {
                    Double.parseDouble(campoVelocidade.getText());
                    Double.parseDouble(campoAutonomia.getText());
                    Double.parseDouble(campoCustoPorMilha.getText());
                }
                catch(NumberFormatException ex)
                {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Os campos VELOCIDADE, AUTONOMIA E CUSTOS devem ser um números");
                    
                }
                catch(Exception ex)
                {
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Os campos VELOCIDADE, AUTONOMIA E CUSTOS devem ser um números");
                }

                if (campoNome.getText().equals("") || campoVelocidade.getText().equals("") || campoAutonomia.getText().equals("") || campoCustoPorMilha.getText().equals("")){
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Preencha todos os campos");
                    return;
                } 
                else if (colecao.consultaNavioBoolean(campoNome.getText()) == true){
                    mensagem.setForeground(Color.RED);
                    mensagem.setText("Navio já cadastrado");
                    return;
                } 
                else 
                {
                    try {
                        navio.setNome(campoNome.getText());
                        navio.setVelocidade(Double.parseDouble(campoVelocidade.getText()));
                        navio.setAutonomia(Double.parseDouble(campoAutonomia.getText()));
                        navio.setCustoPorMilhaBasico(Double.parseDouble(campoCustoPorMilha.getText()));
                        colecao.insereNavio(navio);
                        mensagem.setForeground(Color.GREEN);
                        mensagem.setText("Navio cadastrado com sucesso");
                    } 
                    catch (NullPointerException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Os campos VELOCIDADE, AUTONOMIA E CUSTOS devem ser um numeros");
                    } 
                    catch (ArrayIndexOutOfBoundsException ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar navio");
                    } 
                    catch (Exception ex) {
                        mensagem.setForeground(Color.RED);
                        mensagem.setText("Erro ao cadastrar navio");
                    }
                }
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoNome.setText("");
                campoVelocidade.setText("");
                campoAutonomia.setText("");
                campoCustoPorMilha.setText("");
                mensagem.setText("");
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
