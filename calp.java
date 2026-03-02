import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;

public final class calp extends AbstractProducesMethodProducer {
    private final Producer b;

    public calp(Provider provider0, Provider provider1, Producer producer0) {
        super(provider1, new ProducerToken(calp.class), provider0);
        this.b = Producers.c(producer0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        return gmbu.i(((cank)object0).a());
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return this.b.get();
    }
}

