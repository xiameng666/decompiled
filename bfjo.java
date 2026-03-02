import java.util.Locale;

public final class bfjo implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        herh herh0 = ((herj)object0).d;
        if(herh0 == null) {
            herh0 = herh.a;
        }
        String s = herh0.c;
        ibuq.e(s, "getDisplayName(...)");
        Object object1 = s.toLowerCase(Locale.ROOT);
        ibuq.e(object1, "toLowerCase(...)");
        return object1;
    }
}

