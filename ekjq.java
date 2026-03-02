import j..util.Objects;
import java.util.List;

public final class ekjq extends lsb {
    public final ekmc a;
    public final bxox b;
    public final ejyv c;
    public final ejyn d;
    public final lqi e;
    public bxox f;
    public final eghw g;
    private bxox h;
    private final ekmk i;
    private final ekmp j;

    public ekjq(ekmc ekmc0, eghw eghw0, ekmk ekmk0, ekmp ekmp0, ejyv ejyv0, ejyn ejyn0) {
        this.a = ekmc0;
        this.i = ekmk0;
        this.g = eghw0;
        this.j = ekmp0;
        this.c = ejyv0;
        this.b = ejyv0.c();
        this.d = ejyn0;
        this.f = null;
        this.h = null;
        this.e = new lqi();
    }

    final lqd a(String s, String s1, boolean z) {
        return this.i.a(s, s1, z);
    }

    final lqd b() {
        Objects.requireNonNull(this.j);
        ekjo ekjo0 = new ekjo(this.j);
        return lsa.c(this.a, ekjo0);
    }

    final lqd c() {
        Objects.requireNonNull(this.j);
        ekjm ekjm0 = new ekjm(this.j);
        return lsa.c(this.a, ekjm0);
    }

    final void e() {
        this.b.l(Integer.valueOf(3));
    }

    public final void f() {
        this.b.l(Integer.valueOf(0));
    }

    final void g() {
        this.b.l(Integer.valueOf(2));
    }

    public final void h(String s) {
        this.a.i = s;
        this.c.p();
        this.c.q();
    }

    final void i(List list0) {
        this.e.l(list0);
    }

    public final boolean j() {
        return this.c.b;
    }

    final bxox k(boolean z) {
        if(this.h == null) {
            this.h = new ekms(this.c, this.d, z);
        }
        return this.h;
    }
}

