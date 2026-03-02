import java.util.ArrayList;

public final class ighi {
    private final ArrayList a;
    private Object b;

    public ighi() {
        this.a = new ArrayList();
    }

    public final void A(int v) {
        this.n(igcr.t, v, 2);
    }

    public final void B(int v) {
        this.n(igcr.h, v, 2);
    }

    public final void C(int v) {
        this.n(igcr.v, v, 2);
    }

    public final void D(int v) {
        this.n(igcr.l, v, 2);
    }

    public final void E(int v, int v1) {
        this.t(igcr.k, v, v1);
    }

    public final void F(int v, int v1) {
        this.t(igcr.f, v, v1);
    }

    private final Object G() {
        Object object0 = this.b;
        if(object0 == null) {
            ArrayList arrayList0 = this.a;
            if(arrayList0.size() == 2) {
                Object object1 = arrayList0.get(0);
                Object object2 = arrayList0.get(1);
                if(object1 == null) {
                    object0 = object2;
                }
                else if(object1 == object2 || object2 == null) {
                    object0 = object1;
                }
            }
            if(object0 == null) {
                object0 = new iggv(arrayList0);
            }
            this.b = object0;
        }
        return object0;
    }

    private static final void H(ighq ighq0) {
        if(ighq0 != null) {
            return;
        }
        throw new IllegalArgumentException("No parser supplied");
    }

    private static final boolean I(Object object0) {
        if((object0 instanceof ighp)) {
            return (object0 instanceof iggv) ? ((iggv)object0).b != null : true;
        }
        return false;
    }

    public final iggt a() {
        Object object0 = this.G();
        ighp ighp0 = null;
        ighr ighr0 = !(object0 instanceof ighr) || (object0 instanceof iggv) && ((iggv)object0).a == null ? null : ((ighr)object0);
        if(ighi.I(object0)) {
            ighp0 = (ighp)object0;
        }
        if(ighr0 == null && ighp0 == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new iggt(ighr0, ighp0);
    }

    static void b(Appendable appendable0, int v) {
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            appendable0.append('\uFFFD');
        }
    }

    static boolean c(CharSequence charSequence0, int v, String s) {
        int v1 = s.length();
        if(charSequence0.length() - v >= v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                if(charSequence0.charAt(v + v2) != s.charAt(v2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    static boolean d(CharSequence charSequence0, int v, String s) {
        int v1 = s.length();
        if(charSequence0.length() - v >= v1) {
            for(int v2 = 0; v2 < v1; ++v2) {
                int v3 = charSequence0.charAt(v + v2);
                int v4 = s.charAt(v2);
                if(v3 != v4) {
                    int v5 = Character.toUpperCase(((char)v3));
                    int v6 = Character.toUpperCase(((char)v4));
                    if(v5 != v6 && Character.toLowerCase(((char)v5)) != Character.toLowerCase(((char)v6))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final ighq e() {
        Object object0 = this.G();
        if(ighi.I(object0)) {
            return ighq.b(((ighp)object0));
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object object0) {
        this.b = null;
        this.a.add(object0);
        this.a.add(object0);
    }

    public final void g(ighr ighr0, ighp ighp0) {
        this.b = null;
        this.a.add(ighr0);
        this.a.add(ighp0);
    }

    public final void h(igcr igcr0) {
        this.f(new ighc(igcr0, true));
    }

    public final void i(igcr igcr0) {
        this.f(new ighc(igcr0, false));
    }

    public final void j(boolean z) {
        this.f(new ighf(null, "Z", z, 2));
    }

    public final void k(iggt iggt0) {
        if(iggt0 == null) {
            throw new IllegalArgumentException("No formatter supplied");
        }
        this.g(iggt0.a, iggt0.b);
    }

    public final void l(ighq ighq0) {
        ighi.H(ighq0);
        this.g(null, ighm.b(ighq0));
    }

    public final void m(ighq[] arr_ighq) {
        ighp[] arr_ighp = new ighp[arr_ighq.length];
        int v = 0;
        while(v < arr_ighq.length - 1) {
            ighp ighp0 = ighm.b(arr_ighq[v]);
            arr_ighp[v] = ighp0;
            if(ighp0 == null) {
                throw new IllegalArgumentException("Incomplete parser array");
            }
            ++v;
            continue;
        }
        arr_ighp[v] = ighm.b(arr_ighq[v]);
        this.g(null, new iggy(arr_ighp));
    }

    public final void n(igcr igcr0, int v, int v1) {
        if(v >= 0) {
            if(v1 < v) {
                v1 = v;
            }
            if(v1 > 0) {
                if(v <= 1) {
                    this.f(new ighh(igcr0, v1, false));
                    return;
                }
                this.f(new igha(igcr0, v1, false, v));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(igcr igcr0, int v) {
        this.f(new iggw(igcr0, v));
    }

    public final void p(igcr igcr0, int v, int v1) {
        if(v >= 0) {
            if(v1 < v) {
                v1 = v;
            }
            if(v1 > 0) {
                this.f(new iggx(igcr0, v, v1));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        this.f(new iggu(c));
    }

    public final void r(String s) {
        switch(s.length()) {
            case 0: {
                break;
            }
            case 1: {
                this.f(new iggu(s.charAt(0)));
                break;
            }
            default: {
                this.f(new ighb(s));
            }
        }
    }

    public final void s(ighq ighq0) {
        ighi.H(ighq0);
        this.g(null, new iggy(new ighp[]{ighm.b(ighq0), null}));
    }

    public final void t(igcr igcr0, int v, int v1) {
        if(v >= 0) {
            if(v1 < v) {
                v1 = v;
            }
            if(v1 > 0) {
                if(v <= 1) {
                    this.f(new ighh(igcr0, v1, true));
                    return;
                }
                this.f(new igha(igcr0, v1, true, v));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String s, boolean z, int v) {
        this.f(new ighf(s, s, z, v));
    }

    public final void v(int v) {
        this.n(igcr.i, v, 2);
    }

    public final void w(int v) {
        this.n(igcr.m, v, 1);
    }

    public final void x(int v) {
        this.n(igcr.g, v, 3);
    }

    public final void y(int v, int v1) {
        this.p(igcr.u, v, v1);
    }

    public final void z(int v) {
        this.n(igcr.r, v, 2);
    }
}

