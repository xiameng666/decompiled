import com.google.android.gms.chimera.modules.auth.proximity.AppContextProvider;
import jeb.synthetic.TWR;

public final class alnw implements glzn {
    public final alol a;
    public final String b;

    public alnw(alol alol0, String s) {
        this.a = alol0;
        this.b = s;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        String s = (String)object0;
        if(s != null) {
            if(alrn.a()) {
                alrv alrv0 = alrv.c(AppContextProvider.a());
                if(alrv0.o()) {
                    try {
                        ywg ywg0 = alna.a(alrv0.b);
                        try {
                            alrv0.d.b().f(s);
                            alrv.a.h("called disassociateFromCdm() on personal profile", new Object[0]);
                        }
                        catch(Throwable throwable0) {
                            TWR.safeClose$NT(ywg0, throwable0);
                            throw throwable0;
                        }
                        if(ywg0 != null) {
                            ywg0.close();
                        }
                    }
                    catch(ywm | IllegalStateException exception0) {
                        alrv.a.g("Profile unavailable", exception0, new Object[0]);
                        alrv0.c.g(s);
                    }
                }
                else {
                    alrv0.c.g(s);
                }
            }
            else {
                alpd alpd0 = alpd.c(AppContextProvider.a());
                if(alpd0.o()) {
                    try {
                        alpd0.l();
                        alpd0.b.a().e(s);
                        alpd.a.h("called disassociateFromCdm() on both profiles", new Object[0]);
                    }
                    catch(ywm ywm0) {
                        alpd.a.g("Profile unavailable", ywm0, new Object[0]);
                    }
                }
                alpd.a.h("disassociateFromCdm(): not calling into personal profile.", new Object[0]);
            }
        }
        aloa aloa0 = new aloa(this.b);
        return this.a.b.b(aloa0, gmap.a);
    }
}

