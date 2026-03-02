import java.util.List;

public final class hbc implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        synchronized(hca.c) {
            List list0 = hca.h;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ibts)list0.get(v2)).a(object0);
            }
        }
        return ibom.a;
    }
}

