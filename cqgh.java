import j..time.Instant;
import java.util.concurrent.atomic.AtomicReference;

public final class cqgh implements fkua {
    public final cqgi a;
    public final cqae b;

    public cqgh(cqgi cqgi0, cqae cqae0) {
        this.a = cqgi0;
        this.b = cqae0;
    }

    @Override  // fkua
    public final gmcd a(flad flad0) {
        cqae cqae0 = this.b;
        byte[] arr_b = this.a.a.b;
        Instant instant0 = Instant.ofEpochMilli(this.a.a.d);
        switch(this.a.a.a.ordinal()) {
            case 1: {
                cqae0.a.a(bbdg.fU);
                gmcd gmcd0 = glzd.f(cqae0.b.a(fkwm.a, instant0), new cqaa(), gmap.a);
                cqab cqab0 = new cqab();
                return glyi.g(gmcd0, Exception.class, cqab0, gmap.a);
            }
            case 2: {
                cqae0.a.a(bbdg.fV);
                gsup gsup0 = (gsup)cqbw.a(new cqac(), arr_b);
                ibuq.f(gsup0, "request");
                AtomicReference atomicReference0 = new AtomicReference();
                AtomicReference atomicReference1 = new AtomicReference();
                fkyn fkyn0 = new fkyn(new fkym(atomicReference0, cqae0.b, gsup0, atomicReference1));
                gmcd gmcd1 = glzd.f(gdtf.j(cqae0.b.b.b(fkyn0, gmap.a), new fkwr(new fkwq(atomicReference1, cqae0.b, atomicReference0)), gmap.a), new cqaa(), gmap.a);
                cqab cqab1 = new cqab();
                return glyi.g(gmcd1, Exception.class, cqab1, gmap.a);
            }
            case 3: {
                cqae0.a.a(bbdg.fW);
                gsun gsun0 = (gsun)cqbw.a(new cqad(), arr_b);
                ibuq.f(gsun0, "request");
                AtomicReference atomicReference2 = new AtomicReference();
                AtomicReference atomicReference3 = new AtomicReference();
                fkxm fkxm0 = new fkxm(new fkxk(atomicReference2, cqae0.b, gsun0, atomicReference3));
                gmcd gmcd2 = glzd.f(gdtf.j(cqae0.b.b.b(fkxm0, gmap.a), new fkxo(new fkxn(atomicReference3, cqae0.b, atomicReference2)), gmap.a), new cqaa(), gmap.a);
                cqab cqab2 = new cqab();
                return glyi.g(gmcd2, Exception.class, cqab2, gmap.a);
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }
}

