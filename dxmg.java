import com.google.android.gms.wallet.PaymentDataRequest;

final class dxmg extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final dxmi d;

    public dxmg(dxmi dxmi0, ibrl ibrl0) {
        this.d = dxmi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxmg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxmg(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        Object object4;
        evql evql0;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                dxmi dxmi0 = this.d;
                dxmi0.l(dxmi0.b(true));
                ftem ftem0 = dxmi0.h;
                if((ftem0.b & 0x1000000) == 0) {
                    dxte dxte1 = dxmi0.f;
                    long v = (ftem0.r == null ? hkug.a : ftem0.r).d;
                    gtlg gtlg1 = dxmi0.a();
                    long v1 = ftem0.e;
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtut.a).v_newBuilder();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((gtut)hftp0.b_message).c = 3;
                    ((gtut)hftp0.b_message).d = v;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp0.b_message;
                    ((gtut)hftv0).e = 70068;
                    if(!hftv0.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtut gtut0 = (gtut)hftp0.b_message;
                    gtlg1.getClass();
                    gtut0.g = gtlg1;
                    gtut0.b |= 4;
                    if(hwiq.d() && v1 != 0L) {
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        gtut gtut1 = (gtut)hftp0.b_message;
                        gtut1.b |= 16;
                        gtut1.i = v1;
                    }
                    ProtoLiteMessage hftv1 = hftp0.N_build();
                    evql0 = edng.a(dptv.b(dxte1.a, dpuj.bB, ((MessageLite)hftv1), ((MessageLite)gtuu.a)));
                }
                else {
                    gtni gtni0 = dypl.h(dzdt.f(ftem0.c));
                    dxte dxte0 = dxmi0.f;
                    gtlg gtlg0 = dxmi0.a();
                    ftfu ftfu0 = ftem0.A == null ? ftfu.a : ftem0.A;
                    dyjr dyjr0 = ftfu0.d == null ? dyjr.a : ftfu0.d;
                    String s = (dyjr0.b == 3 ? ((dyjq)dyjr0.c) : dyjq.a).b;
                    ibuq.c(s);
                    gfsx gfsx0 = s.length() == 0 ? gfqx.a : gfsx.l(s);
                    evql0 = edng.a(dxte0.g(gtni0, gtlg0, gfsx0, gfqx.a));
                }
                this.c = 1;
                object4 = fsdk.a(evql0, this);
                if(object4 == object1) {
                    return object1;
                }
                goto label_58;
            }
            case 1: {
                ibnx.b(object0);
                object4 = ((ibnw)object0).a;
            label_58:
                object3 = object4;
                dxmi dxmi1 = this.d;
                if(ibnw.b(object3)) {
                    PaymentDataRequest paymentDataRequest0 = PaymentDataRequest.b(((gtuu)object3).b.toByteArray());
                    evql evql1 = dxmi1.k.cj(paymentDataRequest0);
                    this.a = object3;
                    this.b = dxmi1;
                    this.c = 2;
                    Object object5 = fsdk.c(evql1, this);
                    if(object5 != object1) {
                        dxmi1.j(lsc.a(dxmi1), new frxf[]{new dxor(((evql)object5))});
                        break;
                    }
                    return object1;
                }
                break;
            }
            default: {
                Object object2 = this.b;
                object3 = this.a;
                ibnx.b(object0);
                ((dxmi)object2).j(lsc.a(((lsb)object2)), new frxf[]{new dxor(((evql)object0))});
            }
        }
        dxmi dxmi2 = this.d;
        Throwable throwable0 = ibnw.a(object3);
        if(throwable0 != null) {
            a.ae(dxmi.a.i(), "Failed to get encrypted payment params.", throwable0);
            dxmi.q(dxmi2, null, null, hagu.m, 3);
        }
        return ibom.a;
    }
}

