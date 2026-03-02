import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class cali extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;

    public cali(Provider provider0, Provider provider1, Producer producer0, Producer producer1) {
        super(provider1, new ProducerToken(cali.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        cank cank0 = (cank)((List)object0).get(0);
        Long long0 = (Long)((List)object0).get(1);
        Long long1 = cank0.a();
        return huhz.m() ? gmbu.i(new canj(long1, long0)) : gmbu.i(new canj(long1, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get()});
    }
}

