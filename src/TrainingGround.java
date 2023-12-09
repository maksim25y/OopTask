package src;

public class TrainingGround {
    public static void main(String[] args) {
        Archer hero = new Archer("Maks",100);
        Zombie enemy = new Zombie(100);
        hero.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        Archer archer = new Archer("Ivan",40);
        archer.attackEnemy(enemy);
    }
}
