package cwk4;
import java.io.*;

public class Vizier
{
    private String name;
    private int money;
    private Team team;

    public Vizier(String vizier)
    {
        this.name = vizier;
        this.money = 1000; //Starting with 1000 guldens
        this.team = new Team();
    }

    public String getVizierName()
    {
        return name;
    }

    public int getVizierMoney()
    {
        return money;
    }

    public void addMoney(int amount)
    {
        money += amount;
    }

    public void deductMoney(int amount)
    {
        money -= amount;
    }

    public boolean hasEnoughMoney(int amount)
    {
        return money >= amount;
    }

    public String toString()
    {
        return "Vizier: " + name + "\nMoney: " + money + "guldens";
    }

}
