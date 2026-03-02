import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;

public final class cakt extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;

    public cakt(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2) {
        super(provider1, new ProducerToken(cakt.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        List list0 = (List)object0;
        caoj caoj0 = (caoj)list0.get(0);
        cano cano0 = (cano)list0.get(1);
        canh canh0 = (canh)list0.get(2);
        return cako.a(caoj0, cano0, caok.b, 8, canh0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.d.get()});
    }
}

