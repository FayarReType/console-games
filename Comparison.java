package Game;

/**
 *
 * @author fayarretype.com
 */
public final class Comparison {
    private static int loser;
    
    public static int Compare(int modelName) {
       
        switch(modelName) {
            case ModelName.PAPER:
                loser = ModelName.STONE;
                break;
            case ModelName.STONE:
                loser = ModelName.SCISSORS;
                break;
            case ModelName.SCISSORS:
                loser = ModelName.PAPER;
                break;
            default:
                loser = -1;
        }
        return loser;
    }
}
