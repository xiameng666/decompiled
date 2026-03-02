import java.util.List;

public final class bdri implements ibts {
    public final bdsf a;
    public final gra b;
    public final long c;

    public bdri(bdsf bdsf0, gra gra0, long v) {
        this.a = bdsf0;
        this.b = gra0;
        this.c = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        gra gra1;
        ibuq.f(((dnr)object0), "$this$LazyColumn");
        bdsf bdsf0 = this.a;
        dol.a(((dnr)object0), new gze(656916820, true, new bdrj(bdsf0)));
        if(bdsf0.b != null) {
            dol.a(((dnr)object0), new gze(1776698905, true, new bdrk(bdsf0)));
        }
        long v = this.c;
        dol.a(((dnr)object0), new gze(0xACBF42BD, true, new bdrm(bdsf0)));
        List list0 = bdsf0.e;
        boolean z = list0.isEmpty();
        List list1 = bdsf0.f;
        gra gra0 = this.b;
        boolean z1 = list1.isEmpty();
        if(z) {
            gra1 = gra0;
        }
        else {
            gra1 = gra0;
            dol.a(((dnr)object0), new gze(972008002, true, new bdrp(z1, gra0, v, bdsf0)));
            if(bdrz.b(gra1) == bdqm.b) {
                bdrv bdrv0 = new bdrv(list0);
                bdrw bdrw0 = new bdrw(list0, bdsf0, z1, v);
                z1 = z1;
                v = v;
                bdsf0 = bdsf0;
                ((dnr)object0).b(list0.size(), null, bdrv0, new gze(2039820996, true, bdrw0));
            }
        }
        if(z) {
            if(!z1) {
            label_29:
                dol.a(((dnr)object0), new gze(0x1DA5B00, true, new bdrt(gra1, z, v, bdsf0)));
                if(bdrz.b(gra1) == bdqm.c) {
                    ((dnr)object0).b(list1.size(), null, new bdrx(list1), new gze(2039820996, true, new bdry(list1, bdsf0, v)));
                }
            }
        }
        else if(!z1) {
            dol.a(((dnr)object0), bdpj.l);
            goto label_29;
        }
        return ibom.a;
    }
}

