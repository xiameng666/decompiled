import j..util.DesugarCollections;
import java.util.Map;

public final class dybq implements gfsi {
    public final dyna a;

    public dybq(dyna dyna0) {
        this.a = dyna0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Map map0 = DesugarCollections.unmodifiableMap(((dylt)object0).b);
        dyna dyna0 = this.a;
        if(map0.containsKey(dyna0.name())) {
            String s = dyna0.name();
            dykr dykr0 = dykr.a;
            s.getClass();
            dykr dykr1 = (dykr)((dylt)object0).b.get(s);
            if(dykr1 != null) {
                dykr0 = dykr1;
            }
            return gfsx.m(dykr0);
        }
        return gfqx.a;
    }
}

