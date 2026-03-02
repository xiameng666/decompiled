import android.os.Bundle;
import com.google.android.gms.wallet.PaymentData;
import org.json.JSONObject;

public final class dxsy {
    public static final int a;
    private static final bboh b;

    static {
        dxsy.b = bboh.b("Pay", bbcu.cZ);
    }

    public static final hapr a(hagt hagt0, gtlq gtlq0, long v, hagy hagy0) {
        haha haha0;
        ibuq.f(hagt0, "event");
        ibuq.f(gtlq0, "commonProtoImplementationType");
        ibuq.f(hagy0, "topupMetadataObject");
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        haep haep0 = haeo.a(((ProtoLiteMessage)hagz.a).v_newBuilder());
        haep0.c(hagt0);
        haep0.d(v);
        haep0.g(hahb.b);
        switch(gtlq0.ordinal()) {
            case 1: {
                haha0 = haha.b;
                break;
            }
            case 2: {
                haha0 = haha.c;
                break;
            }
            case 3: {
                haha0 = haha.d;
                break;
            }
            case 4: {
                haha0 = haha.e;
                break;
            }
            default: {
                haha0 = haha.a;
            }
        }
        haep0.e(haha0);
        ibuq.f(hagy0, "value");
        ProtoLiteBuilder hftp0 = haep0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hagz hagz0 = (hagz)hftp0.b_message;
        hagy0.getClass();
        hagz0.m = hagy0;
        hagz0.b |= 8;
        hafk0.d(haep0.a());
        return hafk0.a();
    }

    public static final fhvu b(dyna dyna0, String s) {
        ibuq.f(dyna0, "serviceProvider");
        ibuq.f(s, "sessionId");
        gjca gjca0 = gjbz.a(((gjcd)((ProtoLiteMessage)gjce.a).v_newBuilder()));
        gjca0.i();
        gjlo gjlo0 = gjln.a(((ProtoLiteMessage)gjma.a).v_newBuilder());
        gtni gtni0 = dypl.h(dyna0);
        ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
        gjlo0.c(gtni0);
        gjca0.h(gjlo0.a());
        gjca0.b(dzaw.j(s));
        return douc.a(gjca0.a());
    }

    public static final hapr c(dyna dyna0, hanr hanr0, hanq hanq0, hahc hahc0) {
        ibuq.f(dyna0, "serviceProvider");
        ibuq.f(hanr0, "productFlow");
        ibuq.f(hanq0, "event");
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hafe hafe0 = hafd.a(((ProtoLiteMessage)hans.a).v_newBuilder());
        gtni gtni0 = dypl.h(dyna0);
        ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
        hafe0.d(gtni0);
        hafe0.c(hanr0);
        hafe0.b(hanq0);
        if(hahc0 != null) {
            ProtoLiteBuilder hftp0 = hafe0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hans hans0 = (hans)hftp0.b_message;
            hans0.e = hahc0.a();
        }
        hafk0.h(hafe0.a());
        return hafk0.a();
    }

    public static final hapr d(dyna dyna0, hanv hanv0, hahc hahc0) {
        ibuq.f(dyna0, "serviceProvider");
        ibuq.f(hanv0, "userAction");
        hafk hafk0 = hafj.a(((ProtoLiteMessage)hapr.a).v_newBuilder());
        hafg hafg0 = haff.a(((ProtoLiteMessage)hanw.a).v_newBuilder());
        gtni gtni0 = dypl.h(dyna0);
        ibuq.e(gtni0, "paySeProtoToTapAndPay(...)");
        hafg0.b(gtni0);
        hafg0.c(hanv0);
        if(hahc0 != null) {
            ProtoLiteBuilder hftp0 = hafg0.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hanw hanw0 = (hanw)hftp0.b_message;
            hanw0.d = hahc0.a();
        }
        hafk0.i(hafg0.a());
        return hafk0.a();
    }

    public static final String e(JSONObject jSONObject0) {
        ibuq.f(jSONObject0, "paymentMethodData");
        String s = jSONObject0.getString("description");
        ibuq.e(s, "getString(...)");
        return s;
    }

