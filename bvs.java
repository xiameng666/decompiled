import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class bvs {
    public final bvt a;
    public final bvn b;
    public final bin c;

    public bvs(bvt bvt0, bvn bvn0, bin bin0) {
        this.a = bvt0;
        this.b = bvn0;
        this.c = bin0;
    }

    public final void a() {
        bvn bvn0;
        do {
            bvn0 = this.b;
            AtomicReference atomicReference0 = this.a.a.f;
            if(atomicReference0.compareAndSet(bvn0, null)) {
                bvn0.b(bvx.a);
                break;
            }
        }
        while(atomicReference0.get() == bvn0);
        bvn0.a();
        bld bld0 = this.c.f();
        Map map0 = ((bkz)bld0).b;
        synchronized(map0) {
            bkx bkx0 = (bkx)map0.remove(bvn0);
            if(bkx0 != null) {
                bkx0.b();
                bow.a().execute(new bku(((bkz)bld0), bkx0));
            }
        }
    }
}

