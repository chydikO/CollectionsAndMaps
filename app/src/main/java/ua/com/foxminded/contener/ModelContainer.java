package ua.com.foxminded.contener;

import ua.com.foxminded.model.ModelInterface;

public class ModelContainer {

    private ModelInterface modelContainer;

    public ModelContainer(ModelInterface modelContainer) {
        this.modelContainer = modelContainer;
    }

    public ModelInterface getModelContainer() {
        return modelContainer;
    }
}
