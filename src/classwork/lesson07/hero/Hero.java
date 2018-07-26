package classwork.lesson07.hero;

public abstract class Hero implements Mortal {

    private String name;
    private int damage;
    private int health;

    public void takeDamage(int damage) {
        System.out.println(getName() + " получает " + damage + " урона");
        if (damage >= health) {
            kill();
        } else {
            this.health -= damage;
        }

    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void kill() {
        System.out.println(getName() + " погибает!!!");
        this.health = 0;
    }

    public Hero(String name, int damage, int health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void applyDamage(Enemy enemy) {
        enemy.takeDamage(damage);
    }

    public String getName() {
        return name;
    }
}
