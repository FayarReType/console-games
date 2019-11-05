package Game;

/**
 *
 * @author fayarretype.com
 */
public final class Stone extends BaseModel {
    private final String NAME = "Stone";
    
    public Stone() {
        super.name = ModelName.STONE;
    }

    @Override
    public String getNameValue() {
        return NAME;
    }
    
}
