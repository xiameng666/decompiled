import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bvar implements Factory {
    private final Provider a;

    public bvar(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return jqy.a(new bvao(((ejaz)this.a).a()));
    }
}

