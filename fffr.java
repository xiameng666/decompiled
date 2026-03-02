import com.google.android.gms.wearable.internal.NodeParcelable;
import java.util.Comparator;

final class fffr implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = ((NodeParcelable)object0).a.compareTo(((NodeParcelable)object1).a);
        if(v != 0) {
            return v;
        }
        if(!((NodeParcelable)object0).d) {
            return ((NodeParcelable)object1).d ? -1 : 0;
        }
        return ((NodeParcelable)object1).d ? 0 : 1;
    }
}

