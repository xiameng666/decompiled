import android.util.Pair;
import java.util.Comparator;

final class enny implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((Long)((Pair)object0).first).equals(((Pair)object1).first)) {
            emlc emlc0 = ((emld)((Pair)object1).second).c;
            if(emlc0 == null) {
                emlc0 = emlc.a;
            }
            int v = emlb.a(emlc0.b);
            if(v == 0) {
                throw null;
            }
            emlc emlc1 = ((emld)((Pair)object0).second).c;
            if(emlc1 == null) {
                emlc1 = emlc.a;
            }
            int v1 = emlb.a(emlc1.b);
            if(v1 != 0) {
                return Integer.compare(v - 1, v1 - 1);
            }
            throw null;
        }
        return Long.compare(((Long)((Pair)object0).first).longValue(), ((Long)((Pair)object1).first).longValue());
    }
}

