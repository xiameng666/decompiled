import android.view.View;
import java.util.Comparator;

public final class jtr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        float f = ((View)object0).getZ();
        float f1 = ((View)object1).getZ();
        if((f > f1)) {
            return -1;
        }
        return f < f1 ? 1 : 0;
    }
}

