package org.exemple;

public class Zombie {

    public int arm;
    public int Attack;
    public int life;

    public void demage() {
        this.life = this.life - (this.Attack + this.arm);
    }

    public int life_state() {
        return this.life;
    }

    public boolean transfereVida(Zombie zumbiAlvo, double quantia) {
        if (zumbiAlvo.life > quantia) {
            this.life += quantia;
            zumbiAlvo.life -= quantia;
            return true;
        } else {
            System.out.println("Sem vida");
            return false;
        }
    }
}
