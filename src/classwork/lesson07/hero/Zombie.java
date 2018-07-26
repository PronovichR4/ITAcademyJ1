package classwork.lesson07.hero;

public class Zombie extends Enemy {

    private boolean diedOnce;

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void takeDamage(int damage) {
        System.out.println(getName() + " получает " + damage + " урона");
        if (damage >= getHealth()) {
            if (diedOnce) {
                kill();
            }
            else {
                diedOnce=true;
                setHealth(50);
                System.out.println(getName()+ " Воскрес, здоровье равно " + getHealth());
            }
        } else {
            int newHealth=getHealth();
            newHealth -=damage;
            setHealth(newHealth);
        }

    }
}
