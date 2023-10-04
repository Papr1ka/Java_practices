package Seasons;

import java.util.Random;

public class RunSeasons {
    public static void main(String[] args) {
        Seasons season = switch (new Random().nextInt(4)){
            case 0 -> Seasons.WINTER;
            case 1 -> Seasons.SPRING;
            case 2 -> Seasons.SUMMER;
            case 3 -> Seasons.AUTUMN;
            default -> Seasons.WINTER;
        };
        System.out.println(season);
        RunSeasons self = new RunSeasons();
        self.like(season);
        System.out.println(season.getDescription());

        for (Seasons s : Seasons.values())
        {
            System.out.println("Время года: " + s);
            System.out.println("Средняя температура: " + s.getAvgTemp());
            System.out.println("Описание: " + s.getDescription());
        }
    }
    
    public void like(Seasons season)
    {
        switch (season){
            case AUTUMN -> System.out.println("Я люблю осень");
            case WINTER -> System.out.println("Я люблю зиму");
            case SUMMER -> System.out.println("Я люблю лето");
            case SPRING -> System.out.println("Я люблю весну");
        }
    }
}
