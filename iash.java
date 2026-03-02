import java.io.InputStream;

final class iash implements iauy {
    private final iarq a;
    private final iasn b;
    private final iakk c;

    public iash(iarq iarq0, iasn iasn0, iakk iakk0) {
        this.a = iarq0;
        this.b = iasn0;
        this.c = iakk0;
    }

    @Override  // iauy
    public final iakk a() {
        return this.c;
    }

    @Override  // iauy
    public final void b(iayp iayp0) {
    }

    @Override  // iauy
    public final void c(iapk iapk0) {
        synchronized(this.a) {
            this.a.h(iapk0);
        }
    }

    @Override  // ibfo
    public final void d() {
    }

    @Override  // iauy
    public final void e() {
        try {
            synchronized(this.b) {
                this.b.e();
                this.b.f();
            }
        }
        catch(iapl iapl0) {
            synchronized(this.a) {
                this.a.g(iapl0.a);
            }
        }
    }

    @Override  // ibfo
    public final void f() {
    }

    @Override  // ibfo
    public final void g(int v) {
        synchronized(this.a) {
            this.a.m(v);
        }
    }

    @Override  // ibfo
    public final void h(ialh ialh0) {
    }

    @Override  // iauy
    public final void i(ials ials0) {
        synchronized(this.b) {
            this.b.b(ials0);
        }
    }

    @Override  // iauy
    public final void j(ialv ialv0) {
    }

    @Override  // iauy
    public final void k(int v) {
    }

    @Override  // iauy
    public final void l(int v) {
    }

    @Override  // iauy
    public final void m(iava iava0) {
        synchronized(this.a) {
            this.a.k(this.b, iava0);
        }
        iasn iasn0 = this.b;
        if(iasn0.g()) {
            iava0.e();
        }
        try {
            synchronized(iasn0) {
                iasn0.d();
                iasn0.f();
            }
        }
        catch(iapl iapl0) {
            synchronized(this.a) {
                this.a.g(iapl0.a);
            }
        }
    }

    @Override  // ibfo
    public final void n(InputStream inputStream0) {
        try {
            synchronized(this.b) {
                this.b.c(inputStream0);
                this.b.f();
            }
        }
        catch(iapl iapl0) {
            synchronized(this.a) {
                this.a.g(iapl0.a);
            }
        }
    }

    @Override  // ibfo
    public final boolean o() {
        return this.b.g();
    }

    @Override
    public final String toString() {
        return "MultiMessageClientStream[" + this.a.toString() + "/" + this.b.toString() + "]";
    }
}

