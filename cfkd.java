import java.util.HashMap;

public final class cfkd implements gful_cronetEngineProvider {
    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        hfuo hfuo0 = cfgp.a.c;
        HashMap hashMap0 = new HashMap();
        for(Object object0: hfuo0) {
            cdfo cdfo0 = (cdfo)object0;
            for(Object object1: cdfo0.c) {
                hashMap0.put(((Long)object1), Float.valueOf(cdfo0.d));
            }
        }
        return ggeo.k(hashMap0);
    }
}

