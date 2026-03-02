import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bewu implements Factory {
    private final Provider a;

    public bewu(Provider provider0) {
        this.a = provider0;
    }

    public final bewt a() {
        return new bewt(((beyf)this.a).a());
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

