import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class fvri extends fvqd {
    private long A;
    private fvsl B;
    private boolean C;
    private boolean D;
    private int E;
    final fvlt k;
    long l;
    fvrb m;
    long n;
    fvnb o;
    public boolean p;
    public int q;
    private final fvqn r;
    private final fvrf s;
    private final fwxs t;
    private final fvre u;
    private final fvqb v;
    private long w;
    private boolean x;
    private boolean y;
    private long z;

    public fvri(fwze fwze0, fwyd fwyd0, fwzp fwzp0, fvrj fvrj0, fxzs fxzs0, fvqa fvqa0, fvqn fvqn0, fvrf fvrf0, fwxs fwxs0, fvre fvre0) {
        super("SCollector", fwze0, fwyd0, fwzp0, fvrj0, fxzs0, fvqa0, 2);
        this.k = new fvrh(this);
        this.l = -1L;
        this.w = -1L;
        this.m = null;
        this.x = false;
        this.y = false;
        this.n = -1L;
        this.o = null;
        this.p = false;
        this.q = 2;
        this.z = -1L;
        this.A = -1L;
        this.C = false;
        this.D = false;
        this.r = fvqn0;
        this.s = fvrf0;
        this.t = fwxs0;
        this.u = fvre0;
        this.v = new fvqb(fwyd0, 2L);
    }

    @Override  // fvqd
    public final boolean A() {
        if(this.o == null) {
            this.j = 2;
            return true;
        }
        if(!this.D) {
            fvrf fvrf0 = this.s;
            int v = fvrf0.i;
            if(v != 1) {
                this.p = true;
                switch(v) {
                    case 0: {
                        throw null;
                    }
                    case 22: {
                        this.q = 30;
                        break;
                    }
                    case 23: {
                        this.q = 0x1F;
                        break;
                    }
                    default: {
                        this.q = 2;
                    }
                }
                if(!fvrf0.f() || !this.u()) {
                    goto label_20;
                }
                fvnb fvnb0 = this.o;
                if(fvnb0 != null) {
                    fvnb0.c();
                    return false;
                label_20:
                    this.q = 0x20;
                    fvnb fvnb1 = this.o;
                    if(fvnb1 != null) {
                        fvnb1.a();
                    }
                    this.K(false);
                    this.j = 2;
                    return true;
                }
            }
        }
        return false;
    }

    final boolean E() {
        return this.s.h;
    }

    public final int F(boolean z) {
        boolean z4;
        int v3;
        boolean z3;
        if(z) {
            return 1;
        }
        fwze fwze0 = this.b;
        int v = this.s.i;
        boolean z1 = fwze0.k().mU();
        boolean z2 = this.f.c.c.h(300000L, this.f.d.b(), true);
        int v1 = 0;
        if(v != 1) {
            z3 = false;
        }
        else if(this.x && z1 && z2) {
            z3 = true;
            v = 1;
        }
        else {
            v = 1;
            z3 = false;
        }
        if(z3) {
            File file0 = fwze0.mK().f();
            if(file0 == null) {
                v3 = 0;
            }
            else {
                File[] arr_file = file0.listFiles();
                if(arr_file == null) {
                    v3 = 0;
                }
                else {
                    v3 = 0;
                    for(int v2 = 0; v2 < arr_file.length; ++v2) {
                        if(arr_file[v2].isDirectory()) {
                            ++v3;
                        }
                    }
                }
            }
            z4 = v3 >= 3;
            v1 = v3 < 3 ? 1 : 0;
        }
        else {
            z4 = false;
        }
        if(v1 == 0) {
            if(v != 1) {
                return v;
            }
            if(!z1) {
                return 24;
            }
            if(!z2) {
                return 25;
            }
            return z4 ? 27 : 99;
        }
        return 1;
    }

    static void G(fvri fvri0, long v, long v1, long v2, int v3, int v4) {
        fvri0.Q(v, v1, v2, v3, true, v4);
    }

    private final Calendar H() {
        fwyd fwyd0 = this.c;
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(fwyd0.c());
        return calendar0;
    }

    private final void I(boolean z) {
        if(z != this.y) {
            fwxs fwxs0 = this.t;
            if(z) {
                fwxs0.g(180000L, true);
            }
            else {
                fwxs0.r(180000L);
            }
            this.y = z;
        }
    }

    private final void J() {
        if(this.l != -1L) {
            this.l = -1L;
            this.d.b(fwzf.g);
        }
    }

    private final void K(boolean z) {
        this.o = null;
        this.p = false;
        this.q = 2;
        this.n = -1L;
        this.D = false;
        this.E = 0;
        this.B = null;
        if(z) {
            this.N();
            this.i.a();
        }
    }

    private final void L(Calendar calendar0) {
        boolean z1;
        boolean z = this.v.c();
        int v = this.F(z);
        if(!huvd.r()) {
            z1 = this.u.c(calendar0, z, 0).a;
        }
        else if(!this.u.c(calendar0, z, 14).a && !this.u.c(calendar0, z, 22).a) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        if(v == 1 && z1 && this.j == 2) {
            this.I(true);
            this.M(this.u.b(calendar0));
            return;
        }
        this.I(false);
        if(this.E()) {
            if(z1) {
                this.M(this.u.b(calendar0));
                return;
            }
            this.M(this.u.a(calendar0, true));
        }
    }

    private final void M(long v) {
        if(Long.compare(this.l, -1L) != 0 && Math.abs(v - this.l) <= 1000L) {
            return;
        }
        this.l = v;
        this.d.c(fwzf.g, 3, v, fwzy.a);
    }

    private final void N() {
        this.l = -1L;
        this.L(this.H());
    }

    private final fvnb O(int v, Map map0, File file0, gwth gwth0) {
        fwze fwze0 = this.b;
        fwzo fwzo0 = fwze0.r();
        Set set0 = fvns.a(new fvns[]{fvns.g, fvns.a, fvns.e, fvns.d, fvns.h});
        huvd huvd0 = huvd.a;
        if(huvd0.f().aa()) {
            set0.add(fvns.t);
        }
        set0.add(fvns.b);
        fwzm fwzm0 = fwze0.q();
        fvns fvns0 = fvns.j;
        if(fwzm0.c(fvns0)) {
            set0.add(fvns0);
        }
        else {
            fvns fvns1 = fvns.f;
            if(fwzm0.c(fvns1)) {
                set0.add(fvns1);
            }
        }
        fvns fvns2 = fvns.i;
        if(fwzm0.c(fvns2)) {
            set0.add(fvns2);
        }
        if(huvd0.f().V()) {
            set0.add(fvns.q);
        }
        set0.add(fvns.v);
        String s = file0.getPath();
        String s1 = this.a;
        return fwzo0.mW(set0, map0, s, v, huwo.e(), this.k, s1, gwth0);
    }

    private final void P(long v, fvrc fvrc0, int v1) {
        fvri fvri0;
        fvsl fvsl1;
        fvsl fvsl0 = fvrc0.c;
        if(fvsl0 == null) {
            fvsl1 = null;
        }
        else {
            Iterator iterator0 = this.u.a.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    throw new IllegalArgumentException("Did not find parent of subtimespan: " + fvsl0.toString());
                }
                Object object0 = iterator0.next();
                fvsl fvsl2 = (fvsl)object0;
                if(fvsl2.h(fvsl0.b)) {
                    fvsl1 = fvsl2;
                    break;
                }
            }
        }
        if(this.B != null && !this.B.equals(fvsl1)) {
            int v2 = this.E;
            if(v2 == 0) {
                fvri0 = this;
            }
            else {
                fvri0 = this;
                fvri0.Q(v, -1L, v, v2, false, v1);
            }
        }
        else {
            fvri0 = this;
        }
        fvri0.B = fvsl1;
    }

    private final void Q(long v, long v1, long v2, int v3, boolean z, int v4) {
        long v5 = this.c.a();
        long v6 = v + v5;
        long v7 = v2 + v5;
        if(huvd.r()) {
            this.r.v(v6, v7, v3, v4, this.m);
        }
        else {
            this.r.v(v6, v7, v3, 0, this.m);
        }
        this.r.p();
        new Date(v6);
        new Date(v7);
        if(v1 != -1L) {
            long v8 = v2 - v1;
            if(v8 > 0L) {
                fvrl fvrl0 = this.f.c;
                long v9 = this.f.d.b();
                fvrl0.c.j(v8, v9);
                fvrl0.b(v9);
            }
        }
        this.K(z);
    }

    private final boolean R(long v, boolean z, int v1) {
        fvqn fvqn0 = this.r;
        fvqn0.t();
        fvqn0.s();
        fvqn0.p();
        EnumMap enumMap0 = new EnumMap(fvns.class);
        Integer integer0 = fvqn0.b();
        enumMap0.put(fvns.e, integer0);
        Integer integer1 = fvqn0.a();
        enumMap0.put(fvns.d, integer1);
        fwze fwze0 = this.b;
        fwzm fwzm0 = fwze0.q();
        fvns fvns0 = fvns.j;
        Integer integer2 = (int)1;
        if(fwzm0.c(fvns0)) {
            enumMap0.put(fvns0, integer2);
        }
        else {
            fvns fvns1 = fvns.f;
            if(fwzm0.c(fvns1)) {
                enumMap0.put(fvns1, integer2);
            }
        }
        fvns fvns2 = fvns.i;
        if(fwzm0.c(fvns2)) {
            enumMap0.put(fvns2, Integer.valueOf(3));
        }
        File file0 = fwze0.mK().f();
        fvnb fvnb0 = null;
        if(huvd.r()) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwth.a).v_newBuilder();
            boolean z2 = huvd.p();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwth gwth2 = (gwth)hftp1.b_message;
            gwth2.b |= 1;
            gwth2.c = z2;
            boolean z3 = huvd.r();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gwth gwth3 = (gwth)hftp1.b_message;
            gwth3.b |= 2;
            gwth3.d = z3;
            gwth gwth4 = (gwth)hftp1.N_build();
            if(file0 == null) {
                this.o = null;
            }
            else {
                fvlt fvlt0 = this.k;
                if((fvlt0 instanceof fvrh)) {
                    ((fvrh)fvlt0).b = v1;
                }
                this.o = this.O(v1, enumMap0, file0, gwth4);
            }
        }
        else {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwth.a).v_newBuilder();
            boolean z1 = huvd.p();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gwth gwth0 = (gwth)hftp0.b_message;
            gwth0.b |= 1;
            gwth0.c = z1;
            gwth gwth1 = (gwth)hftp0.N_build();
            if(file0 != null) {
                fvnb0 = this.O(v1, enumMap0, file0, gwth1);
            }
            this.o = fvnb0;
        }
        fvnb fvnb1 = this.o;
        if(fvnb1 != null) {
            this.n = v;
            this.p = false;
            this.q = 2;
            this.D = z;
            fvnb1.b();
            fvqk.a(fwze0.mH(), true);
            fvqn0.v(this.c.c(), 0x7FFFFFFFFFFFFFFFL, 2, v1, this.m);
            fvqn0.p();
        }
        return this.o != null;
    }

    private static final int S(boolean z, boolean z1, boolean z2) {
        if(z) {
            return 20;
        }
        if(z1) {
            return 14;
        }
        return z2 ? 22 : 23;
    }

    @Override  // fvqd
    public final int a() {
        return 6;
    }

    @Override  // fvqd
    public final void b(fwzf fwzf0) {
        if(fwzf0 == fwzf.g) {
            this.N();
        }
    }

    @Override  // fvqd
    public final void d(fvtm fvtm0) {
        this.C = true;
    }

    @Override  // fvqd
    public final void g(fuxg fuxg0) {
        if(fuxg0.b().a == fuxh.c) {
            this.z = this.c.b();
            return;
        }
        if(fuxg0.b().a == fuxh.a) {
            this.A = this.c.b();
        }
    }

    @Override  // fvqd
    public final void i(long v) {
        this.v.b(v);
    }

    @Override  // fvqd
    public final void j(boolean z) {
        this.s.b();
    }

    @Override  // fvqd
    public final void k() {
        this.s.h();
        this.L(this.H());
    }

    @Override  // fvqd
    public final void q(boolean z) {
        this.x = z;
    }

    @Override  // fvqd
    public final boolean s(long v) {
        fvqb fvqb0 = this.v;
        boolean z = fvqb0.c();
        if(!z && (this.C || !this.E())) {
            this.C = false;
            return false;
        }
        Calendar calendar0 = this.H();
        if(this.l == -1L) {
            this.L(calendar0);
        }
        if(this.w == -1L) {
            this.w = v;
        }
        if(huvd.a.f().B() && v - this.w < 30000L) {
            return false;
        }
        if(huvd.r()) {
            int v2 = fvri.S(z, this.z != -1L && v - this.z < 30000L, huvd.p() && fvse.a(huvd.b()) && (this.A != -1L && v - this.A < 30000L));
            if(v2 == 23) {
                int v3 = this.F(z);
                if(v3 != 1) {
                    this.E = v3;
                    return this.j != 2;
                }
                this.E = 21;
                return this.j != 2;
            }
            fvrc fvrc1 = this.u.c(calendar0, z, v2);
            this.P(v, fvrc1, v2);
            if(fvrc1.a) {
                this.m = fvrc1.b;
                int v4 = this.F(z);
                if(v4 == 1) {
                    if(v2 != 14 && v2 != 20 && v2 != 22) {
                        this.E = 21;
                        return this.j != 2;
                    }
                    fvqb0.a();
                    this.J();
                    this.j = 8;
                    this.I(false);
                    if(!this.R(v, z, v2)) {
                        this.j = 2;
                        this.Q(v, -1L, v, 29, false, v2);
                        return this.j != 2;
                    }
                }
                else {
                    this.E = v4;
                }
            }
        }
        else {
            fvrc fvrc0 = this.u.c(calendar0, z, 0);
            this.P(v, fvrc0, 0);
            if(fvrc0.a) {
                this.m = fvrc0.b;
                int v1 = this.F(z);
                if(v1 != 1) {
                    this.E = v1;
                    return this.j != 2;
                }
                boolean z1 = this.z != -1L && v - this.z < 30000L;
                boolean z2 = huvd.p() && fvse.a(huvd.b()) && (this.A != -1L && v - this.A < 30000L);
                if(!z && !z1 && !z2) {
                    this.E = 21;
                    return this.j != 2;
                }
                fvqb0.a();
                this.J();
                this.j = 8;
                this.I(false);
                if(!this.R(v, z, fvri.S(z, z1, z2))) {
                    this.j = 2;
                    this.Q(v, -1L, v, 29, false, 0);
                    return this.j != 2;
                }
            }
        }
        return this.j != 2;
    }
}

