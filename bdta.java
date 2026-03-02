import java.util.List;

public final class bdta implements ibts {
    public final bdtt a;
    public final ibth b;
    public final gra c;
    public final long d;

    public bdta(bdtt bdtt0, ibth ibth0, gra gra0, long v) {
        this.a = bdtt0;
        this.b = ibth0;
        this.c = gra0;
        this.d = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z5;
        boolean z4;
        gra gra1;
        ibuq.f(((dnr)object0), "$this$LazyColumn");
        dol.a(((dnr)object0), bdpw.j);
        dol.a(((dnr)object0), new gze(612650645, true, new bdtb(this.b)));
        bdtt bdtt0 = this.a;
        List list0 = bdtt0.a;
        boolean z = list0.isEmpty();
        List list1 = bdtt0.b;
        boolean z1 = list1.isEmpty();
        List list2 = bdtt0.c;
        boolean z2 = list2.isEmpty();
        gra gra0 = this.c;
        long v = this.d;
        if(z) {
            gra1 = gra0;
        }
        else {
            boolean z3 = z1 && z2;
            bdtd bdtd0 = new bdtd(z3, gra0, v, bdtt0);
            gra1 = gra0;
            bdtt0 = bdtt0;
            v = v;
            dol.a(((dnr)object0), new gze(0x630C78F1, true, bdtd0));
            if(bdto.b(gra1) == bdqn.b) {
                ((dnr)object0).b(list0.size(), null, new bdti(list0), new gze(2039820996, true, new bdtj(list0, bdtt0, z3, v)));
            }
            dol.a(((dnr)object0), bdpw.k);
        }
        if(z1) {
            z5 = z;
            z4 = z2;
        }
        else {
            z4 = z2;
            bdtf bdtf0 = new bdtf(z4, z, gra1, v, bdtt0);
            z5 = z;
            bdtt0 = bdtt0;
            dol.a(((dnr)object0), new gze(1732432730, true, bdtf0));
            if(bdto.b(gra1) == bdqn.c) {
                bdtk bdtk0 = new bdtk(list1);
                bdtl bdtl0 = new bdtl(list1, bdtt0, z4, v);
                z4 = z4;
                ((dnr)object0).b(list1.size(), null, bdtk0, new gze(2039820996, true, bdtl0));
            }
            dol.a(((dnr)object0), bdpw.l);
        }
        if(!z4) {
            dol.a(((dnr)object0), new gze(0x4B20B779, true, new bdth(z5 && z1, gra1, v, bdtt0)));
            if(bdto.b(gra1) == bdqn.d) {
                ((dnr)object0).b(list2.size(), null, new bdtm(list2), new gze(2039820996, true, new bdtn(list2, bdtt0, v)));
            }
        }
        return ibom.a;
    }
}

