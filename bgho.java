import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

final class bgho extends ibsl implements ibtw {
    int a;
    final bghr b;
    final ggfd c;

    public bgho(bghr bghr0, ggfd ggfd0, ibrl ibrl0) {
        this.b = bghr0;
        this.c = ggfd0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgho)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgho(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bghr bghr0 = this.b;
            List list0 = ((bdue)bghr0.f.mr()).a(bghr0.c);
            ibuq.f(list0, "entitiesList");
            gfvb gfvb0 = bghr0.d.a.b;
            gfvb0.g();
            for(Object object2: list0) {
                grbs grbs0 = new grbs(hfxt.a(((bdun)object2).c), hfxt.a(((bdun)object2).d));
                gfvb0.h(new grch(hfxt.a(((bdun)object2).b)), grbs0);
            }
            this.a = 1;
            object0 = iccl.a(new bghq(this.c, bghr0, null), this);
            if(object0 == object1) {
                return object1;
            }
        }
        bghr bghr1 = this.b;
        String s = bghr1.c;
        ibuq.f(s, "accountName");
        gfxi gfxi0 = ((gfwl)bghr1.d.a.b).a;
        ArrayList arrayList0 = new ArrayList(gfxi0.size());
        for(Object object3: gfxi0.entrySet()) {
            Object object4 = ((Map.Entry)object3).getKey();
            ibuq.e(object4, "component1(...)");
            Object object5 = ((Map.Entry)object3).getValue();
            ibuq.e(object5, "component2(...)");
            byte[] arr_b = ((grch)object4).b.toByteArray();
            ibuq.e(arr_b, "toByteArray(...)");
            byte[] arr_b1 = ((grbs)object5).a.toByteArray();
            ibuq.e(arr_b1, "toByteArray(...)");
            byte[] arr_b2 = ((grbs)object5).b.toByteArray();
            ibuq.e(arr_b2, "toByteArray(...)");
            arrayList0.add(new bdun(s, arr_b, arr_b1, arr_b2));
        }
        gged_interceptors gged0 = ggdx.a(arrayList0);
        ((bdue)bghr1.f.mr()).b(gged0);
        gged_interceptors gged1 = ggdx.a(ibpo.ag(((List)object0)));
        return new bggc(graz.b, gged1);
    }
}

