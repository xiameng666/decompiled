import android.accounts.Account;

public final class fxud {
    public final Account a;
    public Long b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public final String i;
    public boolean j;
    public Long k;
    public Integer l;
    public Boolean m;
    public Boolean n;
    public boolean o;
    public Integer p;
    public String q;
    public boolean r;
    public Boolean s;

    public fxud(Account account0, String s) {
        this.c = false;
        this.d = false;
        this.e = false;
        this.j = false;
        this.r = false;
        batl.t(account0, "null account");
        this.a = account0;
        this.i = s;
    }

    public final void a(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public final void b(long v) {
        this.b = v;
    }

    public final void c(int v) {
        this.l = v;
    }

    public final void d() {
        this.c = true;
    }

    public final void e(fxsf fxsf0) {
        if(hzeq.h()) {
            this.s = fxsf0.k;
        }
        if(hzeq.c()) {
            this.h = fxsf0.f;
        }
        this.f = fxsf0.b;
        this.g = fxsf0.d;
        this.k = fxsf0.a;
        this.c(fxsf0.g);
        this.n = null;
        this.p = (int)fxsf0.j;
    }

    public final void f() {
        this.o = true;
        this.a(true);
        this.d();
    }

    public final void g() {
        this.r = true;
        this.a(true);
        this.d();
    }

    public final void h() {
        this.d = true;
        this.a(true);
        this.d();
    }
}

