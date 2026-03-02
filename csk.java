import android.content.Context;
import android.widget.EdgeEffect;

final class csk {
    public long a;
    public EdgeEffect b;
    public EdgeEffect c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    private final Context j;
    private final int k;

    public csk(Context context0, int v) {
        this.j = context0;
        this.k = v;
        this.a = 0L;
    }

    public final EdgeEffect a() {
        EdgeEffect edgeEffect0 = this.c;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.a);
            this.c = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect0 = this.g;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.a);
            this.g = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect0 = this.d;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.b);
            this.d = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect0 = this.h;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.b);
            this.h = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect0 = this.e;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.b);
            this.e = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect0 = this.i;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.b);
            this.i = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect0 = this.b;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.a);
            this.b = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect0 = this.f;
        if(edgeEffect0 == null) {
            edgeEffect0 = this.u(dbw.a);
            this.f = edgeEffect0;
        }
        return edgeEffect0;
    }

    public final boolean i() {
        return csk.v(this.c);
    }

    public final boolean j() {
        return csk.w(this.g);
    }

    public final boolean k() {
        return csk.w(this.c);
    }

    public final boolean l() {
        return csk.v(this.d);
    }

    public final boolean m() {
        return csk.w(this.h);
    }

    public final boolean n() {
        return csk.w(this.d);
    }

    public final boolean o() {
        return csk.v(this.e);
    }

    public final boolean p() {
        return csk.w(this.i);
    }

    public final boolean q() {
        return csk.w(this.e);
    }

    public final boolean r() {
        return csk.v(this.b);
    }

    public final boolean s() {
        return csk.w(this.f);
    }

    public final boolean t() {
        return csk.w(this.b);
    }

    private final EdgeEffect u(dbw dbw0) {
        EdgeEffect edgeEffect0;
        Context context0;
        try {
            context0 = this.j;
            edgeEffect0 = new EdgeEffect(context0, null);
        }
        catch(Throwable unused_ex) {
            edgeEffect0 = new EdgeEffect(context0);
        }
        edgeEffect0.setColor(this.k);
        long v = this.a;
        if(!jlk.c(v, 0L)) {
            if(dbw0 == dbw.a) {
                edgeEffect0.setSize(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
                return edgeEffect0;
            }
            edgeEffect0.setSize(((int)(v & 0xFFFFFFFFL)), ((int)(v >> 0x20)));
        }
        return edgeEffect0;
    }

    private static final boolean v(EdgeEffect edgeEffect0) {
        return edgeEffect0 == null ? false : !edgeEffect0.isFinished();
    }

    private static final boolean w(EdgeEffect edgeEffect0) {
        return edgeEffect0 == null ? false : csi.a(edgeEffect0) != 0.0f;
    }
}

