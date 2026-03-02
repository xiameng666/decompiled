import android.location.Location;
import java.util.List;

public final class cnrk {
    public static void a(cnrl cnrl0, String s, List list0) {
        List list1 = cnyj.d(list0, new cnyi());
        for(Object object0: list1) {
            ((Location)object0).setProvider(s);
        }
        cnrl0.a(list1);
    }
}

