package br.edu.iftm.classes;

public abstract class Produto {
    protected String descricao = "";
    protected float preco;
    protected boolean disponivel;

    public Produto(String descricao, float preco) 
    {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String checarDisponibilidade(boolean disponivel)
    {
        if(disponivel)
        {
            return String.format("Produto disponível.\n");
        }
        else
        {
            return String.format("Estoque insuficiente.\n");
        }
    }
    
    public void checarDisponibilidade(int estoque)
    {
        if(estoque == 1)
        {
            System.out.println("Estoque esgotando, ultima peça disponivel.\n");
        }
        else if (estoque < 5 &&  estoque > 1)
        {
            System.out.println("Estoque esgotando, ultimas 5 pecas disponiveis.\n");
        }
    }

    public void detalhes()
    {
        String check = checarDisponibilidade(true);
        System.out.format("\n%s - R$%.2f - Disponibilidade: %s", descricao, preco, check);
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public float getPreco() 
    {
        return preco;
    }

    public void setPreco(float preco) 
    {
        this.preco = preco;
    }

    public boolean isDisponivel() 
    {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) 
    {
        this.disponivel = disponivel;
    }
    
}