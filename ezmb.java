import android.content.Context;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class ezmb {
    public static final bboh a;
    private final Context b;
    private final fpum c;

    static {
        ezmb.a = bboh.b("Trustlet_Place", bbcu.eM);
    }

    public ezmb(Context context0) {
        this.b = context0;
        this.c = new fpum(context0);
    }

    public final gmcd a(String s, Executor executor0, boolean z) {
        boolean z1;
        ckcq ckcq0;
        clbs clbs0 = clbv.a(this.b);
        clbc clbc0 = new clbc(null);
        clbc0.b("https://maps.googleapis.com/maps/api/place/details/json");
        clbd clbd0 = new clbd(clbc0);
        ezma ezma0 = new ezma(this);
        clba clba0 = new clba(null);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ezll.a).v_newBuilder();
        String s1 = hzcr.a.b().a();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezll ezll0 = (ezll)hftp0.b_message;
        hfuo hfuo0 = ezll0.b;
        if(!hfuo0.c()) {
            ezll0.b = ProtoLiteMessage.E(hfuo0);
        }
        ezll0.b.add(s1);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezll ezll1 = (ezll)hftp0.b_message;
        s.getClass();
        hfuo hfuo1 = ezll1.c;
        if(!hfuo1.c()) {
            ezll1.c = ProtoLiteMessage.E(hfuo1);
        }
        ezll1.c.add(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezll ezll2 = (ezll)hftp0.b_message;
        hfuo hfuo2 = ezll2.e;
        if(!hfuo2.c()) {
            ezll2.e = ProtoLiteMessage.E(hfuo2);
        }
        ezll2.e.add("place_id,formatted_address,geometry/location,name,vicinity");
        String s2 = Locale.getDefault().getLanguage();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ezll ezll3 = (ezll)hftp0.b_message;
        s2.getClass();
        hfuo hfuo3 = ezll3.d;
        if(!hfuo3.c()) {
            ezll3.d = ProtoLiteMessage.E(hfuo3);
        }
        ezll3.d.add(s2);
        clba0.c(((MessageLite)(((ezll)hftp0.N_build()))), (z ? ckzk.g : ckzk.e), ezlm.a);
        cldm cldm0 = new cldm(clba0);
        if(z) {
            ckcq0 = ckzk.c;
            z1 = true;
        }
        else {
            ckcq0 = ckzk.b;
            z1 = false;
        }
        clcj clcj0 = clbs0.e(clcg.b(clbd0, cldm0, ckcq0), ezma0, executor0, -1, 0x7201);
        ckcp ckcp0 = z1 ? ckzk.f : ckzk.d;
        ggeo ggeo0 = this.c.a();
        String s3 = (String)ggeo0.get("X-Android-Package");
        String s4 = (String)ggeo0.get("X-Android-Cert");
        gftb.check(s3);
        gftb.check(s4);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ezlk.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ezlk ezlk0 = (ezlk)hftp1.b_message;
        s3.getClass();
        hfuo hfuo4 = ezlk0.b;
        if(!hfuo4.c()) {
            ezlk0.b = ProtoLiteMessage.E(hfuo4);
        }
        ezlk0.b.add(s3);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ezlk ezlk1 = (ezlk)hftp1.b_message;
        s4.getClass();
        hfuo hfuo5 = ezlk1.c;
        if(!hfuo5.c()) {
            ezlk1.c = ProtoLiteMessage.E(hfuo5);
        }
        ezlk1.c.add(s4);
        ezlk ezlk2 = (ezlk)hftp1.N_build();
        claw claw0 = new claw(null);
        claw0.b(((MessageLite)ezlk2), ckcp0, ezln.a);
        clcj0.m(new clax(claw0));
        return glzd.f(clcj0.e().a(), new ezlz(ezma0), executor0);
    }

    public static void b(JSONObject jSONObject0) {
        String s = jSONObject0.optString("status", "");
        switch(s) {
            case "INVALID_REQUEST": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: INVALID_REQUEST");
                return;
            }
            case "NOT_FOUND": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: NOT_FOUND");
                return;
            }
            case "OK": {
                return;
            }
            case "OVER_DAILY_LIMIT": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: OVER_DAILY_LIMIT");
                return;
            }
            case "OVER_QUERY_LIMIT": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: OVER_QUERY_LIMIT");
                return;
            }
            case "REQUEST_DENIED": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: REQUEST_DENIED");
                return;
            }
            case "UNKNOWN_ERROR": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: UNKNOWN_ERROR");
                return;
            }
            case "ZERO_RESULTS": {
                ((ggtj)ezmb.a.j()).x("[WSPlacesUtil] Bad response from server: ZERO_RESULTS");
                return;
            }
            default: {
                ((ggtj)ezmb.a.j()).B("[WSPlacesUtil] Bad response from server that wasn\'t accounted for %s", s);
            }
        }
    }
}

