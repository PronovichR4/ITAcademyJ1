package classwork.lesson07.hero;

public class Archer extends Hero{

    public Archer (String name, int health){
        super(name,10, health);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.printf("%s стреляет из лука в %s\n", getName(), enemy.getName());
        applyDamage(enemy);
    }

}
