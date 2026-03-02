import java.util.ArrayList;

final class bvlz extends ibsl implements ibtw {
    final bvma a;
    final String b;

    public bvlz(bvma bvma0, String s, ibrl ibrl0) {
        this.a = bvma0;
        this.b = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bvlz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bvlz(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        buyj buyj0;
        Object object1;
        ibnx.b(object0);
        bvma bvma0 = this.a;
        try {
            boolean z = bbmn.t(bvma0.a);
        }
        catch(SecurityException securityException0) {
            a.ae(bvma0.c.h(), "\"Recommended\" tab cannot be displayed: the state of the managed profile cannot be determined. Ensure that the device is compatible with the GMS Core.", securityException0);
            object1 = ibpo.b(buyj.c);
            return htva.a.b().y() ? ibpo.am(((Iterable)object1)) : object1;
        }
        if(z || this.b != null && bbmn.w(bvma0.a, this.b)) {
            object1 = ibpo.b(buyj.c);
        }
        else if(htvk.f()) {
            htvk htvk0 = htvk.a;
            if(htvk0.c().h()) {
                hfuf hfuf0 = htvk0.c().d().b;
                ibuq.e(hfuf0, "getElementList(...)");
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: hfuf0) {
                    ibuq.c(((Integer)object2));
                    switch(((int)(((Integer)object2)))) {
                        case 0: {
                            buyj0 = buyj.a;
                            break;
                        }
                        case 1: {
                            buyj0 = buyj.b;
                            break;
                        }
                        case 2: {
                            buyj0 = buyj.c;
                            break;
                        }
                        default: {
                            buyj0 = null;
                        }
                    }
                    if(buyj0 != null) {
                        arrayList0.add(buyj0);
                    }
                }
                object1 = ibpo.ar(arrayList0);
            }
            else {
                object1 = ibpo.g(new buyj[]{buyj.b, buyj.c});
            }
        }
        else {
            object1 = ibpo.g(new buyj[]{buyj.b, buyj.c});
        }
        return htva.a.b().y() ? ibpo.am(((Iterable)object1)) : object1;
    }
}

