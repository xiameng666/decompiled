import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlwt implements dmba {
    private static final bboh a;
    private final dsio b;

    static {
        dlwt.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlwt(dsio dsio0) {
        this.b = dsio0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bullet");
        ibuq.f(hjwe0, "filter");
        if(hwfn.c()) {
            gftb.g(hjwe0.b == 70, "Cannot evaluate filter that is not bulk import onboarding filter", new Object[0]);
            gfsx gfsx0 = null;
            try {
                dsik dsik0 = new dsik("bulk_import_onboarding");
                gfsx0 = (gfsx)((glyq)this.b.a(dsik0)).v(10L, TimeUnit.SECONDS);
            }
            catch(InterruptedException interruptedException0) {
                a.ae(dlwt.a.j(), "Could not get bulk import onboarding state", interruptedException0);
            }
            catch(ExecutionException executionException0) {
                a.ae(dlwt.a.j(), "Could not get bulk import onboarding state", executionException0);
            }
            catch(TimeoutException timeoutException0) {
                a.ae(dlwt.a.j(), "Could not get bulk import onboarding state", timeoutException0);
            }
            if(gfsx0 == null) {
                return false;
            }
            hjrm hjrm0 = hjwe0.b == 70 ? ((hjrm)hjwe0.c) : hjrm.a;
            boolean z = gfsx0.i();
            return hjrm0.b == (z && ((donh)gfsx0.d()).c);
        }
        return false;
    }
}

