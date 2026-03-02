import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.concurrent.Executor;

public final class cqds implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;

    public cqds(Provider provider0, Provider provider1, Provider provider2, Provider provider3) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Executor executor0 = (Executor)this.a.get();
        frbx frbx0 = (frbx)this.b.get();
        frmi frmi0 = (frmi)this.c.get();
        frmr frmr0 = ((cqdt)this.d).a();
        frij frij0 = new frij();
        frij0.a = executor0;
        frij0.b = frbx0;
        frij0.c(frmi0, frmr0);
        frij0.b(frkf.a);
        frij0.b(frhu.a);
        frij0.b(frks.a);
        return frij0.a();
    }
}

