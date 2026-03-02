import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class iaxg implements iauy {
    private volatile boolean a;
    private iava b;
    private iapk c;
    private List d;
    private iaxf e;
    public iauy f;
    private long g;
    private long h;
    private List i;

    public iaxg() {
        this.d = new ArrayList();
        this.i = new ArrayList();
    }

    @Override  // iauy
    public final iakk a() {
        synchronized(this) {
        }
        return this.f == null ? iakk.a : this.f.a();
    }

    @Override  // iauy
    public void b(iayp iayp0) {
        synchronized(this) {
            if(this.b == null) {
                return;
            }
            if(this.f == null) {
                iayp0.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                iayp0.a("waiting_for_connection");
            }
            else {
                iayp0.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.f.b(iayp0);
            }
        }
    }

    @Override  // iauy
    public void c(iapk iapk0) {
        boolean z = true;
        gftb.r(this.b != null, "May only be called after start");
        gftb.z(iapk0, "reason");
        synchronized(this) {
            if(this.f == null) {
                this.u(ibcc.a);
                this.c = iapk0;
                z = false;
            }
        }
        if(z) {
            this.s(new iawz(this, iapk0));
            return;
        }
        this.r();
        this.p();
        iava iava0 = this.b;
        iaof_metadata iaof0 = new iaof_metadata();
        iava0.a(iapk0, iauz.a, iaof0);
    }

    @Override  // ibfo
    public final void d() {
        gftb.r(this.b != null, "May only be called after start");
        if(this.a) {
            this.f.d();
            return;
        }
        this.s(new iawy(this));
    }

    @Override  // iauy
    public final void e() {
        gftb.r(this.b != null, "May only be called after start");
        this.s(new iaxa(this));
    }

    @Override  // ibfo
    public final void f() {
        gftb.r(this.b == null, "May only be called before start");
        this.i.add(new iawq(this));
    }

    @Override  // ibfo
    public final void g(int v) {
        gftb.r(this.b != null, "May only be called after start");
        if(this.a) {
            this.f.g(v);
            return;
        }
        this.s(new iawp(this, v));
    }

    @Override  // ibfo
    public final void h(ialh ialh0) {
        gftb.r(this.b == null, "May only be called before start");
        gftb.z(ialh0, "compressor");
        this.i.add(new iawr(this, ialh0));
    }

    @Override  // iauy
    public final void i(ials ials0) {
        gftb.r(this.b == null, "May only be called before start");
        this.i.add(new iawv(this, ials0));
    }

    @Override  // iauy
    public final void j(ialv ialv0) {
        gftb.r(this.b == null, "May only be called before start");
        gftb.z(ialv0, "decompressorRegistry");
        this.i.add(new iaws(this, ialv0));
    }

    @Override  // iauy
    public final void k(int v) {
        gftb.r(this.b == null, "May only be called before start");
        this.i.add(new iawt(this, v));
    }

    @Override  // iauy
    public final void l(int v) {
        gftb.r(this.b == null, "May only be called before start");
        this.i.add(new iawu(this, v));
    }

    @Override  // iauy
    public final void m(iava iava0) {
        iapk iapk0;
        gftb.r(this.b == null, "already started");
        synchronized(this) {
            iapk0 = this.c;
            boolean z = this.a;
            if(!z) {
                iaxf iaxf0 = new iaxf(iava0);
                this.e = iaxf0;
                iava0 = iaxf0;
            }
            this.b = iava0;
            this.g = System.nanoTime();
        }
        if(iapk0 != null) {
            iaof_metadata iaof0 = new iaof_metadata();
            iava0.a(iapk0, iauz.a, iaof0);
            return;
        }
        if(z) {
            this.t(iava0);
        }
    }

    @Override  // ibfo
    public final void n(InputStream inputStream0) {
        gftb.r(this.b != null, "May only be called after start");
        if(this.a) {
            this.f.n(inputStream0);
            return;
        }
        this.s(new iawx(this, inputStream0));
    }

    @Override  // ibfo
    public final boolean o() {
        return this.a ? this.f.o() : false;
    }

    protected void p() {
    }

    public final Runnable q(iauy iauy0) {
        iava iava0;
        synchronized(this) {
            if(this.f != null) {
                return null;
            }
            gftb.z(iauy0, "stream");
            this.u(iauy0);
            iava0 = this.b;
            if(iava0 == null) {
                this.d = null;
                this.a = true;
            }
        }
        if(iava0 != null) {
            this.t(iava0);
            return new iaww(this);
        }
        return null;
    }

    public final void r() {
        List list3;
        List list1;
        for(List list0 = new ArrayList(); true; list0 = list1) {
            synchronized(this) {
                if(this.d.isEmpty()) {
                    break;
                }
                list1 = this.d;
                this.d = list0;
            }
            for(Object object0: list1) {
                ((Runnable)object0).run();
            }
            list1.clear();
        }
        this.d = null;
        this.a = true;
        iaxf iaxf0 = this.e;
        if(iaxf0 != null) {
            for(List list2 = new ArrayList(); true; list2 = list3) {
                synchronized(iaxf0) {
                    if(iaxf0.c.isEmpty()) {
                        break;
                    }
                    list3 = iaxf0.c;
                    iaxf0.c = list2;
                }
                for(Object object1: list3) {
                    ((Runnable)object1).run();
                }
                list3.clear();
            }
            iaxf0.c = null;
            iaxf0.b = true;
        }
    }

    private final void s(Runnable runnable0) {
        gftb.r(this.b != null, "May only be called after start");
        synchronized(this) {
            if(!this.a) {
                this.d.add(runnable0);
                return;
            }
        }
        runnable0.run();
    }

    private final void t(iava iava0) {
        for(Object object0: this.i) {
            ((Runnable)object0).run();
        }
        this.i = null;
        this.f.m(iava0);
    }

    private final void u(iauy iauy0) {
        gftb.u(this.f == null, "realStream already set to %s", this.f);
        this.f = iauy0;
        this.h = System.nanoTime();
    }
}

