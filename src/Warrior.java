package src;

public class Warrior extends Hero {
    public Warrior(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Warrior %s атакует врага",getName()));
        enemy.takeDamage(2);
    }
}
