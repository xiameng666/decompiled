import android.accounts.Account;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dlyn implements dmba {
    private static final bboh a;
    private final Account b;
    private final edqv c;
    private final dmtv d;
    private final ibnn e;

    static {
        dlyn.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlyn(Account account0, edqv edqv0, dmtv dmtv0) {
        ibuq.f(edqv0, "ipassCardEligibility");
        super();
        this.b = account0;
        this.c = edqv0;
        this.d = dmtv0;
        this.e = new ibnz(() -> try {
            return this.d.a(this.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        });
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(this.c.a && hjwe0.b == 58) {
            dxeo dxeo0 = (dxeo)this.e.a();
            if(dxeo0 != null) {
                hfuo hfuo0 = dxeo0.b;
                if(hfuo0 != null) {
                    if(hfuo0.isEmpty()) {
                        return false;
                    }
                    for(Object object0: hfuo0) {
                        dxev dxev0 = (dxev)object0;
                        if(dxev0 != null) {
                            hkhr hkhr0 = dxev0.c == null ? hkhr.b : dxev0.c;
                            if(hkhr0 != null) {
                                hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                                hjwx hjwx0 = hjwt0.e == null ? hjwx.a : hjwt0.e;
                                hjww hjww0 = hjww.b(hjwx0.b) == null ? hjww.l : hjww.b(hjwx0.b);
                                ibuq.e(hjww0, "getSecureElementServiceProvider(...)");
                                hkhm hkhm0 = hkhm.b(hkhr0.f) == null ? hkhm.k : hkhm.b(hkhr0.f);
                                ibuq.e(hkhm0, "getType(...)");
                                if(((hkhr0.d == null ? hjwt.a : hkhr0.d).b & 2) == 0 && hkhm0 == hkhm.c && hjww0 == hjww.k) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    // Detected as a lambda impl.
    public static final dxeo b(dlyn dlyn0) {
        try {
            return dlyn0.d.a(dlyn0.b, 1);
        }
        catch(InterruptedException interruptedException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", interruptedException0);
            return null;
        }
        catch(ExecutionException executionException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", executionException0);
            return null;
        }
        catch(TimeoutException timeoutException0) {
            a.ae(dlyn.a.j(), "Could not get payment methods.", timeoutException0);
            return null;
        }
    }
}

