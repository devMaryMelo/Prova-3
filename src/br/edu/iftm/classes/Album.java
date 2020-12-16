package br.edu.iftm.classes;

public final class Album extends Produto
{
    private int anoLancamento;

    public Album(String descricao, float preco, int anoLancamento)
    {
        super(descricao, preco);
        this.anoLancamento = anoLancamento;
    }

    @Override
    public void detalhes()
    {
        String check = checarDisponibilidade(true);
        System.out.format("\n%s\nAno Lancamento:%d\nR$%.2f\nDisponibilidade: %s", 
                            getDescricao(), anoLancamento, getPreco(), check);
        checarDisponibilidade(1);
        
    }

}