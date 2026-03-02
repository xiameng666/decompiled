import j..util.Objects;
import java.io.File;

public final class fnbp {
    public final String a;
    public final File b;
    public final String c;
    public final fnbm d;
    public final fncc e;
    public final gghp f;
    final boolean g;
    final boolean h;
    int i;
    public fnbn j;
    public int k;
    private final fnbz l;
    private boolean m;
    private fnbo n;

    public fnbp(fnbz fnbz0, String s, File file0, String s1, fnbm fnbm0, fncc fncc0) {
        this.f = new gfza();
        this.i = 0;
        this.m = false;
        this.n = fnbo.a;
        this.j = null;
        this.k = -1;
        this.a = s;
        this.b = file0;
        this.c = s1;
        this.d = fnbm0;
        this.l = fnbz0;
        this.e = fncc0;
        boolean z = fnbi.a(s);
        this.g = z;
        boolean z1 = fnbp.g(s);
        this.h = z1;
        if(!z1 && !z) {
            return;
        }
        this.n = fnbo.c;
    }

    public final fnbo a() {
        synchronized(this) {
        }
        return this.n;
    }

    final void b() {
        synchronized(this) {
        }
    }

    final void c() {
        synchronized(this) {
        }
    }

    final void d() {
        synchronized(this) {
            this.m = true;
        }
    }

    public final boolean e() {
        return this.l.m(this);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fnbp) ? Objects.equals(this.a, ((fnbp)object0).a) && Objects.equals(this.b, ((fnbp)object0).b) && Objects.equals(this.c, ((fnbp)object0).c) && Objects.equals(this.n, ((fnbp)object0).n) && this.m == ((fnbp)object0).m : false;
    }

    public final boolean f() {
        synchronized(this) {
        }
        return this.m;
    }

    public static boolean g(String s) {
        return s.startsWith("file:");
    }

    public final void h(fnbo fnbo0) {
        if(!this.h && !this.g) {
            this.n = fnbo0;
        }
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.n, Boolean.valueOf(this.m)});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.a(fnbp.class);
        gfsv0.add("", this.a);
        gfsv0.add("targetDirectory", this.b);
        gfsv0.add("fileName", this.c);
        gfsv0.add("requiredConnectivity", this.n);
        gfsv0.addBool("canceled", this.m);
        return gfsv0.toString();
    }
}

