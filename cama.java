import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;

public final class cama extends AbstractProducesMethodProducer {
    private final Producer b;

    public cama(Provider provider0, Provider provider1, Producer producer0) {
        super(provider1, new ProducerToken(cama.class), provider0);
        this.b = Producers.c(producer0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        return gmbu.i(((capf)object0).b());
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return this.b.get();
    }
}

