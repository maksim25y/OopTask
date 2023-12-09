package src;

public abstract class Enemy implements isMortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        setHealth(getHealth()-damage);
    }
    public abstract void attackEnemy(Hero hero);

    @Override
    public boolean isAlive() {
        return getHealth()>0;
    }
}
