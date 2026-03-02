import java.io.File;
import java.util.List;

final class ucp implements ubk, uct {
    private final List a;
    private final ucu b;
    private final ucs c;
    private int d;
    private uay e;
    private List f;
    private int g;
    private volatile uhn h;
    private File i;

    public ucp(List list0, ucu ucu0, ucs ucs0) {
        this.d = -1;
        this.a = list0;
        this.b = ucu0;
        this.c = ucs0;
    }

    @Override  // uct
    public final void a() {
        uhn uhn0 = this.h;
        if(uhn0 != null) {
            uhn0.c.d();
        }
    }

    @Override  // uct
    public final boolean b() {
        while(true) {
            boolean z = false;
            if(this.f != null && this.d()) {
                this.h = null;
                while(!z && this.d()) {
                    int v = this.g;
                    this.g = v + 1;
                    uho uho0 = (uho)this.f.get(v);
                    ucu ucu0 = this.b;
                    this.h = uho0.a(this.i, ucu0.e, ucu0.f, ucu0.h);
                    if(this.h != null && ucu0.g(this.h.c.a())) {
                        this.h.c.g(ucu0.n, this);
                        z = true;
                    }
                }
                return z;
            }
            int v1 = this.d + 1;
            this.d = v1;
            List list0 = this.a;
            if(v1 >= list0.size()) {
                break;
            }
            uay uay0 = (uay)list0.get(this.d);
            ucu ucu1 = this.b;
            ucq ucq0 = new ucq(uay0, ucu1.m);
            File file0 = ucu1.c().a(ucq0);
            this.i = file0;
            if(file0 != null) {
                this.e = uay0;
                this.f = ucu1.f(file0);
                this.g = 0;
            }
        }
        return false;
    }

    @Override  // ubk
    public final void c(Object object0) {
        this.c.d(this.e, object0, this.h.c, uag.c, this.e);
    }

    private final boolean d() {
        return this.g < this.f.size();
    }

    @Override  // ubk
    public final void f(Exception exception0) {
        this.c.c(this.e, exception0, this.h.c, uag.c);
    }
}

