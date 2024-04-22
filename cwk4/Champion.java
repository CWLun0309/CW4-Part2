package cwk4;
import cwk4.ChampionState;
import java.io.*;

public class Champion
{
    private String name;
    private int skillLevel;
    private boolean necromancer;
    private int entryFee;
    private String spellSpeciality;
    private String weapon;
    private boolean talk;
    private ChampionState state;

    public Champion(String name, int skillLevel, boolean necromancer, int entryFee, String spellSpeciality, String weapon, boolean talk, ChampionState state)
    {
        this.name = name;
        this.skillLevel = skillLevel;
        this.necromancer = necromancer;
        this.entryFee = entryFee;
        this.spellSpeciality = spellSpeciality;
        this.weapon = weapon;
        this.talk = talk;
        this.state = state;
    }

    public String getChampionName()
    {
        return name;
    }


    public int getSkillLevel()
    {
        return skillLevel;
    }
    public boolean isNecromancer()
    {
        return necromancer;
    }

    public int getEntryFee()
    {
        return entryFee;
    }

    public String getSpellSpeciality()
    {
        return spellSpeciality;
    }

    public void setSpellSpeciality(String spellSpeciality)
    {
        this.spellSpeciality = spellSpeciality;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public void setWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public boolean canTalk()
    {
        return talk;
    }

    public void setCanTalk(boolean talk)
    {
        this.talk = talk;
    }

    public ChampionState getState()
    {
        return state;
    }

    public String toString()
    {
        return "Champion: " + name + "\nSkill Level:" + skillLevel + "\nNecromancer: " + necromancer + "\nEntry fee:" + entryFee + "\nSpell Speciality: " + spellSpeciality +
                "\nWeapon: " + weapon + "\nTalk: " + talk + "\nState: " + state;
    }

}
