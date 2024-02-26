
public class Programa {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();

        dog.setId(127);
        dog.setTipo("Dosmetico");
        dog.setHabitat("Terrestre");
        dog.setNome("Leon");
        dog.setRaca("shih tzu");
        dog.setIdade(8);

        System.out.println(dog.getNome());
        System.out.println(dog.getIdade());
        System.out.println(dog.getRaca());
        System.out.println(dog.getTipo());
        System.out.println(dog.getHabitat());
        System.out.println(dog.getId());
    }

}