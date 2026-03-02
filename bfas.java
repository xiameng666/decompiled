import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bfas implements Factory {
    private final Provider a;

    public bfas(Provider provider0) {
        this.a = provider0;
    }

    public final bfar a() {
        return new bfar(((bewu)this.a).a());
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

