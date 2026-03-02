import java.util.HashMap;

public final class cfke implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        hfuo hfuo0 = cfgp.a.b;
        HashMap hashMap0 = new HashMap();
        for(Object object0: hfuo0) {
            cdfp cdfp0 = (cdfp)object0;
            for(Object object1: cdfp0.c) {
                hashMap0.put(((String)object1), Float.valueOf(cdfp0.d));
            }
        }
        return ggeo.k(hashMap0);
    }
}

