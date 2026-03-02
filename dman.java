import android.accounts.Account;
import com.google.android.gms.pay.PageData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dman implements dmba {
    private static final bboh a;
    private final Account b;
    private final dmtv c;
    private final PageData d;
    private dxeo e;

    static {
        dman.a = bboh.b("Pay", bbcu.cZ);
    }

    public dman(Account account0, dmtv dmtv0, PageData pageData0) {
        this.b = account0;
        this.c = dmtv0;
        this.d = pageData0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 39) {
            throw new IllegalArgumentException("Cannot evaluate filter that is not token id list filter");
        }
        int v = 2;
        switch(((hjvp)hjwe0.c).b) {
            case 0: {
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            default: {
                v = 0;
            }
        }
        if(v == 3) {
            if(this.e == null) {
                try {
                    this.e = this.c.a(this.b, 1);
                }
                catch(Exception exception0) {
                    if(!(exception0 instanceof InterruptedException) && (!(exception0 instanceof ExecutionException) && !(exception0 instanceof TimeoutException))) {
                        throw exception0;
                    }
                    a.ae(dman.a.j(), "Could not get payment methods.", exception0);
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
                hkhr hkhr0 = object0.c == null ? hkhr.b : object0.c;
                if(hkhr0 != null) {
                    hjwt hjwt0 = hkhr0.d == null ? hjwt.a : hkhr0.d;
                    if(hjwt0 != null) {
                        hjwq hjwq0 = hjwt0.d == null ? hjwq.a : hjwt0.d;
                        if(hjwq0 != null) {
                            String s = hjwq0.b;
                            if(s != null) {
                                return hjwe0.b == 39 ? ((hjvp)hjwe0.c).c.contains(s) : hjvp.a.c.contains(s);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

