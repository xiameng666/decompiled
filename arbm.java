import com.google.android.gms.backup.d2d.component.D2dEarlySourceChimeraService;

public final class arbm implements glzn {
    public final D2dEarlySourceChimeraService a;
    public final long b;

    public arbm(D2dEarlySourceChimeraService d2dEarlySourceChimeraService0, long v) {
        this.a = d2dEarlySourceChimeraService0;
        this.b = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        D2dEarlySourceChimeraService d2dEarlySourceChimeraService0 = this.a;
        if(((Boolean)object0).booleanValue()) {
            d2dEarlySourceChimeraService0.b.a(hgvs.i);
            return glzd.f(d2dEarlySourceChimeraService0.g.a.a(), new ardn(), gmap.a);
        }
        d2dEarlySourceChimeraService0.b.a(hgvs.j);
        return gmbu.h(new IllegalArgumentException("No data found for session ID: " + this.b));
    }
}

