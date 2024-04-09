class BuildingBlueprint{
    private int stories;
    private int apartments;
    private float occupancy;
    private boolean full;

    BuildingBlueprint(){
        stories = 10;
        apartments = 20;
        occupancy = 1;
        full = true;
    }

    BuildingBlueprint(int numStories, int numApartments, float percentOccupancy ){
        stories = numStories;
        apartments = numApartments;
        occupancy = percentOccupancy;
        full = (percentOccupancy == 1);
    }

    //setters
    void setOccupancy(float percentOccupancy) {
        occupancy = percentOccupancy;
        full = (occupancy == 1);
    }

    //getters

    float getOccupancy(){
        return occupancy;
    }
    int getStories(){
        return stories;
    }
    int getApartments(){
        return apartments;
    }
    boolean getFull(){
        return full;
    }
}