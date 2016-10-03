package be.pxl.mockitis;

public class SettlerTestBuilder {
    private boolean assignedToDefense;

    public SettlerTestBuilder withAssignedToDefense(boolean assignedToDefense) {
        this.assignedToDefense = assignedToDefense;
        return this;
    }

    public Settler build() {
        return new Settler(assignedToDefense);
    }
}