package classwork.lesson07.hero;

public class Mage extends Hero {

    public Mage(String name, int health) {
        super(name, 20, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.printf("%s колдует заклинаниеn на %s\n", getName(),enemy.getName());
        applyDamage(enemy);
    }
}
