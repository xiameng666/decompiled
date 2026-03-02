import dagger.internal.Factory;
import dagger.internal.Provider;

public final class bvte implements Factory {
    private final Provider a;
    private final Provider b;

    public bvte(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        gmcg gmcg0 = (gmcg)this.a.get();
        frbx frbx0 = (frbx)this.b.get();
        frij frij0 = new frij();
        frij0.a = gmcg0;
        frij0.b = frbx0;
        frij0.b(frhu.a);
        return frij0.a();
    }
}

