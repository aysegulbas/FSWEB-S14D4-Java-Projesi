package com.workintech.main;

import com.workintech.rpg.Monster;
import com.workintech.rpg.Troll;
import com.workintech.rpg.Werewolf;

public class RpaMain {
    public static void main(String[] args) {
        Monster troll = new Troll("X", 500, 40);
        System.out.println(troll.attack());
        //System.out.println(troll.);

        Monster wereWolf = new Werewolf("Y", 400, 50);
        System.out.println(wereWolf.attack());
        System.out.println(troll.poison());
    }
}
