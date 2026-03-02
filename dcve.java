import android.net.Uri;

final class dcve extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    boolean g;
    int h;
    final xnb i;
    final dcpn j;
    final gyza k;
    final long l;
    final gzat m;
    final boolean n;

    public dcve(xnb xnb0, dcpn dcpn0, gyza gyza0, long v, gzat gzat0, boolean z, ibrl ibrl0) {
        this.i = xnb0;
        this.j = dcpn0;
        this.k = gyza0;
        this.l = v;
        this.m = gzat0;
        this.n = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcve)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcve(this.i, this.j, this.k, this.l, this.m, this.n, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        xnb xnb0;
        dcpn dcpn0;
        Object object4;
        Object object3;
        boolean z;
        xnb xnb2;
        dcpn dcpn3;
        Object object12;
        Object object11;
        boolean z1;
        Object object10;
        Object object9;
        Object object8;
        dcpn dcpn2;
        xnb xnb1;
        aztb aztb2;
        Object object7;
        Object object6;
        dcmf dcmf1;
        Object object5;
        dcmf dcmf0;
        dcpn dcpn1;
        Object object1 = ibrx.a;
        String s = null;
        switch(this.h) {
            case 0: {
                ibnx.b(object0);
                xnb0 = this.i;
                z = this.n;
                dcpn1 = this.j;
                dcmf0 = cumi.f(xnb0);
                object5 = gytd.a(((ProtoLiteMessage)gyqv.a).v_newBuilder());
                ((gyte)object5).g(this.m);
                if(hvrc.g()) {
                    object4 = object5;
                }
                else {
                    if(hvrc.i()) {
                        evql evql0 = dcmf0.o();
                        this.a = dcmf0;
                        this.b = xnb0;
                        this.c = dcpn1;
                        this.d = object5;
                        this.e = object5;
                        this.g = z;
                        this.h = 1;
                        object0 = dcwp.a(evql0, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        dcpn0 = dcpn1;
                        dcmf1 = dcmf0;
                        object6 = object5;
                        object7 = object6;
                        goto label_70;
                    }
                    else {
                        try {
                            evql evql1 = dcmf0.o();
                            this.a = dcmf0;
                            this.b = xnb0;
                            this.c = dcpn1;
                            this.d = object5;
                            this.e = object5;
                            this.f = object5;
                            this.g = z;
                            this.h = 3;
                            object0 = ictn.b(evql1, this);
                        }
                        catch(aztb aztb1) {
                            aztb2 = aztb1;
                            dcpn0 = dcpn1;
                            object3 = object5;
                            object4 = object3;
                            goto label_154;
                        }
                        if(object0 == object1) {
                            return object1;
                        }
                        xnb1 = xnb0;
                        dcpn2 = dcpn1;
                        object8 = object5;
                        object9 = object8;
                        object10 = object9;
                        goto label_118;
                    }
                    goto label_157;
                }
                break;
            }
            case 1: {
                z = this.g;
                object6 = this.e;
                object7 = this.d;
                dcpn0 = (dcpn)this.c;
                xnb0 = (xnb)this.b;
                dcmf1 = (dcmf)this.a;
                ibnx.b(object0);
            label_70:
                if(((Boolean)object0) == null) {
                    object5 = object6;
                    object4 = object7;
                    goto label_156;
                }
                else {
                    ((gyte)object6).e(((Boolean)object0).booleanValue());
                    if(hvrc.c()) {
                        evql evql2 = dcmf1.m();
                        this.a = xnb0;
                        this.b = dcpn0;
                        this.c = object7;
                        this.d = object6;
                        this.e = null;
                        this.g = z;
                        this.h = 2;
                        object0 = dcwp.a(evql2, this);
                        if(object0 == object1) {
                            return object1;
                        }
                        z1 = z;
                        object11 = object6;
                        object12 = object7;
                        dcpn3 = dcpn0;
                        xnb2 = xnb0;
                        goto label_102;
                    }
                    else {
                        object5 = object6;
                        object4 = object7;
                        dcpn1 = dcpn0;
                    }
                }
                goto label_157;
            }
            case 2: {
                z1 = this.g;
                object11 = this.d;
                object12 = (gyte)this.c;
                dcpn3 = (dcpn)this.b;
                xnb2 = (xnb)this.a;
                ibnx.b(object0);
            label_102:
                if(((Boolean)object0) != null) {
                    ((gyte)object11).c(((Boolean)object0).booleanValue());
                }
                object5 = object11;
                dcpn1 = dcpn3;
                xnb0 = xnb2;
                z = z1;
                object4 = object12;
                goto label_157;
            }
            case 3: {
                z = this.g;
                object8 = this.f;
                object9 = this.e;
                object10 = this.d;
                dcpn2 = (dcpn)this.c;
                xnb1 = (xnb)this.b;
                dcmf0 = (dcmf)this.a;
                try {
                    ibnx.b(object0);
                label_118:
                    ibuq.e(object0, "await(...)");
                    ((gyte)object8).e(((Boolean)object0).booleanValue());
                    if(hvrc.c()) {
                        evql evql3 = dcmf0.m();
                        this.a = xnb1;
                        this.b = dcpn2;
                        this.c = object10;
                        this.d = object9;
                        this.e = object9;
                        this.f = null;
                        this.g = z;
                        this.h = 4;
                        object0 = ictn.b(evql3, this);
                        if(object0 != object1) {
                            goto label_132;
                        }
                        return object1;
                    }
                    else {
                        goto label_143;
                    }
                    goto label_157;
                }
                catch(aztb aztb3) {
                    goto label_149;
                }
                try {
                label_132:
                    object3 = object9;
                    object4 = object10;
                    dcpn0 = dcpn2;
                    xnb0 = xnb1;
                    ibuq.e(object0, "await(...)");
                    ((gyte)object9).c(((Boolean)object0).booleanValue());
                    goto label_155;
                }
                catch(aztb aztb0) {
                    aztb2 = aztb0;
                    goto label_154;
                }
                return object1;
                try {
                label_143:
                    dcpn1 = dcpn2;
                    xnb0 = xnb1;
                    object5 = object9;
                    object4 = object10;
                    goto label_157;
                }
                catch(aztb aztb3) {
                label_149:
                    aztb2 = aztb3;
                    object3 = object9;
                    object4 = object10;
                    dcpn0 = dcpn2;
                    xnb0 = xnb1;
                }
            label_154:
                dcvz.a.e().f(aztb2).p("Failed awaiting opt-in status.", new Object[0]);
            label_155:
                object5 = object3;
            label_156:
                dcpn1 = dcpn0;
            label_157:
                if(hvrc.c()) {
                    ((gyte)object5).d(z);
                }
                else {
                    ((gyte)object5).d(xnb0.getIntent().getBooleanExtra("initial_opt_in", false));
                    ((gyte)object5).c(xnb0.getIntent().getBooleanExtra("initial_enable_status", false));
                }
                break;
            }
            default: {
                z = this.g;
                Object object2 = this.e;
                object3 = this.d;
                object4 = (gyte)this.c;
                dcpn0 = (dcpn)this.b;
                xnb0 = (xnb)this.a;
                try {
                    ibnx.b(object0);
                    ibuq.e(object0, "await(...)");
                    ((gyte)object2).c(((Boolean)object0).booleanValue());
                    goto label_155;
                }
                catch(aztb aztb0) {
                    aztb2 = aztb0;
                    goto label_154;
                }
            }
        }
        ((gyte)object5).b(dcpn1.g(xnb0).g);
        dcpn dcpn4 = this.j;
        gyza gyza0 = this.k;
        xnb xnb3 = this.i;
        gyqv gyqv0 = ((gyte)object4).a();
        long v = ibzw.h(this.l);
        Uri uri0 = xnb3.getReferrer();
        if(uri0 != null) {
            s = uri0.getHost();
        }
        dcpn4.i(dcpt.i(gyza0, v, s, gyqv0, xnb3.isFinishing()));
        return ibom.a;
    }
}

