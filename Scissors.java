package Game;

/**
 *
 * @author fayarretype.com
 */
public final class Scissors extends BaseModel {
    private final String NAME = "Scissors";
    
    public Scissors() {
        super.name = ModelName.SCISSORS;
    }

    @Override
    public String getNameValue() {
        return NAME;
    }

}
