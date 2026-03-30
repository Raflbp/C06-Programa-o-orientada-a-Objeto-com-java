package org.exemple;

public class Main {
    public static void main(String[] args) {

        Zombie zombie1 = new Zombie();
        Zombie zombie2 = new Zombie();

        zombie1.life = 100;
        zombie1.Attack = 5;
        zombie1.arm = 6;

        zombie2.life = 100;
        zombie2.Attack = 5;
        zombie2.arm = 4;

        zombie2.Attack += zombie2.arm;
        zombie1.Attack += zombie1.arm;

        for(int i = 0; i < 3; i++ ){
            zombie1.demage();
            zombie2.demage();
        }

        if (zombie1.life > zombie2.life ) {
            System.out.println("Zombie 1 Win life = " + zombie1.life_state());
            System.out.println("Zombie 2 lose life = " + zombie2.life_state());
        }
        else{
            System.out.println("Zombie 1 lose life = " + zombie1.life_state());
            System.out.println("Zombie 2 win life = " + zombie2.life_state());
        }

        System.out.println("------------------------");

        zombie1.transfereVida(zombie2, 5);
        zombie2.transfereVida(zombie1, 3);

        System.out.println("Vida do Zumbi: " + zombie1.life_state());
        System.out.println("Vida do Zumbi1: " + zombie2.life_state());

    }
}