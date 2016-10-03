package be.pxl.mockitis;

import java.util.List;

public class SettlementTestBuilder {
    private List<Settler> settlers;

    public SettlementTestBuilder withSettlers(List<Settler> settlers) {
        this.settlers = settlers;
        return this;
    }

    public Settlement build() {
        return new Settlement(settlers);
    }
}