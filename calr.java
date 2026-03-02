import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;

public final class calr extends AbstractProducesMethodProducer {
    private final Producer b;

    public calr(Provider provider0, Provider provider1, Producer producer0) {
        super(provider1, new ProducerToken(calr.class), provider0);
        this.b = Producers.c(producer0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Boolean boolean0 = ((calm)object0).a;
        Long long0 = ((calm)object0).b;
        return long0 == null ? gmbu.i(new calm(boolean0, null)) : gmbu.i(new calm(boolean0, long0));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return this.b.get();
    }
}

