package ui;

import dados.*;

import javax.swing.*;


/**
 * Aplicacao grafica
 */

public class Aplicacao extends JFrame {
    private Cliente cliente;
    private Porto porto;
    private Navio navio;
    private TipoCarga TipoCarga;
    private Carga carga;
    private CargaDuravel cargaDuravel;
    private CargaPerecivel cargaPerecivel;
    
    private painelPrincipal painelPrincipal;
    private painelCadastrarCliente painelCadastrarCliente;
    private painelCadastrarPorto painelCadastrarPorto;
    private painelCadastrarNavio painelCadastrarNavio;
    private painelCadastrarTipoCarga painelCadastrarTipoCarga;
    private painelCadastrarNovaCarga painelCadastrarNovaCarga;
    private painelAlterarSituacaoCarga painelAlterarSituacaoCarga;


    public Aplicacao(Cliente cliente, Porto porto, Navio navio, TipoCarga TipoCarga, Carga carga, CargaDuravel cargaDuravel, CargaPerecivel cargaPerecivel)
    {
        super();
        this.cliente = cliente;
        painelPrincipal = new painelPrincipal (this);
        painelCadastrarCliente = new painelCadastrarCliente(this,cliente);
        painelCadastrarPorto = new painelCadastrarPorto(this, porto);
        painelCadastrarNavio = new painelCadastrarNavio(this, navio);
        painelCadastrarTipoCarga = new painelCadastrarTipoCarga(this, TipoCarga, cargaDuravel, cargaPerecivel);
        painelCadastrarNovaCarga = new painelCadastrarNovaCarga(this, carga);
        painelAlterarSituacaoCarga = new painelAlterarSituacaoCarga(this, carga);

        
        this.setContentPane(painelPrincipal);
        this.setTitle("Gerenciamento de cargas");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(800,600);
        this.setVisible(true);
    }

    /**
     * Alterna os paineis da janela
     * @param painel numero do painel para a troca
     */
    public void mudaPainel(int painel) {
        switch(painel) {
            case 1:
                this.setContentPane(painelPrincipal);
                this.pack();
                this.setSize(800,200);
                break;
            case 2:
                this.setContentPane(painelCadastrarCliente);
                this.pack();
                this.setSize(800,200);
                break;
            case 3:
                this.setContentPane(painelCadastrarPorto);
                this.pack();
                this.setSize(800,200);
                break;
            case 4:
                this.setContentPane(painelCadastrarNavio);
                this.pack();
                this.setSize(800,200);
                break;
            case 5:
                this.setContentPane(painelCadastrarTipoCarga);
                this.pack();
                this.setSize(800,200);
                break;
            case 6:
                this.setContentPane(painelCadastrarNovaCarga);
                this.pack();
                this.setSize(800,200);
                break;
            case 7:
                this.setContentPane(painelAlterarSituacaoCarga);
                this.pack();
                this.setSize(800,200);
                break;
        }
    }

}
