package nl.multicode.model;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class MeasurementAmount {

    private final Integer amount;
}
