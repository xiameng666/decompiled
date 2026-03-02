import dagger.internal.Factory;
import dagger.internal.Provider;

public final class busa implements Factory {
    private final Provider a;
    private final Provider b;

    public busa(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        bujj bujj0 = ((bujo)this.a).a();
        busc busc0 = (busc)this.b.get();
        ibuq.f(busc0, "stubProvider");
        return new burn(bujj0.a, busc0);
    }
}

