package cwk4;
import cwk4.ChallengeType;
import java.io.*;

public class Challenge
{
    private int number;
    private  ChallengeType type;
    private String enemy;
    private int skillRequired;
    private int reward;

    public Challenge(int num, ChallengeType type, String enemy, int skillRequired, int reward)
    {
        this.number = num;
        this.type = type;
        this.enemy = enemy;
        this.skillRequired = skillRequired;
        this.reward = reward;
    }

    public int getNumber()
    {
        return number;
    }

    public ChallengeType getType()
    {
        return type;
    }

    public String getEnemy()
    {
        return enemy;
    }

    public int getSkillRequired()
    {
        return skillRequired;
    }

    public int getReward()
    {
        return reward;
    }

    public String toString()
    {
       return "Challenge No: " + number + "\nType: " + type + "\nEnemy: " + enemy + "\nSkill Required: " + skillRequired + "\nReward: " + reward;
    }
}
