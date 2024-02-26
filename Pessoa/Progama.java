public class Progama {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Weslley");
        pessoa.setIdade(25);
        pessoa.setPeso(1.77);
        pessoa.setAltura(60.4);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade() + " anos");
        System.out.println(pessoa.getPeso() + "kg");
        System.out.println(pessoa.getAltura() + "cm");
}
 }
