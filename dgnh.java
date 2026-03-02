import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class dgnh extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    int d;
    final dgop e;
    final dggg f;
    final List g;
    final dgfh h;
    final boolean i;
    final String j;
    final ichm k;
    private Object l;

    public dgnh(dgop dgop0, dggg dggg0, List list0, dgfh dgfh0, ichm ichm0, boolean z, String s, ibrl ibrl0) {
        this.e = dgop0;
        this.f = dggg0;
        this.g = list0;
        this.h = dgfh0;
        this.k = ichm0;
        this.i = z;
        this.j = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgnh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgnh(this.e, this.f, this.g, this.h, this.k, this.i, this.j, ibrl0);
        ibrl1.l = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ArrayList arrayList1;
        icck icck5;
        Iterator iterator0;
        ArrayList arrayList0;
        Object object4;
        icck icck0;
        Object object2;
        Object object9;
        Object object8;
        int v1;
        icck icck2;
        Object object6;
        boolean z;
        Object object5;
        icck icck1;
        Object object1 = ibrx.a;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                icck1 = (icck)this.l;
                dgif dgif0 = new dgif(this.e.j, this.f, this.e.g, true, this.e.f);
                this.l = icck1;
                this.d = 1;
                object5 = dgif0.a(this.g, this);
                if(object5 == object1) {
                    return object1;
                }
                goto label_21;
            }
            case 1: {
                icck1 = (icck)this.l;
                ibnx.b(object0);
                object5 = object0;
            label_21:
                object4 = (dgid)object5;
                cunf cunf0 = dcvz.a;
                cunf0.b().h("[NS_AUTH] Receive-side %s", object4);
                if((object4 instanceof dgib)) {
                    dgfr dgfr0 = ((dgib)object4).a;
                    if(!ibuq.m(dgfr0, dgfo.a)) {
                        dgop dgop0 = this.e;
                        dgym.a().a(new dgzc(dgop0.i.a, this.h.d, this.h.c, this.h.a, this.h.f, false));
                        if(!hvqz.o()) {
                            z = false;
                        }
                        else if(!hvqz.a.b().x()) {
                            z = ibuq.m(dgfr0, new dgfp(gzad.b));
                        }
                        else if(!dcuu.a(dgop0.a).a() && ibuq.m(dgfr0, new dgfp(gzad.b))) {
                            z = true;
                        }
                        else {
                            z = false;
                        }
                        cunf0.b().h("shouldReceivePreviews: %s", Boolean.valueOf(z));
                        this.l = icck1;
                        this.a = object4;
                        this.c = z;
                        this.d = 2;
                        dgop0.c.a.a(z);
                        long v = hvqs.al();
                        object6 = dgop0.c.e(dgop0.c.d, v, this);
                        if(object6 == object1) {
                            return object1;
                        }
                        icck2 = icck1;
                        v1 = z;
                        goto label_61;
                    }
                }
                dgym.a().a(new dgyz(this.e.i.a, this.h.d, this.h.c, this.h.a));
                this.e.h(dglw.a);
                return ibom.a;
            }
            case 2: {
                v1 = this.c;
                Object object7 = this.a;
                icck icck3 = (icck)this.l;
                ibnx.b(object0);
                icck2 = icck3;
                object4 = object7;
                object6 = object0;
            label_61:
                object8 = (dgfc)object6;
                if(object8 == null) {
                    this.e.h(dglx.a);
                    return ibom.a;
                }
                dgym.a().a(new dgzp(this.e.i.a));
                this.l = icck2;
                this.a = object4;
                this.b = object8;
                this.c = v1;
                this.d = 3;
                object9 = this.e.l(this.k, ((dgfc)object8), this);
                if(object9 == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                v1 = this.c;
                object8 = this.b;
                object4 = this.a;
                icck icck4 = (icck)this.l;
                ibnx.b(object0);
                object9 = object0;
                icck2 = icck4;
                break;
            }
            default: {
                object2 = this.b;
                Object object3 = this.a;
                icck0 = (icck)this.l;
                ibnx.b(object0);
                object4 = object3;
                arrayList0 = new ArrayList(ibpo.q(((Iterable)object0), 10));
                iterator0 = ((Iterable)object0).iterator();
                goto label_99;
            }
        }
        if(!((Boolean)object9).booleanValue()) {
            return ibom.a;
        }
        if(v1 == 0) {
            arrayList1 = ibps.a;
            icck5 = icck2;
        }
        else {
            dgop dgop1 = this.e;
            do {
                Object object10 = dgop1.k.b();
                dgnb dgnb0 = (dgnb)object10;
                dgna dgna0 = new dgna(((dgfc)object8), false, false);
            }
            while(!dgop1.k.h(object10, dgna0));
            this.l = icck2;
            this.a = object4;
            this.b = object8;
            this.d = 4;
            Object object11 = dgop1.f(((dgfc)object8).h.size(), this);
            if(object11 != object1) {
                object2 = object8;
                icck0 = icck2;
                arrayList0 = new ArrayList(ibpo.q(((Iterable)object11), 10));
                iterator0 = ((Iterable)object11).iterator();
            label_99:
                while(iterator0.hasNext()) {
                    Object object12 = iterator0.next();
                    arrayList0.add(new dgfv(null, ((cuwu)object12)));
                }
                object8 = object2;
                icck5 = icck0;
                arrayList1 = arrayList0;
                goto label_110;
            }
            return object1;
        }
    label_110:
        if(hvqz.o()) {
            dgym.a().a(new dhad(this.e.i.a, arrayList1.size()));
        }
        boolean z1 = ((dgib)object4).a instanceof dgfp;
        boolean z2 = z1 && (this.f != null && this.f.e) || (this.i || this.e.g != null && ((dgib)object4).b);
        String s = z1 ? null : this.j;
        if(z2) {
            this.e.d.a();
            dgmn dgmn0 = new dgmn(this.h, ((dgfc)object8), true, arrayList1);
            dgmr.c(this.k, dgmn0);
            icbb.b(icck5, null, null, new dgnf(this.e, ((dgfc)object8), null), 3);
        }
        else {
            icbb.b(icck5, null, null, new dgng(this.e, this.k, this.h, ((dgfc)object8), s, arrayList1, null), 3);
        }
        dgop dgop2 = this.e;
        do {
            Object object13 = dgop2.k.b();
            dgnb dgnb1 = (dgnb)object13;
            dgna dgna1 = new dgna(((dgfc)object8), z2, false);
        }
        while(!dgop2.k.h(object13, dgna1));
        dgoo dgoo0 = new dgoo(dgop2, this.k, null);
        dgon dgon0 = new dgon(dgop2, icbb.b(this.k, null, null, dgoo0, 3), null);
        icbb.b(this.k, null, null, dgon0, 3);
        return ibom.a;
    }
}

