import j..util.DesugarCollections;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class epny extends ibsl implements ibtw {
    int a;
    Object b;
    final epng c;

    public epny(epng epng0, ibrl ibrl0) {
        this.c = epng0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epny)this.c(((epns)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epny(this.c, ibrl0);
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
            goto label_30;
        }
        ibnx.b(object0);
        epns epns1 = (epns)this.b;
        epng epng0 = this.c;
        ibqu ibqu0 = new ibqu();
        List list0 = DesugarCollections.unmodifiableList(((epnt)epns1.b_message).b);
        ibuq.e(list0, "getSignificantPlacesList(...)");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object2: list0) {
            linkedHashMap0.put(((epng)object2).c, object2);
        }
        ibqu0.putAll(linkedHashMap0);
        ibqu0.put(epng0.c, epng0);
        Map map0 = ibpz.b(ibqu0);
        if(!epns1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)epns1).ensureMutable();
        }
        ((epnt)epns1.b_message).b = hfvv.a;
        Collection collection0 = map0.values();
        this.b = epns1;
        this.a = 1;
        Object object3 = epom.i(collection0, this);
        if(object3 != object1) {
            object0 = object3;
            epns0 = epns1;
        label_30:
            epns0.a(((Iterable)object0));
            Object object4 = ((ProtoLiteBuilder)epns0).N_build();
            ibuq.e(object4, "build(...)");
            return object4;
        }
        return object1;
    }
}

