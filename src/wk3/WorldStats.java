public class WorldStats 
{
    private String[] continents;
    private int[] populationPerContinent;
    private int numberOfContinents;
    private int indexTracker;

    public WorldStats(int numberOfContinents)
    {
        setNumberOfContinents(numberOfContinents); 
    }

    public int getNumberOfContinents()
    {
        return numberOfContinents;
    }

    public void setNumberOfContinents(int numberOfContinents)
    {
        this.numberOfContinents = numberOfContinents;
    }

    public void addContinent(String continents, int population)
    {
        if(indexTracker >= numberOfContinents) 
        {
            return;  //reached our max amount of continents
        }

        this.continents[indexTracker] = continents;
        this.populationPerContinent[indexTracker] = population;
        indexTracker++;
    }

    public Object[] getContinentByName(int index)
    {
        if(index >=0 && index < numberOfContinents)
            return new Object[]{this.continents[index], this.populationPerContinent[index]};
        return null;
    }
}
