import j..util.DesugarCollections;
import java.util.Map.Entry;
import java.util.Map;

public final class fkzz implements gfsi {
    public final flad a;

    public fkzz(flad flad0) {
        this.a = flad0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((flak)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((flak)object0))));
        Map map0 = flal.g(this.a.c);
        for(Object object1: map0.keySet()) {
            int v = (int)(((Integer)object1));
            int v1 = flal.a(DesugarCollections.unmodifiableList(((flak)((flah)hftp0).b_message).c), v);
            if(v1 == -1) {
                ((flah)hftp0).l(flal.h(v));
            }
            else {
                ((flah)hftp0).n(v1, flal.c(((flah)hftp0).a(v1)));
            }
        }
        for(Object object2: map0.entrySet()) {
            int v2 = (int)(((Integer)((Map.Entry)object2).getKey()));
            Long long0 = (Long)((Map.Entry)object2).getValue();
            if(long0 != null) {
                int v3 = flal.b(DesugarCollections.unmodifiableList(((flak)((flah)hftp0).b_message).f), v2);
                if(v3 == -1) {
                    long v4 = (long)long0;
                    ((flah)hftp0).m(flal.d(v2, v4, v4));
                }
                else {
                    ((flah)hftp0).o(v3, flal.e(((flah)hftp0).k(v3), long0.longValue()));
                }
            }
        }
        return (flak)((ProtoLiteBuilder)(((flah)hftp0))).N_build();
    }
}

