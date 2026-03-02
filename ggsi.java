import java.util.Map.Entry;
import java.util.Set;

final class ggsi extends ggsx {
    public ggsi(Class class0) {
        super("tags", class0, false);
    }

    @Override  // ggsx
    public final void b(Object object0, ggsw ggsw0) {
        if(((ggwj)object0) != null) {
            ggwf ggwf0 = new ggwf(((ggwg)((ggwj)object0).c.d));
            while(ggwf0.hasNext()) {
                Object object1 = ggwf0.next();
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(((Set)map$Entry0.getValue()).isEmpty()) {
                    ggsw0.a(((String)map$Entry0.getKey()), null);
                }
                else {
                    for(Object object2: ((Set)map$Entry0.getValue())) {
                        ggsw0.a(((String)map$Entry0.getKey()), object2);
                    }
                }
            }
        }
    }
}

