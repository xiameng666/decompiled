import dagger.internal.Factory;
import dagger.internal.Provider;

public final class burx implements Factory {
    private final Provider a;
    private final Provider b;

    public burx(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        bujj bujj0 = ((bujo)this.a).a();
        busd busd0 = (busd)this.b.get();
        ibuq.f(busd0, "stubProvider");
        return new buri(bujj0.a, busd0);
    }
}

