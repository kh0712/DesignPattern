package desingpattern.builder;

public class Main {

    public static void main(String[] args) {
        NutritionFacts build = new NutritionFacts.Builder(1000, 10)
                .build();
        System.out.println(build.getCalories());//0

        NutritionFacts build1 = new NutritionFacts.Builder(1000, 10)
                .calories(500)
                .carbohydrate(1000)
                .sodium(10)
                .fat(50)
                .build();
        System.out.println(build1.getFat()); //50
    }
}
