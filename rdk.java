import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import org.json.JSONException;

public final class rdk {
    public static final int a;

    static {
        rdk.a = Runtime.getRuntime().availableProcessors();
    }

    public static int a(Bundle bundle0, String s) {
        if(bundle0 == null) {
            rdk.h(s, "Unexpected null bundle received!");
            return 6;
        }
        Object object0 = bundle0.get("RESPONSE_CODE");
        if(object0 == null) {
            return 0;
        }
        if((object0 instanceof Integer)) {
            return (int)(((Integer)object0));
        }
        rdk.h(s, "Unexpected type for bundle response code: " + object0.getClass().getName());
        return 6;
    }

    public static int b(Intent intent0, String s) {
        return rdk.c(intent0, s).a;
    }

    public static rcm c(Intent intent0, String s) {
        if(intent0 == null) {
            rdk.h("BillingHelper", "Got null intent!");
            return rcl.a(6, 0, "An internal error occurred.");
        }
        return rcl.a(rdk.a(intent0.getExtras(), s), 0, rdk.f(intent0.getExtras(), s));
    }

    public static Purchase d(String s, String s1) {
        if(s != null && s1 != null) {
            try {
                return new Purchase(s, s1);
            }
            catch(JSONException jSONException0) {
                rdk.h("BillingHelper", "Got JSONException while parsing purchase data: " + jSONException0.toString());
            }
        }
        return null;
    }

    public static rdj e(String s, String s1) {
        Purchase purchase0;
        if(s != null && s1 != null) {
            try {
                purchase0 = new Purchase(s, s1);
            }
            catch(JSONException jSONException0) {
                rdk.h("BillingHelper", "Got JSONException while parsing purchase data: " + jSONException0.toString());
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hgym.a).v_newBuilder();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp0.b_message;
                ((hgym)hftv0).c = 2;
                ((hgym)hftv0).b |= 1;
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                hgym hgym0 = (hgym)hftp0.b_message;
                hgym0.b |= 2;
                hgym0.d = "Error parsing: " + s;
                return new rdj(null, ((hgym)hftp0.N_build()));
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgym.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((hgym)hftp1.b_message).c = 1;
            ((hgym)hftp1.b_message).b |= 1;
            return new rdj(purchase0, ((hgym)hftp1.N_build()));
        }
        if(s == null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hgym.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((hgym)hftp2.b_message).c = 4;
            ((hgym)hftp2.b_message).b |= 1;
            return new rdj(null, ((hgym)hftp2.N_build()));
        }
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)hgym.a).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((hgym)hftp3.b_message).c = 5;
        ((hgym)hftp3.b_message).b |= 1;
        return new rdj(null, ((hgym)hftp3.N_build()));
    }

    public static String f(Bundle bundle0, String s) {
        if(bundle0 == null) {
            rdk.h(s, "Unexpected null bundle received!");
            return "";
        }
        Object object0 = bundle0.get("DEBUG_MESSAGE");
        if(object0 == null) {
            return "";
        }
        if((object0 instanceof String)) {
            return (String)object0;
        }
        rdk.h(s, "Unexpected type for debug message: " + object0.getClass().getName());
        return "";
    }

    public static String g(String s, int v) {
        return s.length() > v ? s.substring(0, v) : s;
    }

    public static void h(String s, String s1) {
        if(Log.isLoggable(s, 5)) {
            Log.w(s, s1);
        }
    }

    public static void i(String s, String s1, Throwable throwable0) {
        try {
            if(Log.isLoggable(s, 5)) {
                Log.w(s, s1, throwable0);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void j(Bundle bundle0, String s, long v) {
        bundle0.putString("playBillingLibraryVersion", "8.1.0");
        if(s != null) {
            bundle0.putString("playBillingLibraryWrapperVersion", s);
        }
        bundle0.putLong("billingClientSessionId", v);
    }

    public static Bundle k(rcm rcm0, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("RESPONSE_CODE", rcm0.a);
        bundle0.putString("DEBUG_MESSAGE", rcm0.c);
        bundle0.putInt("LOG_REASON", v - 1);
        return bundle0;
    }

    public static Bundle l(rcm rcm0, String s) {
        Bundle bundle0 = rdk.k(rcm0, 5);
        if(s != null) {
            bundle0.putString("ADDITIONAL_LOG_DETAILS", s);
        }
        return bundle0;
    }
}

