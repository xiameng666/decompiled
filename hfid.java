import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class hfid {
    public static final int a;
    private static final gfud b;
    private static final gfud c;
    private static final gfud d;
    private static final gfss e;
    private static final gfss f;
    private static final gfss g;
    private static final gged_interceptors h;

    static {
        hfid.b = gfud.e('=').d().c(2);
        hfid.c = gfud.e('/');
        hfid.d = gfud.e('-');
        gfud.e(':');
        hfid.e = new gfss("/");
        hfid.f = new gfss("-");
        hfid.g = new gfss("=");
        hfid.h = gged_interceptors.B(new hfic("s", false), new hfic("w", false), new hfic("c", true), new hfic("d", true), new hfic("h", false), new hfic("s", true), new hfic("h", true), new hfic("p", true), new hfic("pp", true), new hfic("pf", true), new hfic("n", true), new hfic("r", false), new hfic[]{new hfic("r", true), new hfic("o", true), new hfic("o", false), new hfic("j", false), new hfic("x", false), new hfic("y", false), new hfic("z", false), new hfic("g", true), new hfic("e", false), new hfic("f", false), new hfic("k", true), new hfic("u", true), new hfic("ut", true), new hfic("i", true), new hfic("a", true), new hfic("b", true), new hfic("b", false), new hfic("c", false), new hfic("t", false), new hfic("nt0", false), new hfic("v", true), new hfic("q", false), new hfic("fh", true), new hfic("fv", true), new hfic("fg", true), new hfic("ci", true), new hfic("rw", true), new hfic("rwu", true), new hfic("rwa", true), new hfic("nw", true), new hfic("rh", true), new hfic("no", true), new hfic("ns", true), new hfic("k", false), new hfic("p", false), new hfic("l", false), new hfic("v", false), new hfic("nu", true), new hfic("ft", true), new hfic("cc", true), new hfic("nd", true), new hfic("ip", true), new hfic("nc", true), new hfic("a", false), new hfic("rj", true), new hfic("rp", true), new hfic("rg", true), new hfic("pd", true), new hfic("pa", true), new hfic("m", false), new hfic("vb", false), new hfic("vl", false), new hfic("lf", true), new hfic("mv", true), new hfic("id", true), new hfic("al", true), new hfic("ic", false), new hfic("pg", true), new hfic("mo", true), new hfic("iv", false), new hfic("il", false), new hfic("ba", false), new hfic("vm", false), new hfic("vf", false)});
    }

    protected hfid() {
    }

    public hfid(byte[] arr_b) {
    }

    static String a(String s, String s1, boolean z) {
        gftb.b(s != null, "oldOptions is null");
        if(!s.isEmpty()) {
            List list0 = hfid.b(s, ((boolean)(((int)z) ^ 1)));
            if(!list0.isEmpty()) {
                list0.addAll(hfid.b(s1, false));
                gfza gfza0 = new gfza();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: list0) {
                    String s2 = (String)object0;
                    gged_interceptors gged0 = hfid.h;
                    int v = ((ggna)gged0).c;
                    Object object1 = null;
                    for(int v1 = 0; v1 < v; ++v1) {
                        hfic hfic0 = (hfic)gged0.get(v1);
                        String s3 = s2.toLowerCase(Locale.getDefault());
                        String s4 = hfic0.a;
                        if(s3.startsWith(s4)) {
                            if(!hfic0.b) {
                                object1 = hfic0;
                            }
                            else if(s2.length() == s4.length()) {
                                object1 = hfic0;
                                break;
                            }
                        }
                    }
                    if(object1 == null) {
                        arrayList0.add(s2);
                    }
                    else {
                        gfza0.v(object1, s2);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                gged_interceptors gged1 = hfid.h;
                int v2 = ((ggna)gged1).c;
                for(int v3 = 0; v3 < v2; ++v3) {
                    String s5 = "";
                    for(Object object2: gfza0.g(((hfic)gged1.get(v3)))) {
                        String s6 = (String)object2;
                        if(Character.isUpperCase(s6.charAt(0))) {
                            arrayList1.add(s6);
                        }
                        else {
                            s5 = s6;
                        }
                    }
                    if(!s5.isEmpty()) {
                        arrayList1.add(s5);
                    }
                }
                arrayList1.addAll(arrayList0);
                return hfid.f.b(arrayList1);
            }
        }
        return s1;
    }

    public static List b(String s, boolean z) {
        gftb.b(s != null, "options is null");
        List list0 = new ArrayList();
        Iterator iterator0 = hfid.d.l(s).iterator();
        while(iterator0.hasNext()) {
            Object object0 = "";
            Object object1 = iterator0.next();
            String s1 = (String)object1;
            if(!s1.isEmpty()) {
                if(s1.startsWith("O") || s1.startsWith("J")) {
                    while(s1.length() < 12) {
                        gfss gfss0 = hfid.f;
                        Object object2 = iterator0.hasNext() ? iterator0.next() : "";
                        s1 = gfss0.g(s1, object2, new Object[0]);
                    }
                }
                if(s1.equals("pi") || s1.equals("ya") || s1.equals("ro")) {
                    gfss gfss1 = hfid.f;
                    if(iterator0.hasNext()) {
                        object0 = iterator0.next();
                    }
                    s1 = gfss1.g(s1, object0, new Object[0]);
                }
                if(!z || Character.isUpperCase(s1.charAt(0))) {
                    list0.add(s1);
                }
            }
        }
        return list0;
    }

    public static final String c(fhsl fhsl0) {
        String s = fhsl0.a();
        ArrayList arrayList0 = ggia.b(hfid.b.l(s));
        return arrayList0.size() == 2 ? ((String)arrayList0.get(1)) : "";
    }

    public static final String d(List list0) {
        switch(list0.size()) {
            case 4: {
                list0.add("");
                return (String)list0.get(4);
            }
            case 5: {
                list0.add(4, "");
                return (String)list0.get(4);
            }
            default: {
                return (String)list0.get(4);
            }
        }
    }

    static final List e(fhsl fhsl0) {
        String s = fhsl0.a();
        List list0 = ggia.b(hfid.c.l(s));
        return list0.size() <= 0 || !((String)list0.get(0)).isEmpty() ? list0 : list0.subList(1, list0.size());
    }

    public static final boolean f(List list0) {
        int v = list0.size();
        return v <= 0 || v > 1 ? false : !((String)list0.get(0)).isEmpty();
    }

    public static final boolean g(List list0) {
        int v = list0.size();
        if(v < 4) {
            return false;
        }
        return v == 4 ? !((String)list0.get(3)).isEmpty() : v <= 6;
    }

    public static final List h(fhsl fhsl0) {
        if(fhsl0.a() == null) {
            throw new hfib("url path is null");
        }
        List list0 = hfid.e(fhsl0);
        if(!list0.isEmpty() && "u".equals(list0.get(0))) {
            list0.remove(1);
            list0.remove(0);
        }
        else if(!list0.isEmpty() && "image".equals(list0.get(0))) {
            list0.remove(0);
        }
        if(list0.size() == 2) {
            list0.remove(0);
        }
        return list0;
    }

    public final boolean i(Uri uri0) {
        String s = new fhsl(uri0).toString();
        if(s != null) {
            return hfiq.a.matcher(s).find();
        }
        throw new IllegalArgumentException();
    }

    public final Uri j(hfik hfik0, Uri uri0) {
        try {
            return (Uri)hfid.k(hfik0, new fhsl(uri0), true);
        }
        catch(hfib hfib0) {
            throw new fhsm(hfib0);
        }
    }

    public static final Object k(hfik hfik0, fhsl fhsl0, boolean z) {
        boolean z1 = true;
        List list0 = hfid.h(fhsl0);
        if(hfid.g(list0)) {
            gftb.b(fhsl0.a() != null, "url path is null");
            List list1 = hfid.e(fhsl0);
            if(!list1.isEmpty() && ((String)list1.get(0)).equals("image")) {
                list1.remove(0);
            }
            else {
                z1 = false;
            }
            String s = hfik0.f();
            String s1 = hfid.a(hfid.d(list1), s, z);
            list1.set(4, s1);
            if(s1.isEmpty() && list1.size() > 5) {
                list1.remove(4);
            }
            if(z1) {
                list1.add(0, "image");
            }
            return fhsl0.b("/" + hfid.e.b(list1)).a;
        }
        if(!hfid.f(list0)) {
            throw new hfib(fhsl0.toString());
        }
        if(fhsl0.a() == null) {
            z1 = false;
        }
        gftb.b(z1, "url path is null");
        String s2 = fhsl0.a();
        ArrayList arrayList0 = ggia.b(hfid.b.l(s2));
        String s3 = hfik0.f();
        String s4 = hfid.a(hfid.c(fhsl0), s3, z);
        String s5 = (String)arrayList0.get(0);
        if(!s4.isEmpty()) {
            s5 = hfid.g.g(s5, s4, new Object[0]);
        }
        return fhsl0.b(s5).a;
    }
}

