import com.google.android.gms.nearby.presence.PresenceAction;
import java.util.Comparator;

public final class dasy implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((PresenceAction)object0).a - ((PresenceAction)object1).a;
    }
}

