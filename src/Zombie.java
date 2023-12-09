package src;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }
    private int count = 1;

    @Override
    public boolean isAlive() {
        if(getHealth()<=4&&count==1){
            count=0;
            setHealth(100);
        }
        return getHealth()>0;
    }

    @Override
    public void attackEnemy(Hero hero) {
        System.out.println("Enemy атакует героя");
        hero.takeDamage(1);
    }
}
