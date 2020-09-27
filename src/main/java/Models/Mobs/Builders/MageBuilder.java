package Models.Mobs.Builders;

import Models.Artifacts.Artifact;
import Models.Mobs.Mage;

import java.util.List;

public class MageBuilder {
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

    public MageBuilder setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        return this;
    }

    public MageBuilder setCurrentDefence(int currentDefence) {
        this.currentDefence = currentDefence;
        return this;
    }

    public MageBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public MageBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public MageBuilder setExperiencePnts(int experiencePnts) {
        this.experiencePnts = experiencePnts;
        return this;
    }

    public MageBuilder setMaxHitPnts(int maxHitPnts) {
        this.maxHitPnts = maxHitPnts;
        return this;
    }

    public MageBuilder setMaxAttackPnts(int maxAttackPnts) {
        this.maxAttackPnts = maxAttackPnts;
        return this;
    }

    public MageBuilder setMaxDefencePnts(int maxDefencePnts) {
        this.maxDefencePnts = maxDefencePnts;
        return this;
    }

    public MageBuilder setBackpack(List<Artifact>[] backpack) {
        this.backpack = backpack;
        return this;
    }

    public MageBuilder setEquipped(Artifact[] equipped) {
        this.equipped = equipped;
        return this;
    }

    public Mage createMage() {
        return new Mage(name, level, experiencePnts, maxHitPnts,currentHp, maxAttackPnts, maxDefencePnts,currentDefence, backpack, equipped);
    }
}