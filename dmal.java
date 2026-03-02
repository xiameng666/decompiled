import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dmal implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private dxeo e;

    static {
        dmal.a = bboh.b("Pay", bbcu.cZ);
    }

    public dmal(Account account0, dmtv dmtv0, PageData pageData0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 33) {
            throw new IllegalArgumentException("Cannot evaluate filter that is not token default filter");
        }
        boolean z = ((hjvo)hjwe0.c).b;
        if(this.e == null) {
            try {
                this.e = this.c.a(this.b, 1);
            }
            catch(Exception exception0) {
                if(!(exception0 instanceof InterruptedException) && (!(exception0 instanceof ExecutionException) && !(exception0 instanceof TimeoutException))) {
                    throw exception0;
                }
                a.ae(dmal.a.j(), "Could not get payment methods.", exception0);
                return false;
            }
        }
        dxeo dxeo0 = this.e;
        Object object0 = null;
        if(dxeo0 != null) {
            hfuo hfuo0 = dxeo0.b;
            if(hfuo0 != null) {
                for(Object object1: hfuo0) {
                    if(ibuq.m(((dxev)object1).e, this.d.a)) {
                        object0 = object1;
                        break;
                    }
                }
                object0 = (dxev)object0;
            }
        }
        if(object0 != null) {
            dxet dxet0 = object0.d == null ? dxet.a : object0.d;
            return dxet0 != null && z == dxet0.c;
        }
        return false;
    }
}

