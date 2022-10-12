package nl.multicode.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class Ingredient {

    private final String name;

    private final MeasurementUnit measurementUnit;
}
