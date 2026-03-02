import java.util.Map.Entry;

public final class bgjf implements evqk {
    public final bgjk a;
    public final gged_interceptors b;

    public bgjf(bgjk bgjk0, gged_interceptors gged0) {
        this.a = bgjk0;
        this.b = gged0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        bgjk bgjk0 = this.a;
        Object object1 = bgjk0.b.apply(((ggeo)object0));
        gged_interceptors gged0 = this.b;
        ggfp ggfp0 = ggch.j(gged0).m(new bgjg()).l(new bgjh()).i(new bgji()).l(new bgjj()).p();
        gfvb gfvb0 = bgjk0.e;
        gfvb0.g();
        bdva bdva0 = bgjk0.c;
        String s = bgjk0.d;
        ByteString hfsf0 = bgjk.b();
        for(Object object2: bdva0.a(s)) {
            bdvj bdvj0 = (bdvj)object2;
            if(ByteString.copyFrom(bdvj0.d).equals(hfsf0)) {
                gfvb0.h(new bgif(ByteString.copyFrom(bdvj0.b)), Boolean.valueOf(bdvj0.c));
            }
        }
        ggfp ggfp1 = ggch.j(ggfp0).i(new bgjc(bgjk0, ((grbr)object1))).p();
        ByteString hfsf1 = bgjk.b();
        ggdy ggdy0 = new ggdy();
        for(Object object3: ((gfwl)gfvb0).a.entrySet()) {
            bgif bgif0 = (bgif)((Map.Entry)object3).getKey();
            Boolean boolean0 = (Boolean)((Map.Entry)object3).getValue();
            ggdy0.i(new bdvj(s, bgif0.b.toByteArray(), boolean0.booleanValue(), hfsf1.toByteArray()));
        }
        gged_interceptors gged1 = ggdy0.h();
        gged1.getClass();
        bdvd bdvd0 = new bdvd(((bdvi)bdva0), gged1);
        oqj.b(((bdvi)bdva0).a, false, true, bdvd0);
        ggdy ggdy1 = new ggdy();
        int v1 = ((ggna)gged0).c;
        for(int v = 0; v < v1; ++v) {
            bedh bedh0 = (bedh)gged0.get(v);
            if(ggfp1.contains(((grdf)((bedg)bedh0.a.j()).b.g()))) {
                ggdy1.i(bedh0);
            }
        }
        gged_interceptors gged2 = gged_interceptors.l(new bgiw(ggdy1.h(), ggna.a));
        return evrg.d(new bggc(graz.c, gged2));
    }
}

