import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.concurrent.Executor;

public final class cjja implements Factory {
    private final Provider a;
    private final Provider b;
    private final Provider c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;

    public cjja(Provider provider0, Provider provider1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.a = provider0;
        this.b = provider1;
        this.c = provider2;
        this.d = provider3;
        this.e = provider4;
        this.f = provider5;
        this.g = provider6;
        this.h = provider7;
    }

    @Override  // ibnf, ibne
    public final Object get() {
        Executor executor0 = (Executor)this.a.get();
        frbx frbx0 = (frbx)this.b.get();
        frii frii0 = (frii)this.c.get();
        gfsx gfsx0 = (gfsx)this.f.get();
        frhi frhi0 = (frhi)this.g.get();
        babh babh0 = babh.a();
        fkyu fkyu0 = new fkyu(babh0, fkyw.a);
        fkqa fkqa0 = (fkqa)((gfsx)((InstanceFactory)this.d).a).f(fkyu0);
        cjiy cjiy0 = new cjiy();
        fkuh fkuh0 = (fkuh)((gfsx)((InstanceFactory)this.e).a).f(cjiy0);
        fgvt fgvt0 = (fgvt)gfsx0.f(new fgvy());
        azts azts0 = new azts(babh0, null);
        return new fkvs(babh0, executor0, "OneGoogle", frbx0, frii0, fkqa0, fkuh0, fgvt0, frhi0, ((azts)((gfsx)((InstanceFactory)this.h).a).f(azts0)));
    }
}

