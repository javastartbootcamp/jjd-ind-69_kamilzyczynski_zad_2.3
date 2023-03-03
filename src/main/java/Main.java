public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Mojito";
        drink.price = 13.0;
        drink.isAlcoholic = true;

        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "woda";
        drink.ingredient1.quantity = 50;

        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "sok cytrynowy";
        drink.ingredient2.quantity = 60;

        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "rum";
        drink.ingredient3.quantity = 100;

        int capacity = drink.ingredient1.quantity + drink.ingredient2.quantity + drink.ingredient3.quantity;

        System.out.printf("Drink: %s%n", drink.name);
        System.out.printf("Cena: %.1fzł%n", drink.price);
        System.out.printf("Czy zawiera alkohol? %b%n", drink.isAlcoholic);
        System.out.println("Składniki:");
        System.out.printf("%s%n", drink.ingredient1.name);
        System.out.printf("%s%n", drink.ingredient2.name);
        System.out.printf("%s%n", drink.ingredient3.name);
        System.out.printf("Pojemność: %dml", capacity);

    }
}
