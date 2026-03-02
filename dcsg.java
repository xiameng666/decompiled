import dagger.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class dcsg extends ibsl implements ibtw {
    Object a;
    int b;
    final List c;
    final dcsh d;
    private Object e;

    public dcsg(List list0, dcsh dcsh0, ibrl ibrl0) {
        this.c = list0;
        this.d = dcsh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcsg)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcsg(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ichm ichm0;
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ichm0 = (ichm)this.e;
            ibnx.b(object0);
            ichm0.d(new dcrx(((Map)object2)));
            return ibom.a;
        }
        ibnx.b(object0);
        ichm ichm1 = (ichm)this.e;
        List list0 = this.c;
        long v = 0L;
        for(Object object3: list0) {
            v += ((dcsk)object3).a();
        }
        if(v <= 0L) {
            throw new IllegalStateException("Cannot upload attachments with zero bytes");
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object4: list0) {
            linkedHashMap0.put(((dcsk)object4).a.a(), object4);
        }
        dcsh dcsh0 = this.d;
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
        for(Object object5: list0) {
            dcsk dcsk0 = (dcsk)object5;
            linkedHashMap1.put(object5, new dctq(((ejaz)dcsh0.d.a.a).a(), dctj.a(), ((dctc)((InstanceFactory)dcsh0.d.a.b).a), dcsh0.a, dcsh0.c));
        }
        Collection collection0 = linkedHashMap1.values();
        ArrayList arrayList0 = new ArrayList(ibpo.q(collection0, 10));
        for(Object object6: collection0) {
            arrayList0.add(((dctq)object6).c);
        }
        icir.d(new ickk(new iclv(new dcsf(((icig[])ibpo.ar(arrayList0).toArray(new icig[0])), dcsh0, v, linkedHashMap0), new dcry(ichm1, null)), new dcrz(null)), ichm1);
        dcsc dcsc0 = new dcsc(linkedHashMap1, dcsh0, null);
        this.e = ichm1;
        this.a = linkedHashMap1;
        this.b = 1;
        if(icbd.a(cclw.d, dcsc0, this) != object1) {
            ichm0 = ichm1;
            object2 = linkedHashMap1;
            ichm0.d(new dcrx(((Map)object2)));
            return ibom.a;
        }
        return object1;
    }
}

