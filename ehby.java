import android.accounts.Account;
import j..util.Objects;

final class ehby implements gmbg {
    final Account a;
    final boolean b;
    final boolean c;
    final long d;
    final int e;
    final egyc f;
    final ehcb g;
    final ehci h;

    public ehby(ehcb ehcb0, Account account0, ehci ehci0, boolean z, boolean z1, long v, int v1, egyc egyc0) {
        this.a = account0;
        this.h = ehci0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = v1;
        this.f = egyc0;
        Objects.requireNonNull(ehcb0);
        this.g = ehcb0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
    }

    @Override  // gmbg
    public final void b(Object object0) {
        if(((long)(((int)(((Integer)object0))))) < hwyp.b()) {
            this.g.g(this.a, ((int)(((Integer)object0))) + 1, this.h, this.b, this.c, this.d, this.e);
        }
        this.f.a.b(new egxv(((int)(((Integer)object0))) + 1), gmap.a);
    }
}

