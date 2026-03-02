import android.os.Bundle;
import android.text.TextUtils;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map;

public final class crpr {
    public final Map a;

    public crpr(Map map0) {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        hashMap0.putAll(map0);
    }

    public final int a() {
        try {
            String s = (String)this.a.get("PolicyVersion");
            return TextUtils.isEmpty(s) ? -1 : Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return -1;
    }

    public final Bundle b() {
        String s = "denied";
        Map map0 = this.a;
        if("1".equals(map0.get("gdprApplies")) && "1".equals(map0.get("EnableAdvertiserConsentMode"))) {
            if(map0.get("Version") == null) {
                if(!"1".equals(map0.get("GoogleConsent"))) {
                    return Bundle.EMPTY;
                }
                int v = this.a();
                if(v < 0) {
                    return Bundle.EMPTY;
                }
                String s1 = (String)map0.get("PurposeConsents");
                if(TextUtils.isEmpty(s1)) {
                    return Bundle.EMPTY;
                }
                Bundle bundle0 = new Bundle();
                if(s1.length() > 0) {
                    bundle0.putString(crma.a.e, (s1.charAt(0) == 49 ? "granted" : "denied"));
                }
                if(s1.length() > 3) {
                    bundle0.putString(crma.d.e, (s1.charAt(2) != 49 || s1.charAt(3) != 49 ? "denied" : "granted"));
                }
                if(s1.length() > 6 && v >= 4) {
                    String s2 = crma.c.e;
                    if(s1.charAt(0) == 49 && s1.charAt(6) == 49) {
                        s = "granted";
                    }
                    bundle0.putString(s2, s);
                }
                return bundle0;
            }
            if(this.a() >= 0) {
                Bundle bundle1 = new Bundle();
                String s3 = Objects.equals(map0.get("AuthorizePurpose1"), "1") ? "granted" : "denied";
                bundle1.putString(crma.a.e, s3);
                String s4 = !Objects.equals(map0.get("AuthorizePurpose3"), "1") || !Objects.equals(map0.get("AuthorizePurpose4"), "1") ? "denied" : "granted";
                bundle1.putString(crma.d.e, s4);
                if(this.a() >= 4) {
                    String s5 = crma.c.e;
                    if(Objects.equals(map0.get("AuthorizePurpose1"), "1") && Objects.equals(map0.get("AuthorizePurpose7"), "1")) {
                        s = "granted";
                    }
                    bundle1.putString(s5, s);
                }
                return bundle1;
            }
        }
        return Bundle.EMPTY;
    }

    final String c() {
        StringBuilder stringBuilder0 = new StringBuilder();
        gged_interceptors gged0 = crpt.a;
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = (String)gged0.get(v1);
            Map map0 = this.a;
            if(map0.containsKey(s)) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(";");
                }
                stringBuilder0.append(s);
                stringBuilder0.append("=");
                stringBuilder0.append(((String)map0.get(s)));
            }
        }
        return stringBuilder0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof crpr) ? this.c().equalsIgnoreCase(((crpr)object0).c()) : false;
    }

    @Override
    public final int hashCode() {
        return this.c().hashCode();
    }

    @Override
    public final String toString() {
        return this.c();
    }
}

