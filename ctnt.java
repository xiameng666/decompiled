import dagger.internal.Factory;
import dagger.internal.Provider;

public final class ctnt implements Factory {
    private final Provider a;

    public ctnt(Provider provider0) {
        this.a = provider0;
    }

    public final cuvm a() {
        return czdu.cz(((ejaz)this.a).a(), null);
    }

    @Override  // ibnf, ibne
    public final Object get() {
        return this.a();
    }
}

