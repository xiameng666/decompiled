import android.telephony.SubscriptionInfo;
import java.util.Comparator;

public final class bjzc implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return ((SubscriptionInfo)object1).getSubscriptionId() - ((SubscriptionInfo)object0).getSubscriptionId();
    }
}

