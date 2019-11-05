package Game;

/**
 *
 * @author fayarretype.com
 */
public abstract class BaseModel {
    protected int name;
    
    abstract String getNameValue();

    public int getName() {
        return name;
    }
}
