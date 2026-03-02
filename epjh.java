import java.util.ArrayList;
import java.util.List;

final class epjh extends ibsl implements ibtw {
    int a;
    final epji b;
    final String c;

    public epjh(epji epji0, String s, ibrl ibrl0) {
        this.b = epji0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epjh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epjh(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object2 = this.b.e.c(this.c, this);
            if(object2 == object1) {
                return object1;
            }
        }
        else {
            object2 = ((ibnw)object0).a;
        }
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(epit.a.j(), "Failed to autocomplete query results", throwable0);
            object2 = ibps.a;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object3: ((List)object2)) {
            epni epni0 = epnh.a(((ProtoLiteMessage)epng.a).v_newBuilder());
            hatn hatn0 = ((hatl)object3).c;
            if(hatn0 == null) {
                hatn0 = hatn.a;
            }
            String s = (hatn0.b == null ? hatk.a : hatn0.b).b;
            ibuq.e(s, "getText(...)");
            epni0.d(s);
            hatn hatn1 = ((hatl)object3).c;
            if(hatn1 == null) {
                hatn1 = hatn.a;
            }
            String s1 = (hatn1.c == null ? hatk.a : hatn1.c).b;
            ibuq.e(s1, "getText(...)");
            epni0.c(s1);
            String s2 = ((hatl)object3).b;
            ibuq.e(s2, "getPlaceId(...)");
            epni0.g(s2);
            arrayList0.add(epni0.a());
        }
        this.b.a.a(arrayList0);
        return ibom.a;
    }
}

