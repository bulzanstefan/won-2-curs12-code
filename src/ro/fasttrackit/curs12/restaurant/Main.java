package ro.fasttrackit.curs12.restaurant;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantService(List.of(
                new Restaurant("Dock", "Oradea", RestaurantType.FUSION, 4),
                new Restaurant("Rivo", "Oradea", RestaurantType.GREEK, 3),
                new Restaurant("Pizza Hut", "Bucuresti", RestaurantType.GREEK, 2),
                new Restaurant("Indigo", "Cluj", RestaurantType.FUSION, 3),
                new Restaurant("Bricks", "Cluj", RestaurantType.ROMANIAN, 4),
                new Restaurant("Flavours", "Oradea", RestaurantType.ROMANIAN, 5),
                new Restaurant("Spoon", "Oradea", RestaurantType.ROMANIAN, 4),
                new Restaurant("Traditional", "Bucuresti", RestaurantType.ROMANIAN, 3)
        ));

        System.out.println(service.getRestaurants());
        System.out.println(service.mapNameToCity());
        System.out.println(service.mapNameToType());
        System.out.println(service.groupByType());
    }
}
