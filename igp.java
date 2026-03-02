import java.util.List;

final class igp extends ibur implements ibth {
    final igt a;

    public igp(igt igt0) {
        this.a = igt0;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        igt igt0 = this.a;
        igt0.f.g = 0;
        gwq gwq0 = igt0.o().k();
        Object[] arr_object = gwq0.a;
        int v1 = gwq0.b;
        for(int v2 = 0; v2 < v1; ++v2) {
            igt igt1 = ((ify)arr_object[v2]).v.p;
            ibuq.c(igt1);
            igt1.h = igt1.i;
            igt1.i = 0x7FFFFFFF;
            if(igt1.y == 2) {
                igt1.y = 3;
            }
        }
        igt0.j(ign.a);
        igm igm0 = ((ife)igt0.i()).g;
        if(igm0 != null) {
            boolean z = igm0.l;
            List list0 = igt0.o().y();
            int v3 = list0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                igm igm1 = ((ify)list0.get(v4)).s().C();
                if(igm1 != null) {
                    igm1.l = z;
                }
            }
        }
        igm igm2 = ((ife)igt0.i()).g;
        ibuq.c(igm2);
        igm2.K().g();
        if(((ife)igt0.i()).g != null) {
            List list1 = igt0.o().y();
            int v5 = list1.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                igm igm3 = ((ify)list1.get(v6)).s().C();
                if(igm3 != null) {
                    igm3.l = false;
                }
            }
        }
        gwq gwq1 = igt0.o().k();
        Object[] arr_object1 = gwq1.a;
        int v7 = gwq1.b;
        for(int v = 0; v < v7; ++v) {
            igt igt2 = ((ify)arr_object1[v]).v.p;
            ibuq.c(igt2);
            if(igt2.h != igt2.i && igt2.i == 0x7FFFFFFF) {
                igt2.r(true);
            }
        }
        igt0.j(igo.a);
        return ibom.a;
    }
}

