import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Comparator;

public final class dbyn implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        if(((ShareTarget)object0).h) {
            return ((ShareTarget)object1).h ? ((ShareTarget)object0).b.compareTo(((ShareTarget)object1).b) : -1;
        }
        return ((ShareTarget)object1).h ? 1 : ((ShareTarget)object0).b.compareTo(((ShareTarget)object1).b);
    }
}

