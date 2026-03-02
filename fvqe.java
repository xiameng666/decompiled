import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public final class fvqe {
    public final fwze a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    boolean g;
    boolean h;
    fuxh i;
    fvrm j;
    boolean k;
    boolean l;
    long m;
    long n;
    boolean o;
    long p;
    int q;
    private final List r;
    private final fwyd s;
    private final fwzp t;
    private final fwxs u;
    private final fvrj v;
    private final Random w;
    private final Calendar x;
    private long y;

    public fvqe(fwze fwze0, fwyd fwyd0, fwzp fwzp0, fvrj fvrj0, fwxs fwxs0) {
        Random random0 = new Random();
        super();
        this.x = Calendar.getInstance();
        this.q = 1;
        this.b = false;
        this.c = true;
        this.d = false;
        this.e = true;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = false;
        this.l = false;
        this.m = -1L;
        this.n = -1L;
        this.y = -1L;
        this.o = false;
        this.p = -1L;
        this.u = fwxs0;
        this.a = fwze0;
        this.s = fwyd0;
        this.t = fwzp0;
        this.v = fvrj0;
        this.w = random0;
        ArrayList arrayList0 = new ArrayList(2);
        arrayList0.add(new fvsl(6, 45, 10));
        arrayList0.add(new fvsl(15, 30, 19));
        this.r = DesugarCollections.unmodifiableList(arrayList0);
    }

    final void a(long v) {
        this.t.c(fwzf.k, 3, v, fwzy.a);
    }

    public final void b() {
        if(this.q != 4 && this.q != 5) {
            return;
        }
        this.k = true;
        this.c();
    }

    public final void c() {
        while(true) {
            boolean z = false;
            fwyd fwyd0 = this.s;
            long v = fwyd0.b();
            int v1 = this.q - 1;
            fvsl fvsl0 = null;
            if(this.q == 0) {
                break;
            }
            switch(v1) {
                case 0: {
                    if(this.m(v, true)) {
                        return;
                    }
                    long v2 = fwyd0.a();
                    long v3 = this.m;
                    if(v3 != -1L) {
                        if(this.l(v)) {
                            Calendar calendar0 = this.x;
                            calendar0.setTimeInMillis(v3 + v2);
                            for(Object object0: this.r) {
                                fvsl fvsl1 = (fvsl)object0;
                                if(fvsl1.i(calendar0)) {
                                    fvsl0 = fvsl1;
                                    break;
                                }
                            }
                            if(fvsl0 == null) {
                                this.e(v, true);
                            }
                            else {
                                this.d();
                                if(!this.g) {
                                    if(this.y == -1L) {
                                        z = true;
                                    }
                                    gftb.q(z);
                                    long v4 = huoa.a.c().c() * 1000L;
                                    this.y = v4;
                                    this.u.g(v4, true);
                                    this.g = true;
                                }
                                fvsl.f(calendar0, fvsl0.c);
                                this.i(calendar0.getTimeInMillis() - v2, v2);
                                this.q = 2;
                                this.f();
                            }
                            continue;
                        }
                        this.a(v3);
                        return;
                    }
                    Calendar calendar1 = this.x;
                    calendar1.setTimeInMillis(v + v2);
                    for(Object object1: this.r) {
                        fvsl fvsl2 = (fvsl)object1;
                        long v5 = fvsl.c(calendar1);
                        if(fvsl2.h(v5) || fvsl2.b > v5) {
                            fvsl0 = fvsl2;
                            break;
                        }
                    }
                    long v6 = this.v.d.b();
                    if(fvsl0 != null && this.v.c.d.h(58000L, v6, false)) {
                        this.g(calendar1, fvsl0, v2);
                        return;
                    }
                    this.h(calendar1, v2);
                    return;
                }
                case 1: {
                    if(this.m(v, true)) {
                        continue;
                    }
                    if(this.h) {
                        int v7 = (int)huoa.a.c().e();
                        this.i(v + ((long)this.w.nextInt(v7)), fwyd0.a());
                        this.q = 3;
                        continue;
                    }
                    else {
                        if(this.l(v)) {
                            this.e(v, true);
                            continue;
                        }
                        this.a(this.m);
                        return;
                    }
                    goto label_71;
                }
                case 2: {
                label_71:
                    if(this.m(v, true)) {
                        continue;
                    }
                    if(this.l(v)) {
                        this.t.o(Boolean.valueOf(true));
                        this.k();
                        this.q = 4;
                        continue;
                    }
                    this.a(this.m);
                    return;
                }
                case 3: {
                    if(this.m(v, true)) {
                        continue;
                    }
                    if(this.l) {
                        if(this.c) {
                            this.e(v, true);
                        }
                        else {
                            this.d();
                            fvrj fvrj0 = this.v;
                            fvrl fvrl0 = fvrj0.c;
                            fwyd fwyd1 = fvrj0.d;
                            long v8 = fwyd1.b();
                            long v9 = Math.min(fvrl0.d.a(v8), 120000L);
                            if(v9 < 58000L) {
                                this.e(v, true);
                                this.f();
                            }
                            else {
                                long v10 = fwyd1.b();
                                fvrm fvrm0 = fvrj0.b.i(v9, v10);
                                if(fvrm0 != null) {
                                    fvrl0.b(v10);
                                }
                                this.j = fvrm0;
                                if(fvrm0 == null) {
                                    this.e(v, true);
                                    this.f();
                                }
                                else {
                                    this.p = fwyd0.b() + v9;
                                    fwze fwze0 = this.a;
                                    fwym fwym0 = fwze0.k();
                                    fwzf fwzf0 = fwzf.k;
                                    fwym0.mQ(fwzf0, true);
                                    if(hunx.c()) {
                                        fwze0.k().mP(fwzf0, true);
                                    }
                                    this.i(this.p, fwyd0.a());
                                    this.q = 5;
                                }
                            }
                        }
                        continue;
                    }
                    return;
                }
                case 4: {
                    if(!this.m(v, false)) {
                        this.a(this.m);
                        return;
                    }
                    long v11 = this.p - v;
                    if(v11 > 0L) {
                        fvrj fvrj1 = this.v;
                        if(this.j != null && this.j.a(v11) > 0L) {
                            long v12 = fvrj1.d.b();
                            fvrj1.c.b(v12);
                        }
                    }
                    fwze fwze1 = this.a;
                    fwym fwym1 = fwze1.k();
                    fwzf fwzf1 = fwzf.k;
                    fwym1.mQ(fwzf1, false);
                    if(hunx.c()) {
                        fwze1.k().mP(fwzf1, false);
                    }
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
            this.p = -1L;
            this.j = null;
            continue;
        }
        throw null;
    }

    private final void d() {
        if(!this.o) {
            this.t.i(fwzf.k, 60000L, null);
            this.o = true;
        }
    }

    private final void e(long v, boolean z) {
        this.t.b(fwzf.k);
        this.m = -1L;
        this.k();
        this.h = false;
        this.i = null;
        this.k = false;
        this.l = false;
        if(z) {
            this.p = -1L;
            this.j = null;
        }
        if(this.q != 1) {
            this.q = 1;
            this.n = v;
        }
        this.f();
    }

    private final void f() {
        if(this.o) {
            this.t.j(fwzf.k);
            this.o = false;
        }
    }

    private final void g(Calendar calendar0, fvsl fvsl0, long v) {
        if(!fvsl0.i(calendar0)) {
            fvsl.f(calendar0, fvsl0.b);
        }
        if(this.n == -1L) {
            this.j(calendar0, v);
            return;
        }
        long v1 = calendar0.getTimeInMillis() - v;
        long v2 = this.n + 600000L;
        if(v2 > v1) {
            calendar0.setTimeInMillis(v2 + v);
        }
        if(!fvsl0.i(calendar0)) {
            List list0 = this.r;
            if(fvsl0 == list0.get(0)) {
                fvsl.f(calendar0, ((fvsl)list0.get(1)).b);
                this.g(calendar0, ((fvsl)list0.get(1)), v);
                return;
            }
            this.h(calendar0, v);
            return;
        }
        this.j(calendar0, v);
    }

    private final void h(Calendar calendar0, long v) {
        fvsl.f(calendar0, ((fvsl)this.r.get(0)).b);
        this.x.add(6, 1);
        this.j(this.x, v);
    }

    private final void i(long v, long v1) {
        this.m = v;
        this.a(v);
        new Date(v1 + this.m);
    }

    private final void j(Calendar calendar0, long v) {
        this.i(calendar0.getTimeInMillis() - v, v);
    }

    private final void k() {
        if(this.g) {
            gftb.q(Long.compare(this.y, -1L) != 0);
            this.u.r(this.y);
            this.g = false;
            this.y = -1L;
        }
    }

    private final boolean l(long v) {
        return v >= this.m - 2000L;
    }

    private final boolean m(long v, boolean z) {
        boolean z1 = this.a.k().mU();
        boolean z2 = fvqi.a(2) && fvqi.a(4);
        boolean z3 = this.b && this.e && fvqi.b() && !this.f && z2 && z1 && this.d;
        int v1 = this.q - 1;
        if(this.q == 0) {
            throw null;
        }
        switch(v1) {
            case 0: {
                if(!z3) {
                    this.e(v, z);
                    return true;
                }
                break;
            }
            case 1: {
                if(!z3 || this.k) {
                    this.e(v, z);
                    return true;
                }
                break;
            }
            case 2: 
            case 3: {
                if(!z3 || (this.i != fuxh.a && this.i != fuxh.d || this.k)) {
                    this.e(v, z);
                    return true;
                }
                break;
            }
            case 4: {
                if(!z3 || this.k || this.c || this.l(v)) {
                    this.e(v, z);
                    return true;
                }
                break;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
        return false;
    }
}

