import android.content.Context;

public final class ebtr {
    public static final dyfy a() {
        dyga dyga0 = dyfz.a(((ProtoLiteMessage)dyfy.a).v_newBuilder());
        dyga0.b(dygr.a(((ProtoLiteMessage)dygq.a).v_newBuilder()).a());
        return dyga0.a();
    }

    public static final String b(Context context0, String s) {
        String s1;
        switch(s) {
            case "com.felicanetworks.mfc": {
                s1 = "Mobile FeliCa Client";
                break;
            }
            case "com.felicanetworks.mfm.main": {
                s1 = "Osaifu-Keitai";
                break;
            }
            case "com.google.android.gms.pay.sidecar": {
                s1 = "Google Play services for payments";
                break;
            }
            default: {
                s1 = "";
            }
        }
        ibuq.c(s1);
        return s1;
    }
}

