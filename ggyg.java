import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Logger;

public final class ggyg {
    public static final Logger a;
    public final ggyb b;
    public ghde c;
    public final ible d;
    public int e;
    public ggxs f;
    public final ArrayList g;
    public int h;
    public int i;
    public ggxs j;
    protected final PriorityQueue k;
    public ggye l;
    public boolean m;
    public final HashSet n;
    public ggyc o;
    private final Comparator p;
    private final Comparator q;
    private final PriorityQueue r;
    private final ArrayList s;
    private final Comparator t;
    private final ArrayList u;
    private final List v;
    private final ghbw w;
    private final ggxq x;
    private final ggxq y;

    static {
        ggyg.a = Logger.getLogger(ggyg.class.getCanonicalName());
    }

    public ggyg(ggyb ggyb0, ghde ghde0) {
        ggxy ggxy0 = new ggxy();
        this.p = ggxy0;
        ggxz ggxz0 = new ggxz(this);
        this.q = ggxz0;
        this.r = new PriorityQueue(16, ggxz0);
        this.s = new ArrayList();
        this.t = new ggys();
        this.d = new ible();
        this.e = 0x7FFFFFFF;
        this.u = new ArrayList(6);
        ArrayList arrayList0 = new ArrayList(6);
        this.g = arrayList0;
        this.k = new PriorityQueue(16, ggxy0);
        this.x = new ggxq();
        this.n = new HashSet();
        this.v = new ArrayList();
        this.w = new ghbw();
        this.y = new ggxq();
        this.b = ggyb0;
        this.c = ghde0;
        this.h = 0;
        this.i = 0;
        arrayList0.clear();
    }

    protected final void a(ggxs ggxs0, int v, int v1) {
        ggye ggye1;
        if(this.e == 1) {
            if(this.l == null) {
                List list0 = this.v;
                if(list0.isEmpty()) {
                    this.l = new ggye(ggxs0);
                }
                else {
                    ggye ggye0 = (ggye)list0.remove(list0.size() - 1);
                    this.l = ggye0;
                    ggye0.a = ggxs0;
                }
                this.x.a = (ggxr)ggxs0;
                this.j = this.d(ggxs0);
                return;
            }
            if(this.x.a(((ggxr)ggxs0))) {
                this.l.a = ggxs0;
                this.j = this.d(this.l.a);
            }
        }
        else {
            List list1 = this.v;
            if(list1.isEmpty()) {
                ggye1 = new ggye(ggxs0);
            }
            else {
                ggye1 = (ggye)list1.remove(list1.size() - 1);
                ggye1.a = ggxs0;
            }
            PriorityQueue priorityQueue0 = this.k;
            priorityQueue0.add(ggye1);
            int v2 = priorityQueue0.size();
            int v3 = this.e;
            if(v2 >= v3) {
                if(v2 > v3) {
                    list1.add(((ggye)priorityQueue0.poll()));
                }
                this.j = this.d(((ggye)priorityQueue0.peek()).a);
            }
        }
    }

