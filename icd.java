import android.graphics.Rect;

final class icd extends ibur implements ibts {
    final ice a;
    final hze b;

    public icd(ice ice0, hze hze0) {
        this.a = ice0;
        this.b = hze0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        idd idd1;
        igi igi0 = (igi)object0;
        ice ice0 = this.a;
        if(ice0.a.c.e() > 0) {
            long v = igi0.n().g();
            hze hze0 = this.b;
            ida[] arr_ida = idc.b;
            int v1 = 0;
            while(v1 < 9) {
                ida ida0 = arr_ida[v1];
                Object object1 = hze0.a.a(ida0);
                ibuq.c(object1);
                ibt ibt0 = ida0.a();
                long v2 = ((idd)object1).c;
                idd idd0 = (idd)object1;
                idc.a(igi0, ibt0, v2, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                if(idd0.f()) {
                    idd1 = idd0;
                    idc.a(igi0, idd0.a, idd0.e, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                    idc.a(igi0, idd1.b, idd1.f, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                }
                else {
                    idd1 = idd0;
                }
                idc.a(igi0, ida0.b(), idd1.d, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                ++v1;
                igi0 = igi0;
            }
            if(ice0.a().g()) {
                bzd bzd0 = ice0.a();
                Object[] arr_object = bzd0.a;
                int v3 = bzd0.b;
                for(int v4 = 0; v4 < v3; ++v4) {
                    gra gra0 = (gra)arr_object[v4];
                    ibt ibt1 = (ibt)ice0.a.b.get(v4);
                    Rect rect0 = (Rect)gra0.a();
                    igi0.o(ibt1.c(), ((float)rect0.left));
                    igi0.o(ibt1.b(), ((float)rect0.top));
                    igi0.o(ibt1.d(), ((float)rect0.right));
                    igi0.o(ibt1.a(), ((float)rect0.bottom));
                }
            }
        }
        return ibom.a;
    }
}

