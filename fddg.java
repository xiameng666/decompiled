import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public final class fddg {
    public static int a() {
        return !fdci.b() || !hzvd.a.c().f() ? 0x7F153662 : 0x7F153663;  // string:wearable_tos_wifi_description "Your watch can continue getting notifications 
                                                                        // and messages from your phone over Wi-Fi or LTE using Google Cloud Sync. When enabled, 
                                                                        // the data is end-to-end encrypted and only stored transiently."
    }

    public static int b(String s, boolean z) {
        if(s != null && iaaa.a.b().a().b.contains(s)) {
            return z ? 0x7F153657 : 0x7F153656;  // string:wearable_tos_google_description_with_location_cn "By continuing, you agree 
                                                 // to the Google <a href=https://policies.google.cn/terms>Terms of Service</a>, <a 
                                                 // href=https://policies.google.cn/terms/location>Location Terms of Service</a> and 
                                                 // the terms below.<br />Note: The <a href=https://policies.google.cn/privacy>Google 
                                                 // Privacy Policy</a> describes how data is handled in this service."
        }
        return z ? 0x7F153655 : 0x7F153654;  // string:wearable_tos_google_description_cn "By continuing, you agree to the Google 
                                             // <a href=https://policies.google.cn/terms>Terms of Service</a> and the terms below.<br 
                                             // />Note: The <a href=https://policies.google.cn/privacy>Google Privacy Policy</a> 
                                             // describes how data is handled in this service."
    }

    public static gged_interceptors c(List list0) {
        ggdy ggdy0 = new ggdy();
        ggqk ggqk0 = ((gged_interceptors)list0).E();
        while(ggqk0.hasNext()) {
            Object object0 = ggqk0.next();
            ArrayList arrayList0 = new ArrayList();
            Integer integer0 = ((fddf)object0).a;
            if(integer0 != null) {
                arrayList0.add(integer0);
            }
            arrayList0.add(Integer.valueOf(((fddf)object0).c));
            ggdy0.k(arrayList0);
        }
        return ggdy0.h();
    }

    public static boolean d(gged_interceptors gged0, List list0) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < ((ggna)gged0).c; ++v) {
            arrayList0.add(Integer.valueOf(((fddf)gged0.get(v)).f));
        }
        for(Object object0: list0) {
            if(!arrayList0.contains(((Integer)object0))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(int v, String s, String s1) {
        return v == 1 ? !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) : true;
    }
}

