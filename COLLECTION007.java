import java.util.*;

class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int amount) {
        this.health -= amount;
    }

    public boolean isDead() {
        return this.health <= 0;
    }
}

class Trainer {
    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public int getNumberOfPokemons() {
        return pokemons.size();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public boolean hasElement(String element) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void processTournament(String element) {
        if (hasElement(element)) {
            numberOfBadges++;
        } else {
            reduceHealth();
        }
    }

    private void reduceHealth() {
        Iterator<Pokemon> iterator = pokemons.iterator();
        while (iterator.hasNext()) {
            Pokemon pokemon = iterator.next();
            pokemon.loseHealth(10);
            if (pokemon.isDead()) {
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return name + " " + numberOfBadges + " " + pokemons.size();
    }
}

public class COLLECTION007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Tournament")) {
                break;
            }
            String[] parts = line.split(" ");
            String trainerName = parts[0];
            String pokemonName = parts[1];
            String pokemonElement = parts[2];
            int pokemonHealth = Integer.parseInt(parts[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            trainers.get(trainerName).addPokemon(pokemon);
        }

        while (true) {
            String element = scanner.nextLine();
            if (element.equals("End")) {
                break;
            }
            for (Trainer trainer : trainers.values()) {
                trainer.processTournament(element);
            }
        }

        List<Trainer> sortedTrainers = new ArrayList<>(trainers.values());
        sortedTrainers.sort((t1, t2) -> {
            if (t1.getNumberOfBadges() != t2.getNumberOfBadges()) {
                return Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges());
            } else {
                return 0; // Keep insertion order
            }
        });

        for (Trainer trainer : sortedTrainers) {
            System.out.println(trainer);
        }
    }
}