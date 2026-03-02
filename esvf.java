import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class esvf extends esvj {
    public final List a;

    public esvf(int v) {
        super(v);
        this.a = new ArrayList();
        if(esvf.q(v)) {
            return;
        }
        throw new esvm(v);
    }

    @Override  // esvj
    protected final int a(byte[] arr_b, int v) {
        for(Object object0: this.a) {
            v = ((esvj)object0).i(arr_b, v);
        }
        return v;
    }

    @Override  // esvj
    public final int b() {
        int v = 0;
        for(Object object0: this.a) {
            v += ((esvj)object0).j();
        }
        return v;
    }

    public static esvf c(int v, int v1, byte[] arr_b, int v2) {
        esvf esvf0 = new esvf(v);
        int v3;
        for(v3 = v2; true; v3 += esvj0.j()) {
            int v4 = v2 + v1;
            if(v3 >= v4) {
                break;
            }
            esvj esvj0 = esvj.n(arr_b, v3);
            esvf0.h(esvj0);
        }
        if(v3 == v4) {
            return esvf0;
        }
        throw new esvl(v1, v3 - v2);
    }

    public final esvj d(int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            this = (esvj)gggq.k(this.l().f(), new esve(v1));
        }
        return this;
    }

    public final gfsx e(int[] arr_v) {
        gfsx gfsx0 = gfsx.m(this);
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            gfsx0 = gggq.c(((esvj)gfsx0.d()).l().f(), new esvd(v1));
            if(!gfsx0.i()) {
                return gfsx0;
            }
        }
        return gfsx0;
    }

    public final List f() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    public final void g(List list0) {
        this.a.addAll(list0);
    }

    public final void h(esvj esvj0) {
        this.a.add(esvj0);
    }

    @Override
    public final String toString() {
        gfss gfss0 = new gfss(",");
        String s = this.o();
        String s1 = Integer.toHexString(this.b());
        String s2 = new gfss(",").b(this.a);
        Locale locale0 = Locale.US;
        return "(" + gfss0.f(new String[]{s, s1, "[" + s2 + "]"}).toUpperCase(locale0) + ")";
    }
}

