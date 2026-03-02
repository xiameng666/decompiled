import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dmar implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private dxeo e;

    static {
        dmar.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmar(Account account0, dmtv dmtv0, PageData pageData0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        gftb.g(hjwe0.b == 0x1F, "Cannot evaluate filter that is not token state filter", new Object[0]);
        hfuh hfuh0 = new hfuh((hjwe0.b == 0x1F ? ((hjvv)hjwe0.c) : hjvv.b).c, hjvv.a);
        if(this.e == null) {
            try {
                this.e = this.c.a(this.b, 1);
            }
            catch(InterruptedException interruptedException0) {
                a.ae(dmar.a.j(), "Could not get payment methods.", interruptedException0);
                return false;
            }
            catch(ExecutionException executionException0) {
                a.ae(dmar.a.j(), "Could not get payment methods.", executionException0);
                return false;
            }
            catch(TimeoutException timeoutException0) {
                a.ae(dmar.a.j(), "Could not get payment methods.", timeoutException0);
                return false;
            }
        }
        dxeo dxeo0 = this.e;
        hkhr hkhr0 = null;
        if(dxeo0 != null) {
            hfuo hfuo0 = dxeo0.b;
            if(hfuo0 != null) {
                for(Object object0: hfuo0) {
                    if(!ibuq.m(((dxev)object0).e, this.d.a)) {
                        continue;
                    }
                    goto label_27;
                }
                object0 = null;
            label_27:
                if(((dxev)object0) != null) {
                    hkhr0 = ((dxev)object0).c;
                    if(hkhr0 == null) {
                        hkhr0 = hkhr.b;
                    }
                }
            }
        }
        if(hkhr0 != null) {
            hkhh hkhh0 = hkhr0.q == null ? hkhh.a : hkhr0.q;
            if(hkhh0 != null) {
                hkir hkir0 = hkhh0.g == null ? hkir.a : hkhh0.g;
                if(hkir0 != null) {
                    hkiq hkiq0 = hkiq.b(hkir0.h) == null ? hkiq.f : hkiq.b(hkir0.h);
                    return hkiq0 == null ? false : hfuh0.contains(hkiq0);
                }
            }
        }
        return false;
    }
}

