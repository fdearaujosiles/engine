package engine.utils.functions;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

    public static <T> void shuffleArray(ArrayList<T> ar)
    {
        Random rnd = new Random();
        for (int i = ar.size() - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            T a = ar.get(index);
            ar.set(index, ar.get(i));
            ar.set(i, a);
        }
    }

}
