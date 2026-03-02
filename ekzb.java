import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import java.util.Comparator;

public final class ekzb implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.valueOf(((AppIndexingUserActionInfo)object1).b).compareTo(Long.valueOf(((AppIndexingUserActionInfo)object0).b));
    }
}

