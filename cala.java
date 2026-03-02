import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import java.util.concurrent.Executor;

public final class cala extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;
    private final Producer e;

    public cala(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2, Producer producer3) {
        super(provider1, new ProducerToken(cala.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
        this.e = Producers.c(producer3);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        List list0 = (List)object0;
        Boolean boolean0 = (Boolean)list0.get(0);
        Boolean boolean1 = (Boolean)list0.get(1);
        Executor executor0 = (Executor)list0.get(2);
        return glzd.f(this.d.get(), new cakx(boolean0, boolean1), executor0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.e.get()});
    }
}