    public final void b() {
        ggym ggym13;
        PriorityQueue priorityQueue0;
        this.m = false;
        ggzu ggzu0 = this.c.a();
        ggxr ggxr0 = ggxr.a;
        ggyh ggyh0 = new ggyh(this.o.a, ggxr0);
        if(!ggyh0.k()) {
            if(this.e == 1 && ggzs.d(ggzu0, ggyh0.a)) {
                this.e(((ghcc)ggzu0.a()));
                if(!this.j.equals(ggxr0)) {
                    goto label_8;
                }
            }
            else {
            label_8:
                ArrayList arrayList0 = this.u;
                if(arrayList0.isEmpty()) {
                    arrayList0.clear();
                    this.g.clear();
                    ggzu ggzu1 = this.c.a();
                    if(!ggzu1.f()) {
                        ggzu ggzu2 = this.c.a();
                        ggzu2.b();
                        ggzu2.g();
                        if(!ggzs.b(ggzu1).equals(ggzs.b(ggzu2))) {
                            int v = ggzs.b(ggzu1).c(ggzs.b(ggzu2)) + 1;
                            ggym ggym0 = ggzs.b(ggzu2).E(v);
                            for(ggym ggym1 = ggzs.b(ggzu1).E(v); !ggym1.equals(ggym0); ggym1 = ggym1.C()) {
                                if(!ggym1.F().W(ggzs.b(ggzu1))) {
                                    ggzu ggzu3 = ggzu1.i();
                                    ggzu1.d(ggym1.F().C());
                                    ggzu ggzu4 = ggzu1.i();
                                    ggzu4.g();
                                    this.g(ggzu3, ggzu4);
                                }
                            }
                        }
                        this.g(ggzu1, ggzu2);
                    }
                }
                if(this.j == ggxr.d) {
                    for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                        this.f(((ggym)arrayList0.get(v1)), ((ghcc)this.g.get(v1)));
                    }
                }
                else {
                    ArrayList arrayList1 = new ArrayList();
                    ArrayList arrayList2 = this.s;
                    arrayList2.clear();
                    ggxs ggxs0 = this.j;
                    gftb.checkTrue(((boolean)(ggyh0.b.j() ^ 1)));
                    gftb.checkTrue(((boolean)(ggyh0.b.i() ^ 1)));
                    gftb.checkTrue(((boolean)(((ggxr)ggxs0).j() ^ 1)));
                    gftb.checkTrue(((boolean)(((ggxr)ggxs0).i() ^ 1)));
                    ggxr ggxr1 = ((ggxr)ggxs0).h(((ggxr)ggxs0).f * 3.330669E-16);
                    ggxr ggxr2 = ggxr.d(ggyh0.b, ggxr1);
                    ggyh ggyh1 = new ggyh(ggyh0.a, ggxr2);
                    ghbm ghbm0 = new ghbm();
                    ghbm0.c = 4;
                    ghbq ghbq0 = new ghbq(ghbm0);
                    arrayList1.clear();
                    double f = ggyh1.b().c;
                    int v2 = Math.min(ghbj.b.a(f + f), 29);
                    if(v2 == 0) {
                        Collections.addAll(arrayList1, ggym.b);
                    }
                    else {
                        ggym.B(ggyh1.a).M(v2, arrayList1);
                    }
                    int v3 = ghbq0.c;
                    if(v3 < 30) {
                        for(int v4 = 0; v4 < arrayList1.size(); ++v4) {
                            ggym ggym2 = (ggym)arrayList1.get(v4);
                            int v5 = ggym2.j();
                            int v6 = Math.min(v5, v3);
                            if(v6 != v5) {
                                arrayList1.set(v4, ggym2.E(v6));
                            }
                        }
                    }
                    ggyq.o(arrayList1);
                    while(arrayList1.size() > ghbq0.e) {
                        int v7 = -1;
                        int v8 = 0;
                        int v9 = -1;
                        while(v8 + 1 < arrayList1.size()) {
                            int v10 = ((ggym)arrayList1.get(v8)).c(((ggym)arrayList1.get(v8 + 1)));
                            if(v10 > v7) {
                                v9 = v8;
                            }
                            ++v8;
                            v7 = v10 <= v7 ? v7 : v10;
                        }
                        if(v7 < ghbq0.b) {
                            break;
                        }
                        arrayList1.set(v9, ((ggym)arrayList1.get(v9)).E(v7));
                        ggyq.o(arrayList1);
                    }
                    int v11 = ghbq0.b;
                    if(v11 > 0) {
                        ggyq ggyq0 = new ggyq();
                        ggyq0.d(arrayList1);
                        arrayList1.clear();
                        arrayList1.ensureCapacity(ggyq0.b());
                        for(Object object0: ggyq0) {
                            ggym ggym3 = (ggym)object0;
                            int v12 = ggym3.j();
                            int v13 = Math.max(v11, v12);
                            if(v13 == v12) {
                                arrayList1.add(ggym3);
                            }
                            else {
                                ggym ggym4 = ggym3.w(v13);
                                for(ggym ggym5 = ggym3.v(v13); !ggym5.equals(ggym4); ggym5 = ggym5.C()) {
                                    arrayList1.add(ggym5);
                                }
                            }
                        }
                    }
                    arrayList2.clear();
                    int v14 = 0;
                    int v15 = 0;
                    while(v14 < arrayList0.size() && v15 < arrayList1.size()) {
                        ggym ggym6 = (ggym)arrayList0.get(v14);
                        ggym ggym7 = ggym6.G();
                        ggym ggym8 = (ggym)arrayList1.get(v15);
                        ggym ggym9 = ggym8.G();
                        if(!ggym7.Q(ggym9)) {
                            if(ggym9.Q(ggym7)) {
                                if(ggym8.V(ggym6.F())) {
                                    arrayList2.add(ggym8);
                                    goto label_140;
                                }
                                else {
                                    v14 = ggyq.a(arrayList0, ggym9, v14 + 1);
                                    int v17 = v14 - 1;
                                    if(!ggym8.V(((ggym)arrayList0.get(v17)).F())) {
                                        continue;
                                    }
                                    v14 = v17;
                                    continue;
                                }
                                goto label_135;
                            }
                            else {
                            label_135:
                                if(ggym6.W(ggym8)) {
                                    arrayList2.add(ggym6);
                                    ++v14;
                                    continue;
                                }
                                else {
                                    arrayList2.add(ggym8);
                                }
                            }
                        label_140:
                            ++v15;
                        }
                        else if(ggym6.V(ggym8.F())) {
                            arrayList2.add(ggym6);
                            ++v14;
                        }
                        else {
                            v15 = ggyq.a(arrayList1, ggym7, v15 + 1);
                            int v16 = v15 - 1;
                            if(!ggym6.V(((ggym)arrayList1.get(v16)).F())) {
                                continue;
                            }
                            v15 = v16;
                        }
                    }
                    int v18 = 0;
                    int v19 = 0;
                label_144:
                    while(v18 < arrayList2.size()) {
                        ggym ggym10 = (ggym)arrayList2.get(v18);
                        while(((ggym)arrayList0.get(v19)).F().W(ggym10)) {
                            ++v19;
                        }
                        ggym ggym11 = (ggym)arrayList0.get(v19);
                        if(ggym10.equals(ggym11)) {
                            ++v18;
                            this.f(ggym11, ((ghcc)this.g.get(v19)));
                            ++v19;
                            continue;
                        }
                        else {
                            int v20 = ggzs.e(ggzu0, ggym10);
                            if(v20 == 1) {
                                this.f(ggzs.b(ggzu0), ((ghcc)ggzu0.a()));
                                ggym ggym12 = ggzs.b(ggzu0).F();
                                while(true) {
                                    ++v18;
                                    if(v18 >= arrayList2.size() || !((ggym)arrayList2.get(v18)).V(ggym12)) {
                                        continue label_144;
                                    }
                                }
                            }
                            else {
                                ++v18;
                                if(v20 != 2) {
                                    continue;
                                }
                                this.f(ggym10, null);
                                continue;
                            }
                        }
                        break;
                    }
                }
            }
        }
    alab1:
        while(true) {
            while(true) {
            label_166:
                priorityQueue0 = this.r;
                if(priorityQueue0.isEmpty()) {
                    break alab1;
                }
                ggyd ggyd0 = (ggyd)priorityQueue0.poll();
                if(this.t.compare(ggyd0.a, this.j) >= 0) {
                    goto label_186;
                }
                ghcc ghcc0 = ggyd0.c;
                if(ghcc0 == null) {
                    ggym13 = ggyd0.b;
                    ggzu0.d(ggym13.u(1).G());
                    if(!ggzu0.f() && ggzs.b(ggzu0).V(ggym13.u(1).F())) {
                        this.h(ggym13.u(1), ggzu0);
                    }
                    if(ggzu0.g() && ggzs.b(ggzu0).P(ggym13.G())) {
                        this.h(ggym13.u(0), ggzu0);
                    }
                    ggzu0.d(ggym13.u(3).G());
                    if(!ggzu0.f() && ggzs.b(ggzu0).V(ggym13.u(3).F())) {
                        this.h(ggym13.u(3), ggzu0);
                    }
                    if(ggzu0.g() && ggzs.b(ggzu0).P(ggym13.u(2).G())) {
                        break;
                    }
                }
                else {
                    this.e(ghcc0);
                }
            }
            this.h(ggym13.u(2), ggzu0);
            goto label_166;
        label_186:
            priorityQueue0.clear();
            break;
        }
    }

    public final void c(int v, int v1) {
        ggxr ggxr1;
        if(this.m) {
        label_3:
            ggxq ggxq0 = this.y;
            ggxq0.a = (ggxr)this.j;
            ghbx ghbx0 = (ghbx)this.c.c().get(v);
            ghbx0.p(v1, this.w);
            ghbx0.A();
            ghae ghae0 = this.o.a;
            ghae ghae1 = this.w.a;
            ghae ghae2 = this.w.b;
            if(!ggxq0.a.f()) {
                ggxr ggxr0 = ggxq0.a;
                gftb.f(ggxv.g(ghae0), "S2Point not normalized: %s", ghae0);
                gftb.f(ggxv.g(ghae1), "S2Point not normalized: %s", ghae1);
                gftb.f(ggxv.g(ghae2), "S2Point not normalized: %s", ghae2);
                double f = ghae.r(ghae0, ghae1).g();
                double f1 = ghae.r(ghae0, ghae2).g();
                gftb.f(ggxv.g(ghae0), "S2Point not normalized: %s", ghae0);
                gftb.f(ggxv.g(ghae1), "S2Point not normalized: %s", ghae1);
                gftb.f(ggxv.g(ghae2), "S2Point not normalized: %s", ghae2);
                double f2 = ghae.r(ghae1, ghae2).g();
                if(Math.abs(f - f1) < f2 + ((f + f1 + f2) * 1.054712E-15 + 3.944305E-31)) {
                    ghae ghae3 = ghbs.a(ghae1, ghae2);
                    double f3 = ghae0.b(ghae3);
                    double f4 = f3 * f3;
                    double f5 = ghae3.g();
                    double f6 = ggxr0.f;
                    if(f4 <= f5 * f6) {
                        ghae ghae4 = ghae.n(ghae3, ghae0);
                        if(ghae.r(ghae1, ghae0).b(ghae4) < 0.0 && ghae.r(ghae2, ghae0).b(ghae4) > 0.0) {
                            double f7 = 1.0 - Math.sqrt(ghae4.g() / f5);
                            double f8 = f4 / f5 + f7 * f7;
                            ggxr1 = f8 < f6 ? ggxr.e(f8) : ggxr0;
                        }
                        else {
                            ggxr1 = ggxr0;
                        }
                    }
                    else {
                        ggxr1 = ggxr0;
                    }
                }
                else {
                    ggxr1 = ggxr0;
                }
                if(ggxr1 == ggxr0) {
                    double f9 = Math.min(f, f1);
                    if(f9 < ggxr0.f) {
                        ggxr0 = ggxr.e(f9);
                    }
                }
                else {
                    ggxr0 = ggxr1;
                }
                if(ggxq0.a(ggxr0)) {
                    this.a(ggxq0.a, v, v1);
                }
            }
        }
        else {
            ggyf ggyf0 = new ggyf(v, v1);
            if(this.n.add(ggyf0)) {
                goto label_3;
            }
        }
    }

    protected final ggxs d(ggxs ggxs0) {
        ggxs ggxs1 = this.f;
        gftb.checkTrue(((boolean)(((ggxr)ggxs0).k() ^ 1)));
        gftb.checkTrue(((boolean)(((ggxr)ggxs1).k() ^ 1)));
        double f = ((ggxr)ggxs0).f;
        double f1 = ((ggxr)ggxs1).f;
        if(f1 != 0.0) {
            if((f <= f1)) {
                return ggxr.a;
            }
            double f2 = Math.max(0.0, Math.sqrt((1.0 - f1 * 0.25) * f) - Math.sqrt(f1 * (1.0 - f * 0.25)));
            return new ggxr(f2 * f2);
        }
        return ggxs0;
    }

    private final void e(ghcc ghcc0) {
        for(int v = 0; v < ghcc0.a(); ++v) {
            ghdb ghdb0 = ghcc0.b(v);
            int v1 = ghdb0.e();
            for(int v2 = 0; v2 < ghdb0.d(); ++v2) {
                this.c(v1, ghdb0.c(v2));
            }
        }
    }

    private final void f(ggym ggym0, ghcc ghcc0) {
        if(ghcc0 == null) {
        label_11:
            ggyi ggyi0 = new ggyi(ggym0);
            ggxq ggxq0 = new ggxq();
            ggxq0.a = (ggxr)this.j;
            if(!ggxq0.a.f() && ggxq0.a(ggyi0.c(this.o.a))) {
                ggyd ggyd0 = new ggyd(ggxq0.a, ggym0, ghcc0);
                this.r.add(ggyd0);
            }
        }
        else {
            int v1 = 0;
            for(int v = 0; v < ghcc0.a(); ++v) {
                v1 += ghcc0.b(v).d();
            }
            if(v1 != 0) {
                if(v1 < 10) {
                    this.e(ghcc0);
                    return;
                }
                goto label_11;
            }
        }
    }

    private final void g(ggzu ggzu0, ggzu ggzu1) {
        if(ggzs.b(ggzu0).equals(ggzs.b(ggzu1))) {
            ggym ggym0 = ggzs.b(ggzu0);
            this.u.add(ggym0);
            ghcc ghcc0 = (ghcc)ggzu0.a();
            this.g.add(ghcc0);
            return;
        }
        int v = ggzs.b(ggzu0).c(ggzs.b(ggzu1));
        ggym ggym1 = ggzs.b(ggzu0).E(v);
        this.u.add(ggym1);
        this.g.add(null);
    }

    private final void h(ggym ggym0, ggzu ggzu0) {
        if(ggzs.b(ggzu0).equals(ggym0)) {
            this.f(ggym0, ((ghcc)ggzu0.a()));
            return;
        }
        this.f(ggym0, null);
    }
}

