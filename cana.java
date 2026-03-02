import dagger.internal.Provider;
import dagger.producers.Producer;
import dagger.producers.internal.AbstractProducesMethodProducer;
import dagger.producers.internal.Producers;
import dagger.producers.monitoring.ProducerToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import jeb.synthetic.TWR;

public final class cana extends AbstractProducesMethodProducer {
    private final Producer b;
    private final Producer c;
    private final Provider d;
    private final Provider e;
    private final Provider f;
    private final Provider g;
    private final Provider h;
    private final Producer i;
    private final Producer j;
    private final Producer k;

    public cana(Provider provider0, Provider provider1, Producer producer0, Producer producer1, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Producer producer2, Producer producer3, Producer producer4) {
        super(provider1, new ProducerToken(cana.class), provider0);
        this.b = Producers.c(producer0);
        this.c = Producers.c(producer1);
        this.d = provider2;
        this.e = provider3;
        this.f = provider4;
        this.g = provider5;
        this.h = provider6;
        this.i = Producers.c(producer2);
        this.j = Producers.c(producer3);
        this.k = Producers.c(producer4);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    public final gmcd b(Object object0) {
        Provider provider0;
        gmcd gmcd0;
        HashMap hashMap0 = (HashMap)((List)object0).get(0);
        Long long0 = (Long)((List)object0).get(1);
        cank cank0 = (cank)((List)object0).get(2);
        canh canh0 = (canh)((List)object0).get(3);
        Executor executor0 = (Executor)((List)object0).get(4);
        Long long1 = cank0.a();
        ArrayList arrayList0 = new ArrayList();
        camx camx0 = new camx(cank0, new canj(long0, long1));
        if(huhz.k()) {
            int v = 0;
            for(Object object1: hashMap0.values()) {
                v += (int)(((Integer)object1));
            }
            if(((long)v) >= huhz.c() || hashMap0.containsKey(Integer.valueOf(2))) {
                canm canm0 = new canm(5);
                canm0.g();
                canh0.b(canm0);
                camk camk0 = (camk)this.d;
                caot caot0 = camk0.a().a(long0, null);
                HashSet hashSet0 = new HashSet();
                HashSet hashSet1 = new HashSet();
                boolean z = huhz.a.h().R();
                if(z && caot0 != null) {
                    while(caot0.e()) {
                        capc capc0 = (capc)caot0.d();
                        if(capc0 != null) {
                            if(capc0.b()) {
                                hashSet0.add(capc0.d);
                            }
                            if(capc0.c()) {
                                hashSet1.add(capc0.f);
                            }
                        }
                    }
                    caot0.close();
                    caot0 = camk0.a().a(long0, null);
                }
                canp canp0 = ((camj)this.f).a();
                if(caot0 == null) {
                    gmcd0 = gmbu.i(Boolean.valueOf(false));
                }
                else {
                    try {
                        ((ggtj)camy.a.h()).z("Sending update to icing for %d files to MusicRecording corpus.", caot0.a());
                        gmcd0 = canp0.f(caot0, canm0);
                    }
                    catch(Throwable throwable0) {
                        TWR.safeClose$NT(caot0, throwable0);
                        throw throwable0;
                    }
                    caot0.close();
                }
                gmbu.t(gmcd0, camx0, executor0);
                arrayList0.add(gmcd0);
                if(z) {
                    Iterator iterator1 = hashSet0.iterator();
                    while(true) {
                        provider0 = this.e;
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object2 = iterator1.next();
                        arrayList0.add(camy.a(((camm)provider0).a(), ((Long)object2).longValue(), ((camh)this.g).a(), canm0, caok.a));
                    }
                    for(Object object3: hashSet1) {
                        arrayList0.add(camy.a(((camm)provider0).a(), ((Long)object3).longValue(), ((cami)this.h).a(), canm0, caok.b));
                    }
                }
            }
        }
        return glzd.f(gmbu.e(arrayList0), new camw(), executor0);
    }

    @Override  // dagger.producers.internal.AbstractProducesMethodProducer
    protected final gmcd c() {
        return gmbu.f(new gmcd[]{this.b.get(), this.c.get(), this.i.get(), this.j.get(), this.k.get()});
    }
}

