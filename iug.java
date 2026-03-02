import java.util.ArrayList;
import java.util.List;

public final class iug {
    public final ify a;
    public final ity b;
    public boolean c;
    public final int d;
    private final hfb e;
    private final boolean f;
    private iug g;

    public iug(hfb hfb0, boolean z, ify ify0, ity ity0) {
        this.e = hfb0;
        this.f = z;
        this.a = ify0;
        this.b = ity0;
        this.d = ify0.c;
    }

    public final long a() {
        ihy ihy0 = this.d();
        if(ihy0 != null) {
            if(!ihy0.t()) {
                ihy0 = null;
            }
            return ihy0 == null ? 0L : hzl.a(ihy0);
        }
        return 0L;
    }

    public final hka b() {
        ihy ihy0 = this.d();
        if(ihy0 != null) {
            if(!ihy0.t()) {
                ihy0 = null;
            }
            return ihy0 == null ? hka.a : hzl.e(ihy0);
        }
        return hka.a;
    }

    public final hka c() {
        ihy ihy0 = this.d();
        if(ihy0 != null) {
            if(!ihy0.t()) {
                ihy0 = null;
            }
            return ihy0 == null ? hka.a : hzl.h(ihy0);
        }
        return hka.a;
    }

    public final ihy d() {
        if(this.c) {
            iug iug0 = this.g();
            return iug0 == null ? null : iug0.d();
        }
        ify ify0 = this.a;
        ije ije0 = ify0.t();
        if(ije0 != null) {
            ihy ihy0 = ien.e(ije0, 8);
            return ihy0 == null ? ify0.r() : ihy0;
        }
        return ify0.r();
    }

    public final ity e() {
        if(this.q()) {
            ity ity0 = this.b.b();
            this.p(new ArrayList(), ity0);
            return ity0;
        }
        return this.b;
    }

    public final iug f() {
        return new iug(this.e, true, this.a, this.b);
    }

    public final iug g() {
        ify ify0;
        iug iug0 = this.g;
        if(iug0 != null) {
            return iug0;
        }
        boolean z = this.f;
        if(z) {
            ify0 = this.a.n();
            while(ify0 != null) {
                ity ity0 = ify0.u();
                if(ity0 != null && ity0.a) {
                    goto label_12;
                }
                ify0 = ify0.n();
            }
        }
        ify0 = null;
    label_12:
        if(ify0 == null) {
            for(ify0 = this.a.n(); true; ify0 = ify0.n()) {
                if(ify0 == null) {
                    ify0 = null;
                    break;
                }
                if(ify0.u.j(8)) {
                    break;
                }
            }
        }
        return ify0 == null ? null : iuh.a(ify0, z);
    }

    public final List h() {
        return iug.l(this, false, 7);
    }

    public final List i() {
        return iug.l(this, true, 4);
    }

    public final boolean j() {
        if(!this.c && this.i().isEmpty()) {
            ify ify0;
            for(ify0 = this.a.n(); true; ify0 = ify0.n()) {
                if(ify0 == null) {
                    ify0 = null;
                    break;
                }
                ity ity0 = ify0.u();
                if(ity0 != null && ity0.a) {
                    break;
                }
            }
            return ify0 == null;
        }
        return false;
    }

    public final List k(boolean z, boolean z1) {
        if(!z && this.b.b) {
            return ibps.a;
        }
        ArrayList arrayList0 = new ArrayList();
        if(this.q()) {
            List list0 = new ArrayList();
            this.s(arrayList0, list0);
            return list0;
        }
        return this.m(arrayList0, z1);
    }

    public static List l(iug iug0, boolean z, int v) {
        int v1 = 0;
        int v2 = (v & 1) == 0 ? 0 : iug0.f ^ 1;
        if((v & 2) == 0) {
            v1 = 1;
        }
        return iug0.k(((boolean)v2), ((boolean)(((int)z) & v1)));
    }

    public final List m(List list0, boolean z) {
        if(this.c) {
            return ibps.a;
        }
        this.r(this.a, list0);
        if(z) {
            ity ity0 = this.b;
            its its0 = (its)itz.a(ity0, iuz.x);
            if(its0 != null && ity0.a && !list0.isEmpty()) {
                list0.add(this.o(its0, new iud(its0)));
            }
            ivi ivi0 = iuz.a;
            if(ity0.f(ivi0) && !list0.isEmpty() && ity0.a) {
                List list1 = (List)itz.a(ity0, ivi0);
                String s = list1 == null ? null : ((String)ibpo.T(list1));
                if(s != null) {
                    list0.add(0, this.o(null, new iue(s)));
                }
            }
        }
        return list0;
    }

    public static void n(iug iug0, List list0) {
        iug0.m(list0, false);
    }

    private final iug o(its its0, ibts ibts0) {
        int v1;
        int v;
        ity ity0 = new ity();
        ity0.a = false;
        ity0.b = false;
        ibts0.a(ity0);
        iuf iuf0 = new iuf(ibts0);
        if(its0 == null) {
            v = this.d;
            v1 = 2000000000;
        }
        else {
            v = this.d;
            v1 = 1000000000;
        }
        iug iug0 = new iug(iuf0, false, new ify(true, v + v1), ity0);
        iug0.c = true;
        iug0.g = this;
        return iug0;
    }

    private final void p(List list0, ity ity0) {
        if(!this.b.b) {
            int v = list0.size();
            iug.n(this, list0);
            int v1 = list0.size();
            while(v < v1) {
                iug iug0 = (iug)list0.get(v);
                if(!iug0.q()) {
                    ity0.e(iug0.b);
                    iug0.p(list0, ity0);
                }
                ++v;
            }
        }
    }

    private final boolean q() {
        return this.f && this.b.a;
    }

    private final void r(ify ify0, List list0) {
        gwq gwq0 = ify0.j();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(ify1.am() && !ify1.C) {
                if(ify1.u.j(8)) {
                    list0.add(iuh.a(ify1, this.f));
                }
                else {
                    this.r(ify1, list0);
                }
            }
        }
    }

    private final void s(List list0, List list1) {
        int v = list0.size();
        iug.n(this, list0);
        int v1 = list0.size();
        while(v < v1) {
            iug iug0 = (iug)list0.get(v);
            if(iug0.q()) {
                list1.add(iug0);
            }
            else if(!iug0.b.b) {
                iug0.s(list0, list1);
            }
            ++v;
        }
    }
}

