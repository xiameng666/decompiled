import java.util.Comparator;

public final class wxd implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ggbe ggbe0 = ggbe.b;
        int v = xbm.a(((xbp)object0).c);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        int v2 = xbm.a(((xbp)object1).c);
        if(v2 != 0) {
            v1 = v2;
        }
        return ggbe0.b(v - 1, v1 - 1).d(((xbp)object0).d, ((xbp)object1).d).d(((xbp)object0).n, ((xbp)object1).n).a();
    }
}

