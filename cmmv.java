import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

public final class cmmv implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        batl.s(((ActivityTransition)object0));
        batl.s(((ActivityTransition)object1));
        int v = ((ActivityTransition)object0).a;
        int v1 = ((ActivityTransition)object1).a;
        if(v != v1) {
            return v >= v1 ? 1 : -1;
        }
        int v2 = ((ActivityTransition)object0).b;
        int v3 = ((ActivityTransition)object1).b;
        if(v2 == v3) {
            return 0;
        }
        return v2 >= v3 ? 1 : -1;
    }
}

