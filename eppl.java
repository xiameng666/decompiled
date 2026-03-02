import java.util.ArrayList;
import java.util.List;

final class eppl extends ibsl implements ibtw {
    int a;
    final List b;
    final ezmb c;
    final boolean d;
    private Object e;

    public eppl(List list0, ezmb ezmb0, boolean z, ibrl ibrl0) {
        this.b = list0;
        this.c = ezmb0;
        this.d = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new eppl(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.e;
        ezmb ezmb0 = this.c;
        boolean z = this.d;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object2: this.b) {
            arrayList0.add(icbb.a(icck0, null, null, new eppk(ezmb0, ((String)object2), z, null), 3));
        }
        this.a = 1;
        Object object3 = icay.a(arrayList0, this);
        return object3 == object1 ? object1 : object3;
    }
}

