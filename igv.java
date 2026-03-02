public final class igv {
    public final ify a;
    public final iet b;
    public boolean c;
    public boolean d;
    public final iii e;
    public final gwq f;
    public final gwq g;
    public jkp h;
    public final igf i;

    public igv(ify ify0) {
        this.a = ify0;
        this.b = new iet();
        this.e = new iii();
        this.f = new gwq(new iin[16]);
        this.g = new gwq(new igu[16]);
        this.i = null;
    }

    public final void a() {
        gwq gwq0 = this.f;
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ((iin)arr_object[v1]).a();
        }
        gwq0.g();
    }

    public final void b(boolean z) {
        if(z) {
            iii iii0 = this.e;
            ify ify0 = this.a;
            if(ify0.B > 0) {
                iii0.a.g();
                iii0.a.n(ify0);
                ify0.A = true;
            }
        }
        iii iii1 = this.e;
        if(iii1.c()) {
            gwq gwq0 = iii1.a;
            gwq0.j(iih.a);
            int v = gwq0.b;
            ify[] arr_ify = iii1.b != null && iii1.b.length >= v ? iii1.b : new ify[Math.max(16, v)];
            iii1.b = null;
            for(int v1 = 0; v1 < v; ++v1) {
                arr_ify[v1] = (ify)gwq0.a[v1];
            }
            gwq0.g();
            while(true) {
                --v;
                if(v < 0) {
                    break;
                }
                ify ify1 = arr_ify[v];
                ibuq.c(ify1);
                if(ify1.A) {
                    iii1.a(ify1);
                }
                arr_ify[v] = null;
            }
            iii1.b = arr_ify;
        }
    }

    public final void c() {
        gwq gwq0 = this.g;
        int v = gwq0.b;
        if(v != 0) {
            Object[] arr_object = gwq0.a;
            for(int v1 = 0; v1 < v; ++v1) {
                igu igu0 = (igu)arr_object[v1];
                ify ify0 = igu0.a;
                if(ify0.am()) {
                    if(igu0.b) {
                        ify.av(ify0, igu0.c, 2);
                    }
                    else {
                        ify.ax(ify0, igu0.c, 2);
                    }
                }
            }
            gwq0.g();
        }
    }

    public final void d(ify ify0) {
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(ibuq.m(ify1.v(), Boolean.valueOf(true)) && !ify1.C) {
                if(this.b.b(ify1)) {
                    ify1.O();
                }
                this.d(ify1);
            }
        }
    }

    public final void e(ify ify0, boolean z) {
        if(!this.c) {
            hxt.d("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if(igv.t(ify0, z)) {
            hxt.c("node not yet measured");
        }
        this.p(ify0, z);
    }

    public final void f(ify ify0) {
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        for(int v1 = 0; v1 < v; ++v1) {
            ify ify1 = (ify)arr_object[v1];
            if(igv.s(ify1)) {
                if(ige.a(ify1)) {
                    this.g(ify1, true);
                }
                else {
                    this.f(ify1);
                }
            }
        }
    }

    public final void g(ify ify0, boolean z) {
        jkp jkp0;
        if(ify0.C) {
            return;
        }
        if(ify0 == this.a) {
            jkp0 = this.h;
            ibuq.c(jkp0);
        }
        else {
            jkp0 = null;
        }
        if(z) {
            igv.l(ify0, jkp0);
            return;
        }
        igv.m(ify0, jkp0);
    }

    public final boolean h() {
        return this.b.a();
    }

    // This method was un-flattened
    public final boolean i(ibth ibth0) {
        boolean z2;
        ify ify1;
        boolean z1;
        ify ify0 = this.a;
        if(!ify0.am()) {
            hxt.c("performMeasureAndLayout called with unattached root");
        }
        if(!ify0.an()) {
            hxt.c("performMeasureAndLayout called with unplaced root");
        }
        if(this.c) {
            hxt.c("performMeasureAndLayout called during measure layout");
        }
        boolean z = false;
        if(this.h != null) {
            try {
                this.c = true;
                this.d = true;
                iet iet0 = this.b;
                if(iet0.a()) {
                    z1 = false;
                    while(true) {
                        ieq ieq0 = iet0.a;
                        if(ieq0.d()) {
                            ieq ieq1 = iet0.b;
                            if(ieq1.d()) {
                                ieq ieq2 = iet0.c;
                                if(ieq2.d()) {
                                    break;
                                }
                                ify1 = ieq2.a();
                                z2 = this.r(ify1, false, true);
                            }
                            else {
                                ify1 = ieq1.a();
                                z2 = this.r(ify1, ify1.i != null, true);
                            }
                        }
                        else {
                            ify1 = ieq0.a();
                            z2 = this.r(ify1, ify1.i != null, false);
                            if(ify1.aj()) {
                                iet0.d(ify1, 2);
                            }
                            if(ify1.ai()) {
                                iet0.d(ify1, 4);
                            }
                        }
                        if(ify1 == ify0 && z2) {
                            z1 = true;
                        }
                    }
                    if(ibth0 != null) {
                        ibth0.a();
                    }
                }
                else {
                    z1 = false;
                }
            }
            finally {
                this.c = false;
                this.d = false;
            }
            z = z1;
        }
        this.a();
        return z;
    }

    public final boolean j(ify ify0, boolean z) {
        int v = ify0.aC();
        if(v == 0) {
            throw null;
        }
        switch(v - 1) {
            case 0: 
            case 1: {
                break;
            }
            case 2: 
            case 3: {
                igu igu0 = new igu(ify0, false, z);
                this.g.n(igu0);
                return false;
            }
            case 4: {
                if(!ify0.al() || z) {
                    ify0.R();
                    if(!ify0.C && (ify0.an() || igv.o(ify0))) {
                        ify ify1 = ify0.n();
                        if(ify1 == null || !ify1.al()) {
                            this.b.d(ify0, 3);
                        }
                        return !this.d;
                    }
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        return false;
    }

    public static void k(igv igv0) {
        igv0.b(false);
    }

    public static final boolean l(ify ify0, jkp jkp0) {
        if(ify0.i == null) {
            return false;
        }
        boolean z = jkp0 == null ? ify0.ap(ify0.v.c()) : ify0.ap(jkp0);
        ify ify1 = ify0.n();
        if(z && ify1 != null) {
            if(ify1.i == null) {
                ify.ax(ify1, false, 3);
                return z;
            }
            switch(ify0.aE()) {
                case 1: {
                    ify.av(ify1, false, 3);
                    return z;
                }
                case 2: {
                    ify.au(ify1);
                    return true;
                }
                default: {
                    return z;
                }
            }
        }
        return z;
    }

    public static final boolean m(ify ify0, jkp jkp0) {
        boolean z = jkp0 == null ? ify.at(ify0) : ify0.aq(jkp0);
        ify ify1 = ify0.n();
        if(z && ify1 != null) {
            switch(ify0.aD()) {
                case 1: {
                    ify.ax(ify1, false, 3);
                    return z;
                }
                case 2: {
                    ify.aw(ify1);
                    return true;
                }
                default: {
                    return z;
                }
            }
        }
        return z;
    }

    public static final boolean n(ify ify0) {
        if(ify0.ak()) {
            if(ify0.aE() == 3) {
                igt igt0 = ify0.v.p;
                if(igt0 != null) {
                    return igt0.p == null ? false : igt0.p.j();
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean o(ify ify0) {
        if(ify0.al()) {
            while(true) {
                if(ify0.aD() == 3 && !ify0.v.o.w.j()) {
                    ify ify1 = ify0.n();
                    if(ify1 != null && ify1.aC() == 1) {
                        goto label_4;
                    }
                    break;
                }
            label_4:
                ify0 = ify0.n();
                if(ify0 == null) {
                    break;
                }
                if(ify0.an()) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void p(ify ify0, boolean z) {
        gwq gwq0 = ify0.k();
        Object[] arr_object = gwq0.a;
        int v = gwq0.b;
        int v1 = 0;
        while(v1 < v) {
            ify ify1 = (ify)arr_object[v1];
            if(!z && igv.s(ify1)) {
            label_11:
                if(ige.a(ify1) && !z) {
                    if(ify1.ak() && this.b.b(ify1)) {
                        this.r(ify1, true, false);
                    }
                    else {
                        this.e(ify1, true);
                    }
                }
                this.q(ify1, z);
                if(!igv.t(ify1, z)) {
                    this.p(ify1, z);
                }
            }
            else if(z) {
                if(ify1.aE() == 1) {
                    goto label_11;
                }
                else {
                    igt igt0 = ify1.v.p;
                    if(igt0 != null && (igt0.p != null && igt0.p.j())) {
                        goto label_11;
                    }
                }
            }
            ++v1;
        }
        this.q(ify0, z);
    }

    private final void q(ify ify0, boolean z) {
        if(igv.t(ify0, z)) {
            this.r(ify0, z, false);
        }
    }

    private final boolean r(ify ify0, boolean z, boolean z1) {
        ibp ibp0;
        jkp jkp0;
        boolean z2 = false;
        if(ify0.C) {
            return false;
        }
        if(!ify0.an() && !ify0.ao() && !igv.o(ify0) && !ibuq.m(ify0.v(), Boolean.valueOf(true)) && !igv.n(ify0) && (!ify0.v.o.w.j() && (ify0.v.p == null || (ify0.v.p.p == null || !ify0.v.p.p.j())))) {
            return false;
        }
        ify ify1 = this.a;
        if(ify0 == ify1) {
            jkp0 = this.h;
            ibuq.c(jkp0);
        }
        else {
            jkp0 = null;
        }
        if(z) {
            if(ify0.ak()) {
                z2 = igv.l(ify0, jkp0);
            }
            if(z1 && (z2 || ify0.aj()) && ibuq.m(ify0.v(), Boolean.valueOf(true))) {
                ify0.O();
            }
        }
        else {
            boolean z3 = ify0.al() ? igv.m(ify0, jkp0) : false;
            if(z1 && ify0.ai()) {
                if(ify0 == ify1) {
                label_22:
                    if(ify0 == ify1) {
                        if(ify0.D == 3) {
                            ify0.D();
                        }
                        ify ify3 = ify0.n();
                        if(ify3 == null) {
                            ibp0 = new ibl(igc.a(ify0));
                        }
                        else {
                            ibp0 = ify3.r().m;
                            if(ibp0 == null) {
                                ibp0 = new ibl(igc.a(ify0));
                            }
                        }
                        ibp.A(ibp0, ify0.q(), 0, 0);
                    }
                    else {
                        ify0.W();
                    }
                    this.e.b(ify0);
                    ((ili)igc.a(ify0)).l.c(ify0);
                }
                else {
                    ify ify2 = ify0.n();
                    if(ify2 != null && ify2.an() && ify0.ao()) {
                        goto label_22;
                    }
                }
            }
            z2 = z3;
        }
        this.c();
        return z2;
    }

    private static final boolean s(ify ify0) {
        return ify0.aD() == 1 || ify0.v.o.w.j();
    }

    private static final boolean t(ify ify0, boolean z) {
        return z ? ify0.ak() : ify0.al();
    }
}

