package tbcs.model.kitchen;

import tbcs.interfaces.Nameable;

public class Chef implements Nameable {

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
