import android.content.Context;
import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import java.util.concurrent.Executor;

public final class camz extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Producer i;
    private final Producer j;

    public camz(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Producer producer2, Producer producer3) {
        super(provider1, new ProducerToken(camz.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = provider2;
        this.e = provider3;
        this.f = provider4;
        this.g = provider5;
        this.h = provider6;
        this.i = Producers.c(producer2);
        this.j = Producers.c(producer3);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Context context0 = (Context)((List)object0).get(0);
        canh canh0 = (canh)((List)object0).get(1);
        Executor executor0 = (Executor)((List)object0).get(2);
        boolean z = canf.c(context0);
        Provider provider0 = this.h;
        Provider provider1 = this.g;
        Provider provider2 = this.f;
        Provider provider3 = this.e;
        if(z) {
            canp canp0 = ((camj)provider3).a();
            ((camh)provider2).a();
            ((cami)provider1).a();
            ((caml)provider0).a();
            canf.d(canp0);
            canh0.f();
            return this.c.get();
        }
        if(huhz.n()) {
            ((ggtj)camy.a.j()).x("MediaStore access denied or indexing disabled");
        }
        ((canl)this.d).a().c();
        return canf.a(((camj)provider3).a(), ((camh)provider2).a(), ((caml)provider0).a(), ((cami)provider1).a(), executor0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.i.get(), this.j.get()});
    }
}

