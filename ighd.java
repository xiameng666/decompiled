import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ighd extends Enum implements ighp, ighr {
    public static final enum ighd a;
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final ighd[] g;

    static {
        ighd.a = new ighd();
        ighd.g = new ighd[]{ighd.a};
        ighd.f = new ArrayList();
        ArrayList arrayList0 = new ArrayList(igcw.c);
        ighd.d = arrayList0;
        Collections.sort(arrayList0);
        ighd.e = new HashMap();
        int v = 0;
        int v1 = 0;
        for(Object object0: arrayList0) {
            String s = (String)object0;
            int v2 = s.indexOf(0x2F);
            if(v2 >= 0) {
                if(v2 < s.length()) {
                    ++v2;
                }
                v1 = Math.max(v1, v2);
                String s1 = s.substring(0, v2 + 1);
                String s2 = s.substring(v2);
                Map map0 = ighd.e;
                if(!map0.containsKey(s1)) {
                    map0.put(s1, new ArrayList());
                }
                ((List)map0.get(s1)).add(s2);
            }
            else {
                ighd.f.add(s);
            }
            v = Math.max(v, s.length());
        }
        ighd.b = v;
        ighd.c = v1;
    }

    private ighd() {
        super("INSTANCE", 0);
    }

    @Override  // ighp
    public final int a() {
        return ighd.b;
    }

    @Override  // ighr
    public final int b() {
        return ighd.b;
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        int v4;
        String s = "";
        List list0 = ighd.f;
        int v1 = charSequence0.length();
        int v2 = Math.min(v1, ighd.c + v);
        int v3 = v;
        while(v3 < v2) {
            if(charSequence0.charAt(v3) == 0x2F) {
                String s1 = charSequence0.subSequence(v, v3 + 1).toString();
                v4 = s1.length() + v;
                String s2 = v3 >= v1 - 1 ? s1 : s1 + charSequence0.charAt(v3 + 1);
                List list1 = (List)ighd.e.get(s2);
                if(list1 == null) {
                    return ~v;
                }
                s = s1;
                list0 = list1;
                goto label_18;
            }
            ++v3;
        }
        v4 = v;
    label_18:
        String s3 = null;
        for(int v5 = 0; v5 < list0.size(); ++v5) {
            String s4 = (String)list0.get(v5);
            if(ighi.c(charSequence0, v4, s4) && (s3 == null || s4.length() > s3.length())) {
                s3 = s4;
            }
        }
        if(s3 != null) {
            ighl0.f(igcw.m((s + s3)));
            return v4 + s3.length();
        }
        return ~v;
    }

    @Override  // ighr
    public final void d(Appendable appendable0, igdm igdm0, Locale locale0) {
    }

    @Override  // ighr
    public final void e(Appendable appendable0, long v, igcm igcm0, int v1, igcw igcw0, Locale locale0) {
        appendable0.append((igcw0 == null ? "" : igcw0.d));
    }

    public static ighd[] values() {
        return (ighd[])ighd.g.clone();
    }
}

