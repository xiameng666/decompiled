import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import java.util.concurrent.Executor;

public final class cals extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;
    private final Producer e;
    private final Producer f;
    private final Producer g;

    public cals(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2, Producer producer3, Producer producer4, Producer producer5) {
        super(provider1, new ProducerToken(cals.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
        this.e = Producers.c(producer3);
        this.f = Producers.c(producer4);
        this.g = Producers.c(producer5);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Long long0 = (Long)((List)object0).get(0);
        caoi caoi0 = (caoi)((List)object0).get(1);
        canp canp0 = (canp)((List)object0).get(2);
        Executor executor0 = (Executor)((List)object0).get(3);
        canh canh0 = (canh)((List)object0).get(4);
        cank cank0 = (cank)((List)object0).get(5);
        if(!huhz.k()) {
            return gmbu.i(new calm(Boolean.valueOf(true), ((long)0x8000000000000000L)));
        }
        canm canm0 = new canm(5);
        canm0.g();
        canh0.b(canm0);
        return glzd.g(canp0.a(), new call(cank0, caoi0, canm0, canp0, executor0), executor0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get()});
    }
}

