import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;

public final class calq extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;
    private final Producer e;

    public calq(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2, Producer producer3) {
        super(provider1, new ProducerToken(calq.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
        this.e = Producers.c(producer3);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        boolean z = false;
        calm calm0 = (calm)((List)object0).get(0);
        Boolean boolean0 = (Boolean)((List)object0).get(1);
        cank cank0 = (cank)((List)object0).get(2);
        Long long0 = (Long)((List)object0).get(3);
        Boolean boolean1 = calm0.a;
        if(boolean1.booleanValue()) {
            cank0.d();
            Long long1 = calm0.b;
            if(long1 != null && ((long)long1) > ((long)long0)) {
                cank0.g(long1.longValue());
            }
            else {
                cank0.g(long0.longValue());
            }
        }
        if(boolean1.booleanValue() && boolean0.booleanValue()) {
            z = true;
        }
        return gmbu.i(Boolean.valueOf(z));
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.d.get(), this.e.get()});
    }
}

