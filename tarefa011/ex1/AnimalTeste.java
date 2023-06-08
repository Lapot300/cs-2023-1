package ex1;

public class AnimalTeste {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Cachorro", 1);
        Cavalo cavalo = new Cavalo("Cavalo", 2);
        Preguica preguica = new Preguica("Preguiça", 3);

        cachorro.fazerSom();
        cavalo.fazerSom();
        preguica.subirEmArvore();

        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        Cachorro cachorro2 = new Cachorro("Cachorro 2", 4);
        Cavalo cavalo2 = new Cavalo("Cavalo 2", 5);
        Preguica preguica2 = new Preguica("Preguiça 2", 6);

        Cachorro cachorro3 = new Cachorro("Cachorro 3", 7);
        Cavalo cavalo3 = new Cavalo("Cavalo 3", 8);
        Preguica preguica3 = new Preguica("Preguiça 3", 9);

        Cachorro cachorro4 = new Cachorro("Cachorro 4", 10);

        Zoologico zoologico = new Zoologico();

        zoologico.getJaula().add(cachorro);
        zoologico.getJaula().add(cavalo);
        zoologico.getJaula().add(preguica);
        zoologico.getJaula().add(cachorro2);
        zoologico.getJaula().add(cavalo2);
        zoologico.getJaula().add(preguica2);
        zoologico.getJaula().add(cachorro3);
        zoologico.getJaula().add(cavalo3);
        zoologico.getJaula().add(preguica3);
        zoologico.getJaula().add(cachorro4);

        zoologico.getJaula().forEach(animal -> {
            animal.fazerSom();

            if(animal instanceof Cachorro){
                Cachorro c = (Cachorro) animal;
                c.correr();
            }else if(animal instanceof Cavalo){
                Cavalo c = (Cavalo) animal;
                c.correr();
            }
        });
    }

}
