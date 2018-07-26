package classwork.lesson07.hero;

public class BattleGround {

    public static void main(String[] args) {

        Enemy enemy = new Zombie("Василий", 45, 15);

        Hero mage = new Mage("Гендальф",100);

        while (enemy.isAlive() && mage.isAlive()) {
            mage.attackEnemy(enemy);
            if (enemy.isAlive()){
                enemy.attackHero(mage);
            }

        }

    }
}
