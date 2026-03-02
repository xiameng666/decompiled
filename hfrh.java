import java.util.concurrent.atomic.AtomicReference;

public final class hfrh {
    public final iapk a;
    public final Object b;
    public final iaof_metadata c;

    public hfrh(hfrg hfrg0) {
        this.a = hfrg0.a;
        this.b = hfrg0.b;
        this.c = hfrg0.c;
    }

    public static gmcd a(ibjo ibjo0, hfrf hfrf0, Object object0) {
        AtomicReference atomicReference0 = new AtomicReference();
        AtomicReference atomicReference1 = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        gmcd gmcd0 = glzd.f(((gmcd)hfrf0.a(ibjo0.p(new iakw[]{new hfre(atomicReference0, atomicReference1, atomicReference2)}), object0)), new hfqz(atomicReference0, atomicReference1, atomicReference2), gmap.a);
        hfra hfra0 = new hfra(atomicReference0, atomicReference1, atomicReference2);
        return glyi.f(gmcd0, iapn.class, hfra0, gmap.a);
    }

    public static void b(hfrg hfrg0, AtomicReference atomicReference0, AtomicReference atomicReference1) {
        iaof_metadata iaof0 = (iaof_metadata)atomicReference0.get();
        iaof_metadata iaof1 = (iaof_metadata)atomicReference1.get();
        if(iaof1 != null) {
            hfrg0.c = iaof1;
        }
    }
}

