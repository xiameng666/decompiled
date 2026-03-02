import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

public final class fkrx implements Factory {
    private final Provider a;
    private final Provider b;

    public fkrx(Provider provider0, Provider provider1) {
        this.a = provider0;
        this.b = provider1;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        gfsx gfsx0 = (gfsx)((InstanceFactory)this.a).a;
        hhps hhps0 = (hhps)this.b.get();
        return gfsx0.i() ? ((ggtl)gfsx0.d()) : ggtn.c(hhps0.c);
    }
}