    public static final String f(Throwable throwable0) {
        String s;
        if((throwable0 instanceof aztb)) {
            s = ((aztb)throwable0).a.j;
            return s == null || s.length() == 0 ? "INTERNAL_ERROR" : s;
        }
        s = (throwable0 instanceof dlgy) ? ((dlgy)throwable0).a.b : "";
        return s == null || s.length() == 0 ? "INTERNAL_ERROR" : s;
    }

    public static final String g(JSONObject jSONObject0) {
        ibuq.f(jSONObject0, "paymentMethodData");
        String s = jSONObject0.getJSONObject("info").getString("instrumentId");
        ibuq.e(s, "getString(...)");
        return s;
    }

    public static final String h(JSONObject jSONObject0) {
        ibuq.f(jSONObject0, "paymentMethodData");
        String s = jSONObject0.getJSONObject("tokenizationData").getString("token");
        ibuq.e(s, "getString(...)");
        return s;
    }

    public static final JSONObject i(PaymentData paymentData0) {
        JSONObject jSONObject0 = new JSONObject(paymentData0.g).getJSONObject("paymentMethodData");
        ibuq.e(jSONObject0, "getJSONObject(...)");
        return jSONObject0;
    }

    public static final boolean j(ftem ftem0) {
        ibuq.f(ftem0, "<this>");
        String s = (ftem0.z == null ? fton.a : ftem0.z).c;
        ibuq.e(s, "getWearNodeId(...)");
        return s.length() > 0;
    }

    public static final ftej k(Bundle bundle0) {
        byte[] arr_b = bundle0.getByteArray("process_payment_config");
        if(arr_b != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftej.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((ftej)hftv0), "parseFrom(...)");
                return (ftej)hftv0;
            }
            catch(hfur hfur0) {
                a.ae(dxsy.b.i(), "Failed to parse ProcessPaymentConfig", hfur0);
                return ftek.a(((ftea)((ProtoLiteMessage)ftej.a).v_newBuilder())).a();
            }
        }
        return ftek.a(((ftea)((ProtoLiteMessage)ftej.a).v_newBuilder())).a();
    }

    public static final ftem l(Bundle bundle0) {
        byte[] arr_b = bundle0.getByteArray("purchase_preview_config");
        if(arr_b != null) {
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftem.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                ibuq.e(((ftem)hftv0), "parseFrom(...)");
                return (ftem)hftv0;
            }
            catch(hfur hfur0) {
                a.ae(dxsy.b.i(), "Failed to parse PurchasePreviewConfig", hfur0);
                return ften.a(((ProtoLiteMessage)ftem.a).v_newBuilder()).a();
            }
        }
        return ften.a(((ProtoLiteMessage)ftem.a).v_newBuilder()).a();
    }

    public static hagy m(boolean z, boolean z1, hagu hagu0, int v) {
        if((v & 4) != 0) {
            hagu0 = hagu.a;
        }
        ibuq.f(hagu0, "purchaseErrorType");
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hagy.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        int v1 = 1;
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hagy)hftv0).b = 1 == (((int)z) & (v & 1 ^ 1));
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        if((v & 2) != 0) {
            v1 = 0;
        }
        ((hagy)hftp0.b_message).c = v1 & ((int)z1);
        ibuq.f(hagu0, "value");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hagy hagy0 = (hagy)hftp0.b_message;
        hagy0.d = hagu0.a();
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (hagy)hftv1;
    }

    public static hapr n(hagt hagt0, gtlq gtlq0, long v) {
        return dxsy.a(hagt0, gtlq0, v, hagy.a);
    }

    public static final gucn o() {
        gulb gulb0 = gula.a(((ProtoLiteMessage)gucn.a).v_newBuilder());
        gulf gulf0 = gule.a(((gucs)((ProtoLiteMessage)guct.a).v_newBuilder()));
        gulf0.d();
        gulf0.c(dsgr.i(0x30));
        gulf0.d();
        guld guld0 = gulc.a(((ProtoLiteMessage)gucr.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)guhe.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((guhe)hftv0), "value");
        ProtoLiteBuilder hftp1 = guld0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gucr gucr0 = (gucr)hftp1.b_message;
        ((guhe)hftv0).getClass();
        gucr0.d = (guhe)hftv0;
        gucr0.c = 0x40;
        gulf0.c(guld0.a());
        gulf0.d();
        gulf0.c(dsgr.i(0x30));
        gulb0.b(gulf0.a());
        return gulb0.a();
    }
}

