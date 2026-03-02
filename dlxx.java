import android.accounts.Account;
import java.util.concurrent.ExecutionException;

public final class dlxx implements dmba {
    private static final bboh a;
    private final Account b;
    private final String c;
    private final String d;
    private final dxyx e;
    private final dycl f;
    private final frli g;

    static {
        dlxx.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlxx(Account account0, String s, String s1, dxyx dxyx0) {
        this.b = account0;
        this.c = s;
        this.d = s1;
        this.e = dxyx0;
        this.f = new dycl(s, s1);
        frli frli0 = dxyx0.a(account0, s1);
        ibuq.e(frli0, "create(...)");
        this.g = frli0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        dymw dymw0;
        hjta hjta0;
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        if(hjwe0.b != 0x2F) {
            throw new IllegalArgumentException("Cannot evaluate filter that is not EmoneySetupFinishOperationFilter");
        }
        dygd dygd0 = null;
        switch(((hjtb)hjwe0.c).b) {
            case 0: {
                hjta0 = hjta.a;
                break;
            }
            case 1: {
                hjta0 = hjta.b;
                break;
            }
            case 2: {
                hjta0 = hjta.c;
                break;
            }
            default: {
                hjta0 = null;
            }
        }
        if(hjta0 == null) {
            hjta0 = hjta.d;
        }
        ibuq.e(hjta0, "getOperationStatus(...)");
        try {
            dymw0 = (dymw)this.f.b().get();
        }
        catch(ExecutionException executionException0) {
            a.ae(dlxx.a.i(), "Failed to get pending eMoney card provision data.", executionException0);
            dymw0 = null;
        }
        if(dymw0 != null && (dymw0.b == 1 || dymw0.b == 2) && System.currentTimeMillis() - dymw0.d < hwsd.f()) {
            switch(hjta0.ordinal()) {
                case 1: {
                    if((dymv.b(dymw0.e) == null ? dymv.f : dymv.b(dymw0.e)) == dymv.b || (dymv.b(dymw0.e) == null ? dymv.f : dymv.b(dymw0.e)) == dymv.d) {
                        return true;
                    }
                    break;
                }
                case 2: {
                    if((dymv.b(dymw0.e) == null ? dymv.f : dymv.b(dymw0.e)) == dymv.c) {
                        return true;
                    }
                }
            }
        }
        if(hjta0 == hjta.b) {
            try {
                dygd0 = (dygd)this.g.a().get();
            }
            catch(ExecutionException executionException1) {
                a.ae(dlxx.a.i(), "Failed to get eMoney transfer status.", executionException1);
            }
            if(dygd0 != null) {
                dyfl dyfl0 = dygd0.d == null ? dyfl.a : dygd0.d;
                return dyfl0 != null && dyuq.d(dyfl0);
            }
        }
        return false;
    }
}

