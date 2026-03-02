import com.google.android.gms.pay.ProtoSafeParcelable;
import java.util.Collection;

final class dlqe extends ibsl implements ibtw {
    long a;
    long b;
    int c;
    final byte[] d;
    final dlqf e;

    public dlqe(byte[] arr_b, dlqf dlqf0, ibrl ibrl0) {
        this.d = arr_b;
        this.e = dlqf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlqe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlqe(this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        long v1;
        long v;
        Object object1 = ibrx.a;
        if(this.c != 0) {
            v = this.b;
            v1 = this.a;
            ibnx.b(object0);
            object2 = ((ibnw)object0).a;
            goto label_29;
        }
        ibnx.b(object0);
        byte[] arr_b = this.d;
        if(arr_b == null) {
            icck icck0 = lsc.a(this.e);
            this.e.c(icck0, new frxf[]{dlpt.a});
            return ibom.a;
        }
        dlqh dlqh0 = new dlqh(dlqs.a);
        this.e.e(dlqh0);
        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)idds.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv0);
        long v2 = ((idds)hftv0).c;
        ProtoLiteMessage hftv1 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gflo.a), arr_b, 0, arr_b.length, hftc.a);
        ProtoLiteMessage.P_makeImmutable(hftv1);
        long v3 = ((gflo)hftv1).d;
        evql evql0 = this.e.j.aK(this.e.f, 2);
        this.a = v2;
        this.b = v3;
        this.c = 1;
        object2 = fsdk.a(evql0, this);
        if(object2 != object1) {
            v = v3;
            v1 = v2;
        label_29:
            dlqf dlqf0 = this.e;
            if(ibnw.b(object2)) {
                dlqf0.e(new dlqh(dlqq.a));
                ibuq.c(((ProtoSafeParcelable)object2));
                ibuq.e(dxeo.a, "getDefaultInstance(...)");
                hfuo hfuo0 = ((dxeo)ftqe.c(((ProtoSafeParcelable)object2), ((MessageLite)dxeo.a))).b;
                ibuq.e(hfuo0, "getPaymentMethodDataList(...)");
                for(Object object3: hfuo0) {
                    dxev dxev0 = (dxev)object3;
                    hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                    ibuq.e(hkhr0, "getPaymentMethod(...)");
                    if(!fscr.a(hkhr0)) {
                        continue;
                    }
                    hkhr hkhr1 = dxev0.c == null ? hkhr.b : dxev0.c;
                    hjwt hjwt0 = hkhr1.d == null ? hjwt.a : hkhr1.d;
                    if((hjwt0.c == null ? hjwv.a : hjwt0.c).b == v1) {
                        goto label_51;
                    }
                    hkhr hkhr2 = dxev0.c == null ? hkhr.b : dxev0.c;
                    hjwt hjwt1 = hkhr2.d == null ? hjwt.a : hkhr2.d;
                    if((hjwt1.c == null ? hjwv.a : hjwt1.c).b != v) {
                        continue;
                    }
                    goto label_51;
                }
                object3 = null;
            label_51:
                if(((dxev)object3) == null) {
                    ((ggtj)dlqf.a.j()).x("Payment method not found.");
                    dlqf0.c(lsc.a(dlqf0), new frxf[]{dlpt.a});
                }
                else {
                    if(hwfk.a.b().G() && (!(hfuo0 instanceof Collection) || !hfuo0.isEmpty())) {
                        int v4 = 0;
                        for(Object object4: hfuo0) {
                            hkhr hkhr3 = ((dxev)object4).c;
                            if(hkhr3 == null) {
                                hkhr3 = hkhr.b;
                            }
                            ibuq.e(hkhr3, "getPaymentMethod(...)");
                            if(fscr.a(hkhr3)) {
                                ++v4;
                                if(v4 < 0) {
                                    ibpo.l();
                                }
                            }
                        }
                        if(v4 == 1) {
                            icbb.b(lsc.a(dlqf0), null, null, new dlqd(dlqf0, null), 3);
                        }
                    }
                    dlqf0.c(lsc.a(dlqf0), new frxf[]{new dlpy(((dxev)object3))});
                }
            }
            Throwable throwable0 = ibnw.a(object2);
            if(throwable0 != null) {
                a.ae(dlqf.a.j(), "failed to get payment methods.", throwable0);
            }
            return ibom.a;
        }
        return object1;
    }
}

