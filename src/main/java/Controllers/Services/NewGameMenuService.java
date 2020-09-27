package Controllers.Services;

import Models.Artifacts.Artifact;
import Models.Global;
import Models.Mobs.*;
import Models.Mobs.Builders.*;

import java.util.ArrayList;
import java.util.List;

public class NewGameMenuService extends Global {

	enum HeroClasses{
		mage,
		warrior,
		hunter,
		rouge
	}

	public static Hero createHero(String rawName, String heroClass){
		String name = rawName.length() >= 20 ? rawName.substring(0, 20) : rawName;
		List<Artifact>[] backpack = new ArrayList[3];
		backpack[HELM] = new ArrayList<Artifact>();
		backpack[ARMOUR] = new ArrayList<Artifact>();
		backpack[WEAPON] = new ArrayList<Artifact>();
		Artifact[] equipped = new Artifact[3];

		switch (HeroClasses.valueOf(heroClass.toLowerCase())) {
			case mage:
				equipped[HELM] = new Artifact("Magic_Hood", 1, HELM);
				equipped[ARMOUR] = new Artifact("Robe", 1, ARMOUR);
				equipped[WEAPON] = new Artifact("Staff", 1, WEAPON);
				return (new MageBuilder().setName(name).setLevel(0).setExperiencePnts(0).setMaxHitPnts(102).setCurrentHp(102).setMaxAttackPnts(10).setMaxDefencePnts(21).setCurrentDefence(22).setBackpack(backpack).setEquipped(equipped).createMage());

			case rouge:
				equipped[HELM] = new Artifact("Leather_Helm", 1, HELM);
				equipped[ARMOUR] = new Artifact("Leather_Armour", 1, ARMOUR);
				equipped[WEAPON] = new Artifact("Daggers", 1, WEAPON);
				return (new RougeBuilder().setName(name).setLevel(0).setExperiencePnts(0).setMaxHitPnts(100).setCurrentHp(100).setMaxAttackPnts(23).setMaxDefencePnts(22).setCurrentDefence(23).setBackpack(backpack).setEquipped(equipped).createRouge());

			case hunter:
				equipped[HELM] = new Artifact("Hunters_Hood", 1, HELM);
				equipped[ARMOUR] = new Artifact("Chainmail_Vest", 1, ARMOUR);
				equipped[WEAPON] = new Artifact("Bow", 1, WEAPON);
				return (new HunterBuilder().setName(name).setLevel(0).setExperiencePnts(0).setMaxHitPnts(105).setCurrentHp(105).setMaxAttackPnts(20).setMaxDefencePnts(20).setCurrentDefence(21).setBackpack(backpack).setEquipped(equipped).createHunter());

			case warrior:
				equipped[HELM] = new Artifact("Iron_Helm", 1, HELM);
				equipped[ARMOUR] = new Artifact("Iron_Armour", 1, ARMOUR);
				equipped[WEAPON] = new Artifact("Wooden_Sword", 1, WEAPON);
				return (new WarriorBuilder().setName(name).setLevel(0).setExperiencePnts(0).setMaxHitPnts(103).setCurrentHp(103).setMaxAttackPnts(25).setMaxDefencePnts(20).setCurrentDefence(21).setBackpack(backpack).setEquipped(equipped).createWarrior());

			default:
				return (new HeroBuilder().setName(name).setLevel(0).setExperiencePnts(0).setMaxHitPnts(100).setCurrentHp(100).setMaxAttackPnts(20).setMaxDefencePnts(20).setCurrentDefence(20).setBackpack(backpack).setEquipped(equipped).createHero());
		}
	}
}
