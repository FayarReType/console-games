package Game;

/**
 *
 * @author fayarretype.com
 */
public final class Paper extends BaseModel {
    private final String NAME = "Paper";
    
    public Paper() {
        super.name = ModelName.PAPER;
    }

    @Override
    public String getNameValue() {
        return NAME;
    }
    
}
