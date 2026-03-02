import android.content.Context;
import j..util.Objects;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;

public final class fkvi implements fkza, fkzb {
    public final Map a;
    public final Object b;
    public final Context c;
    public final fkyx d;
    public final fkzg e;
    public final fkyz f;
    public final fkrk g;
    public final fkvq h;

    public fkvi(fkzg fkzg0, Context context0, fkyz fkyz0, fkrk fkrk0, fkyx fkyx0, fkvq fkvq0) {
        this.a = new LinkedHashMap();
        this.b = new Object();
        this.e = fkzg0;
        this.c = context0;
        this.f = fkyz0;
        this.g = fkrk0;
        this.d = fkyx0;
        this.h = fkvq0;
    }

    public final gfsx a() {
        this.e.a();
        return gfqx.a;
    }

    public final gmcd b(fkuf fkuf0, int v) {
        return gdtf.k(this.c(), new fkun(this, fkuf0, v), gmap.a);
    }

    public final gmcd c() {
        return gdtf.k(this.e.a(), new fkuz(this), gmap.a);
    }

    public final gmcd d() {
        gdta gdta0 = gdta.g(gdta.g(this.f()).i(new fkuu(this), gmap.a).h(new fkuv(), gmap.a));
        fkuw fkuw0 = new fkuw(this);
        return gdta0.f(Exception.class, fkuw0, gmap.a).h(new fkuy(this), gmap.a);
    }

    public final gmcd e(fkuf fkuf0, int v) {
        gdta gdta0 = gdta.g(this.f()).i(new fkva(this, fkuf0, v), gmap.a);
        fkvb fkvb0 = new fkvb(this);
        return gdta0.f(Exception.class, fkvb0, gmap.a).h(new fkvc(this), gmap.a);
    }

    public final gmcd f() {
        gdta gdta0 = gdta.g(this.g.a());
        fkur fkur0 = new fkur(this);
        return gdta0.f(IOException.class, fkur0, gmap.a);
    }

    public final void g(fkue fkue0, Executor executor0) {
        gftb.check(executor0);
        synchronized(this.b) {
            this.a.put(fkue0, executor0);
        }
    }

    @Override  // fkza
    public final void h() {
        ggeo ggeo0;
        synchronized(this.b) {
            ggeo0 = ggeo.k(this.a);
        }
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Executor executor0 = (Executor)((Map.Entry)object0).getValue();
            fkue fkue0 = (fkue)((Map.Entry)object0).getKey();
            Objects.requireNonNull(fkue0);
            executor0.execute(gdrx.g(new fkve(fkue0)));
        }
    }

    @Override  // fkzb
    public final void i() {
        ggeo ggeo0;
        synchronized(this.b) {
            ggeo0 = ggeo.k(this.a);
        }
        ggqj ggqj0 = ggeo0.v().om();
        while(ggqj0.hasNext()) {
            Object object0 = ggqj0.next();
            Executor executor0 = (Executor)((Map.Entry)object0).getValue();
            fkue fkue0 = (fkue)((Map.Entry)object0).getKey();
            Objects.requireNonNull(fkue0);
            executor0.execute(gdrx.g(new fkvd(fkue0)));
        }
    }

    public static boolean j(fkvu fkvu0) {
        return !((ProtoLiteMessage)(fkvu0.d == null ? fkvt.a : fkvu0.d)).equals(fkvt.a);
    }

    public static boolean k(fkvu fkvu0) {
        return !((ProtoLiteMessage)fkvu.a).equals(fkvu0);
    }

    public static boolean l(fkvu fkvu0, fkuf fkuf0) {
        gdmz gdmz0 = fkzi.a((fkvu0.c == null ? gssv.a : fkvu0.c));
        return gdmz0 == null ? false : fkuf0.a || !gdmz0.e;
    }
}

