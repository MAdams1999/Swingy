package Models.Mobs;

import Models.Artifacts.Artifact;

import java.util.List;

public class Warrior extends Hero {
    public Warrior(String name, int level, int experiencePnts, int maxHitPnts , int currentHp, int maxAttackPnts, int maxDefencePnts, int currentDefence, List<Artifact>[] backpack, Artifact[] equipped) {
        super(name, level, experiencePnts, maxHitPnts , currentHp, maxAttackPnts, maxDefencePnts, currentDefence ,backpack, equipped);
    }
}

