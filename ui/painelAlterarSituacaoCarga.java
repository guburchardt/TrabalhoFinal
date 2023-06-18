package ui;

import dados.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class painelAlterarSituacaoCarga extends JPanel
{
    private Aplicacao aplicacao;
    private Carga carga;

    private JTextField campoIdentificador;

    private JButton botaoAlterar;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;

    private JLabel mensagem;

    public painelAlterarSituacaoCarga(Aplicacao aplicacao, Carga carga)
    {
        super();

        this.aplicacao = aplicacao;
        this.carga = carga;

        GridLayout layout = new GridLayout(3,3);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite o identificador da carga");
        JLabel lIdentificador = new JLabel("Identificador");
        campoIdentificador = new JTextField(10);

        botaoAlterar = new JButton("Alterar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        this.add(pRotulo);

        JPanel pCodigo = new JPanel(new GridLayout(1,1));
        pCodigo.add(lIdentificador);
        pCodigo.add(campoIdentificador);
        this.add(pCodigo);

        JPanel pBotoes = new JPanel(new GridLayout(1, 4));
        pBotoes.add(botaoAlterar);
        pBotoes.add(botaoLimpar);
        pBotoes.add(botaoVoltar);
        pBotoes.add(botaoTerminar);
        this.add(pBotoes);
        

        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoIdentificador.setText("");
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
