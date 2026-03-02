import android.accounts.Account;
import com.google.android.gms.common.Feature;
import org.json.JSONArray;
import org.json.JSONObject;

public final class dlqf extends lsb {
    public static final bboh a;
    public static final String b;
    public final frxn c;
    public final frxj d;
    public final lrf e;
    public final Account f;
    public final dlou g;
    public final edon h;
    public final azts i;
    public final azts j;

    static {
        dlqf.a = bboh.b("Pay", bbcu.cZ);
        String s = new JSONObject().put("existingPaymentMethodRequired", false).put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(new JSONObject().put("type", "BANK_ACCOUNT"))).toString();
        ibuq.e(s, "toString(...)");
        dlqf.b = s;
    }

    public dlqf(lrf lrf0, azts azts0, Account account0, dlou dlou0, edon edon0, azts azts1) {
        this.c = new frxn();
        this.d = new frxj(new dlqh(null));
        this.e = lrf0;
        this.j = azts0;
        this.f = account0;
        this.g = dlou0;
        this.h = edon0;
        this.i = azts1;
    }

    public final dlqh a() {
        return (dlqh)this.d.a();
    }

    public final Object b(Account account0, ibrl ibrl0) {
        Object object2;
        dlqa dlqa0;
        if((ibrl0 instanceof dlqa)) {
            dlqa0 = (dlqa)ibrl0;
            int v = dlqa0.c;
            if((v & 0x80000000) == 0) {
                dlqa0 = new dlqa(this, ibrl0);
            }
            else {
                dlqa0.c = v - 0x80000000;
            }
        }
        else {
            dlqa0 = new dlqa(this, ibrl0);
        }
        Object object0 = dlqa0.a;
        Object object1 = ibrx.a;
        switch(dlqa0.c) {
            case 0: {
                ibnx.b(object0);
                if(!hwfk.a.b().P()) {
                    return ibps.a;
                }
                azts azts0 = this.j;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftdr.a).v_newBuilder();
                ibuq.f(hftp0, "builder");
                String s = account0.name;
                ibuq.e(s, "name");
                ibuq.f(s, "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ftdr ftdr0 = (ftdr)hftp0.b_message;
                s.getClass();
                ftdr0.d = s;
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftdo.a).v_newBuilder();
                ibuq.f(hftp1, "builder");
                ProtoLiteMessage hftv0 = hftp1.N_build();
                ibuq.e(hftv0, "build(...)");
                ibuq.f(((ftdo)hftv0), "value");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ftdr ftdr1 = (ftdr)hftp0.b_message;
                ((ftdo)hftv0).getClass();
                ftdr1.c = (ftdo)hftv0;
                ftdr1.b = 3;
                ProtoLiteMessage hftv1 = hftp0.N_build();
                ibuq.e(hftv1, "build(...)");
                byte[] arr_b = ((ftdr)hftv1).toBytesArray();
                azzc azzc0 = new azzc();
                azzc0.a = new doqk(arr_b);
                azzc0.c = new Feature[]{dlde.aA};
                azzc0.b = false;
                azzc0.d = 7340;
                evql evql0 = azts0.jn(azzc0.a());
                dlqa0.c = 1;
                object2 = fsdk.a(evql0, dlqa0);
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                object2 = ((ibnw)object0).a;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(ibnw.b(object2)) {
            ibnx.b(object2);
            ProtoLiteMessage hftv2 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ftdv.a), ((byte[])object2), 0, ((byte[])object2).length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv2);
            ibuq.e(((ftdv)hftv2), "parseFrom(...)");
            ibuq.f(((ftdv)hftv2), "<this>");
            ftds ftds0 = ((ftdv)hftv2).b == 2 ? ((ftds)((ftdv)hftv2).c) : null;
            if(ftds0 != null) {
                dxfk dxfk0 = ftds0.c == null ? dxfk.a : ftds0.c;
                if(dxfk0 != null) {
                    Object object3 = dxfk0.b;
                    if(object3 != null) {
                        return object3;
                    }
                }
            }
            return ibps.a;
        }
        a.ae(dlqf.a.j(), "failed to get vendor ids", ibnw.a(object2));
        return ibps.a;
    }

    public final void c(icck icck0, frxf[] arr_frxf) {
        ibuq.f(icck0, "<this>");
        this.c.b(icck0, arr_frxf);
    }

    public final void e(dlqh dlqh0) {
        this.d.b(dlqh0);
    }
}

