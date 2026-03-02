import java.util.Locale;
import java.util.Map;

public final class ighe implements ighp, ighr {
    private final int a;

    public ighe(int v) {
        this.a = v;
    }

    @Override  // ighp
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override  // ighr
    public final int b() {
        return this.a == 1 ? 4 : 20;
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        Map map0 = igct.a;
        Object object0 = null;
        for(Object object1: map0.keySet()) {
            String s = (String)object1;
            if(ighi.c(charSequence0, v, s) && (object0 == null || s.length() > ((String)object0).length())) {
                object0 = s;
            }
        }
        if(object0 != null) {
            ighl0.f(((igcw)map0.get(object0)));
            return v + ((String)object0).length();
        }
        return ~v;
    }

    @Override  // ighr
    public final void d(Appendable appendable0, igdm igdm0, Locale locale0) {
    }

    @Override  // ighr
    public final void e(Appendable appendable0, long v, igcm igcm0, int v1, igcw igcw0, Locale locale0) {
        String s;
        if(igcw0 == null) {
            s = "";
        }
        else {
            long v2 = v - ((long)v1);
            if(this.a == 0) {
                if(locale0 == null) {
                    locale0 = Locale.getDefault();
                }
                String s2 = igcw0.g(v2);
                if(s2 == null) {
                    s = igcw0.d;
                }
                else {
                    ighz ighz1 = igcw.e;
                    if((ighz1 instanceof ighz)) {
                        boolean z1 = igcw0.p(v2);
                        String[] arr_s2 = ighz1.b(locale0, igcw0.d, z1);
                        s = arr_s2 == null ? null : arr_s2[1];
                    }
                    else {
                        String[] arr_s3 = ighz1.a(locale0, igcw0.d, s2);
                        s = arr_s3 == null ? null : arr_s3[1];
                    }
                    if(s == null) {
                        s = igcw.l(igcw0.a(v2));
                    }
                }
            }
            else {
                if(locale0 == null) {
                    locale0 = Locale.getDefault();
                }
                String s1 = igcw0.g(v2);
                if(s1 == null) {
                    s = igcw0.d;
                }
                else {
                    ighz ighz0 = igcw.e;
                    if((ighz0 instanceof ighz)) {
                        boolean z = igcw0.p(v2);
                        String[] arr_s = ighz0.b(locale0, igcw0.d, z);
                        s = arr_s == null ? null : arr_s[0];
                    }
                    else {
                        String[] arr_s1 = ighz0.a(locale0, igcw0.d, s1);
                        s = arr_s1 == null ? null : arr_s1[0];
                    }
                    if(s == null) {
                        s = igcw.l(igcw0.a(v2));
                    }
                }
            }
        }
        appendable0.append(s);
    }
}

