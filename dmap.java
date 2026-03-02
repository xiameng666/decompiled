import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dmap implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private dxeo e;

    static {
        dmap.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmap(Account account0, dmtv dmtv0, PageData pageData0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 34) {
            throw new IllegalArgumentException("Cannot evaluate filter that is not token payment network filter");
        }
        hfuh hfuh0 = new hfuh(((hjvs)hjwe0.c).c, hjvs.a);
        if(this.e == null) {
            try {
                this.e = this.c.a(this.b, 1);
            }
            catch(Exception exception0) {
                if(!(exception0 instanceof InterruptedException) && (!(exception0 instanceof ExecutionException) && !(exception0 instanceof TimeoutException))) {
                    throw exception0;
                }
                a.ae(dmap.a.j(), "Could not get payment methods.", exception0);
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
                    goto label_24;
                }
                object0 = null;
            label_24:
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
                    hktu hktu0 = hktu.b(hkir0.f) == null ? hktu.D : hktu.b(hkir0.f);
                    return hktu0 == null ? false : hfuh0.contains(hktu0);
                }
            }
        }
        return false;
    }
}

