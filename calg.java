import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;

public final class calg extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;

    public calg(Provider provider0, Provider provider1, Producer producer0, Producer producer1) {
        super(provider1, new ProducerToken(calg.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        cank cank0 = (cank)((List)object0).get(0);
        canj canj0 = (canj)((List)object0).get(1);
        if(canj0.a()) {
            cank0.b(canj0);
        }
        return gmbu.i(cand.a(cank0.e()));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get()});
    }
}

