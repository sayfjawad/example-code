package nl.multicode.usecase;

import nl.multicode.model.Recipe;

public interface Prepair {

    String getPreparationInstructionsFor(Recipe recipe, int numberOfConsumers);
}
