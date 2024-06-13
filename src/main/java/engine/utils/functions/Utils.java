package engine.utils.functions;

import java.util.List;
import java.util.Random;

public class Utils {

    public static final Random rnd = new Random();

    protected Utils() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> void shuffleArray(List<T> ar)
    {
        for (int i = ar.size() - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            T a = ar.get(index);
            ar.set(index, ar.get(i));
            ar.set(i, a);
        }
    }

}
