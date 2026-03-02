import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.List;
import jeb.synthetic.TWR;

public final class calh extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;

    public calh(Provider provider0, Provider provider1, Producer producer0, Producer producer1) {
        super(provider1, new ProducerToken(calh.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        caol caol0 = (caol)((List)object0).get(0);
        caoi caoi0 = (caoi)((List)object0).get(1);
        long v = -1L;
        Long long0 = (long)-1L;
        if(huhz.m()) {
            caot caot0 = caoi0.a(Long.valueOf(0L), null);
            if(caot0 != null) {
                try {
                    capc capc0 = (capc)caot0.b();
                    if(capc0 != null) {
                        if(capc0.d().booleanValue()) {
                            v = (long)capc0.g;
                        }
                        long0 = v;
                        goto label_17;
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(caot0, throwable0);
                    throw throwable0;
                }
            }
            if(caot0 != null) {
            label_17:
                caot0.close();
                return gmbu.i(long0);
            }
        }
        return gmbu.i(long0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get()});
    }
}

