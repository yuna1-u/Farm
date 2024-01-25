public class Main {
    public static void main(String[] args) {


        Cow cow = new Cow("35", "1", "male", "lola");
        Cow cow2 = new Cow("35", "2", "female", "flora");
        Cow cow3 = new Cow("35", "3", "male", "kola");
        Cow cow4 = new Cow("35", "4", "male", "sona");
        Cow cow5 = new Cow("35", "5", "female", "rora");

        Cow[] cows = {cow, cow2, cow3, cow4, cow5};

        Sheep sheep = new Sheep("40", "6", "male", "lala");
        Sheep sheep2 = new Sheep("40", "7", "female", "sara");
        Sheep sheep3 = new Sheep("40", "8", "female", "zaza");

        Sheep[] sheeps = {sheep, sheep2, sheep3};

        Horse horse = new Horse("60", "9", "male", "kila", "white");
        Horse horse2 = new Horse("60", "10", "female", "jila", "black");

        Horse[] horses = {horse, horse2};

        Farm farm = new Farm("Moscow", cows, horses, sheeps, "qwerty");



        Cow cowFarm2 = new Cow("50", "5", "female", "hika");
        Cow[] cows2 = {cowFarm2};

        Horse horseFarm2 = new Horse("55", "5", "male", "vila", "browm");
        Horse[] horses2 = {horseFarm2};

        Sheep sheepFarm2 = new Sheep("60", "5", "male", "viola");
        Sheep[] sheeps2 = {sheepFarm2};

        Farm farm2 = new Farm("Talas", cows2, horses2, sheeps2, "qwerty");


        System.out.println(farm + "\n");
        System.out.println("--------------------------------------------------");
        System.out.println(farm2);

    }
}