import j..util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

final class ighc implements ighp, ighr {
    private static final Map a;
    private final igcr b;
    private final boolean c;

    static {
        ighc.a = new ConcurrentHashMap();
    }

    public ighc(igcr igcr0, boolean z) {
        this.b = igcr0;
        this.c = z;
    }

    @Override  // ighp
    public final int a() {
        return this.b();
    }

    @Override  // ighr
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        int v4;
        int v3;
        Map map2;
        Map map0 = ighc.a;
        Locale locale0 = ighl0.b;
        Map map1 = (Map)map0.get(locale0);
        if(map1 == null) {
            map1 = new ConcurrentHashMap();
            map0.put(locale0, map1);
        }
        igcr igcr0 = this.b;
        Object[] arr_object = (Object[])map1.get(igcr0);
        if(arr_object == null) {
            map2 = new ConcurrentHashMap(0x20);
            igdh igdh0 = new igdh(0L, igcw.b);
            igcp igcp0 = igcr0.a(igdh0.b);
            if(!igcp0.A()) {
                throw new IllegalArgumentException("Field \'" + igcr0.y + "\' is not supported");
            }
            igdg igdg0 = new igdg(igdh0, igcp0);
            int v1 = igdg0.b.e();
            int v2 = igdg0.b.c();
            if(v2 - v1 <= 0x20) {
                v3 = igdg0.b.b(locale0);
                while(v1 <= v2) {
                    igdg0.a.oV(igdg0.b.l(igdg0.a.a, v1));
                    map2.put(igdg0.f(locale0), Boolean.TRUE);
                    map2.put(igdg0.f(locale0).toLowerCase(locale0), Boolean.TRUE);
                    map2.put(igdg0.f(locale0).toUpperCase(locale0), Boolean.TRUE);
                    map2.put(igdg0.g(locale0), Boolean.TRUE);
                    map2.put(igdg0.g(locale0).toLowerCase(locale0), Boolean.TRUE);
                    map2.put(igdg0.g(locale0).toUpperCase(locale0), Boolean.TRUE);
                    ++v1;
                }
                if("en".equals(locale0.getLanguage()) && igcr0 == igcr.b) {
                    map2.put("BCE", Boolean.TRUE);
                    map2.put("bce", Boolean.TRUE);
                    map2.put("CE", Boolean.TRUE);
                    map2.put("ce", Boolean.TRUE);
                    v3 = 3;
                }
                map1.put(igcr0, new Object[]{map2, v3});
                v4 = Math.min(charSequence0.length(), v3 + v);
                goto label_42;
            }
        }
        else {
            Map map3 = (Map)arr_object[0];
            v3 = (int)(((Integer)arr_object[1]));
            map2 = map3;
            v4 = Math.min(charSequence0.length(), v3 + v);
        label_42:
            while(v4 > v) {
                String s = charSequence0.subSequence(v, v4).toString();
                if(map2.containsKey(s)) {
                    ighj ighj0 = ighl0.c();
                    ighj0.a = igcr0.a(ighl0.a);
                    ighj0.b = 0;
                    ighj0.c = s;
                    ighj0.d = locale0;
                    return v4;
                }
                --v4;
            }
        }
        return ~v;
    }

    @Override  // ighr
    public final void d(Appendable appendable0, igdm igdm0, Locale locale0) {
        String s;
        try {
            igcr igcr0 = this.b;
            if(igdm0.k(igcr0)) {
                igcp igcp0 = igcr0.a(igdm0.h());
                s = this.c ? igcp0.q(igdm0, locale0) : igcp0.t(igdm0, locale0);
            }
            else {
                s = "\uFFFD";
            }
            appendable0.append(s);
        }
        catch(RuntimeException unused_ex) {
            appendable0.append('\uFFFD');
        }
    }

    @Override  // ighr
    public final void e(Appendable appendable0, long v, igcm igcm0, int v1, igcw igcw0, Locale locale0) {
        try {
            igcp igcp0 = this.b.a(igcm0);
            appendable0.append((this.c ? igcp0.p(v, locale0) : igcp0.s(v, locale0)));
        }
        catch(RuntimeException unused_ex) {
            appendable0.append('\uFFFD');
        }
    }
}

