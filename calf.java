import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public final class calf extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Provider c;
    private final Provider d;
    private final Producer e;
    private final Producer f;
    private final Producer g;
    private final Producer h;

    public calf(Provider provider0, Provider provider1, Producer producer0, Provider provider2, Provider provider3, Producer producer1, Producer producer2, Producer producer3, Producer producer4) {
        super(provider1, new ProducerToken(calf.class), provider0);
        this.b = Producers.c(producer0);
        this.c = provider2;
        this.d = provider3;
        this.e = Producers.c(producer1);
        this.f = Producers.c(producer2);
        this.g = Producers.c(producer3);
        this.h = Producers.c(producer4);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        gmcd gmcd0;
        Set set0 = (Set)((List)object0).get(0);
        Executor executor0 = (Executor)((List)object0).get(1);
        cank cank0 = (cank)((List)object0).get(2);
        canh canh0 = (canh)((List)object0).get(3);
        canj canj0 = (canj)((List)object0).get(4);
        canh0.f();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: set0) {
            canj canj1 = (canj)object1;
            Long long0 = canj1.a;
            Long long1 = canj1.b;
            HashSet hashSet0 = new HashSet();
            camk camk0 = (camk)this.c;
            caot caot0 = camk0.a().a(long0, long1);
            if(caot0 == null) {
            label_25:
                if(caot0 != null) {
                    caot0.close();
                }
            }
            else {
                while(true) {
                    try {
                    label_17:
                        if(!caot0.e()) {
                            goto label_25;
                        }
                        if(((capc)caot0.d()) == null) {
                            goto label_17;
                        }
                        hashSet0.add(Integer.valueOf(2));
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(caot0, throwable0);
                        throw throwable0;
                    }
                }
            }
            for(Object object2: hashSet0) {
                if(((int)(((Integer)object2))) == 2 && huhz.k() && ((long)long0) == 0L) {
                    canm canm0 = new canm(5);
                    canm0.g();
                    canh0.b(canm0);
                    caoi caoi0 = camk0.a();
                    canp canp0 = ((camj)this.d).a();
                    caot caot1 = caoi0.a(long0, long1);
                    try {
                        gmcd0 = glzd.f(canp0.f(caot1, canm0), new calc(canj1), executor0);
                    }
                    catch(Throwable throwable1) {
                        TWR.safeClose$NT(caot1, throwable1);
                        throw throwable1;
                    }
                    if(caot1 != null) {
                        caot1.close();
                    }
                    arrayList0.add(gmcd0);
                }
            }
        }
        return glzd.f(gmbu.e(arrayList0), new calb(canj0, cank0), executor0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get()});
    }
}

