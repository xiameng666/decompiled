import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;
import j..util.DesugarCollections;
import java.util.List;

final class dlqb extends ibsl implements ibtw {
    Object a;
    int b;
    final dlqf c;
    final dlow d;
    private Object e;

    public dlqb(dlqf dlqf0, dlow dlow0, ibrl ibrl0) {
        this.c = dlqf0;
        this.d = dlow0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlqb)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dlqb(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object3;
        icck icck0;
        icck icck2;
        Object object6;
        Object object4;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icck icck1 = (icck)this.e;
                dlqf dlqf0 = this.c;
                dlqf0.e(new dlqh(dlqs.a));
                object4 = ((ProtoLiteMessage)hkhx.a).v_newBuilder();
                hkid hkid0 = hkid.f;
                if(!object4.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)object4).ensureMutable();
                }
                hkhx hkhx0 = (hkhx)object4.b_message;
                hkhx0.c = hkid0.a();
                dlow dlow0 = this.d;
                if(dlow0.a) {
                    String s = dlow0.b;
                    if(s == null) {
                        this.e = icck1;
                        this.a = object4;
                        this.b = 1;
                        Object object5 = dlqf0.b(dlqf0.f, this);
                        if(object5 != object1) {
                            icck2 = icck1;
                            object0 = object5;
                            object6 = object4;
                            goto label_58;
                        }
                    }
                    else {
                        hkhz hkhz0 = hkhy.a(((ProtoLiteMessage)hkhw.a).v_newBuilder());
                        ProtoLiteBuilder hftp0 = hkhz0.a;
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hkhw hkhw0 = (hkhw)hftp0.b_message;
                        hkhw0.b = 2;
                        hkhw0.c = s;
                        hkhw hkhw1 = hkhz0.a();
                        if(!object4.b_message.isImmutable()) {
                            ((ProtoLiteBuilder)object4).ensureMutable();
                        }
                        hkhx hkhx1 = (hkhx)object4.b_message;
                        hkhw1.getClass();
                        hkhx1.f = hkhw1;
                        hkhx1.b |= 4;
                        icck2 = icck1;
                        goto label_114;
                    }
                }
                else {
                    this.e = icck1;
                    this.a = object4;
                    this.b = 2;
                    Object object7 = dlqf0.b(dlqf0.f, this);
                    if(object7 != object1) {
                        icck2 = icck1;
                        object0 = object7;
                        object6 = object4;
                        goto label_82;
                    }
                }
                break;
            }
            case 1: {
                object6 = this.a;
                icck2 = (icck)this.e;
                ibnx.b(object0);
            label_58:
                hkhz hkhz1 = hkhy.a(((ProtoLiteMessage)hkhw.a).v_newBuilder());
                ProtoLiteBuilder hftp1 = hkhz1.a;
                List list0 = DesugarCollections.unmodifiableList(((hkhw)hftp1.b_message).d);
                ibuq.e(list0, "getVendorIdList(...)");
                new hfxu(list0);
                ibuq.f(((List)object0), "values");
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                hkhw hkhw2 = (hkhw)hftp1.b_message;
                hfuo hfuo0 = hkhw2.d;
                if(!hfuo0.c()) {
                    hkhw2.d = ProtoLiteMessage.E(hfuo0);
                }
                hfrj.E(((List)object0), hkhw2.d);
                hkhw hkhw3 = hkhz1.a();
                if(!((ProtoLiteBuilder)object6).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)object6).ensureMutable();
                }
                hkhx hkhx2 = (hkhx)((ProtoLiteBuilder)object6).b_message;
                hkhw3.getClass();
                hkhx2.f = hkhw3;
                hkhx2.b |= 4;
                goto label_113;
            }
            case 2: {
                object6 = this.a;
                icck2 = (icck)this.e;
                ibnx.b(object0);
            label_82:
                hkhz hkhz2 = hkhy.a(((ProtoLiteMessage)hkhw.a).v_newBuilder());
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hkhv.a).v_newBuilder();
                ibuq.f(hftp2, "builder");
                List list1 = DesugarCollections.unmodifiableList(((hkhv)hftp2.b_message).b);
                ibuq.e(list1, "getVendorIdList(...)");
                new hfxu(list1);
                ibuq.f(((List)object0), "values");
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                hkhv hkhv0 = (hkhv)hftp2.b_message;
                hfuo hfuo1 = hkhv0.b;
                if(!hfuo1.c()) {
                    hkhv0.b = ProtoLiteMessage.E(hfuo1);
                }
                hfrj.E(((List)object0), hkhv0.b);
                ProtoLiteMessage hftv0 = hftp2.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((hkhv)hftv0), "value");
                ProtoLiteBuilder hftp3 = hkhz2.a;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                hkhw hkhw4 = (hkhw)hftp3.b_message;
                ((hkhv)hftv0).getClass();
                hkhw4.c = (hkhv)hftv0;
                hkhw4.b = 3;
                hkhw hkhw5 = hkhz2.a();
                if(!((ProtoLiteBuilder)object6).b_message.isImmutable()) {
                    ((ProtoLiteBuilder)object6).ensureMutable();
                }
                hkhx hkhx3 = (hkhx)((ProtoLiteBuilder)object6).b_message;
                hkhw5.getClass();
                hkhx3.f = hkhw5;
                hkhx3.b |= 4;
            label_113:
                object4 = object6;
            label_114:
                GetPaymentMethodActionTokensRequest getPaymentMethodActionTokensRequest0 = new GetPaymentMethodActionTokensRequest();
                getPaymentMethodActionTokensRequest0.a = this.c.f;
                getPaymentMethodActionTokensRequest0.b = new ProtoSafeParcelable[]{ftqe.a(((MessageLite)((ProtoLiteBuilder)object4).N_build()))};
                getPaymentMethodActionTokensRequest0.c = 1;
                evql evql0 = this.c.j.aJ(getPaymentMethodActionTokensRequest0);
                this.e = icck2;
                this.a = null;
                this.b = 3;
                object3 = fsdk.a(evql0, this);
                if(object3 != object1) {
                    icck0 = icck2;
                label_125:
                    dlqf dlqf1 = this.c;
                    if(ibnw.b(object3)) {
                        dlqf1.e(new dlqh(dlqp.a));
                        ibuq.c(((ProtoSafeParcelable)object3));
                        ibuq.e(hkgr.a, "getDefaultInstance(...)");
                        hfuo hfuo2 = ((hkgr)ftqe.c(((ProtoSafeParcelable)object3), ((MessageLite)hkgr.a))).b;
                        ibuq.e(hfuo2, "getTokensList(...)");
                        for(Object object8: hfuo2) {
                            if(hkgp.a(((hkgq)object8).b) == 3) {
                                object2 = object8;
                                break;
                            }
                        }
                        if(((hkgq)object2) == null) {
                            dlqf1.c(lsc.a(dlqf1), new frxf[]{new dlpw(false)});
                        }
                        else {
                            if(hwfk.d()) {
                                dlqf1.e.e("HAS_STARTED_BENDER_KEY", Boolean.valueOf(true));
                            }
                            dlqf1.c(lsc.a(dlqf1), new frxf[]{new dlpu(((hkgq)object2))});
                        }
                    }
                    Throwable throwable0 = ibnw.a(object3);
                    if(throwable0 != null) {
                        dlqf1.e(new dlqh(dlqo.a));
                        if((throwable0 instanceof aztb)) {
                            String s1 = ((aztb)throwable0).getMessage();
                            if(s1 != null && ibzk.G(s1, "RESOLVE_PAYMENT_PROFILE_FOR_PIX")) {
                                dlqf1.c(icck0, new frxf[]{dlpx.a});
                                return ibom.a;
                            }
                        }
                        dlqf1.c(icck0, new frxf[]{new dlpw(((boolean)(dlqf1.h.a() ^ 1)))});
                        a.ae(dlqf.a.j(), "failed to get bank account payment method action token.", throwable0);
                    }
                    return ibom.a;
                }
                break;
            }
            default: {
                icck0 = (icck)this.e;
                ibnx.b(object0);
                object3 = ((ibnw)object0).a;
                goto label_125;
            }
        }
        return object1;
    }
}

