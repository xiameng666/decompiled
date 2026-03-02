import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

final class fxeg extends fxov {
    public static final int a;
    private final cmnh b;
    private final fxog c;
    private final Executor d;
    private fxef e;
    private evpn f;
    private fxob g;
    private boolean h;

    static {
        bboh.c("EQMon", bbcu.g, "LocRCL_N");
    }

    public fxeg(Context context0, fxnw fxnw0) {
        cnjv cnjv0 = new cnjv(context0);
        fxog fxog0 = new fxog(huwd.a.n().ah(), huwd.a.n().au(), ((int)huwd.a.n().H()));
        bblp bblp0 = new bblp(1, 10);
        super(fxnw0);
        this.g = fxob.a;
        this.b = cnjv0;
        this.c = fxog0;
        this.d = bblp0;
    }

    final fxob a() {
        synchronized(this) {
        }
        return this.g;
    }

    @Override  // fxov
    public final fxou b() {
        switch(this.g.c) {
            case 0: {
                return new fxou(2, 14);
            }
            case 1: {
                return fxou.b;
            }
            default: {
                return new fxou(1, 15);
            }
        }
    }

    // Detected as a lambda impl.
    public final void c(Location location0) {
        synchronized(this) {
            if(this.h && location0 != null) {
                fxob fxob0 = this.g;
                fxob fxob1 = this.c.a(location0);
                this.g = fxob1;
                if(fxob1.c != fxob0.c || fxob1.b.b != fxob0.b.b) {
                    this.i.a();
                }
            }
        }
    }

    @Override  // fxov
    public final void f() {
        synchronized(this) {
            this.e = new fxef(this);
            this.h = true;
            this.f = new evpn();
            cmmy cmmy0 = new cmmy();
            cmmy0.b(huwd.a.n().x());
            cmmy0.c(huwd.a.n().w());
            cmmy0.d(102);
            cmmy0.e(2);
            CurrentLocationRequest currentLocationRequest0 = cmmy0.a();
            this.b.c(currentLocationRequest0, this.f.a).b((Location location0) -> synchronized(this) {
                if(this.h && location0 != null) {
                    fxob fxob0 = this.g;
                    fxob fxob1 = this.c.a(location0);
                    this.g = fxob1;
                    if(fxob1.c != fxob0.c || fxob1.b.b != fxob0.b.b) {
                        this.i.a();
                    }
                }
            });
            cmoc cmoc0 = new cmoc(huwd.a.n().K());
            cmoc0.k(105);
            cmoc0.j(huwd.a.n().J());
            cmoc0.i(((float)huwd.l()));
            cmoc0.l(2);
            LocationRequest locationRequest0 = cmoc0.a();
            this.b.k(locationRequest0, this.d, this.e);
        }
    }

    @Override  // fxov
    public final void g() {
        synchronized(this) {
            this.h = false;
            evpn evpn0 = this.f;
            if(evpn0 != null) {
                evpn0.a();
                this.f = null;
            }
            fxef fxef0 = this.e;
            if(fxef0 != null) {
                this.b.f(fxef0);
            }
            this.g = fxob.a;
        }
    }
}

