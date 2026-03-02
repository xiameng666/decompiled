import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

public final class egkf extends bbey {
    private static final HashMap j;

    static {
        egkf.j = new HashMap();
    }

    public egkf(Context context0, String s, String s1, boolean z, boolean z1, String s2, String s3) {
        super(context0.getApplicationContext(), s, s1, z, s2, s3, 5401);
    }

    @Override  // bbeo
    public final HashMap b(Context context0, baqr baqr0) {
        String s1;
        String s3;
        HashMap hashMap0 = super.b(context0, baqr0);
        String s = baqr0.c("sync_reason");
        HashMap hashMap1 = egkf.j;
        synchronized(hashMap1) {
            s1 = (String)hashMap1.get(s);
            if(s1 == null) {
                StringBuilder stringBuilder0 = new StringBuilder(bbfx.a(context0, "People/1.0"));
                if(TextUtils.isEmpty(s)) {
                    stringBuilder0.append("; ondemand");
                }
                else {
                    stringBuilder0.append("; sync-");
                    stringBuilder0.append(s);
                }
                s1 = stringBuilder0.toString();
                hashMap1.put(s, s1);
            }
        }
        hashMap0.put("User-Agent", s1);
        String s2 = baqr0.c("social_client_app_id");
        if(TextUtils.isEmpty(s2)) {
            egig.l("PeopleApiaryServer", "App ID not set in client context", new ehjr());
        }
        boolean z = bbmq.N(context0, "com.google.android.pano.v1");
        boolean z1 = bbnp.o(context0.getResources());
        if(TextUtils.isEmpty(s2)) {
            s2 = "0";
        }
        if(z) {
            s3 = "9";
        }
        else {
            s3 = z1 ? "3" : "2";
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        String s4 = (String)hashMap0.get("X-Api-Client");
        if(s4 != null && s4.length() > 0) {
            stringBuilder1.append(s4);
            stringBuilder1.append(';');
        }
        stringBuilder1.append("device=");
        stringBuilder1.append(s3);
        stringBuilder1.append(";platform=2;application=");
        stringBuilder1.append(s2);
        hashMap0.put("X-Api-Client", stringBuilder1.toString());
        return hashMap0;
    }
}

