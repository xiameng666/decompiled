import java.util.Comparator;

public final class efqq implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        String s1;
        hemb hemb0 = ((efqs)object0).b;
        if(hemb0.b == 1) {
            double f = 0.0;
            hemb hemb1 = ((efqs)object1).b;
            if(hemb1.b == 1) {
                double f1 = ((hemw)hemb0.c).b.isEmpty() ? 0.0 : efqr.a(((efqs)object0));
                if(!(hemb1.b == 1 ? ((hemw)hemb1.c) : hemw.a).b.isEmpty()) {
                    f = efqr.a(((efqs)object1));
                }
                String s = "";
                int v = Double.compare(f1, f);
                if(v != 0) {
                    return v > 0 ? -1 : 1;
                }
                if((hemb0.b == 1 ? ((hemw)hemb0.c) : hemw.a).b.isEmpty()) {
                    s1 = "";
                }
                else {
                    hemf hemf0 = ((heme)(hemb0.b == 1 ? ((hemw)hemb0.c) : hemw.a).b.get(0)).d;
                    if(hemf0 == null) {
                        hemf0 = hemf.a;
                    }
                    s1 = (hemf0.d == null ? hems.a : hemf0.d).b;
                }
                if(!(hemb1.b == 1 ? ((hemw)hemb1.c) : hemw.a).b.isEmpty()) {
                    hemf hemf1 = ((heme)(hemb1.b == 1 ? ((hemw)hemb1.c) : hemw.a).b.get(0)).d;
                    if(hemf1 == null) {
                        hemf1 = hemf.a;
                    }
                    s = (hemf1.d == null ? hems.a : hemf1.d).b;
                }
                return s1.equals(s) ? 0 : s1.compareTo(s);
            }
        }
        return 0;
    }
}

