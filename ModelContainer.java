package Game;

/**
 *
 * @author fayarretype.com
 */
public final class ModelContainer {
    private static ModelContainer model;
    
    private ModelContainer() {
        
    }
    
    public static ModelContainer create() {
        if(model == null) model = new ModelContainer();
        return model;
    }
    
    public BaseModel getModel(int modelName) {
        switch(modelName) {
            case ModelName.STONE:
                return new Stone();
            case ModelName.PAPER:
                return new Paper();
            case ModelName.SCISSORS:
                return new Scissors();
            default :
                return null;
        }
    }
}
