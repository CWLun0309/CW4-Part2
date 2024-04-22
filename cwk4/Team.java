package cwk4;
import java.util.ArrayList;
import java.util.List;

public class Team
{
    private List<Champion> champions;;

    public Team()
    {
        this.champions = new ArrayList<>();
    }


    public void addChampion(Champion champion)
    {
        champions.add(champion);
    }

    public void removeChampion(Champion champion)
    {
        champions.remove(champion);
    }

    public void retireChampion(Champion champion)
    {
        champions.remove(champion);
    }

    public boolean containsChampion(String champion )
    {
        return champions.contains(champion);
    }

    public boolean isEmpty()
    {
        return champions.isEmpty();
    }

    public Champion getChampion(String name)
    {
        for (Champion champion : champions)
            if (champion.getChampionName().equals(name))
            {
                return champion;
            }
        return null;
    }

    public String toStirng()
    {
        String ss = "Teams: \n";
        for (Champion champion : champions) {
            ss += champions.toString() + "\n";
        }
        return ss;
    }


}
