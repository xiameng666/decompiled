import java.util.ArrayList;

final class duvd implements ibtw {
    public static final duvd a;

    static {
        duvd.a = new duvd();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hqf hqf0 = exc.a;
        if(hqf0 == null) {
            hqd hqd0 = new hqd("Sharp.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 0x60);
            hmy hmy0 = new hmy(hll.a);
            ArrayList arrayList0 = new ArrayList(0x20);
            hqg.h(19.0f, 6.41f, arrayList0);
            hqg.f(17.59f, 5.0f, arrayList0);
            hqg.f(12.0f, 10.59f, arrayList0);
            hqg.f(6.41f, 5.0f, arrayList0);
            hqg.f(5.0f, 6.41f, arrayList0);
            hqg.f(10.59f, 12.0f, arrayList0);
            hqg.f(5.0f, 17.59f, arrayList0);
            hqg.f(6.41f, 19.0f, arrayList0);
            hqg.f(12.0f, 13.41f, arrayList0);
            hqg.f(17.59f, 19.0f, arrayList0);
            hqg.f(19.0f, 17.59f, arrayList0);
            hqg.f(13.41f, 12.0f, arrayList0);
            hqg.f(19.0f, 6.41f, arrayList0);
            hqg.a(arrayList0);
            hqd.e(hqd0, arrayList0, 0, "", hmy0, 1.0f, null, 1.0f, 1.0f, 2, 1.0f, 0x3800);
            exc.a = hqd0.a();
            hqf0 = exc.a;
            ibuq.c(hqf0);
        }
        fiso.b(hqf0, isq.c(0x7F151C03, ((goz)object0)), null, 0L, ((goz)object0), 0, 12);  // string:pay_back "Back"
        return ibom.a;
    }
}

