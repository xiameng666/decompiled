import android.app.Application;

public final class divi implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        ltx ltx0 = (ltx)object0;
        Application application0 = (Application)ltx0.a(lsg.b);
        gftb.check(application0);
        return new divr(application0, lrm.a(ltx0), cumi.f(application0), dcpn.f(application0));
    }
}

