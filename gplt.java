import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;

final class gplt extends iakv {
    public final Executor a;
    public final Set b;
    public final Deque c;
    public int d;
    public gpls e;
    public iaku f;
    public boolean g;
    public final gplr h;
    public boolean i;
    public iakv j;
    private final iakr k;
    private final gRPCMethodDescriptor l;
    private final gged_interceptors m;
    private final LinkedHashMap n;
    private final Set o;
    private final Queue p;
    private iakq q;
    private final Queue r;
    private int s;
    private iaof_metadata t;

    public gplt(iakr iakr0, gRPCMethodDescriptor iaoj0, iakq iakq0, gged_interceptors gged0) {
        this.b = ggog.n();
        this.n = new LinkedHashMap();
        this.o = ggog.n();
        this.g = false;
        this.i = false;
        this.k = iakr0;
        this.l = iaoj0;
        this.q = iakq0;
        this.m = gged0;
        this.c = new ArrayDeque();
        this.r = new ArrayDeque();
        this.p = new ArrayDeque();
        this.e = new gpls(((ggna)gged0).c, 1, 0, 0);
        Executor executor0 = iakq0.c;
        if(executor0 == null) {
            executor0 = gmap.a;
        }
        gplr gplr0 = new gplr(executor0);
        this.h = gplr0;
        this.a = new gpla(this, new gmct(gplr0));
    }

    @Override  // iakv
    public final void a(String s, Throwable throwable0) {
        Runnable runnable0 = gdrx.g(new gplf(this, s, throwable0));
        this.a.execute(runnable0);
    }

    @Override  // iakv
    public final void b() {
        Runnable runnable0 = gdrx.g(new gplb(this));
        this.a.execute(runnable0);
    }

    @Override  // iakv
    public final void c(int v) {
        __monitor_enter(this.r);
        this.s += v;
        __monitor_exit(this.r);
        ArrayDeque arrayDeque0 = new ArrayDeque();
        Queue queue0 = this.r;
        __monitor_enter(queue0);
        int v1 = FIN.finallyOpen$NT();
        if(queue0.isEmpty()) {
            FIN.finallyCodeBegin$NT(v1);
        }
        else {
            int v2 = this.s;
            for(int v3 = 0; v3 < v2; ++v3) {
                Object object0 = queue0.poll();
                if(object0 != null) {
                    arrayDeque0.add(object0);
                    --this.s;
                }
            }
            boolean z = queue0.isEmpty();
            FIN.finallyExec$NT(v1);
            for(Object object1: arrayDeque0) {
                this.f.c(object1);
            }
            if(z) {
                this.f.a(iapk.b, null);
            }
        }
        Runnable runnable0 = gdrx.g(new gplc(this, v));
        this.a.execute(runnable0);
    }

    @Override  // iakv
    public final void d(Object object0) {
        Runnable runnable0 = gdrx.g(new gplg(this, object0));
        this.a.execute(runnable0);
    }

