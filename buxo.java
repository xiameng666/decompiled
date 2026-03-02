import dagger.internal.Factory;
import dagger.internal.Provider;

public final class buxo implements Factory {
    private final Provider a;

    public buxo(Provider provider0) {
        this.a = provider0;
    }

    public final fnkt a() {
        fnle fnle0 = (fnle)this.a.get();
        ibuq.f(fnle0, "accountMenuManager");
        return new buum(fnle0.c, fnle0.o);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

