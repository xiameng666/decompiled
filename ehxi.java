import android.content.Context;

public final class ehxi implements eift {
    public static final bboh a;
    public final eifs b;
    public final eigk c;
    public String d;
    public ehwj e;

    static {
        ehxi.a = eicd.a("FD");
    }

    public ehxi(Context context0) {
        this.b = eifs.b(context0);
        this.c = eigk.c();
    }

    @Override  // eift
    public final void a(gwgu gwgu0) {
    }

    @Override  // eift
    public final void b(gwgx gwgx0, gwgx gwgx1, eigg eigg0) {
        if(gwgx1 != null && ((gwgu.b(gwgx1.g) == null ? gwgu.a : gwgu.b(gwgx1.g)) == gwgu.f && (gwgx1.b & 1) != 0 && gwgx1.c.equals(this.d))) {
            ehwj ehwj0 = this.e;
            if(ehwj0 != null) {
                ehwj0.c(gwgx1.d, 2);
            }
        }
    }

    @Override  // eift
    public final void d(int v) {
    }
}

