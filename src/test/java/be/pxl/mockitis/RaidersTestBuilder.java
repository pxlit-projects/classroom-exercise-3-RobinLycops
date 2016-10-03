package be.pxl.mockitis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 03/10/16.
 */
public class RaidersTestBuilder {
    public RaidersTestBuilder withHasLegendary(boolean hasLegendary) {
        this.hasLegendary = hasLegendary;
        return this;
    }

    public RaidersTestBuilder withActualRaiders(List<Raider> actualRaiders) {
        this.actualRaiders = actualRaiders;
        return this;
    }

    private boolean hasLegendary;
    private List<Raider> actualRaiders = new ArrayList<>();

    public RaidersTestBuilder(){}

    public Raiders build() {
        Raiders raiders = new Raiders(hasLegendary);

        actualRaiders.forEach(raiders::addAttacker);

        return raiders;
    }
}
