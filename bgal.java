import java.util.ArrayList;

final class bgal implements ibtw {
    public static final bgal a;

    static {
        bgal.a = new bgal();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dls.k(hfc.e, 18.0f);
        hqf hqf0 = ewd.a;
        if(hqf0 == null) {
            hqd hqd0 = new hqd("Filled.Done", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60);
            hmy hmy0 = new hmy(hll.a);
            ArrayList arrayList0 = new ArrayList(0x20);
            hqg.h(9.0f, 16.200001f, arrayList0);
            hqg.f(4.8f, 12.0f, arrayList0);
            hqg.g(-1.4f, 1.4f, arrayList0);
            hqg.f(9.0f, 19.0f, arrayList0);
            hqg.f(21.0f, 7.0f, arrayList0);
            hqg.g(-1.4f, -1.4f, arrayList0);
            hqg.f(9.0f, 16.200001f, arrayList0);
            hqg.a(arrayList0);
            hqd.e(hqd0, arrayList0, 0, "", hmy0, 1.0f, null, 1.0f, 1.0f, 2, 1.0f, 0x3800);
            ewd.a = hqd0.a();
            hqf0 = ewd.a;
            ibuq.c(hqf0);
        }
        fiso.b(hqf0, null, hfc0, 0L, ((goz)object0), 0x30, 8);
        return ibom.a;
    }
}

