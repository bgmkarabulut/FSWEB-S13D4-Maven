package org.example;

public class Main {
    public static void main(String[] args) {

        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());

        Player player=new Player("Begüm",60,Weapon.SWORD);
        player.loseHealth(20);
        Weapon.SWORD.getAttackSpeed();
        Weapon.SWORD.getDamage();
        player.healthRemaining();
        player.restoreHealth(96);




    }
}