    @Override  // iakv
    public final void e(iaku iaku0, iaof_metadata iaof0) {
        this.f = new gplp(this, new gpmh(new gplv(iaku0, this.m, this.o)));
        this.t = iaof0;
        Runnable runnable0 = gdrx.g(() -> {
            gpkt gpkt0 = this.l(this.q, iaof0, this.k.b());
            gged_interceptors gged0 = (gged_interceptors)this.m.get(this.e.b);
            int v = gged0.size();
            for(int v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    if(!this.n.isEmpty()) {
                        break;
                    }
                    this.p();
                    break;
                }
                gpkv gpkv0 = (gpkv)gged0.get(v1);
                gpmb gpmb0 = gpkv0.b(this.m(gpkt0));
                if(gpmb0.b.equals(gpma.d)) {
                    gmcd gmcd0 = gpmb0.a();
                    this.n.put(gpkv0, gmcd0);
                    gmcd0.hB(gdrx.g(() -> {
                        LinkedHashMap linkedHashMap0 = this.n;
                        if(!linkedHashMap0.isEmpty()) {
                            Iterator iterator0 = linkedHashMap0.entrySet().iterator();
                            while(iterator0.hasNext()) {
                                Object object0 = iterator0.next();
                                if(!((gmcd)((Map.Entry)object0).getValue()).isDone()) {
                                    break;
                                }
                                iterator0.remove();
                                gpkv gpkv0 = (gpkv)((Map.Entry)object0).getKey();
                                gpmb gpmb0 = gpkv0.a(this.m(gpkt0));
                                if(gpmb0.b.equals(gpma.d)) {
                                    gmcd gmcd0 = gpmb0.a();
                                    linkedHashMap0.put(gpkv0, gmcd0);
                                    gmcd0.hB(gdrx.g(new gplk(this, gpkt0)), this.a);
                                }
                                if(this.q(gpmb0)) {
                                    return;
                                }
                            }
                            if(linkedHashMap0.isEmpty() && !this.i) {
                                this.p();
                            }
                        }
                    }), this.a);
                }
                if(this.q(gpmb0)) {
                    break;
                }
                this.o.add(gpkv0);
            }
        });
        this.a.execute(runnable0);
    }

    // Detected as a lambda impl.
    public final void f(gpkt gpkt0) {
        LinkedHashMap linkedHashMap0 = this.n;
        if(!linkedHashMap0.isEmpty()) {
            Iterator iterator0 = linkedHashMap0.entrySet().iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(!((gmcd)((Map.Entry)object0).getValue()).isDone()) {
                    break;
                }
                iterator0.remove();
                gpkv gpkv0 = (gpkv)((Map.Entry)object0).getKey();
                gpmb gpmb0 = gpkv0.a(this.m(gpkt0));
                if(gpmb0.b.equals(gpma.d)) {
                    gmcd gmcd0 = gpmb0.a();
                    linkedHashMap0.put(gpkv0, gmcd0);
                    gmcd0.hB(gdrx.g(new gplk(this, gpkt0)), this.a);
                }
                if(this.q(gpmb0)) {
                    return;
                }
            }
            if(linkedHashMap0.isEmpty() && !this.i) {
                this.p();
            }
        }
    }

    // Detected as a lambda impl.
    public final void g(gpku gpku0, gplq gplq0) {
        LinkedHashMap linkedHashMap0 = gplq0.b;
        Iterator iterator0 = linkedHashMap0.entrySet().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!((gmcd)((Map.Entry)object0).getValue()).isDone()) {
                break;
            }
            iterator0.remove();
            gpkv gpkv0 = (gpkv)((Map.Entry)object0).getKey();
            gpmb gpmb0 = gpkv0.d();
            if(gpmb0.b.equals(gpma.d)) {
                gmcd gmcd0 = gpmb0.a();
                linkedHashMap0.put(gpkv0, gmcd0);
                gmcd0.hB(gdrx.g(new gplh(this, gpku0, gplq0)), this.a);
            }
            if(this.q(gpmb0)) {
                return;
            }
        }
        if(linkedHashMap0.isEmpty()) {
            this.n();
            this.h();
        }
    }

    public final void h() {
        if(this.g) {
            gplq gplq0 = (gplq)this.c.peekLast();
            switch(this.e.e - 1) {
                case 1: {
                    if(gplq0 == null || gplq0.b.isEmpty() && gplq0.c == gplq0.d.e.c + 1) {
                        this.p();
                        return;
                    }
                    break;
                }
                case 3: {
                    if(gplq0 == null) {
                        this.j.b();
                        return;
                    }
                    break;
                }
            }
        }
    }

    public final void i() {
        switch(this.e.e - 1) {
            case 1: {
                for(Object object0: this.c) {
                    gplq gplq0 = (gplq)object0;
                    int v = gplq0.c;
                    int v1 = this.e.c;
                    if(v <= v1) {
                        this.o(gplq0, v, v1 + 1);
                    }
                }
                return;
            }
            case 3: {
                for(Object object1: this.c) {
                    this.o(((gplq)object1), ((gplq)object1).c, this.e.a);
                }
            }
        }
    }

    // Detected as a lambda impl.
    public final void j(iaof_metadata iaof0) {
        gpkt gpkt0 = this.l(this.q, iaof0, this.k.b());
        gged_interceptors gged0 = (gged_interceptors)this.m.get(this.e.b);
        int v = gged0.size();
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                if(!this.n.isEmpty()) {
                    break;
                }
                this.p();
                break;
            }
            gpkv gpkv0 = (gpkv)gged0.get(v1);
            gpmb gpmb0 = gpkv0.b(this.m(gpkt0));
            if(gpmb0.b.equals(gpma.d)) {
                gmcd gmcd0 = gpmb0.a();
                this.n.put(gpkv0, gmcd0);
                gmcd0.hB(gdrx.g(() -> {
                    LinkedHashMap linkedHashMap0 = this.n;
                    if(!linkedHashMap0.isEmpty()) {
                        Iterator iterator0 = linkedHashMap0.entrySet().iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            if(!((gmcd)((Map.Entry)object0).getValue()).isDone()) {
                                break;
                            }
                            iterator0.remove();
                            gpkv gpkv0 = (gpkv)((Map.Entry)object0).getKey();
                            gpmb gpmb0 = gpkv0.a(this.m(gpkt0));
                            if(gpmb0.b.equals(gpma.d)) {
                                gmcd gmcd0 = gpmb0.a();
                                linkedHashMap0.put(gpkv0, gmcd0);
                                gmcd0.hB(gdrx.g(new gplk(this, gpkt0)), this.a);
                            }
                            if(this.q(gpmb0)) {
                                return;
                            }
                        }
                        if(linkedHashMap0.isEmpty() && !this.i) {
                            this.p();
                        }
                    }
                }), this.a);
            }
            if(this.q(gpmb0)) {
                break;
            }
            this.o.add(gpkv0);
        }
    }

    private final gpkt l(iakq iakq0, iaof_metadata iaof0, String s) {
        gftb.check(this.l);
        gftb.check(iakq0);
        gftb.check(iaof0);
        gftb.check(s);
        return new gpkt(this.l, iakq0, iaof0, s);
    }

    private final gpkt m(gpkt gpkt0) {
        return this.q == gpkt0.b ? gpkt0 : this.l(this.q, gpkt0.a, gpkt0.d);
    }

    private final void n() {
        while(true) {
            Deque deque0 = this.c;
            if(deque0.isEmpty()) {
                break;
            }
            gplq gplq0 = (gplq)deque0.peek();
            if(!gplq0.b.isEmpty() || gplq0.c != gplq0.d.e.a) {
                break;
            }
            Object object0 = ((gplq)deque0.poll()).a;
            if(this.e.e == 4) {
                this.j.d(object0);
            }
            else {
                this.p.add(object0);
            }
        }
    }

    private final void o(gplq gplq0, int v, int v1) {
        gpku gpku0 = new gpku(gplq0.a);
        while(v < v1) {
            gged_interceptors gged0 = (gged_interceptors)this.m.get(v);
            int v2 = gged0.size();
            int v3 = 0;
            while(v3 < v2) {
                gpkv gpkv0 = (gpkv)gged0.get(v3);
                gpmb gpmb0 = gpkv0.e();
                if(gpmb0.b.equals(gpma.d)) {
                    gmcd gmcd0 = gpmb0.a();
                    gplq0.b.put(gpkv0, gmcd0);
                    gmcd0.hB(gdrx.g(() -> {
                        LinkedHashMap linkedHashMap0 = gplq0.b;
                        Iterator iterator0 = linkedHashMap0.entrySet().iterator();
                        while(iterator0.hasNext()) {
                            Object object0 = iterator0.next();
                            if(!((gmcd)((Map.Entry)object0).getValue()).isDone()) {
                                break;
                            }
                            iterator0.remove();
                            gpkv gpkv0 = (gpkv)((Map.Entry)object0).getKey();
                            gpmb gpmb0 = gpkv0.d();
                            if(gpmb0.b.equals(gpma.d)) {
                                gmcd gmcd0 = gpmb0.a();
                                linkedHashMap0.put(gpkv0, gmcd0);
                                gmcd0.hB(gdrx.g(new gplh(this, gpku0, gplq0)), this.a);
                            }
                            if(this.q(gpmb0)) {
                                return;
                            }
                        }
                        if(linkedHashMap0.isEmpty()) {
                            this.n();
                            this.h();
                        }
                    }), this.a);
                }
                ++v3;
                if(this.q(gpmb0)) {
                    return;
                }
            }
            ++v;
        }
        gplq0.c = v1;
        if(gplq0.b.isEmpty()) {
            this.n();
            this.h();
        }
    }

    private final void p() {
        gpls gpls1;
        gpls gpls0 = this.e;
        int v = gpls0.e;
        gftb.r(((boolean)((v == 4 ? 1 : 0) ^ 1)), "UNDERLYING_CALL_STARTED state is terminal, cannot transition");
        if(v == 3) {
            gpls1 = new gpls(gpls0.a, 4, gpls0.b, gpls0.c);
        }
        else if(v == 1 && gpls0.d) {
            gpls1 = new gpls(gpls0.a, 2, gpls0.b, gpls0.b);
        }
        else {
            gpls1 = gpls0.b + 1 >= gpls0.a ? new gpls(gpls0.a, 3, gpls0.b, gpls0.c) : new gpls(gpls0.a, 1, gpls0.b + 1, gpls0.c);
        }
        this.e = gpls1;
        switch(gpls1.e - 1) {
            case 0: {
                this.j(this.t);
                return;
            }
            case 2: {
                iakv iakv0 = this.k.a(this.l, this.q);
                this.j = iakv0;
                iakv0.e(this.f, this.t);
                int v1 = this.d;
                if(v1 > 0) {
                    this.j.c(v1);
                }
                for(Object object0: this.p) {
                    this.j.d(object0);
                }
                if(this.g && this.c.isEmpty()) {
                    this.j.b();
                }
                this.p();
                return;
            }
            default: {
                this.i();
            }
        }
    }

    private final boolean q(gpmb gpmb0) {
        gpma gpma0 = gpmb0.b;
        switch(gpma0.ordinal()) {
            case 0: {
                return this.r(gpmb0);
            }
            case 1: {
                iapk iapk0 = gpmb0.c.a;
                this.f.a(iapk0, gpmb0.c.b);
                if(this.e.e == 4) {
                    this.j.a("Aborted RPC with exception", iapk0.v);
                }
                this.i = true;
                return true;
            }
            case 2: {
                throw null;
            }
            case 3: {
                gmcd gmcd0 = gpmb0.a();
                this.b.add(gmcd0);
                gmcd0.hB(gdrx.g(new gpld(this, gmcd0)), this.a);
                return this.r(gpmb0);
            }
            case 4: {
                this.e.d = true;
                return false;
            }
            default: {
                throw new IllegalStateException("Unrecognized outcome type: " + gpma0.toString());
            }
        }
    }

    private final boolean r(gpmb gpmb0) {
        iakq iakq0 = gpmb0.d;
        if(iakq0 != null) {
            if(this.e.e != 1) {
                IllegalStateException illegalStateException0 = new IllegalStateException("Cannot return *WithCallOptions() from message processing methods");
                this.f.a(iapk.d(illegalStateException0), new iaof_metadata());
                if(this.e.e == 4) {
                    this.j.a("Interceptor returned invalid outcome", illegalStateException0);
                }
                return true;
            }
            this.q = iakq0;
        }
        return false;
    }
}

