import android.content.Context;
import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;

public final class calo extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;

    public calo(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2) {
        super(provider1, new ProducerToken(calo.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Context context0 = (Context)((List)object0).get(0);
        canh canh0 = (canh)((List)object0).get(1);
        if(canf.c(context0)) {
            canh0.f();
            return this.b.get();
        }
        if(huhz.n()) {
            ((ggtj)caln.a.j()).x("MediaStore access denied or indexing disabled");
        }
        return gmbu.i(Boolean.valueOf(true));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.c.get(), this.d.get()});
    }
}

