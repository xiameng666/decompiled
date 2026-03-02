import java.util.Comparator;

final class itt implements Comparator {
    public static final itt a;

    static {
        itt.a = new itt();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        hka hka0 = ((iug)object0).c();
        hka hka1 = ((iug)object1).c();
        int v = Float.compare(hka1.d, hka0.d);
        if(v != 0) {
            return v;
        }
        int v1 = Float.compare(hka0.c, hka1.c);
        if(v1 != 0) {
            return v1;
        }
        int v2 = Float.compare(hka0.e, hka1.e);
        return v2 == 0 ? Float.compare(hka1.b, hka0.b) : v2;
    }
}

