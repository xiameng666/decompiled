import java.util.Comparator;

final class itq implements Comparator {
    public static final itq a;

    static {
        itq.a = new itq();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        hka hka0 = ((iug)object0).c();
        hka hka1 = ((iug)object1).c();
        int v = Float.compare(hka0.b, hka1.b);
        if(v != 0) {
            return v;
        }
        int v1 = Float.compare(hka0.c, hka1.c);
        if(v1 != 0) {
            return v1;
        }
        int v2 = Float.compare(hka0.e, hka1.e);
        return v2 == 0 ? Float.compare(hka0.d, hka1.d) : v2;
    }
}

