package ui;

import dados.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;

import javax.swing.*;

public class painelCadastrarTipoCarga extends JPanel
{
    private Aplicacao aplicacao;
    private TipoCarga tipoCarga;
    private CargaDuravel cargaDuravel;
    private CargaPerecivel cargaPerecivel;

    private JTextField campoNumero;
    private JTextField campoDescricao;
    


    private JButton botaoCadastrarPerecivel;
    private JButton botaoCadastrarDuravel;
    private JButton botaoLimpar;
    private JButton botaoVoltar;
    private JButton botaoTerminar;

    private JRadioButton Perecivel, Duravel;
    private JLabel PerecivelDuravel;

    private JLabel lOrigem;
    private JLabel lValidade;
    private JTextField campoOrigem;
    private JTextField campoValidade;

    private JLabel lSetor;
    private JLabel lMaterialPrincipal;
    private JLabel lIPI;
    private JTextField campoSetor;
    private JTextField campoMaterial;
    private JTextField campoIPI;


    private JLabel mensagem;

    public painelCadastrarTipoCarga(Aplicacao aplicacao, TipoCarga tipoCarga, CargaDuravel cargaDuravel, CargaPerecivel cargaPerecivel)
    {
        super();

        this.aplicacao = aplicacao;
        this.tipoCarga = tipoCarga;
        this.cargaDuravel = cargaDuravel;
        this.cargaPerecivel = cargaPerecivel;


        GridLayout layout = new GridLayout(3,3);
        this.setLayout(layout);

        JLabel rotulo = new JLabel("Digite os dados do tipo de carga");
        JLabel lNumero = new JLabel("Numero");
        campoNumero = new JTextField(10);
        JLabel lDescricao = new JLabel("Descricao");
        campoDescricao = new JTextField(10);
        botaoCadastrarPerecivel = new JButton("Cadastrar");
        botaoCadastrarDuravel = new JButton("Cadastrar");
        botaoLimpar = new JButton("Limpar");
        botaoVoltar = new JButton("Voltar");
        botaoTerminar = new JButton("Terminar");
        mensagem = new JLabel();

        Perecivel = new JRadioButton("Perecivel", null, false);
        Duravel = new JRadioButton("Duravel", null, false);
        PerecivelDuravel = new JLabel("Tipo de carga");

        lOrigem = new JLabel("Origem");
        campoOrigem = new JTextField(10);
        lValidade = new JLabel("Validade");
        campoValidade = new JTextField(10);

        lSetor = new JLabel("Setor");
        campoSetor = new JTextField(10);
        lMaterialPrincipal = new JLabel("Material Principal");
        campoMaterial = new JTextField(10);
        lIPI = new JLabel("IPI");
        campoIPI = new JTextField(10);



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


                    JPanel pNumero = new JPanel(new GridLayout(2,4));
                    pNumero.add(lNumero);
                    pNumero.add(lDescricao);
                    pNumero.add(lOrigem);
                    pNumero.add(lValidade);
                    pNumero.add(campoNumero);
                    pNumero.add(campoDescricao);
                    pNumero.add(campoOrigem);
                    pNumero.add(campoValidade);
                    add(pNumero);

                    
                    
                    JPanel pBotoes = new JPanel(new GridLayout(1,4));
                    pBotoes.add(botaoCadastrarPerecivel);
                    pBotoes.add(botaoLimpar);
                    pBotoes.add(botaoVoltar);
                    pBotoes.add(botaoTerminar);
                    add(pBotoes);
                
                    revalidate(); // Atualize o painel
                    repaint(); // Redesenhe o painel

                    };
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

                    JPanel pNumero = new JPanel(new GridLayout(2,5));
                    pNumero.add(lNumero);
                    pNumero.add(lDescricao);
                    pNumero.add(lSetor);
                    pNumero.add(lMaterialPrincipal);
                    pNumero.add(lIPI);
                    pNumero.add(campoNumero);
                    pNumero.add(campoDescricao);
                    pNumero.add(campoSetor);
                    pNumero.add(campoMaterial);
                    pNumero.add(campoIPI);
                    add(pNumero);


                    JPanel pBotoes = new JPanel(new GridLayout(1,4));
                    pBotoes.add(botaoCadastrarDuravel);
                    pBotoes.add(botaoLimpar);
                    pBotoes.add(botaoVoltar);
                    pBotoes.add(botaoTerminar);
                    add(pBotoes);

                    revalidate(); // Atualize o painel
                    repaint(); // Redesenhe o painel
                }
            }
        });

        botaoCadastrarPerecivel.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    Integer.parseInt(campoNumero.getText());
                    Integer.parseInt(campoValidade.getText());
                }
                catch (NumberFormatException ex)
                {
                    mensagem.setText("Numero e Validade devem ser numeros inteiros");
                    return;
                }
                if (campoNumero.getText().equals("") || campoDescricao.getText().equals("") || campoOrigem.getText().equals("") || campoValidade.getText().equals(""))
                {
                    mensagem.setText("Todos os campos devem ser preenchidos");
                    return;
                }
                if (Integer.parseInt(campoNumero.getText()) < 0 || Integer.parseInt(campoValidade.getText()) < 0)
                {
                    mensagem.setText("Numero e Validade devem ser numeros positivos");
                    return;
                }

            }
        });



        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoOrigem.setText("");
                campoValidade.setText("");
                campoSetor.setText("");
                campoMaterial.setText("");
                campoIPI.setText("");
                campoNumero.setText("");
                campoDescricao.setText("");
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
