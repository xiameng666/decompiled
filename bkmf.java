import com.google.android.gms.family.v2.model.ContactPerson;
import java.util.Comparator;

public final class bkmf implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        String s = ((ContactPerson)object0).a;
        String s1 = ((ContactPerson)object1).a;
        if(s == null && s1 == null) {
            return (int)(((long)((ContactPerson)object0).b) - ((long)((ContactPerson)object1).b));
        }
        if(s == null) {
            return 1;
        }
        return s1 == null ? -1 : s.compareTo(s1);
    }
}

