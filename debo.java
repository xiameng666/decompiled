import java.util.Comparator;
import java.util.Locale;

public final class debo implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        String s = ((deax)object0).a.toLowerCase(Locale.ROOT);
        ibuq.e(s, "toLowerCase(...)");
        String s1 = ((deax)object1).a.toLowerCase(Locale.ROOT);
        ibuq.e(s1, "toLowerCase(...)");
        return ibrc.a(s, s1);
    }
}

