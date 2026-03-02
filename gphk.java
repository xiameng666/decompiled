import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Set;

public final class gphk implements Factory {
    private final Provider a;
    private final Provider b;

    public gphk(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        gged_interceptors gged0 = gged_interceptors.i(((Set)((InstanceFactory)this.b).a));
        gftb.check(gphm.a);
        return new gpkc(((gpgx)((InstanceFactory)this.a).a), gged0);
    }
}

