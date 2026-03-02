import android.text.TextUtils;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class gavl {
    public static ghim a(String s) {
        int v = s.indexOf("<PREFIX>");
        if(v >= 0) {
            int v1 = s.indexOf("<POSTFIX>") + 9;
            String s1 = s.substring(v, v1).replace("<PREFIX>", "").replace("<POSTFIX>", "");
            ghim[] arr_ghim = {gawi.c(s.substring(0, v)), null, null};
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            ArrayList arrayList0 = new ArrayList();
            if(!"b".matches("[a-z0-9-]+")) {
                throw new IllegalArgumentException(a.a("b", "Invalid element name \"", "\". Only lowercase letters, numbers and \'-\' allowed."));
            }
            if(ghil.a.contains("b")) {
                throw new IllegalArgumentException(a.a("b", "Element \"", "\" is not supported."));
            }
            ghil.b(s1, "b", arrayList0);
            arr_ghim[1] = ghin.d(ghil.a("b", linkedHashMap0, arrayList0));
            arr_ghim[2] = gawi.c(s.substring(v1));
            return gawi.b(arr_ghim);
        }
        return gawi.c(s);
    }

    public static String b(String s, String s1) {
        String s2 = s1.trim();
        int v = TextUtils.indexOf(gawk.b(s), gawk.b(s2));
        if(!s2.isEmpty() && v >= 0) {
            int v1 = s2.length() + v;
            return s.substring(0, v) + "<PREFIX>" + s.substring(v, v1) + "<POSTFIX>" + s.substring(v1);
        }
        return s;
    }

    public static String c(hctv hctv0, int v) {
        if(hctv0 != null) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hctv0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)hctv0));
            return gavl.d(hftp0, v);
        }
        return "";
    }

    public static String d(ProtoLiteBuilder hftp0, int v) {
        for(Object object0: DesugarCollections.unmodifiableList(((hctv)hftp0.b_message).d)) {
            hctu hctu0 = (hctu)object0;
            if(hctu0.c == v) {
                return hctu0.d;
            }
        }
        return "";
    }
}

