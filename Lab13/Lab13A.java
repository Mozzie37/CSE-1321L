public class Lab13A{
    public static void main(String[] args){
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75f);

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(100 * buildingOne.getOccupancy()) + "% occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(100 * buildingTwo.getOccupancy()) + "% occupied. Full? " + buildingTwo.getFull());

        System.out.println("\nMany years pass.\n");

        System.out.println("Year 2043:");
        buildingOne.setOccupancy(0);
        buildingTwo.setOccupancy(1);
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(100 * buildingOne.getOccupancy()) + "% occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(100 * buildingTwo.getOccupancy()) + "% occupied. Full? " + buildingTwo.getFull());

        System.out.println("Looks like people prefer taller buildings.");

    }
}

