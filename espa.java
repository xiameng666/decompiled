import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.util.Comparator;

final class espa implements Comparator {
    private final String a;

    public espa(String s) {
        this.a = s;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        String s = ((CardInfo)object0).a;
        String s1 = this.a;
        if(s.equals(s1)) {
            return -1;
        }
        String s2 = ((CardInfo)object1).a;
        if(s2.equals(s1)) {
            return 1;
        }
        int v = Long.compare(((CardInfo)object1).C, ((CardInfo)object0).C);
        return v == 0 ? s.compareTo(s2) : v;
    }
}

