import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto:"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
        float quantidade = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto:"));

        Produto produto = new Produto(id, descricao, quantidade, preco);

        JOptionPane.showMessageDialog(null,
                "Informações do produto:\n" +
                        "ID: " + produto.getId() + "\n" +
                        "Descrição: " + produto.getDescricao() + "\n" +
                        "Quantidade: " + produto.getQuantidade() + "\n" +
                        "Preço: R$" + produto.getPreco());

        float desconto = Float.parseFloat(JOptionPane.showInputDialog("Digite o desconto a ser aplicado (em decimal, por exemplo, 0.1 para 10%):"));
        ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto(id, descricao, quantidade, preco, desconto);

        JOptionPane.showMessageDialog(null,
                "Informações do produto com desconto:\n" +
                        "ID: " + produtoComDesconto.getId() + "\n" +
                        "Descrição: " + produtoComDesconto.getDescricao() + "\n" +
                        "Quantidade: " + produtoComDesconto.getQuantidade() + "\n" +
                        "Preço: R$" + produtoComDesconto.getPreco() + "\n" +
                        "Desconto aplicado: " + (desconto * 100) + "%");

        produto.work();
        produtoComDesconto.work();
    }
}
