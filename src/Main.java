public class Main {

    public static void main(String[] args) {

        Warrior warrior1 = new Warrior("Thor ");
        Wizard wizard1 = new Wizard("jaina ");

        int hpWarrior = warrior1.getHp();
        int hpWizzard = wizard1.getHp();
        int round = 1;
        boolean segundabatalla = false;


        System.out.println(warrior1.toString());
        System.out.println(wizard1.toString());

        battle(warrior1,wizard1,round);

    }

    public static void battle(Character warrior1, Character wizard1,int round){
        while (warrior1.getHp()>0 && wizard1.getHp()>0) {
            System.out.println("--------"+round+"--------");
            warrior1.attack(wizard1);
            wizard1.attack(warrior1);
            round++;
        }
        if(warrior1.isAlive()){
            System.out.println(warrior1.getName()+" has won the battle");
        } else if (wizard1.isAlive()) {
            System.out.println(wizard1.getName()+" has won the battle");
        }else{
            round=0;
            battle(warrior1,wizard1,round);
        }
    }


}
