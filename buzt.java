import dagger.internal.Factory;
import dagger.internal.Provider;

public final class buzt implements Factory {
    private final Provider a;

    public buzt(Provider provider0) {
        this.a = provider0;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        fgvt fgvt0 = (fgvt)this.a.get();
        ibuq.f(fgvt0, "clock");
        return new buzr(fgvt0, ibzy.h(15, ibzz.e));
    }
}

