package Livro;
public class Programa {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setNome("O menino de Pijama Listrado ");
        livro.setGenero("Romance");
        livro.setPreco(40.03);

        System.out.println(livro.getNome());
        System.out.println(livro.getGenero());
        System.out.println("R$" + livro.getPreco());
    }
}