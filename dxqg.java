import android.content.Intent;
import com.google.android.gms.common.Feature;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.TopupSePrepaidCardRequest;
import com.google.android.gms.wallet.PaymentData;
import j..util.Optional;
import org.json.JSONException;
import org.json.JSONObject;

final class dxqg extends ibsl implements ibtw {
    Object a;
    int b;
    final dxqi c;
    final PaymentData d;

    public dxqg(dxqi dxqi0, PaymentData paymentData0, ibrl ibrl0) {
        this.c = dxqi0;
        this.d = paymentData0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxqg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxqg(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dynd dynd0;
        Object object3;
        Object object2;
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.b) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_20;
                }
                default: {
                    object2 = this.a;
                    ibnx.b(object0);
                    object3 = ((ibnw)object0).a;
                    goto label_178;
                }
            }
        }
        catch(JSONException jSONException0) {
            a.ae(dxqi.i.i(), "Failed to parse payment data.", jSONException0);
            dxmj.m(this.c, null, 3);
            return ibom.a;
        }
        ibnx.b(object0);
        try {
            dxqy dxqy0 = dxqy.a(this.c.a(), null, true, false, 5);
            this.c.j(dxqy0);
            this.b = 1;
            dyna dyna0 = dzdt.f(this.c.e.c);
            ibuq.e(dyna0, "getSeServiceProviderFromBillableService(...)");
            ftiz ftiz0 = ftiy.a(((ProtoLiteMessage)ftix.a).v_newBuilder());
            ftiz0.b(this.c.g.b);
            ftix ftix0 = ftiz0.a();
            Object object4 = this.c.f.c(dyna0, ftix0, this);
            if(object4 != object1) {
                object4 = ibom.a;
            }
            if(object4 == object1) {
                return object1;
            }
            goto label_21;
        label_20:
            ibnx.b(object0);
        label_21:
            dxqi dxqi0 = this.c;
            ftej ftej0 = dxqi0.e;
            dyna dyna1 = dzdt.f(ftej0.c);
            ibuq.c(dyna1);
            dxqi0.n(dyna1, hanq.b);
            JSONObject jSONObject0 = dxsy.i(this.d);
            ibuq.f(ftej0, "<this>");
            String s = (ftej0.u == null ? fton.a : ftej0.u).c;
            ibuq.e(s, "getWearNodeId(...)");
            if(s.length() > 0) {
                eagu eagu0 = dzpw.c(dxqi0.c);
                if((eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)) == eagt.c && !eagu0.f.isEmpty()) {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)dymt.a).v_newBuilder();
                    ibuq.f(hftp0, "builder");
                    dyna dyna2 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
                    ibuq.e(dyna2, "getServiceProvider(...)");
                    ibuq.f(dyna2, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dymt dymt0 = (dymt)hftp0.b_message;
                    dymt0.c = dyna2.a();
                    Object object5 = eagu0.f.get(0);
                    ibuq.e(object5, "get(...)");
                    ibuq.f(((hkjm)object5), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dymt dymt1 = (dymt)hftp0.b_message;
                    ((hkjm)object5).getClass();
                    dymt1.d = (hkjm)object5;
                    dymt1.b |= 1;
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hjin.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    String s1 = dxqi0.g.c;
                    ibuq.e(s1, "getCurrencyCode(...)");
                    ibuq.f(s1, "value");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    hjin hjin0 = (hjin)hftp1.b_message;
                    s1.getClass();
                    hjin0.b = s1;
                    long v = dxqi0.g.b / 1000000L;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((hjin)hftp1.b_message).c = v;
                    ProtoLiteMessage hftv0 = hftp1.N_build();
                    ibuq.e(hftv0, "build(...)");
                    ibuq.f(((hjin)hftv0), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dymt dymt2 = (dymt)hftp0.b_message;
                    ((hjin)hftv0).getClass();
                    dymt2.e = (hjin)hftv0;
                    dymt2.b |= 2;
                    String s2 = dxsy.h(jSONObject0);
                    ibuq.f(s2, "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    dymt dymt3 = (dymt)hftp0.b_message;
                    s2.getClass();
                    dymt3.f = s2;
                    ProtoLiteMessage hftv1 = hftp0.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ibuq.c(eagu0);
                    ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)eagu0).jf(5, null);
                    hftp2.X(((ProtoLiteMessage)eagu0));
                    eagw eagw0 = eagv.a(hftp2);
                    ibuq.f(((dymt)hftv1), "value");
                    ProtoLiteBuilder hftp3 = eagw0.a;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    eagu eagu1 = (eagu)hftp3.b_message;
                    ((dymt)hftv1).getClass();
                    eagu1.m = (dymt)hftv1;
                    eagu1.b |= 4;
                    eagu eagu2 = eagw0.a();
                    dxqi0.i(lsc.a(dxqi0), new frxf[]{new dxrc(eagu2)});
                    return ibom.a;
                }
                Intent intent0 = new Intent();
                intent0.putExtra("top_up_amount", dxqi0.g.b);
                intent0.putExtra("top_up_payment_method", dxsy.h(jSONObject0));
                intent0.putExtra("top_up_instrument_id", dxsy.g(jSONObject0));
                intent0.putExtra("top_up_instrument_descr", dxsy.e(jSONObject0));
                dxqi0.g(intent0);
                return ibom.a;
            }
            TopupSePrepaidCardRequest topupSePrepaidCardRequest0 = new TopupSePrepaidCardRequest();
            topupSePrepaidCardRequest0.a = dxqi0.j;
            fteg fteg0 = ftej0.s == null ? fteg.a : ftej0.s;
            topupSePrepaidCardRequest0.b = ednj.a((fteg0.e == null ? hjqn.a : fteg0.e));
            topupSePrepaidCardRequest0.f = dypl.a(dyna1);
            if(dyna1 == dyna.b) {
                JSONObject jSONObject1 = new JSONObject(dxsy.h(jSONObject0));
                if(jSONObject1.has("error_information")) {
                    JSONObject jSONObject2 = jSONObject1.getJSONObject("error_information");
                    ibuq.e(jSONObject2, "getJSONObject(...)");
                    String s3 = jSONObject2.getString("error_code");
                    ibuq.e(s3, "getString(...)");
                    ((ggtj)dxqi.i.j()).B("Error occurs when top-up Edy card: %s", s3);
                    dxmj.m(dxqi0, s3, 2);
                    return ibom.a;
                }
                String s4 = jSONObject1.getString("result");
                ibuq.e(s4, "getString(...)");
                if(s4.equals("1")) {
                    dxqi0.i(lsc.a(dxqi0), new frxf[]{dxrd.a});
                    return ibom.a;
                }
                dyns dyns0 = dynr.a(((ProtoLiteMessage)dynq.a).v_newBuilder());
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)dyft.a).v_newBuilder();
                ibuq.f(hftp4, "builder");
                String s5 = jSONObject1.getString("fss_start_url");
                ibuq.e(s5, "getString(...)");
                ibuq.f(s5, "value");
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                dyft dyft0 = (dyft)hftp4.b_message;
                s5.getClass();
                dyft0.b = s5;
                String s6 = jSONObject1.getString("fss_session_id");
                ibuq.e(s6, "getString(...)");
                ibuq.f(s6, "value");
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                dyft dyft1 = (dyft)hftp4.b_message;
                s6.getClass();
                dyft1.c = s6;
                ProtoLiteMessage hftv2 = hftp4.N_build();
                ibuq.e(hftv2, "build(...)");
                ibuq.f(((dyft)hftv2), "value");
                ProtoLiteBuilder hftp5 = dyns0.a;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                dynq dynq0 = (dynq)hftp5.b_message;
                ((dyft)hftv2).getClass();
                dynq0.c = (dyft)hftv2;
                dynq0.b = 2;
                topupSePrepaidCardRequest0.j = dyns0.a().toBytesArray();
            }
            else {
                dyns dyns1 = dynr.a(((ProtoLiteMessage)dynq.a).v_newBuilder());
                dygx dygx0 = dygw.a(((ProtoLiteMessage)dygv.a).v_newBuilder());
                dygx0.c(dxsy.h(jSONObject0));
                dygx0.b(dxqi0.g.b);
                dyns1.b(dygx0.a());
                topupSePrepaidCardRequest0.j = dyns1.a().toBytesArray();
                topupSePrepaidCardRequest0.g = dxsy.g(jSONObject0);
                topupSePrepaidCardRequest0.h = dxsy.e(jSONObject0);
            }
            azzc azzc0 = new azzc();
            azzc0.a = new dopk(topupSePrepaidCardRequest0);
            azzc0.c = new Feature[]{dlde.G};
            azzc0.b = false;
            azzc0.d = 7304;
            azzd azzd0 = azzc0.a();
            evql evql0 = dxqi0.n.iG(azzd0);
            this.a = dyna1;
            this.b = 2;
            Object object6 = fsdk.a(evql0, this);
            if(object6 == object1) {
                return object1;
            }
            object3 = object6;
            object2 = dyna1;
        label_178:
            dxqi dxqi1 = this.c;
            if(ibnw.b(object3)) {
                ProtoSafeParcelable protoSafeParcelable0 = (ProtoSafeParcelable)object3;
                ibuq.c(object2);
                dxqi1.n(((dyna)object2), hanq.c);
                Intent intent1 = new Intent();
                intent1.putExtra("top_up_amount", dxqi1.g.b);
                dxqi1.g(intent1);
            }
            Throwable throwable0 = ibnw.a(object3);
            if(throwable0 != null) {
                a.ae(dxqi.i.i(), "Failed to top-up SE prepaid card.", throwable0);
                String s7 = dxsy.f(throwable0);
                if(object2 == dyna.b && ibzk.G(s7, "320300002004")) {
                    icck icck0 = lsc.a(dxqi1);
                    dxqd dxqd0 = new dxqd(dxqi1, null);
                    icbb.b(icck0, dxqi1.l, null, dxqd0, 2);
                    return ibom.a;
                }
                if((throwable0 instanceof dlgy)) {
                    Optional optional0 = dzdt.s(((dlgy)throwable0));
                    ibuq.e(optional0, "tryGetSecureElementUnifiedError(...)");
                    dynd0 = (dynd)ibvp.b(optional0);
                }
                else {
                    dynd0 = null;
                }
                dxqi1.h(s7, dynd0);
                return ibom.a;
            }
        }
        catch(JSONException jSONException0) {
            a.ae(dxqi.i.i(), "Failed to parse payment data.", jSONException0);
            dxmj.m(this.c, null, 3);
        }
        return ibom.a;
    }
}

