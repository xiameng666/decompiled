import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

final class iatm implements iavn {
    public final String a;
    public ibbr b;
    public final Object c;
    public final Set d;
    public final Executor e;
    public final ibfu f;
    public iakk g;
    public final iatd h;
    public boolean i;
    public iapk j;
    public boolean k;
    private final iaml l;
    private final InetSocketAddress m;
    private final String n;
    private boolean o;
    private boolean p;

    public iatm(iatd iatd0, InetSocketAddress inetSocketAddress0, String s, String s1, iakk iakk0, Executor executor0, ibfu ibfu0) {
        this.c = new Object();
        this.d = Collections.newSetFromMap(new IdentityHashMap());
        gftb.z(inetSocketAddress0, "address");
        this.m = inetSocketAddress0;
        this.l = iaml.a(this.getClass(), inetSocketAddress0.toString());
        this.n = s;
        this.a = iayh.e("cronet", s1);
        this.e = executor0;
        this.h = iatd0;
        this.f = ibfu0;
        iaki iaki0 = new iaki(iakk.a);
        iaki0.b(iaya.a, iapd.c);
        iaki0.b(iaya.b, iakk0);
        this.g = iaki0.a();
    }

    final void a(iatj iatj0, iapk iapk0) {
        boolean z = true;
        synchronized(this.c) {
            if(this.d.remove(iatj0)) {
                if(iapk0.t != iaph.b && iapk0.t != iaph.e) {
                    z = false;
                }
                iaof_metadata iaof0 = new iaof_metadata();
                iatj0.o.l(iapk0, z, iaof0);
                this.e();
            }
        }
    }

    @Override  // iavb
    public final iauy b(gRPCMethodDescriptor iaoj0, iaof_metadata iaof0, iakq iakq0, ialc[] arr_ialc) {
        gftb.z(iaoj0, "method");
        gftb.z(iaof0, "headers");
        return new iatl(this, "https://" + this.n + ("/" + iaoj0.fullMethodName_), iaof0, iaoj0, ibfn.l(arr_ialc, this.g), iakq0).a;
    }

    @Override  // iamq
    public final iaml c() {
        return this.l;
    }

    @Override  // ibbs
    public final Runnable d(ibbr ibbr0) {
        this.b = ibbr0;
        synchronized(this.c) {
            this.k = true;
        }
        return new iatk(this);
    }

    final void e() {
        synchronized(this.c) {
            if(this.i && !this.p && this.d.isEmpty()) {
                this.p = true;
                this.b.d();
            }
        }
    }

    @Override  // ibbs
    public final void p(iapk iapk0) {
        synchronized(this.c) {
            if(this.i) {
                return;
            }
        }
        synchronized(this.c) {
            if(this.o) {
                return;
            }
            this.o = true;
        }
        this.b.c(iapk0);
        synchronized(this.c) {
            this.i = true;
            this.j = iapk0;
        }
        this.e();
    }

    @Override  // ibbs
    public final void q(iapk iapk0) {
        ArrayList arrayList0;
        this.p(iapk0);
        synchronized(this.c) {
            arrayList0 = new ArrayList(this.d);
        }
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((iatj)arrayList0.get(v2)).c(iapk0);
        }
        this.e();
    }

    @Override  // iavn
    public final iakk r() {
        return this.g;
    }

    @Override
    public final String toString() {
        return super.toString() + "(" + this.m.toString() + ")";
    }
}

