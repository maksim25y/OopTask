public abstract class Hero implements isMortal{

    private String name;
    private int health;

    public Hero(String name,int health) {
        this.name = name;
        this.health=health;
    }
    public void takeDamage(int damage){
        setHealth(getHealth()-damage);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return getHealth()>0;
    }

    public abstract void attackEnemy(Enemy enemy);
}
