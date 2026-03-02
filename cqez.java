import dagger.internal.Factory;
import dagger.internal.Provider;
import j..util.Objects;

public final class cqez implements Factory {
    private final Provider a;

    public cqez(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        fiyl fiyl0 = (fiyl)this.a.get();
        Objects.requireNonNull(fiyl0);
        cqer cqer0 = new cqer(fiyl0);
        cqes cqes0 = new cqes();
        cqet cqet0 = new cqet();
        return cjiu.a("MdiSyncModule", bbcu.dt, cqer0, ((gful_cronetEngineProvider)cqes0), ((gful_cronetEngineProvider)cqet0));
    }
}

