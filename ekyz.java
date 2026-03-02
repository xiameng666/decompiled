import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import java.util.Comparator;

public final class ekyz implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        return Long.valueOf(((AppIndexingErrorInfo)object1).e).compareTo(Long.valueOf(((AppIndexingErrorInfo)object0).e));
    }
}

