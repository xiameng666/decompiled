import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Map;

public final class zlo implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;

    public zlo(Provider provider0, Provider provider1, Provider provider2) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
    }

    public final zec a() {
        return zlo.b(((zil)this.a.get()), ((zec)this.b.get()), ((Map)this.c.get()));
    }

    public static zec b(zil zil0, zec zec0, Map map0) {
        if(hojn.m()) {
            hoka hoka0 = zil0.a;
            if(hoka0 != null) {
                gful_cronetEngineProvider gful0 = (gful_cronetEngineProvider)map0.get(hoka0);
                if(gful0 != null) {
                    zec0 = (zec)gful0.mr();
                }
            }
        }
        Preconditions.f(zec0);
        return zec0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

