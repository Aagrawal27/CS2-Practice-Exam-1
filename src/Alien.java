public class Alien {
    private int energyLevel;
    private int hostilityIndex;

    public Alien(int energyLevel, int hostilityIndex){
        this.energyLevel=energyLevel;
        this.hostilityIndex=hostilityIndex;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel){
        this.energyLevel=energyLevel;
    }

    public int getHostilityIndex(){
        return hostilityIndex;
    }

    public void setHostilityIndex(int hostilityIndex){
        this.hostilityIndex=hostilityIndex;
    }

    public void printInfo(){
        System.out.println("Energy level: "+energyLevel+", "+"Hostility index: "+hostilityIndex);
    }
}

