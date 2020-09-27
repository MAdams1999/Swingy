package Models.Mobs;

import Controllers.ApplicationControls;
import Models.Artifacts.Artifact;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterFactory {
    private static String[] possibleTypes = {"Drauger", "Hag_Raven", "Giant", "Vampire","Wisp", "Dragon"};
    private static String[] adjectives = {"Ancient", "Frail", "Legendary", "Elder", "Over_9000", "Meek", "Restless"};

    public static Monster generateMonster(){
        Hero hero = ApplicationControls.getHero();
        Random rn = new Random();
        List<Artifact>[] backpack = new ArrayList[3];
        Artifact[] equipped = new Artifact[3];

        String type = possibleTypes[rn.nextInt(6)];
        String name = adjectives[rn.nextInt(7)] + "_" + type;
        Monster monster = new Monster(name,
        hero.getLevel(),
        0,
        rn.nextInt(hero.getMaxHitPnts()) + 10,
                (rn.nextInt(hero.getAttackPnts()) / 2) + 10,
        0,
        backpack,
        equipped);
        return monster;
    }
}
