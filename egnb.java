import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class egnb implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = new bxf();
        for(Object object2: ((egnn)object0).b) {
            egnm egnm0 = (egnm)object2;
            hfwn hfwn0 = egnm0.c == null ? hfwn.a : egnm0.c;
            long v = TimeUnit.DAYS.toMillis(hxeb.a.b().a());
            if(System.currentTimeMillis() - hfyn.b(hfwn0) <= v) {
                ((Set)object1).addAll(egnm0.d);
            }
        }
        return object1;
    }
}

