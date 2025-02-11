import java.util.ArrayList;
import java.util.List;
import java.util.Random;

    public class Roller {
        public List<Integer> roll(int dice) {
            Random roller = new Random();
        
            List<Integer> rolls = new ArrayList<Integer>();
    
            // TODO: Only rolls d6 for now
            for (int i = 0; i < dice; i++) {
                int nextRoll = roller.nextInt(5);
                nextRoll += 1;

                rolls.add(nextRoll);
            }
    
            return rolls;
        }
    
    
    }