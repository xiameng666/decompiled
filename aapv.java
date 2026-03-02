import java.util.List;

public final class aapv implements zgz {
    @Override  // zgz
    public final Object a(Object object0, Object object1) {
        zoh zoh0;
        gryi gryi1;
        zoi zoi0;
        Object object2;
        ggdy ggdy0 = new ggdy();
        aaby aaby0 = (aaby)((gfsx)object0).g();
        if(aaby0 == null) {
            object2 = null;
        }
        else {
            grwe grwe0 = aaby0.d;
            if(grwe0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            zhr zhr0 = zhy.a(grwe0);
            if(zhr0 == null) {
                throw new IllegalStateException("Image not provided.");
            }
            String s = aaby0.a;
            if(s == null) {
                throw new IllegalStateException("Title not provided.");
            }
            String s1 = aaby0.c;
            String s2 = aaby0.b;
            if(s1 != null && aaby0.f != null) {
                zoi0 = new zoi(s1);
            }
            else if(s1 == null) {
                zoi0 = null;
            }
            else {
                zoi0 = new zoj(s1);
            }
            object2 = new zol(aaby0, zhr0, s, s2, zoi0);
        }
        if(object2 != null) {
            ggdy0.i(object2);
        }
        gged_interceptors gged0 = gged_interceptors.i(((List)object1));
        ibuq.f(gged0, "sectionItems");
        ggdy ggdy1 = new ggdy();
        ggqk ggqk0 = gged0.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            gryj gryj0 = (gryj)ggqk0.next();
            String s3 = gryj0.c;
            ibuq.e(s3, "getTitle(...)");
            ggdy1.i(new zop(s3));
            hfuo hfuo0 = gryj0.d;
            ibuq.e(hfuo0, "getSearchItemsList(...)");
            ibuq.c(gryj0);
            ibuq.f(gryj0, "<this>");
            if((gryj0.b & 2) == 0) {
                gryi1 = null;
            }
            else {
                gryi gryi0 = gryj0.e;
                gryi1 = gryi0 == null ? gryi.a : gryi0;
            }
            List list0 = ibpo.ag(ibpo.al(hfuo0, gryi1));
            int v = 0;
            for(Object object3: list0) {
                grwe grwe1 = ((gryi)object3).c;
                if(grwe1 == null) {
                    grwe1 = grwe.a;
                }
                ibuq.e(grwe1, "getImage(...)");
                zhr zhr1 = zhy.a(grwe1);
                String s4 = ((gryi)object3).d;
                ibuq.e(s4, "getTitle(...)");
                String s5 = ((gryi)object3).e;
                ibuq.e(s5, "getDescription(...)");
                if(list0.size() == 1) {
                    zoh0 = zoh.d;
                }
                else if(v == 0) {
                    zoh0 = zoh.a;
                }
                else {
                    zoh0 = v == list0.size() - 1 ? zoh.c : zoh.b;
                }
                grwp grwp0 = ((gryi)object3).g;
                if(grwp0 == null) {
                    grwp0 = grwp.a;
                }
                ggdy1.i(new zoo(zhr1, s4, s5, zoh0, zhz.a(grwp0)));
                ++v;
            }
        }
        gged_interceptors gged1 = ggdy1.h();
        ibuq.e(gged1, "build(...)");
        ggdy0.k(gged1);
        return ggdy0.h();
    }
}

