public class Archer extends Hero{
    public Archer(String name,int health) {
        super(name,health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(String.format("Archer %s атакует врага",getName()));
        enemy.takeDamage(4);
    }
}
