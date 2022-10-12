package nl.multicode.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@RequiredArgsConstructor
public class Recipe {

    private final String name;

    private final FoodType foodType;

    private final List<Ingredient> ingredients;
}
