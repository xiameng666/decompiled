import android.accounts.Account;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public final class dmau implements dmba {
    dxeo a;
    private static final bboh b;
    private final Account c;
    private final dmtv d;

    static {
        dmau.b = bboh.b("Pay", bbcu.cZ);
    }

    public dmau(Account account0, dmtv dmtv0) {
        this.c = account0;
        this.d = dmtv0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 6, "cannot evaluate filter that is not tokenized payment card count");
        hjvy hjvy0 = hjwe0.b == 6 ? ((hjvy)hjwe0.c) : hjvy.a;
        if(this.a == null) {
            try {
                this.a = this.d.a(this.c, 1);
            }
            catch(InterruptedException | ExecutionException | TimeoutException exception0) {
                a.ae(dmau.b.j(), "could not get payment methods.", exception0);
                return false;
            }
        }
        Boolean boolean0 = Boolean.valueOf(true);
        Iterator iterator0 = gggq.j(this.a.b, new dmat()).iterator();
        int v;
        for(v = 0; gghd.o(iterator0, boolean0); ++v) {
        }
        if((hjvy0.b & 2) != 0 && v > (hjvy0.d == null ? hftw.a : hjvy0.d).b) {
            return false;
        }
        return (hjvy0.b & 1) == 0 ? true : v >= (hjvy0.c == null ? hftw.a : hjvy0.c).b;
    }
}

