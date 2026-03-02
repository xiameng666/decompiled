import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlyx implements dmba {
    private static final bboh a;
    private final bavt b;
    private final cqxc c;
    private gfsx d;

    static {
        dlyx.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyx(bavt bavt0, cqxc cqxc0) {
        this.d = gfqx.a;
        this.b = bavt0;
        this.c = cqxc0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        int v;
        gftb.b(hjwe0.b == 21, "Cannot evaluate: does not have mDL count filter");
        hjuc hjuc0 = hjwe0.b == 21 ? ((hjuc)hjwe0.c) : hjuc.a;
        if(hwly.l()) {
            try {
                if(!((Boolean)evrg.o(dtzb.b(this.b), 10L, TimeUnit.SECONDS)).booleanValue()) {
                    ((ggtj)dlyx.a.h()).x("Mdocstore module not installed, not checking mdl count.");
                    return false;
                }
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                a.ae(dlyx.a.j(), "Exception checking for mdocstore module when loading bulletins. Continuing.", exception0);
            }
        }
        try {
            if(!this.d.i()) {
                this.d = gfsx.m(Integer.valueOf(((gtxe)evrg.o(this.c.l(), 10L, TimeUnit.SECONDS)).b.size()));
            }
            v = (int)(((Integer)this.d.d()));
        }
        catch(ExecutionException | InterruptedException | TimeoutException exception1) {
            a.ae(dlyx.a.h(), "Not showing because of mDL fetch exception", exception1);
            return false;
        }
        ((ggtj)dlyx.a.h()).z("Found %s mDLs", v);
        if((hjuc0.b & 2) != 0 && v > (hjuc0.d == null ? hftw.a : hjuc0.d).b) {
            return false;
        }
        return (hjuc0.b & 1) == 0 ? true : v >= (hjuc0.c == null ? hftw.a : hjuc0.c).b;
    }
}

