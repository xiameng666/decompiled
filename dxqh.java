import com.google.android.gms.wallet.PaymentDataRequest;

final class dxqh extends ibsl implements ibtw {
    Object a;
    Object b;
    int c;
    final dxqi d;

    public dxqh(dxqi dxqi0, ibrl ibrl0) {
        this.d = dxqi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqh(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dxqh dxqh0;
        Object object2;
        gfsx gfsx0;
        Object object3;
        ibrx ibrx0 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                dxqi dxqi0 = this.d;
                dxqi0.j(dxqy.a(dxqi0.a(), null, false, true, 3));
                ftej ftej0 = dxqi0.e;
                gtni gtni0 = dypl.h(dzdt.f(ftej0.c));
                gtlg gtlg0 = dxqi0.g;
                gfqx gfqx0 = gfqx.a;
                ibuq.c(gtni0);
                if(gtni0 == gtni.b) {
                    fteg fteg0 = ftej0.s == null ? fteg.a : ftej0.s;
                    dylc dylc0 = fteg0.f == null ? dylc.a : fteg0.f;
                    ibuq.e(dylc0, "getCardData(...)");
                    fteg fteg1 = ftej0.s == null ? fteg.a : ftej0.s;
                    ibuq.e((fteg1.g == null ? dylb.a : fteg1.g), "getCreationData(...)");
                    hfui hfui0 = ftej0.i;
                    ibuq.e(hfui0, "getPaymentAmountMicrosList(...)");
                    Long long0 = (Long)ibpo.W(hfui0);
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gtus.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    String s = dylc0.d;
                    ibuq.e(s, "getServiceProviderCardId(...)");
                    ibuq.f(s, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus0 = (gtus)hftp0.b_message;
                    s.getClass();
                    gtus0.b |= 1;
                    gtus0.c = s;
                    String s1 = dylc0.f;
                    ibuq.e(s1, "getIdm(...)");
                    ibuq.f(s1, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus1 = (gtus)hftp0.b_message;
                    s1.getClass();
                    gtus1.b |= 2;
                    gtus1.d = s1;
                    gtlg gtlg1 = edol.a((dylc0.e == null ? dymg.a : dylc0.e));
                    ibuq.e(gtlg1, "toTapAndPayMoney(...)");
                    ibuq.f(gtlg1, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus2 = (gtus)hftp0.b_message;
                    gtlg1.getClass();
                    gtus2.e = gtlg1;
                    gtus2.b |= 4;
                    dyng dyng0 = dylc0.h == null ? dyng.a : dylc0.h;
                    int v = (dyng0.b == 4 ? ((dyfq)dyng0.c) : dyfq.a).b;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus3 = (gtus)hftp0.b_message;
                    gtus3.b |= 8;
                    gtus3.f = v;
                    gtlg gtlg2 = gtlg.a;
                    gtnz gtnz0 = gtny.a(((ProtoLiteMessage)gtlg2).v_newBuilder());
                    ibuq.c(long0);
                    gtnz0.c(long0.longValue());
                    String s2 = ftej0.g;
                    ibuq.e(s2, "getCurrencyCode(...)");
                    gtnz0.b(s2);
                    gtlg gtlg3 = gtnz0.a();
                    ibuq.f(gtlg3, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus4 = (gtus)hftp0.b_message;
                    gtlg3.getClass();
                    gtus4.g = gtlg3;
                    gtus4.b |= 16;
                    gtnz gtnz1 = gtny.a(((ProtoLiteMessage)gtlg2).v_newBuilder());
                    object3 = ibrx0;
                    gtnz1.c(ftej0.t);
                    String s3 = ftej0.g;
                    ibuq.e(s3, "getCurrencyCode(...)");
                    gtnz1.b(s3);
                    gtlg gtlg4 = gtnz1.a();
                    ibuq.f(gtlg4, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gtus gtus5 = (gtus)hftp0.b_message;
                    gtlg4.getClass();
                    gtus5.h = gtlg4;
                    gtus5.b |= 0x20;
                    ProtoLiteMessage hftv0 = hftp0.N_build();
                    ibuq.e(hftv0, "build(...)");
                    gfsx0 = gfsx.l(((gtus)hftv0));
                }
                else {
                    object3 = ibrx0;
                    gfsx0 = gfqx0;
                }
                evql evql0 = edng.a(dxqi0.k.g(gtni0, gtlg0, gfqx0, gfsx0));
                dxqh0 = this;
                dxqh0.c = 1;
                Object object4 = fsdk.a(evql0, dxqh0);
                if(object4 == object3) {
                    return object3;
                }
                object2 = object4;
                goto label_107;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                object3 = ibrx0;
                dxqh0 = this;
            label_107:
                Object object5 = dxqh0.d;
                if(ibnw.b(object2)) {
                    PaymentDataRequest paymentDataRequest0 = PaymentDataRequest.b(((gtuu)object2).b.toByteArray());
                    evql evql1 = object5.m.cj(paymentDataRequest0);
                    dxqh0.a = object2;
                    dxqh0.b = object5;
                    dxqh0.c = 2;
                    Object object6 = fsdk.c(evql1, dxqh0);
                    if(object6 != object3) {
                        ((dxmj)object5).i(lsc.a(((lsb)object5)), new frxf[]{new dxor(((evql)object6))});
                        break;
                    }
                    return object3;
                }
                break;
            }
            default: {
                Object object1 = this.b;
                object2 = this.a;
                ibnx.b(object0);
                dxqh0 = this;
                ((dxmj)object1).i(lsc.a(((lsb)object1)), new frxf[]{new dxor(((evql)object0))});
            }
        }
        dxqi dxqi1 = dxqh0.d;
        Throwable throwable0 = ibnw.a(object2);
        if(throwable0 != null) {
            a.ae(dxqi.i.i(), "Failed to get encrypted payment params.", throwable0);
            dxmj.m(dxqi1, null, 3);
        }
        return ibom.a;
    }
}

