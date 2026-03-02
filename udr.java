import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public final class udr implements uqw {
    final udq a;
    public final uqz b;
    public uay c;
    public boolean d;
    public boolean e;
    public ueb f;
    uag g;
    public boolean h;
    udv i;
    public boolean j;
    udt k;
    public volatile boolean l;
    public final udm m;
    public final udm n;
    private final kav o;
    private final ufv p;
    private final ufv q;
    private final ufv r;
    private final AtomicInteger s;
    private boolean t;
    private ucy u;

    public udr(ufv ufv0, ufv ufv1, ufv ufv2, udm udm0, udm udm1, kav kav0) {
        this.a = new udq(new ArrayList(2));
        this.b = new uqz();
        this.s = new AtomicInteger();
        this.p = ufv0;
        this.q = ufv1;
        this.r = ufv2;
        this.n = udm0;
        this.m = udm1;
        this.o = kav0;
    }

    public final ufv b() {
        return this.t ? this.r : this.q;
    }

    final void c() {
        udt udt0;
        synchronized(this) {
            this.b.a();
            uqo.b(this.j(), "Not yet complete!");
            int v1 = this.s.decrementAndGet();
            uqo.b(v1 >= 0, "Can\'t decrement below 0");
            if(v1 == 0) {
                udt0 = this.k;
                this.e();
            }
            else {
                udt0 = null;
            }
        }
        if(udt0 != null) {
            udt0.f();
        }
    }

    final void d(int v) {
        synchronized(this) {
            uqo.b(this.j(), "Not yet complete!");
            if(this.s.getAndAdd(v) == 0) {
                udt udt0 = this.k;
                if(udt0 != null) {
                    udt0.d();
                }
            }
        }
    }

    public final void e() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        if(this.c != null) {
            this.a.a.clear();
            this.c = null;
            this.k = null;
            this.f = null;
            this.j = false;
            this.l = false;
            this.h = false;
            ucy ucy0 = this.u;
            if(ucy0.d.d()) {
                ucy0.b();
            }
            this.u = null;
            this.i = null;
            this.g = null;
            this.o.b(this);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void f(ucy ucy0) {
        ufv ufv0;
        synchronized(this) {
            this.u = ucy0;
            switch(ucy0.e(1)) {
                case 2: 
                case 3: {
                    ufv0 = this.p;
                    break;
                }
                default: {
                    ufv0 = this.b();
                }
            }
            ufv0.execute(ucy0);
        }
    }

    @Override  // uqw
    public final uqz fx() {
        return this.b;
    }

    public final void g(uoz uoz0, Executor executor0) {
        synchronized(this) {
            this.b.a();
            udp udp0 = new udp(uoz0, executor0);
            this.a.a.add(udp0);
            if(this.h) {
                this.d(1);
                executor0.execute(new udo(this, uoz0));
                return;
            }
            if(this.j) {
                this.d(1);
                executor0.execute(new udn(this, uoz0));
                return;
            }
            uqo.b(((boolean)(this.l ^ 1)), "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public final void h(uoz uoz0) {
        synchronized(this) {
            this.b.a();
            udp udp0 = new udp(uoz0, uqg.b);
            this.a.a.remove(udp0);
            if(this.a.c()) {
                if(!this.j()) {
                    this.l = true;
                    this.u.r = true;
                    uct uct0 = this.u.q;
                    if(uct0 != null) {
                        uct0.a();
                    }
                    this.n.a(this, this.c);
                }
                if((this.h || this.j) && this.s.get() == 0) {
                    this.e();
                }
            }
        }
    }

    public final void i(uay uay0, boolean z, boolean z1, boolean z2) {
        synchronized(this) {
            this.c = uay0;
            this.d = z;
            this.t = z1;
            this.e = z2;
        }
    }

    private final boolean j() {
        return this.j || this.h || this.l;
    }
}

