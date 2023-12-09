public class BattleGround {
    public static void main(String[] args) {
        Zombie enemy = new Zombie(100);
        Archer archer = new Archer("Ivan",65);
        while (archer.isAlive()&&enemy.isAlive()){
            archer.attackEnemy(enemy);
            System.out.println("Hp enemy: "+enemy.getHealth());
            enemy.attackEnemy(archer);
            System.out.println("Hp hero: "+archer.getHealth());
        }
        String res = enemy.isAlive()?"enemy":"hero";
        System.out.println("Win "+res);
    }
}
