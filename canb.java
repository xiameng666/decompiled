import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.HashMap;
import java.util.List;

public final class canb extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Producer d;

    public canb(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Producer producer2) {
        super(provider1, new ProducerToken(canb.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = Producers.c(producer2);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Long long1;
        int v = 0;
        Long long0 = (Long)((List)object0).get(0);
        cank cank0 = (cank)((List)object0).get(1);
        caot caot0 = ((caoi)((List)object0).get(2)).a(long0, null);
        if(caot0 == null) {
            return gmbu.i(new HashMap());
        }
        HashMap hashMap0 = new HashMap();
        long v1 = 0x8000000000000000L;
        long v2 = 0x7FFFFFFFFFFFFFFFL;
        while(caot0.e()) {
            capc capc0 = (capc)caot0.d();
            if(capc0 != null) {
                if(!huhz.m()) {
                    if(capc0.a().booleanValue()) {
                        long1 = capc0.a;
                        goto label_20;
                    }
                }
                else if(capc0.d().booleanValue()) {
                    long1 = capc0.g;
                    goto label_20;
                }
                long1 = null;
            label_20:
                long v3 = Math.max(v1, (long1 == null ? 0x8000000000000000L : ((long)long1)));
                v2 = Math.min(v2, (long1 == null ? 0x7FFFFFFFFFFFFFFFL : ((long)long1)));
                Integer integer0 = (int)2;
                if(hashMap0.containsKey(integer0)) {
                    hashMap0.put(integer0, Integer.valueOf(((int)(((Integer)hashMap0.get(integer0)))) + 1));
                }
                else {
                    hashMap0.put(integer0, Integer.valueOf(1));
                }
                v1 = v3;
            }
            ++v;
            if(((long)v) >= huhz.c()) {
                huhz.c();
                cank0.b(new canj(long0, ((long)(v2 - 1L))));
                break;
            }
        }
        caot0.close();
        if(v1 > ((long)long0)) {
            cank0.g(v1);
        }
        return gmbu.i(hashMap0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.d.get()});
    }
}

