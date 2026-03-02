import android.content.Intent;

public final class ddve implements ibts {
    public final gra a;
    public final nry b;

    public ddve(nry nry0, gra gra0) {
        this.b = nry0;
        this.a = gra0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((Intent)object0), "intent");
        String s = ddwg.a(((Intent)object0));
        nry nry0 = this.b;
        nsz nsz0 = nry0.d();
        if(nsz0 != null && !ibuq.m(nsz0.i(), s)) {
            nry0.k(s, new ddvi(nry0));
        }
        this.a.b(Boolean.valueOf(true));
        return ibom.a;
    }
}

