package ro.fasttrackit.curs12.restaurant;

import java.util.*;

public class RestaurantService {
    private final List<Restaurant> restaurants = new ArrayList<>();

    public RestaurantService(Collection<Restaurant> restaurants) {
        if (restaurants != null) {
            this.restaurants.addAll(restaurants);
        }
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public Map<String, String> mapNameToCity() {
        Map<String, String> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapNameToType() {
        Map<String, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<RestaurantType, List<Restaurant>> groupByType() {
        Map<RestaurantType, List<Restaurant>> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            List<Restaurant> existingList = result.get(restaurant.getType());
            if (existingList == null) {
                existingList = new ArrayList<>();
            }
            existingList.add(restaurant);
            result.put(restaurant.getType(), existingList);
        }
        return result;
    }
}
