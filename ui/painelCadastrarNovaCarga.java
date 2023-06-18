package ui;

import dados.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class painelCadastrarNovaCarga extends JPanel
{
    private Aplicacao aplicacao;
    private Carga carga;

    private JTextField campoIdentificador;
    private JTextField campoPeso;
    private JTextField campoValorDeclarado;
    private JTextField campoTempoMaximo;
    private JTextField campoDestino;
    private JTextField campoOrigem;
    private JTextField campoTipoCarga;

    private JButton botaoCadastrarPerecivel;
    private JButton botaoCadastrarDuravel;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;

    private JLabel mensagem;

    private JRadioButton Perecivel, Duravel;
    private JLabel PerecivelDuravel;
    private JLabel lIdTipo;
    private JTextField campoIdTipo;

    public painelCadastrarNovaCarga(Aplicacao aplicacao, Carga carga)
    {
        super();
        
        this.aplicacao = aplicacao;
        this.carga = carga;

        GridLayout layout = new GridLayout(3,3);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite os dados da carga");
        JLabel lIdentificador = new JLabel("Identificador");
        campoIdentificador = new JTextField(10);
        JLabel lPeso = new JLabel("Peso");
        campoPeso = new JTextField(10);
        JLabel lValorDeclarado = new JLabel("Valor Declarado");
        campoValorDeclarado = new JTextField(10);
        JLabel lTempoMaximo = new JLabel("Tempo Maximo");
        campoTempoMaximo = new JTextField(10);
        JLabel lDestino = new JLabel("Destino");
        campoDestino = new JTextField(10);
        JLabel lOrigem = new JLabel("Origem");
        campoOrigem = new JTextField(10);
        JLabel lTipoCarga = new JLabel("Tipo Carga");
        campoTipoCarga = new JTextField(10);

        Perecivel = new JRadioButton("Perecivel", null, false);
        Duravel = new JRadioButton("Duravel", null, false);
        PerecivelDuravel = new JLabel("Tipo de carga");

        botaoCadastrarPerecivel = new JButton("Cadastrar");
        botaoCadastrarDuravel = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        lIdTipo = new JLabel("IdTipo");
        campoIdTipo = new JTextField(10);

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        pRotulo.add(mensagem);
        this.add(pRotulo);

        JPanel pSelecao = new JPanel(new FlowLayout());
        pSelecao.add(PerecivelDuravel);
        pSelecao.add(Perecivel);
        pSelecao.add(Duravel);
        this.add(pSelecao);

        Perecivel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Perecivel.isSelected()) {
                    Duravel.setSelected(false);
                }
            }
        });

        Duravel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Duravel.isSelected()) {
                    Perecivel.setSelected(false);
                }
            }
        });

        Perecivel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Perecivel.isSelected()) {
                    // Remova os campos existentes antes de adicionar os novos
                    removeAll();

                    // Atualize o layout para acomodar os novos componentes
                    GridLayout layout = new GridLayout(3,3);
                    setLayout(layout);

                    
                    JPanel pRotulo = new JPanel();
                    pRotulo.add(rotulo);
                    pRotulo.add(mensagem);
                    pRotulo.add(PerecivelDuravel);
                    pRotulo.add (Perecivel);
                    pRotulo.add (Duravel);
                    add(pRotulo);


                    JPanel pCodigo = new JPanel(new GridLayout(2,7));
                    pCodigo.add(lIdentificador);
                    pCodigo.add(lPeso);
                    pCodigo.add(lValorDeclarado);
                    pCodigo.add(lTempoMaximo);
                    pCodigo.add(lDestino);
                    pCodigo.add(lOrigem);
                    pCodigo.add(lIdTipo);
                    pCodigo.add(campoIdentificador);
                    pCodigo.add(campoPeso);
                    pCodigo.add(campoValorDeclarado);
                    pCodigo.add(campoTempoMaximo);
                    pCodigo.add(campoDestino);
                    pCodigo.add(campoOrigem);
                    pCodigo.add(campoIdTipo);
                    add(pCodigo);

                    JPanel pBotoes = new JPanel(new GridLayout(1,4));
                    pBotoes.add(botaoCadastrarPerecivel);
                    pBotoes.add(botaoLimpar);
                    pBotoes.add(botaoVoltar);
                    pBotoes.add(botaoTerminar);
                    add(pBotoes);

                    revalidate();
                    repaint();
                }
            }
        });

        Duravel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Duravel.isSelected()) {
                    // Remova os campos existentes antes de adicionar os novos
                    removeAll();

                    // Atualize o layout para acomodar os novos componentes
                    GridLayout layout = new GridLayout(3,3);
                    setLayout(layout);

                    
                    JPanel pRotulo = new JPanel();
                    pRotulo.add(rotulo);
                    pRotulo.add(mensagem);
                    pRotulo.add(PerecivelDuravel);
                    pRotulo.add (Perecivel);
                    pRotulo.add (Duravel);
                    add(pRotulo);

                    JPanel pCodigo = new JPanel(new GridLayout(2,7));
                    pCodigo.add(lIdentificador);
                    pCodigo.add(lPeso);
                    pCodigo.add(lValorDeclarado);
                    pCodigo.add(lTempoMaximo);
                    pCodigo.add(lDestino);
                    pCodigo.add(lOrigem);
                    pCodigo.add(lIdTipo);
                    pCodigo.add(campoIdentificador);
                    pCodigo.add(campoPeso);
                    pCodigo.add(campoValorDeclarado);
                    pCodigo.add(campoTempoMaximo);
                    pCodigo.add(campoDestino);
                    pCodigo.add(campoOrigem);
                    pCodigo.add(campoIdTipo);
                    add(pCodigo);

                    JPanel pBotoes = new JPanel(new GridLayout(1,4));
                    pBotoes.add(botaoCadastrarDuravel);
                    pBotoes.add(botaoLimpar);
                    pBotoes.add(botaoVoltar);
                    pBotoes.add(botaoTerminar);
                    add(pBotoes);

                    revalidate();
                    repaint();
                }
            }
        });

        botaoCadastrarPerecivel.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
           } 
        });

        botaoCadastrarDuravel.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            
           } 
        });


        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoIdentificador.setText("");
                campoPeso.setText("");
                campoValorDeclarado.setText("");
                campoTempoMaximo.setText("");
                campoDestino.setText("");
                campoOrigem.setText("");
                campoTipoCarga.setText("");
                mensagem.setText("");
            }
        });
        
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(1);
            }
        });
        
        botaoTerminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        


    }
}
    

