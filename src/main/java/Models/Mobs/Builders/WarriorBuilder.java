package Models.Mobs.Builders;

import Models.Artifacts.Artifact;
import Models.Mobs.Warrior;

import java.util.List;

public class WarriorBuilder {
    private String name;
    private int level;
    private int experiencePnts;
    private int maxHitPnts;
    private int maxAttackPnts;
    private int maxDefencePnts;
    private List<Artifact>[] backpack;
    private Artifact[] equipped;
    private int currentHp;
    private int currentDefence;

    public WarriorBuilder setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        return this;
    }

    public WarriorBuilder setCurrentDefence(int currentDefence) {
        this.currentDefence = currentDefence;
        return this;
    }

    public WarriorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public WarriorBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public WarriorBuilder setExperiencePnts(int experiencePnts) {
        this.experiencePnts = experiencePnts;
        return this;
    }

    public WarriorBuilder setMaxHitPnts(int maxHitPnts) {
        this.maxHitPnts = maxHitPnts;
        return this;
    }

    public WarriorBuilder setMaxAttackPnts(int maxAttackPnts) {
        this.maxAttackPnts = maxAttackPnts;
        return this;
    }

    public WarriorBuilder setMaxDefencePnts(int maxDefencePnts) {
        this.maxDefencePnts = maxDefencePnts;
        return this;
    }

    public WarriorBuilder setBackpack(List<Artifact>[] backpack) {
        this.backpack = backpack;
        return this;
    }

    public WarriorBuilder setEquipped(Artifact[] equipped) {
        this.equipped = equipped;
        return this;
    }

    public Warrior createWarrior() {
        return new Warrior(name, level, experiencePnts, maxHitPnts,currentHp, maxAttackPnts, maxDefencePnts,currentDefence, backpack, equipped);
    }
}