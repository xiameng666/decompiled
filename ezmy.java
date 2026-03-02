import android.os.SystemClock;
import com.android.volley.NetworkResponse;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;

public final class ezmy {
    private final ezmx a;
    private final ezts b;
    private long c;

    public ezmy(ezmx ezmx0, ezts ezts0) {
        this.a = ezmx0;
        this.b = ezts0;
    }

    public final hfqm a(baqr baqr0, hfql hfql0) {
        String s;
        this.c = SystemClock.elapsedRealtime();
        try {
            byte[] arr_b = hfql0.toBytesArray();
            hfqm hfqm0 = (hfqm)this.a.a.h(baqr0, 1, "/users/" + bbes.b(hfql0.d) + "/overviewConfig?alt=proto", arr_b, hfqm.a);
            this.b(null);
            return hfqm0;
        }
        catch(acse acse0) {
            this.b("AUTH");
            throw acse0;
        }
        catch(VolleyError volleyError0) {
            if((volleyError0 instanceof TimeoutError)) {
                s = "NETWORK";
            }
            else {
                NetworkResponse networkResponse0 = volleyError0.networkResponse;
                if(networkResponse0 == null) {
                    s = "NETWORK";
                }
                else if(networkResponse0.statusCode >= 500 && networkResponse0.statusCode < 600) {
                    s = "SERVER";
                }
                else {
                    s = "OTHER";
                }
            }
            this.b(s);
            throw volleyError0;
        }
    }

    private final void b(String s) {
        ezts ezts0 = this.b;
        if(ezts0 != null) {
            long v = SystemClock.elapsedRealtime() - this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
            hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
            gqsp gqsp0 = gqsp.dV;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((gqxs)hftr0.b_message).c = gqsp0.fJ;
            ((gqxs)hftr0.b_message).b |= 1;
            gqsm gqsm0 = gfta.c(s) ? gqsm.pY : gqsm.pZ;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((gqxs)hftr0.b_message).e = gqsm0.UH;
            ((gqxs)hftr0.b_message).b |= 4;
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs.b(((gqxs)hftr0.b_message));
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gqwf.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqwf gqwf0 = (gqwf)hftp1.b_message;
            gqwf0.b |= 1;
            gqwf0.c = "FetchOverviewConfig";
            String s1 = hzdc.d().replace("https://", "");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gqwf gqwf1 = (gqwf)hftp1.b_message;
            s1.getClass();
            gqwf1.b |= 4;
            gqwf1.e = s1;
            String s2 = hzdc.c().replace("/userdatacontrols/", "");
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            s2.getClass();
            ((gqwf)hftv0).b |= 2;
            ((gqwf)hftv0).d = s2;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gqwf)hftv1).b |= 8;
            ((gqwf)hftv1).f = (int)v;
            if(s != null) {
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gqwf gqwf2 = (gqwf)hftp1.b_message;
                gqwf2.b |= 16;
                gqwf2.g = s;
            }
            gqwf gqwf3 = (gqwf)hftp1.N_build();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            gqxs gqxs0 = (gqxs)hftr0.b_message;
            gqwf3.getClass();
            gqxs0.h = gqwf3;
            gqxs0.b |= 0x40;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gqxt gqxt0 = (gqxt)hftp0.b_message;
            gqxs gqxs1 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
            gqxs1.getClass();
            gqxt0.c = gqxs1;
            gqxt0.b |= 1;
            ezts0.b(((gqxt)hftp0.N_build()));
        }
    }
}

