package classwork.lesson07.hero;

public class Runner {

    public static void main(String[] args) {

        Enemy enemy = new Zombie("Зомби", 10, 40);
        Archer archer = new Archer("Леголас",40);
        archer.attackEnemy(enemy);


    }

}
