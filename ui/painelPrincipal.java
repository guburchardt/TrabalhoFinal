package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class painelPrincipal extends JPanel {
    private JButton ButtonCadastrarPorto, ButtonCadastrarNavio, ButtonCadastrarCliente,
    ButtonCadastrarCarga, ButtonConsultarTodasCargas, ButtonAlterarCarga, ButtonCarregarDados,
    ButtonSalvarDados, ButtonFretarCarga, ButtonFinalizarSistema, ButtonCadastrarTipoCarga;


    public painelPrincipal(Aplicacao aplicacao){
        super();
        //Criação de Botões
        GridLayout layout = new GridLayout(2,5);
        this.setLayout(layout);
        ButtonCadastrarPorto = new JButton("Cadastrar Porto");
        ButtonCadastrarCarga = new JButton("Cadastrar Carga");
        ButtonCadastrarNavio = new JButton("Cadastrar Navio");
        ButtonCadastrarCliente = new JButton("Cadastrar Cliente");
        ButtonConsultarTodasCargas = new JButton("Consultar Cargas");
        ButtonCadastrarTipoCarga = new JButton("Cadastrar Tipo Carga");
        ButtonAlterarCarga = new JButton("Alterar Carga");
        ButtonCarregarDados = new JButton("Carregar Dados");
        ButtonSalvarDados = new JButton("Salvar Dados");
        ButtonFretarCarga = new JButton("Fretar Carga");
        ButtonFinalizarSistema = new JButton("Finalizar Sistema");
        JLabel rotulo = new JLabel("Em construção, selecione apenas o botão Cadastrar Cliente");

         

        JPanel pRotulo = new JPanel();
        pRotulo.add(rotulo);
        this.add(pRotulo);
        
        JPanel painel = new JPanel(new GridLayout(2,6));
        painel.add(ButtonCadastrarPorto);
        painel.add(ButtonCadastrarTipoCarga);
        painel.add(ButtonCadastrarCarga);
        painel.add(ButtonCadastrarNavio);
        painel.add(ButtonCadastrarCliente);
        painel.add(ButtonConsultarTodasCargas);
        painel.add(ButtonAlterarCarga);
        painel.add(ButtonCarregarDados);
        painel.add(ButtonSalvarDados);
        painel.add(ButtonFretarCarga);
        painel.add(ButtonFinalizarSistema);
        this.add(painel);
        

        ButtonCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(2);
            }
        });

        ButtonCadastrarPorto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(3);
            }
        });

        ButtonCadastrarNavio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(4);
            }
        });

        ButtonCadastrarTipoCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(5);
            }
        });

        ButtonCadastrarCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(6);
            }
        });

        ButtonAlterarCarga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aplicacao.mudaPainel(7);
            }
        });
    

    }
    
}
    

