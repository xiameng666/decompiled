import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

final class epog extends ibsl implements ibtw {
    int a;
    Object b;
    final ibvb c;
    final ibts d;

    public epog(ibvb ibvb0, ibts ibts0, ibrl ibrl0) {
        this.c = ibvb0;
        this.d = ibts0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epog)this.c(((epns)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epog(this.c, this.d, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        epns epns0;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            epns0 = (epns)this.b;
            ibnx.b(object0);
            goto label_28;
        }
        ibnx.b(object0);
        epns epns1 = (epns)this.b;
        List list0 = DesugarCollections.unmodifiableList(((epnt)epns1.b_message).b);
        ibuq.e(list0, "getSignificantPlacesList(...)");
        ibts ibts0 = this.d;
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: list0) {
            ibuq.c(((epng)object2));
            if(!((Boolean)ibts0.a(((epng)object2))).booleanValue()) {
                arrayList0.add(object2);
            }
        }
        this.c.a = DesugarCollections.unmodifiableList(((epnt)epns1.b_message).b).size() - arrayList0.size();
        if(!epns1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)epns1).ensureMutable();
        }
        ((epnt)epns1.b_message).b = hfvv.a;
        this.b = epns1;
        this.a = 1;
        Object object3 = epom.i(arrayList0, this);
        if(object3 != object1) {
            object0 = object3;
            epns0 = epns1;
        label_28:
            epns0.a(((Iterable)object0));
            Object object4 = ((ProtoLiteBuilder)epns0).N_build();
            ibuq.e(object4, "build(...)");
            return object4;
        }
        return object1;
    }
}

